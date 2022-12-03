package MainPack;

import javax.swing.*;

public class Window {
    private JFrame jframe;

    public Window(Painter painter) {
        jframe = new JFrame();

        jframe.setSize(600,400);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.add(painter);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);



    }
}
