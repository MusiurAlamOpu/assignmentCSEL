public class DriverClass_2012973 {
    public static void main(String[] args) {
        StudentClass_2012973 object1 = new StudentClass_2012973("Musiur Alam", "Opu", "BD 42342", "2012973642", 20, 2.72f, new String[] { "CSE215", "MAT116" });
        StudentClass_2012973 object2 = new StudentClass_2012973("Monir", "Alam", "BD 32342", "34234242432", 15, 3.00f, new String[] { "CSE115", "MAT120" });
        StudentClass_2012973 object3 = new StudentClass_2012973("Rezwan", "Khan", "BD 34342", "234234242432", 22, 3.20f, new String[] { "CSE173", "MAT125" });

        FacultyClass_2012973 faculty1 = new FacultyClass_2012973("Shahin", "Sir", "Bd 23fs423", 42, "f23423424", "Lecturer", new String[] { "CSE173", "MAT125", "MAT120" });
        FacultyClass_2012973 faculty2 = new FacultyClass_2012973("Shohorab", "Sir", "Bd 234sa23", 40, "fggee23424", "Professor", new String[] { "CSE173", "MAT125" });
        FacultyClass_2012973 faculty3 = new FacultyClass_2012973("Alam", "Sir", "Bd 234df23", 36, "f23re44424", "Lecturer", new String[] { "CSE173", "MAT125", "CSE215" });
       
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


