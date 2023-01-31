import java.awt.*;
import java.util.Random;

public class Balloon {
   
    //declare instance variables
    private int x, y;
    private int width = 40;
    private int height = 40;
    private Color color;
    private Random rand;
    private int speed;
 
    //constructor
    public Balloon() {
        x = rand.nextInt(550);
        y = 0;
        color = Color.RED;
        rand = new Random();
        speed = rand.nextInt(5)+1;
    }
 
    //draw the balloon
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
        y += speed;
    }
}