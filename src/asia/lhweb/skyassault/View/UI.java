package asia.lhweb.skyassault.View;


import asia.lhweb.skyassault.controller.PlaneController;

import javax.swing.*;

public class UI extends JFrame {

    private LoginJFrame loginJFrame;
    private GameJFrame gameJFrame;
    private PlaneController planeController;

    public UI(PlaneController planeController) {
        this.planeController = planeController;
        loginJFrame = new LoginJFrame(this.planeController);
        gameJFrame = new GameJFrame(this.planeController);
    }
    public void endGame(){
        //关闭窗口会自动结束进程
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public LoginJFrame getLoginJFrame() {
        return loginJFrame;
    }

    public void setLoginJFrame(LoginJFrame loginJFrame) {
        this.loginJFrame = loginJFrame;
    }
    public GameJFrame getGameJFrame() {
        return gameJFrame;
    }

    public void setGameJFrame(GameJFrame gameJFrame) {
        this.gameJFrame = gameJFrame;
    }

    public PlaneController getPlaneController() {
        return planeController;
    }

    public void setPlaneController(PlaneController planeController) {
        this.planeController = planeController;
    }
}