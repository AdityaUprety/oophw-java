import model.Student;


public class Main
{
    public static void main(String[]args){
        Student student1=new Student("Ram",20,new int[]{75,85,90});
        Student student2=new Student("Shyam",22,new int[]{80,92,88});
        Student student3=new Student("Hari",21,new int[]{65,75,70});

        student1.displayResults();
        student2.displayResults();
        student3.displayResults();
    }
}

