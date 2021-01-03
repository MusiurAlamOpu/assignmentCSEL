package assignmentCSE215L;

public class Driver {
    public static void main(String[]args){
        Square s1 = new Square(false, "Black", 5);
        Square s2 = new Square(true, "White", 9);
        Rectangle r1 = new Rectangle(false, "Green", 8, 7);
        Rectangle r2 = new Rectangle(true, "Red", 5, 8);
  
        System.out.println(s1.compareTo(s2));
        System.out.println(r1.compareTo(r2));
        System.out.println(s1.compareTo(r2));
    }
}
