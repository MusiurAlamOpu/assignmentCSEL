package assignmentCSE215L;

public class Square extends Rectangle{

    Square(boolean filled, String color, double sidelength) {
        super(filled, color, sidelength, sidelength);
    }
    @Override
    public String toString() { 
        return "Square(" + super.toString() + " SideLength = " + super.length + ")";
    }
}
