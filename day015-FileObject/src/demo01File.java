import java.io.File;

public class demo01File {
    public static void main(String[] args) {
        /**
         * 系统路径分割符pathSeparator 和 系统名称分隔符separator
         * pathSeparator windows为;   linux为:
         * separator windows为\  linux为/
         * 为了适应不同的操作系统建议使用路径，拼接字符串 如下形式：
         * "c:" + File.separator + "develop" + File.separator + "a.txt"
         */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); //windows ;

        String separator = File.separator;
        System.out.println(separator);  //windows \
        show1();
        show2("C:\\Users\\Administrator\\Desktop\\a\\","b.txt");
        show3();
    }

    /**
     * 构造方法
     * 只有一个参数 可以是文件夹 也可以是一个文件 还可以是一个相对路径
     */
    private static void show1(){
        System.out.println("======================");

        /**
         * 创建一个文件夹
         */
        File dir = new File("C:\\Users\\Administrator\\Desktop\\a\\");
        System.out.println(dir);

        /**
         * 创建一个文件
         */
        File file = new File("C:\\Users\\Administrator\\Desktop\\a\\a.txt");
        System.out.println(file);

        /**
         * 相对路径
         */
        File path = new File(".\\a\\");
        System.out.println(path);

        /**
         * 相对路径文件
         */
        File filePath = new File(".\\a\\a.txt");
        System.out.println(filePath);
        long length = file.length();
        System.out.println("文件大小：" + length);
    }

    /**
     * 构造方法
     * 两个参数：一个父路径 一个子路径 两者拼接
     * @param parent
     * @param child
     */
    private static void show2(String parent,String child){
        System.out.println("======================");
        File file = new File(parent,child);
        System.out.println(file);
        long length = file.length();
        System.out.println("文件大小：" + length);
    }

    /**
     * 构造方法
     * 两个参数：一个父文件目录，另一个子文件路径
     */
    private static void show3(){
        System.out.println("======================");
        File parent = new File("C:\\Users\\Administrator\\Desktop\\a\\");
        File file = new File(parent,"c.txt");
        System.out.println(file);
        long length = file.length();
        System.out.println("文件大小：" + length);
    }
}
