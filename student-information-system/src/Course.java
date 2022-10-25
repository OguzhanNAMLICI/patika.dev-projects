public class Course {
    Teacher courseTeacher;
    public String courseName;
    public String courseCode;
    public String coursePrefix;
    public int note;

    public int verbalNote;


    public Course(String name, String code ,String prefix){
        this.courseName = name;
        this.courseCode = code;
        this.coursePrefix = prefix;
        this.note = 0;
    }


    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.coursePrefix)){
            this.courseTeacher = teacher;
        }
        else{
            System.out.println("Teacher and course parts do not match");
        }
    }

    void printTeacherInfo(){
        this.courseTeacher.printTeacherAttributes();
    }
}
