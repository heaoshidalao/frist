import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        System.out.println("请输入数字个数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        print(a);
        selectionSort(a);
        print(a);
    }
    public static void print(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void selectionSort(int[] a) {
        for(int i = 0;i < a.length; i++) {
            for(int j = i+1;j < a.length;j++) {
                //当后者比前者小时，交换
                if(a[j]<a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
