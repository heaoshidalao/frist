import java.io.File;
import java.io.IOException;
public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\java_code\\file\\";
        String dir_name = "demo_dir\\dir1\\dir2\\demo.java";
        String pathname = path + dir_name;
        File file = new File(pathname);
        File pfile = file.getParentFile(); //获取父目录File对象
        if(!pfile.exists()){//检测路径是否存在，不存在创建
            pfile.mkdirs();
//获取File对象的绝对路径，后面学，这个先用起来
            System.out.println("路径" + pfile.getAbsolutePath() + "不存在，创建");
        }
        if(!file.exists()){
            file.createNewFile();
        }

    }
}

