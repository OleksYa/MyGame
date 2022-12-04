package MainPack;

import javax.swing.*;

public class Window {
    private JFrame jframe;

    public Window(Painter painter) {
        jframe = new JFrame();

        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.add(painter);
        jframe.setLocationRelativeTo(null);
        jframe.pack();
        //jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jframe.setVisible(true);



    }
}
