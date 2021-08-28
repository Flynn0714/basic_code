package Abstract;
public class  Student{
    private  int x ;
    public Student(double f){
        this.x = (int)f;
    }
    public  Student(){x = 1;}

    public int getX(){
        return x;
    }

    public static void main(String[] args) {
        Student s = new Student(5.2);
        System.out.println(s.getX());
    }
}