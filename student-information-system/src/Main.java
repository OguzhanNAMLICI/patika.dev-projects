import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Theodore Newman","555-339-62-85","MAT");
        Teacher teacher2 = new Teacher("Erick Turner","555-666-33-44","PHY");
        Teacher teacher3 = new Teacher("Oscar Ruiz","567-345-62-12","HST");

        Course mathematic = new Course("Mathematic","101","MAT");
        mathematic.addTeacher(teacher1);

        Course physic = new Course("Physic","102","PHY");
        physic.addTeacher(teacher2);

        Course history = new Course("History","103","HST");
        history.addTeacher(teacher3);


        Student student1 = new Student("Eric Rogers","123","4",mathematic,physic,history);

        student1.studentInfo();
        student1.addBulkExamNote(100,50,50);
        student1.addVerbalNote(100,100,100);
        student1.isPass();

    }
}