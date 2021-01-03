package Assignment1;

public class Student extends Person{
    private float cgpa;
    private String studentId;
    private String[] courses;

    Student(String firstname,
            String lastname,
            String nationalId,
            String studentId,
            int age,
            float cgpa,
            String[] courses) {
        super(firstname, lastname, nationalId, age);
        this.studentId = studentId;
        this.cgpa = cgpa;    
        this.courses = courses;
    }
    public String getFullName(){
        return super.getFullName();
    }
    public void setCgpa(float newCgpa){
        this.cgpa = newCgpa;
    }
    public float getCgpa(){
        return this.cgpa;
    }
    public String getStudentId(){
        return this.studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    public String[] getCourses(){
        return this.courses;
    }
    public void setCourses(String[] newCourses){
        this.courses = newCourses;
    }
    
    @Override
    public String toString() {
        return "Student{ "
        + super.toString()
        + "  Student Id: "
        + this.studentId
        + "  CGPA: "
        + this.cgpa
        + "  Courses["
        + this.courses
        + "] "
        +" }\n";    
    }
}
