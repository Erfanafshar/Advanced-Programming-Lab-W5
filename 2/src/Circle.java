public class Circle extends Shape {

    // filed //

    private int radius;

    // constructor //

    public Circle(int shoae) {
        radius = shoae;
    }

    // method //

    public int getRadius() {
        return radius;
    }

    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    public void draw() {
        System.out.println("model : Circle");
        System.out.println("Perimeter : " + calculatePerimeter());
        System.out.println("Area : " + calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj ){
            return true ;
        }
        if(! (obj instanceof Circle ) ){
            return false ;
        }
        if(((Circle) obj).radius == radius ){
            return true ;
        }
        else {
            return false ;
        }
    }

    public String toString() {
        return (getClass().getSimpleName() + " - " + radius);
    }
}
