package platformGame;
import PlGameInputs.KeyboardInputs;
import PlGameInputs.MouseInputs;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.util.Random;

public class GamePannel extends JPanel {

    float xDalta = 100 , XDir = 1f;
    float yDalta = 100 ,  YDir = 1f;
    long lastCheck = 0;
    int frame = 0;
    public Color color = new Color(150,10,20);
    Random random = new Random();
    MouseInputs mouseInputs =  new MouseInputs(this);
    public GamePannel(){
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    public void changeXDalta(int value){
        this.xDalta += value;
        repaint();
    }
    public void changeYDalta(int value){
        this.yDalta += value;
        //repaint();
    }
    public void setRect(int x , int y){
        this.xDalta = x;
        this.yDalta = y;
      //  repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        updateRact();
        g.setColor(color);
        g.fillRect((int)xDalta, (int)yDalta,200,100);
        frame++;
        if(System.currentTimeMillis() - lastCheck >= 1000){
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS " + frame);
            frame=0;
        }
        //repaint();
    }
    public void updateRact(){//changing position and direction
        xDalta += XDir;
        if(xDalta>400 || xDalta <0){
            XDir*=-1;
            color = getRndColor();
        }
        yDalta += YDir;
        if(yDalta>400 || yDalta <0){
            YDir*=-1;
            color = getRndColor();
        }
    }

    private Color getRndColor() {// for changing color
        int r = random.nextInt(255);
        int b = random.nextInt(255);
        int g = random.nextInt(255);
        return new Color(r,g,b);
    }

}
