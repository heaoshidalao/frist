public class quickSoct {
    public static void main(String [] args){
        int [] arr = {4,2,5,31,125,13,35,53,1,4,13};
        quicsort(arr);
        for (int data: arr){
            System.out.print(data+" ");
        }
    }
    public static void quicsort(int [] arr){
        quickSort1(arr,0,arr.length-1);
    }
    public static void quickSort1(int []arr,int left, int right){
        int size = right - left+1;
        if(size<=1){
            return;
        }
        int  index = arr[left];
        int left1 = left;
        int right1 = right;
        while(left1<right1){
            while(left1<right1&&arr[right1]>=index){
                right1--;
            }
            arr[left1] = arr[right1];
            while(left1<right1&&arr[left1]<=index){
                left1++;
            }
            arr[right1] =arr[left1] ;
        }
        arr[left1]=index;
        quickSort1(arr,left,left1-1);
        quickSort1(arr,left1+1,right);
    }
}
