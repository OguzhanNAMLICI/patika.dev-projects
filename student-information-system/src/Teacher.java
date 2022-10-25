import java.util.Scanner;
public class Teacher {
    public String teacherName;
    public String phoneNumber;
    public String branch;

    public Teacher(String name , String phoneNumber , String branch){
        this.teacherName = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    void printTeacherAttributes(){
        System.out.println("Teacher Name: " + this.teacherName);
        System.out.println("Teacher Phone: " +this.phoneNumber );
        System.out.println("Teacher Branch: " + this.branch);
    }
}
