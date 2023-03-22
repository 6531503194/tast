package platformGame;
import javax.swing.JFrame;
public class GameWindow {
    private JFrame jFrame;
    public GameWindow(GamePannel gamePannel){

        jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.add(gamePannel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

    }
}

