package Inputs;

import MainPack.Painter;

import javax.swing.event.ChangeEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    private Painter painter;

    public KeyboardInputs(Painter painter) {
        this.painter = painter;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W -> painter.ChangeY(-5);
            case KeyEvent.VK_S -> painter.ChangeY(5);
            case KeyEvent.VK_A -> painter.ChangeX(-5);
            case KeyEvent.VK_D -> painter.ChangeX(5);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
