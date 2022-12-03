package MainPack;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class Painter extends JPanel {
    private MouseInputs mouseInputs;
    private int x = 100, y = 100;
    private int frames = 0;
    private long lastTCheck = 0;

    public Painter() {
        mouseInputs = new MouseInputs(this);
        //TODO add odny xyünü
        addKeyListener(new KeyboardInputs(this));
        addMouseMotionListener(mouseInputs);
    }

    public void setObjPos(int xMouse, int yMouse){
        this.x = xMouse;
        this.y = yMouse;
    }
    public void ChangeX(int change) {
        this.x += change;
    }

    public void ChangeY(int change) {
        this.y += change;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(x, y, 60, 40);
        frames++;
        if(System.currentTimeMillis() - lastTCheck >= 1000){
            lastTCheck = System.currentTimeMillis();
            System.out.println("FPS:"+frames);
            frames = 0;
        }


    }
}