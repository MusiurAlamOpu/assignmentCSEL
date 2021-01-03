package Assignment1;

public class Faculty extends Person{
    private String facultyId;
    private String designation;
    private String[] courses;

    Faculty(String firstname,
            String lastname,
            String nationalId,
            int age,
            String facultyId,
            String designation,
            String[] courses){
        super(firstname, lastname, nationalId, age);
        this.facultyId = facultyId;
        this.designation = designation;
        this.courses = courses;
    }
    @Override
    public String getFullName() {
        return super.getFullName();
    }
    public String getDesignation() {
        return this.designation;
    }
    public String[] getCourses(){
        return this.courses;
    }
    public void setCourses(String[] courses){
        this.courses = courses;
    }
    public void setDesignation(String newDesignation){
        this.designation = newDesignation;
    }
    @Override
    public String toString() {
        return "Faculty{ "
        + super.toString()
        + "  faculty Id: "
        + this.facultyId
        + "  Designation: "
        + this.designation
        + " Courses: ["
        + this.courses
        + "] }\n" ;
    }

}
