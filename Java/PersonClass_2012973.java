public class PersonClass_2012973 {
    private String firstname, lastname;
    private int age;
    protected String nationalId;

    PersonClass_2012973(String firstname, String lastname, String nationalId, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.nationalId = nationalId;
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public String getFullName(){
        return this.firstname + " " + this.lastname;
    }
    public String getNationalId(){
        return this.nationalId;
    }
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "Full name: " 
        + this.firstname
        + " "
        + this.lastname
        + "  Age: "
        + this.age
        + "  National Id: "
        + this.nationalId;
    }
}
