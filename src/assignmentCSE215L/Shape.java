package assignmentCSE215L;

public class Shape implements Comparable<Shape> {
    protected boolean filled;
    protected String color;
    
    public Shape(boolean filled, String color){
        this.filled = filled;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Shape{" + this.filled + "  Color = " + this.color +"}";
    }
	@Override
	public int compareTo(Shape anotherObject) {
        if(anotherObject instanceof Square && this instanceof Square){
            double areaOfCallerObject = ((Square)this).getArea();
            double areaOfAnotherObject = ((Square)anotherObject).getArea(); 
            if(areaOfCallerObject < areaOfAnotherObject){
                return -1;
            }else if(areaOfCallerObject > areaOfAnotherObject){
                return 1;
            }else{
                return 0;
            }
        }
        return -100;
	}
}
