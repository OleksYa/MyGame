package MainPack;

public class Game implements Runnable{
    private Window window;
    private Painter painter;
    private Thread gameThread;
    private final int FPS_WANTED = 120;
    public Game() {
        painter = new Painter();
        window = new Window(painter);
        painter.requestFocus();
        startGameLoop();
    }
    private void startGameLoop(){
        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {
        double timePerFrame = 1000000000.0/FPS_WANTED;
        long lastFrame = System.nanoTime();
        long timeNow = System.nanoTime();
        while(true){
            timeNow = System.nanoTime();
            if(timeNow - lastFrame >= timePerFrame){
                painter.repaint();
                lastFrame = timeNow;
            }
        }

    }
}
