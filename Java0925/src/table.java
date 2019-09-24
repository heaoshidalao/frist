public class table {
    private int[] data = new int[5];
    private  int size = 0;
    public  void display(){
        System.out.print("[");
        for(int i=0;i<this.size;i++){
            System.out.print(this.data[i]);
            if(i!=this.size-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.print("\n");
    }
    public void add(int pos,int elem){
        if(size>=this.data.length){
        malloc(data,2*data.length);
        }
        if(pos>size){
            return ;
        }
        if(pos==size){
            this.data[size] = elem;
            size++;
            return ;
        }
            for (int i = size; i > size - pos; i--) {
                this.data[i] = this.data[i - 1];
            }
        data[pos]=elem;
        size++;
    }
    public void malloc(int [] data,int number){
        int [] newdata = new int[number];
        for(int i=0;i<size;i++){
            newdata[i] =this.data[i];
        }
        this.data=newdata;
    }
    public boolean contains(int toFind){
        for(int i=0;i<size;i++){
            if(data[i]==toFind) {
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){
        for(int i=0;i<size;i++){
            if(data[i]==toFind) {
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos){
        return data[pos];
    }
    public void setPos(int pos,int value){
        data[pos]=value;
    }
    public void remove(int toRmove){
       int number = search(toRmove);
       for(int i=size-number;i<size;i++){
           data[i-1]=data[i];
       }
       size--;
    }
    public int Size(){
        return size;
    }
    public void clear(){
        this.size=0;
    }
}
