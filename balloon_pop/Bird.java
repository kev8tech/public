import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
 
public class Bird {
   
    //declare instance variables
    private int x;
    private int y;
    private int width;
    private int height;
    private Image image;
 
    //constructor
    public Bird() {
        x = 250;
        y = 350;
        width = 40;
        height = 30;
        image = Toolkit.getDefaultToolkit().getImage("bird.png");
    }
 
    //draw the bird
    public void draw(Graphics g) {
        g.drawImage(image, x, y, width, height, null);
    }
 
    //move the bird left
    public void moveLeft() {
        if (x > 0) {
            x -= 10;
        }
    }
 
    //move the bird right
    public void moveRight() {
        if (x < 520) {
            x += 10;
        }
    }
}