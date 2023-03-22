package PlGameInputs;

import platformGame.Game;
import platformGame.GamePannel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {
    private GamePannel gamePannel;
    public MouseInputs(GamePannel gamePannel){
        this.gamePannel = gamePannel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("mouse clicked!");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        //gamePannel.setRect(e.getX(),e.getY());
    }
}
