import java.io.File;
import java.io.IOException;

/**
 * File类遍历文件夹功能：
 *  - public String list() 返回一个String数组，表示该目录的所有子文件或者目录
 *  - public File[] listFiles() 返回一个File数组，表示File目录中所有的子文件或者目录
 *
 *  注意：如果构造器中给出的路径不是一个目录或者是一个文件，则会抛出空指针异常
 */
public class demo04File {
    public static void main(String[] args) {
        show1();
        show2();
        findTxtFile();
    }

    private static void show1() {
        System.out.println("+++++++++++++++++++++++");
        File file = new File("C:\\Users\\Administrator\\Desktop\\project");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }


    private static void show2() {
        System.out.println("+++++++++++++++++++++++");
        File file = new File("C:\\Users\\Administrator\\Desktop\\project");
        File[] filelist = file.listFiles();
        for (File file1 : filelist) {
            String name = file1.getName();
            System.out.println(name);
        }
    }

    /**
     * 寻找当前文件下所有的.txt文件
     */
    private static void findTxtFile(){
        System.out.println("+++++++++++++++++++++++");
        File file = new File("C:\\Users\\Administrator\\Desktop\\project");
        File[] filelist = file.listFiles();
        for (File file1 : filelist) {
           if (file1.getName().toString().toLowerCase().endsWith(".txt")) {
               System.out.println(file1.getName());
           }
        }
    }

}
