public class Run {

    public static void main(String[] args) {

        Shape c = new Circle(4);
        System.out.println(c.toString());
        Paint p = new Paint() ;
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle(1, 1, 1, 1);
        Rectangle rect2 = new Rectangle(1, 1, 1, 1);

        p.addShape(circle1);
        p.addShape(circle2);
        p.addShape(rect1);
        p.describeEqualSides();
        p.addShape(rect2);
        System.out.println(rect1.equals(rect2));


    }

}
