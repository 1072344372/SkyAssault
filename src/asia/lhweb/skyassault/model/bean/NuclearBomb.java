package asia.lhweb.skyassault.model.bean;

import asia.lhweb.skyassault.Util.ImageUtils;
import asia.lhweb.skyassault.constant.GameConstant;

import java.awt.*;

/**
 * 核弹
 *
 * @author 罗汉
 * @date 2024/01/26
 */// NuclearBomb奖励类
 public  class NuclearBomb extends FlyingObj {
    private boolean movingRight = true; // 标记Z字形移动方向
    public NuclearBomb(int x, int y) {
        flyX = x;
        flyY = y;
        flyH = 40;
        flyW = 40;
        flyType = 4; // 假设4代表核弹奖励
        flyName = "核弹";
        flyImage = ImageUtils.getNuclearBombImage(); // 使用合适的图片
    }

    @Override
    public void drawFlayer(Graphics g) {
        g.drawImage(flyImage, flyX, flyY, flyH, flyW, null);
    }

    @Override
    public void move() {
        if (movingRight) {
            flyX += flySpeed; // 向右移动
        } else {
            flyX -= flySpeed; // 向左移动
        }

        if (flyX <= 0 || flyX >= (GameConstant.GAME_WINDOW_LEFT_WIDTH - flyW)) {
            // 如果触边，改变方向，并向下移动
            movingRight = !movingRight;

        }
        flyY += 20;
    }
}