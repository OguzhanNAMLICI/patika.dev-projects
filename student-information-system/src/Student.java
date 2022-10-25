import java.util.Scanner;
public class Student {
    Course courseOne;
    Course courseTwo;
    Course courseTheree;
    public String studentName;
    public String studentNumber;
    public String classes;
    double avarage;
    boolean isPass;



    public Student(String studentName , String studentNumber , String classes , Course courseOne , Course courseTwo , Course courseTheree){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.courseOne = courseOne;
        this.courseTwo = courseTwo;
        this.courseTheree = courseTheree;
        this.avarage = 0.0;
        this.isPass = false;
    }


    public void studentInfo(){
        System.out.println("\n---Student Info---");
        System.out.println("NAME-SURNAME: " + this.studentName);
        System.out.println("STUDENT NUMBER: " + this.studentNumber );
        System.out.println("CLASESS: " + this.classes);
        System.out.println("LESSONS: " + this.courseOne.courseName +"\t"+ this.courseTwo.courseName + "\t" +this.courseTheree.courseName);
    }

    public void addBulkExamNote(int courseOneNote, int courseTwoNote, int courseThereeNote){
        if(courseOneNote >= 0 && courseOneNote <= 100){
           this.courseOne.note = courseOneNote;

        }

        if(courseTwoNote >= 0 && courseTwoNote <= 100){
            this.courseTwo.note = courseTwoNote;
        }

        if(courseThereeNote >= 0 && courseThereeNote <= 100){
            this.courseTheree.note = courseThereeNote;
        }
    }


    public void addVerbalNote(int courseOneVerbalNote , int courseTwoVerbalNote, int courseThereeVerbalNote){
        if(courseOneVerbalNote >= 0 && courseOneVerbalNote <= 100){
            this.courseOne.verbalNote = courseOneVerbalNote;

        }

        if(courseTwoVerbalNote >= 0 && courseTwoVerbalNote <= 100){
            this.courseTwo.verbalNote = courseTwoVerbalNote;
        }

        if(courseThereeVerbalNote >= 0 && courseThereeVerbalNote <= 100){
            this.courseTheree.verbalNote = courseThereeVerbalNote;
        }
    }



    public void printStudentNotes(){
        System.out.println(courseOne.courseName + " Notes : " + courseOne.note);
        System.out.println(courseTwo.courseName + " Notes : " + courseTwo.note);
        System.out.println(courseTheree.courseName + " Notes : " + courseTheree.note);
    }

    public void isPass(){
        this.avarage = (((this.courseOne.note * 0.80)+(this.courseOne.verbalNote * 0.20)) +
                ((this.courseTwo.note * 0.80)+(this.courseTwo.verbalNote * 0.20)) +
                ((this.courseTheree.note * 0.80)+(this.courseTheree.verbalNote * 0.20))) / 3.0;

        if(this.avarage > 55){
            System.out.println("\nYou successfully passed the class");
            System.out.println("Your GPA: " + this.avarage +"\n");
            System.out.println("---Your Exam Grades:---");
            this.isPass = true;
        }
        else{
            System.out.println("\nYour avarage is not to enough to pass the class.");
            System.out.println("Your GPA: " + this.avarage+"\n");
            System.out.println("---Your Exam Grades---");
            this.isPass = false;
        }
        printStudentNotes();
    }
}
