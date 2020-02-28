import java.util.ArrayList;
public class Paint {

    // field //

    private ArrayList<Shape> shapes;

    // constructor //

    public Paint (){
        shapes = new ArrayList<>();
    }


    // method //

    public void describeEqualSides (){
        for ( int i = 0 ; i < shapes.size() ; i++){
            if(shapes.get(i) instanceof Rectangle){
                if(((Rectangle) shapes.get(i)).isSquare()){
                    System.out.println(shapes.get(i).toString());
                    System.out.println("morabae");
                }
            }
            if(shapes.get(i) instanceof Triangle){
                if(((Triangle) shapes.get(i)).isEquilateral()){
                    System.out.println("motesavi");
                }
            }

        }
    }

    public void addShape(Shape s){
        shapes.add(s);
    }
}

