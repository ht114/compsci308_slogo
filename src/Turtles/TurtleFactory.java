package Turtles;

import GUIFeatures.SlogoCanvas;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Hsingchih Tang
 * Produces new TurtleView objects and manages all TurtleViews that have been created in the program
 */
public class TurtleFactory {
    private final Image DEFAULT_TURTLE_IMG = new Image(this.getClass().getClassLoader().getResourceAsStream("Turtle.png"));
    private final Color DEFAULT_PEN_COLOR = Color.WHITE;
    private Map<Integer,TurtleView> myTurtles;

    public TurtleFactory(){
        this.myTurtles = new HashMap<>();
    }

    public TurtleView makeTurtle(int id){
        TurtleView newTurtle = new TurtleView(id, DEFAULT_TURTLE_IMG,DEFAULT_PEN_COLOR);
        myTurtles.put(id,newTurtle);
        return newTurtle;
    }

    public TurtleView makeTurtle(int id, String imgSrc){
        TurtleView newTurtle = new TurtleView(id, new Image(this.getClass().getClassLoader().getResourceAsStream(imgSrc)),DEFAULT_PEN_COLOR);
        myTurtles.put(id,newTurtle);
        return newTurtle;
    }

    public TurtleView getTurtle(int id){
        return myTurtles.get(id);
    }

}
