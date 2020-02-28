//import java.util.ArrayList;

import java.util.ArrayList;

public class Rectangle extends Polygon {

    // field //

    //private ArrayList<Integer> sides;

    // constructor //

    public Rectangle(int firstSide, int twiceSide, int thirdSide, int forthSide) {
        //sides = new ArrayList<Integer>();
        sides.add(firstSide);
        sides.add(twiceSide);
        sides.add(thirdSide);
        sides.add(forthSide);
    }

    // method //


    public ArrayList getSides() {
        return sides;
    }

    public boolean isSquare() {
        if (sides.get(0).equals(sides.get(1)) &&
                sides.get(0).equals(sides.get(2)) &&
                sides.get(0).equals(sides.get(3))) {
            return true;
        } else {
            return false;
        }
    }

    public double calculatePerimeter() {
        return (sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3));
    }

    public double calculateArea() {
        return (sides.get(0) * sides.get(1));
    }

    public void draw() {
        System.out.println("model : Rectangle");
        System.out.println("Perimeter : " + calculatePerimeter());
        System.out.println("Area : " + calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj ){
            return true ;
        }
        if(! (obj instanceof Rectangle ) ){
            return false ;
        }
        if(((Rectangle) obj).sides.containsAll(sides)){
            return true ;
        }
        else {
            return false ;
        }
    }

    public String toString() {
        return (getClass().getSimpleName() + " - " + sides.get(0) + " - " + sides.get(1) + " - " + sides.get(2) + " - " + sides.get(3));
    }

}
