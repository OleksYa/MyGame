package MainPack;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Painter extends JPanel {
    private MouseInputs mouseInputs;
    private float x = 100, y = 100;
    private int frames = 0;
    private long lastTCheck = 0;
    private BufferedImage img;

    public Painter() {
        mouseInputs = new MouseInputs(this);
        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseMotionListener(mouseInputs);
        importImage();
    }

    private void importImage() {
        InputStream inputStream = getClass().getResourceAsStream("/NinjaFrog/Fall (32x32).png");
        try {
            img = ImageIO.read(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setPreferredSize(size);
    }

    public void setObjPos(int xMouse, int yMouse) {
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
        g.drawImage(img, (int) x, (int) y, null);
        frames++;
        if (System.currentTimeMillis() - lastTCheck >= 1000) {
            lastTCheck = System.currentTimeMillis();
            System.out.println("FPS:" + frames);
            frames = 0;
        }
    }
}