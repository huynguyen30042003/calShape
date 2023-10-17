package Controller;

import java.io.IOException;

import Common.Algorithm;
import Common.Library;
import Model.Circle;
import Model.Rectangle;
import Model.Triangle;
import Views.Menu;

public class ManagerShape extends Menu<String> {
    static String[] options = { "input",
            "Perform function",
            "Exit" };
    Algorithm algorithm = new Algorithm();
    Library library = new Library();
    Rectangle rectangle = new Rectangle();
    Circle circle = new Circle();
    Triangle trigle = new Triangle();

    public ManagerShape() {
        super("Manager Shape", options);
    }

    @Override
    public void execute(int n) throws IOException {
        switch (n) {
            case 1:
                rectangle = library.inputRectangle();
                circle = library.inputCircle();
                trigle = library.inputTriangle();
                break;
            case 2:
                algorithm.display(trigle, rectangle, circle);

                break;
            case 3:
                System.exit(0);
                break;
        }

    }



    public static void main(String[] args) throws IOException {
        new ManagerShape().run();
    }

}
