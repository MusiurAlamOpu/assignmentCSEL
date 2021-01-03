package Assignment1;

public class Person {
    private String firstname, lastname;
    private int age;
    protected String nationalId;

    Person(String firstname, String lastname, String nationalId, int age){
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
