public abstract class Shape {

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public void draw() {
        System.out.println("area : " + calculateArea());
    }

    public boolean equals;

    public String toString() {
        return " ";
    }

}

