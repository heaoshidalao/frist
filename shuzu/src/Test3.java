import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char [] arr = n.toCharArray();
        int max = 0;
        int de = 0;
        int count = 0;
        int i = 0;
        for( i=0;i<arr.length;i++){
            if((arr[i]-'0'>=0)&&(arr[i]-'9'<=0)){
                count++;
            }
            else{
                if(count>max){
                        max = count;de = i;
                }
                count = 0;
            }
        }
//       if(count>max){
//            max = count;
//            de = i;
//        }
        for(int j = (de-max);j<de;j++){
            System.out.print(arr[j]);
        }
        System.out.println(de);
        System.out.println(max);
    }
}
//abcd12345ed125ss123456789
