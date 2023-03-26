package platformGame;
public class Game implements Runnable {
   private GameWindow gameWindow;
   private GamePannel gamePannel;
   private Thread gameThread;
   private final int set_FPS = 150;

    public Game(){

        gamePannel = new GamePannel();
        gameWindow = new GameWindow(gamePannel);
        gamePannel.requestFocus();
        startGameLoop();

    }
    public void startGameLoop(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
        double timePerFrame = 1000000000.0/set_FPS;//nano second
        long lastFrame = System.nanoTime();
        long now =System.nanoTime();

        while(true){
            now = System.nanoTime();
            if( now - lastFrame >= timePerFrame){
                gamePannel.repaint();
                lastFrame = now;

            }
        }

    }
}
