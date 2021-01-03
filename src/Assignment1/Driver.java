package Assignment1;

public class Driver {
    public static void main(String[] args) {
        Student object1 = new Student("Musiur Alam", "Opu", "BD 42342", "2012973642", 20, 2.72f, new String[] { "CSE215", "MAT116" });
        Student object2 = new Student("Monir", "Alam", "BD 32342", "34234242432", 15, 3.00f, new String[] { "CSE115", "MAT120" });
        Student object3 = new Student("Rezwan", "Khan", "BD 34342", "234234242432", 22, 3.20f, new String[] { "CSE173", "MAT125" });

        Faculty faculty1 = new Faculty("Shahin", "Sir", "Bd 23fs423", 42, "f23423424", "Lecturer", new String[] { "CSE173", "MAT125", "MAT120" });
        Faculty faculty2 = new Faculty("Shohorab", "Sir", "Bd 234sa23", 40, "fggee23424", "Professor", new String[] { "CSE173", "MAT125" });
        Faculty faculty3 = new Faculty("Alam", "Sir", "Bd 234df23", 36, "f23re44424", "Lecturer", new String[] { "CSE173", "MAT125", "CSE215" });
       
        float[] arr = { object1.getCgpa(), object2.getCgpa(), object3.getCgpa() };
        float max = 0f;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println(object1.toString());
        System.out.println(object2.toString());
        System.out.println(object3.toString());
        System.out.println(faculty1.toString());
        System.out.println(faculty2.toString());
        System.out.println(faculty3.toString());

        System.out.println("The largest CGPA: " + max);
        //this is the ending of the code
    }
}
