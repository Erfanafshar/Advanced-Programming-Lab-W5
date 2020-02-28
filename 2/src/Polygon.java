import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class Polygon extends Shape{

    // field //

    public ArrayList<Integer> sides ;





    // constructor //

    public Polygon (Integer... side ){
        sides = new ArrayList<Integer>();
        Collections.addAll(sides , side);
    }
    // method //
    public ArrayList getSides (){
        return sides ;
    }

}
