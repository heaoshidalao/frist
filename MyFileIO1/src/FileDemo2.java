import java.io.File;
import java.io.IOException;
    public class FileDemo2 {
        public static void main(String[] args) throws IOException {
            String path = "E:\\java_code\\file\\";
            String new_name = "demo2.txt";
            String pathname = path + new_name;
            File file = new File(pathname);
//            if (!file.exists()) { //注意'!', 表示取反
//                try {
//                    file.createNewFile();
//                } catch (IOException e) { //文件部分异常，常见为IOException
//                    System.out.println("文件" + pathname + "创建失败");
////e.printStackTrace();
//                }
//            } else {
//                System.out.println("文件" + pathname + "已经存在，不需创建");
//            }
        }
    }
