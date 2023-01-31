import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BalloonPop {
   
    //declare instance variables
    private JFrame frame;
    private JPanel panel;
    private Bird bird;
    private Balloon balloon;
    private Timer timer;
    private int delay = 10;
    private int score = 0;
    private JLabel scoreLabel;
 
    //constructor
    public BalloonPop() {
        frame = new JFrame();
        panel = new JPanel();
        bird = new Bird();
        balloon = new Balloon();
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.repaint();
            }
        });
        scoreLabel = new JLabel();
        init();
    }
 
    //initialize the game
    private void init() {
        //set up the frame
        frame.setTitle("Balloon Pop");
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
 
        //set up the panel
        panel.setLayout(null);
        panel.add(scoreLabel);
        scoreLabel.setBounds(500, 10, 80, 20);
        scoreLabel.setText("Score: "+score);
        panel.add(bird);
        //add listeners
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    bird.moveLeft();
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    bird.moveRight();
                }
            }
        });
 
        //start the timer
        timer.start();
    }
 
    //repaint the panel
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        bird.draw(g);
        balloon.draw(g);
    }
 
    //update the score
    public void updateScore() {
        score++;
        scoreLabel.setText("Score: "+score);
    }
 
    //main method
    public static void main(String[] args) {
        new BalloonPop();
    }
}