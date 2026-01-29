import com.app.core.Box;
import com.app.core.Box;

public class Main {

    // method must be inside class
    public static Box getBox() {
        Box b = new Box(2, 3, 4);
        return b;
    }

    public static void main(String[] args) {
        Box box = getBox();
        System.out.println("Volume = " + box.volume());
    }
}
