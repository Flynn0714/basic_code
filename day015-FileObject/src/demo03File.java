import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;

/**
 * 创建删除文件的方法
 * 1、public boolean createNewFile() 当且仅当该名称文件不存在时，创建一个新文件
 * 2、public boolean delete() 删除此文件表示的文件或者目录
 * 3、public boolean mkdir() 创建有此文件表示的目录
 * 4、public boolean mkdirs() 创建此文件表示的目录，包括任何任何必须但不存在的父目录
 */
public class demo03File {
    public static void main(String[] args) {
        show2();
        show1();
        show3();
        show4();
    }

    private static void show1() {
        System.out.println("+++++++++++++++++++++++");
        File file = new File("C:\\Users\\Administrator\\Desktop\\project\\a.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("创建新文件a.txt：" + newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void show2(){
        System.out.println("+++++++++++++++++++++++");
        File file = new File("C:\\Users\\Administrator\\Desktop\\project\\a.txt");
        boolean deleteFile = file.delete();
        System.out.println("删除文件a.txt：" + deleteFile);
    }

    private static void show3(){
        System.out.println("+++++++++++++++++++++++");
        File file = new File("C:\\Users\\Administrator\\Desktop\\project\\a");
        boolean mkdir = file.mkdir();
        System.out.println("创建一个文件夹：" + mkdir);
    }

    private static void show4(){
        System.out.println("+++++++++++++++++++++++");
        File file = new File("C:\\Users\\Administrator\\Desktop\\project\\a\\b\\c\\d");
        boolean mkdirs = file.mkdirs();
        System.out.println("创建一个父目录：" + mkdirs);
    }
}
