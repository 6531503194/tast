package PlGameInputs;
import platformGame.Game;
import platformGame.GamePannel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyboardInputs implements KeyListener{

    private GamePannel gamePannel;
    public KeyboardInputs(GamePannel gamePannel){
        this.gamePannel = gamePannel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("A key is passed");
        switch(e.getKeyCode()){
            case KeyEvent.VK_W:
               // System.out.println("It's W");
                gamePannel.changeYDalta(5);
                break;
            case KeyEvent.VK_A:
                gamePannel.changeXDalta(-5);
                break;
            case KeyEvent.VK_S:

                gamePannel.changeYDalta(-5);
                break;
            case KeyEvent.VK_D:
                gamePannel.changeXDalta(5);

                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
