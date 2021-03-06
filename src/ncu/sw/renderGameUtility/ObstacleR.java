package ncu.sw.renderGameUtility;

import javafx.scene.canvas.GraphicsContext;
import ncu.sw.gameUtility.GameObject;
import ncu.sw.gameUtility.Obstacle;

/**
 * Created by Arson on 2016/11/1.
 */
public class ObstacleR extends GameObjectR {
    public  ObstacleR(){}
    public ObstacleR ( double x,double y ) {
        super ( x,y,20,20 );
    }

    @Override
    public void draw (GraphicsContext ctx, Point ViewPortCenter ) {
        setHightandWidth(ImageUtility.obstacleImage.getHeight(),ImageUtility.obstacleImage.getWidth());
        double x = getPosition ().x - ViewPortCenter.x-getWidth()/2;
        double y = getPosition ().y - ViewPortCenter.y-getHight()/2;
        ctx.drawImage ( ImageUtility.obstacleImage , x, y);
    }
    @Override
    public void copyFromCmd(GameObject cmd){
        if(cmd instanceof Obstacle){
            setPosition ( cmd.getPositionX (),cmd.getPositionY () );
        }
    }
}