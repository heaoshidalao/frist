public class BinarySearch {
    public static void main(String [] args){
       int arr[] = {1,2,3,4,7,8,9,11,12,13,14,15,16,17,21,22,33,44};
       int n = 11;
       int left = 0;
       int right = arr.length-1;
       int size = right-left;
       int count = 0;
       while(right>=left){
           count++;
           int mid = (right+left)/2;
           if(n == arr[mid]){
               System.out.println("zhaodaol");
               System.out.println(count);
               return;
           }
           else if(n>arr[mid]){
               left = mid+1;
           }
           else {
               right = mid-1;

           }
       }
    }
}
