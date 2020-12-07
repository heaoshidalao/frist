import java.io.File;
import java.io.IOException;
import java.util.Date;
public class FileDemo4 {
    public static void main(String[] args) throws IOException {
// 要操作的文件
        File file = new File("C:\\");
// 保证是个目录且存在
        if (file.exists() && file.isDirectory()) {
// 列出目录中的全部内容
            File[] result = file.listFiles();
            for (File file2 : result) {
                System.out.println(file2);
            }
        }
//        int [] arr = {6,5,4,3,2,1};
//        for(int a:arr){
//            System.out.print(a);
//        }
    }
}
