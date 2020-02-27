import java.text.DecimalFormat;
        import java.util.LinkedList;
        import java.util.List;
        import java.util.Scanner;

class Process{
    public int arrivalTime;
    public int serviceTime;
    public int finishTime;
    public int startTime;
    public int WholeTime;
    public double weightWholeTime;
    public String pid;

    Process(int x,int y,String id){
        arrivalTime=x;
        serviceTime=y;
        pid=id;
    }
}
public class SJF{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入进程个数：");
        int n = scanner.nextInt();
        Process [] p=new Process[n];
        System.out.println("请输入每个进程的到达时间和服务时间和名字");
        for(int i =0; i<n;i++){
            int arrTime = scanner.nextInt();
            int serviceTime = scanner.nextInt();
            String Name = scanner.next();
            p[i]= new Process(arrTime,serviceTime,Name);
        }
        Process[] processes=SJF(p);
        Out(processes);
    }
    public static void Out(Process[] p){
        DecimalFormat df = new DecimalFormat("#.00");
        float sumWT=0;
        float sumWWT=0;
        float AverageWT;
        float AverageWWT;
        for(int i=0;i<p.length;i++){
            System.out.println("时刻"+p[i].startTime+": 进程"+p[i].pid+"开始运行，完成时间为:"+p[i].finishTime+",周转时间为："+p[i].WholeTime+",带权周转时间为："+df.format(p[i].weightWholeTime));
            sumWT+=p[i].WholeTime;
            sumWWT+=p[i].weightWholeTime;
        }
        AverageWT=sumWT/p.length;
        AverageWWT=sumWWT/p.length;

        System.out.println("平均周转时间为："+df.format(AverageWT));
        System.out.println("平均带权周转时间为："+df.format(AverageWWT));
        System.out.println("---------------------------------------------------------");
    }
    //找出下一个处理的进程
    public static Process FindNextPro(List<Process> list,int now){
        Process pro=list.get(0);
        int index=0;
        for(int i=1;i<list.size();i++){
            if(list.get(i).serviceTime<pro.serviceTime&&list.get(i).arrivalTime<now){
                pro=list.get(i);
                index=i;
            }
        }
        list.remove(index);
        return pro;
    }

    //插入排序
    public static void InsertSort(Process[] p)
    {


        int j = 0;
        for(j = 0;j<p.length;j++) {
            for (int z = p.length - 1; z > j; z--) {
                if (p[z].arrivalTime < p[z - 1].arrivalTime) {
                    Process temp = p[z];
                    p[z] = p[z - 1];
                    p[z - 1] = temp;
                }
            }
        }
    }
    public static Process[] SJF(Process[] p){
        //当前时间
        int now=0;
        //待处理list
        List<Process> list=new LinkedList<>();
        //结果list
        List<Process> res=new LinkedList<>();
        //按时间对进程进行排序
        InsertSort(p);
        //处理第一个进程
        p[0].finishTime=p[0].arrivalTime+p[0].serviceTime;
        p[0].WholeTime=p[0].finishTime-p[0].arrivalTime;
        p[0].weightWholeTime=p[0].WholeTime/p[0].serviceTime;
        res.add(p[0]);
        now=p[0].finishTime;
        //将剩余进程添加进待处理list
        for(int i=1;i<p.length;i++){
            list.add(p[i]);
        }
        while(list.size()!=0){
            Process next=FindNextPro(list, now);
            if(next.arrivalTime>now){
                next.finishTime=next.arrivalTime+next.serviceTime;
                next.startTime=next.arrivalTime;
            }else{
                next.finishTime=now+next.serviceTime;
                next.startTime=now;
            }
            now=next.finishTime;
            next.WholeTime=next.finishTime-next.arrivalTime;
            next.weightWholeTime=(double)next.WholeTime/(double)next.serviceTime;
            res.add(next);
        }
        return res.toArray(new Process[0]);
    }
}