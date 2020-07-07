package Howto2j;
import java.io.File;
public class test1 {
    public static void main(String[] args){
        File f = new File("c:\\windows");
        File[] fs = f.listFiles();
        if(null==fs)
            return;
        long minSize = Integer.MAX_VALUE;//从最大值限制
        long maxSize = 0;
        File minFile = null;
        File maxFile = null;
        for (File file : fs){
            if(file.isDirectory())
                continue;
            if(file.length()>maxSize){
                maxSize = file.length();
                maxFile = file;
            }
            if(file.length()!=0&&file.length()<minSize){
                minSize = file.length();
                minFile = file;
            }
            // 遍历所有的文件
            System.out.printf("最大的文件是%s，其大小是%,d字节%n",file.getAbsoluteFile(),maxFile.length());
        }
        System.out.printf("最大的文件是%s，其大小是%,d字节%n",maxFile.getAbsoluteFile(),maxFile.length());
        System.out.printf("最小的文件是%s，其大小是%,d字节%n",minFile.getAbsoluteFile(),minFile.length());

    }
}
