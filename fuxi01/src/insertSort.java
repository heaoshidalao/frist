public class insertSort {
    public static void main(String [] args){
        int [] arr = {4,2,5,31,125,13,35,53,1,4,13};
//        for(int i = 0;i<arr.length-1;i++){
//            for(int j=i+1;j>0;j--){
//                if(arr[j-1]>arr[j]){
//                    int temp = arr[j-1];
//                    arr[j-1] =arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//            }
        for(int i = 1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int data: arr){
            System.out.print(data+" ");
        }
        }

}
