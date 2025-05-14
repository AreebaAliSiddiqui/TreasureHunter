package Object;

import Main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_YellowRose extends SuperObject{

    GamePanel gp ;

public OBJ_YellowRose (GamePanel gp) {

    this.gp = gp;

    name= "YRose";
    try {

        image = ImageIO.read(getClass().getResourceAsStream("/objects/yellowrose.png"));
        uTool.scaleImage(image , gp.tileSize , gp.tileSize);

    }catch(IOException e) {
        e.printStackTrace();

    }

}
}
