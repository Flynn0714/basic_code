import java.io.File;

/**
 * File类中的三个判断方法
 * public boolean exists 判断文件或者目录是否存在
 * public boolean isDirectory 判断此路径是否为目录
 * public boolean isFile 判断是否此路径是否为文件
 */
public class demo02File {
    public static void main(String[] args) {
        show1();
        show2();
        show3();
    }
    /**
     * 判断是否存在文件或者目录
     */
    private static void show1(){
        System.out.println("++++++++++++++++++++++++");
        File file = new File("C:\\Users\\Administrator\\Desktop\\a");
        File file1 = new File("C:\\Users\\Administrator\\Desktop\\a\\d.txt");
        System.out.println("C:\\Users\\Administrator\\Desktop\\a :" +file.exists());
        System.out.println("C:\\Users\\Administrator\\Desktop\\a\\d.txt :" +file1.exists());
    }

    /**
     * 判断是否为文件夹
     */
    private static void show2(){
        System.out.println("++++++++++++++++++++++++");
        File file = new File("C:\\Users\\Administrator\\Desktop\\a");
        System.out.println("C:\\Users\\Administrator\\Desktop\\a  " + file.isDirectory());
        File file1 = new File("C:\\Users\\Administrator\\Desktop\\a\\d.txt");
        System.out.println("C:\\Users\\Administrator\\Desktop\\a\\d.txt  " + file1.isDirectory());
    }

    /**
     * 判断是否为文件夹
     */
    private static void show3(){
        System.out.println("++++++++++++++++++++++++");
        File file = new File("C:\\Users\\Administrator\\Desktop\\a");
        System.out.println("C:\\Users\\Administrator\\Desktop\\a  " + file.isFile());
        File file1 = new File("C:\\Users\\Administrator\\Desktop\\a\\c.txt");
        System.out.println("C:\\Users\\Administrator\\Desktop\\a\\c.txt  " + file1.isFile());
    }
}
