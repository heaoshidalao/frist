public class Test4 {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,4,1,2};
    }
    public int[] func1 (int[][] order_list, int n) {
        // write code here
        if(order_list.length == 0||n==0){
            return null;
        }
        int temp[][] =new int [n][2];
        for(int i = 0;i<order_list.length;i++){
            int j ;
            for(j = order_list[i][0];j<=order_list[i][1];j++){
                temp[j][0]= j;
                temp[j][1]+=order_list[i][2];
            }
        }
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= temp[i][1];
        }
        return arr;



    }
}
