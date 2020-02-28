//import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends Polygon{

    // field //

    //private ArrayList<Integer> sides;

    // constructor //

    public Triangle(int firstSide, int twiceSide, int thirdSide) {
        //sides = new ArrayList<Integer>();
        sides.add(firstSide);
        sides.add(twiceSide);
        sides.add(thirdSide);
    }

    // method //


    /*public ArrayList<Integer> getSides() {
        return sides;
    }*/

    public boolean isEquilateral() {
        if (sides.get(0).equals(sides.get(1)) &&
                sides.get(0).equals(sides.get(2))) {
            return true;
        } else {
            return false;
        }
    }

    public double calculatePerimeter() {
        return (sides.get(0) + sides.get(1) + sides.get(2));
    }


    public double calculateArea() {
        int p = ( sides.get(0) + sides.get(1) + sides.get(2) ) / 2;
        return Math.pow( p *(p-sides.get(0)) * (p-sides.get(1)) * (p-sides.get(2)) , 0.5);
    }


    public void draw() {
        System.out.println("model : Triangle");
        System.out.println("Perimeter : " + calculatePerimeter());
        System.out.println("Area : " + calculateArea());
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj ){
            return true ;
        }
        if(! (obj instanceof Triangle ) ){
            return false ;
        }
        if(((Triangle) obj).sides.containsAll(sides)){
            return true ;
        }
        else {
            return false ;
        }
    }

    public String toString() {
        return (getClass().getSimpleName()+ " - " + sides.get(0) + " - " + sides.get(1) + " - " + sides.get(2));
    }
}
