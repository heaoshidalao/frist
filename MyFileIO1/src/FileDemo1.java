import java.io.File;
import java.util.Date;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String [] args){

            String path = "E:\\java_code\\file\\";
            String name = "demo.txt";
            String pathname = path + name;
            File file = new File(pathname);
        String name1 = "demo1";
        String pathname1 = path + name1;
        File file1 = new File(pathname1);
        if(!file1.exists()){
            file1.mkdir(); //创建一个空目录
//file.mkdirs(); //创建一个可能具有多个目录的路径
        }
        else{
            System.out.println("路径已经存在，不需创建");
        }
        System.out.println("文件 " + name + "size : " + file1.length());
//Date类我们后面学
        System.out.println("文件 " + name + "最近修改时间: " + new
                Date(file1.lastModified()));
        System.out.println(file1.getParent());
        System.out.println(file1.getName());
        System.out.println(file1.getParentFile());
        File file2 = file1.getParentFile();
        File file3 = new File(pathname1);
        if(!file3.exists()){
            file2.mkdir(); //创建一个空目录
//file.mkdirs(); //创建一个可能具有多个目录的路径
        }
        else{
            System.out.println("路径已经存在，不需创建");
        }

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件 " + name + "size : " + file3.length());
//Date类我们后面学
        System.out.println("文件 " + name + "最近修改时间: " + new
                Date(file3.lastModified()));
        boolean res = file.exists();
            System.out.println("文件" + pathname + "是否存在: " + res);

    }
}
