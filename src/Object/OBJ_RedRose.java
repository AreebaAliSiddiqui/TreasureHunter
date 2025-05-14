package Object;

import Main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_RedRose extends SuperObject {

    GamePanel gp;

    public OBJ_RedRose (GamePanel gp) {

        this.gp = gp;
        name= "RedRose";
        try {

            image = ImageIO.read(getClass().getResourceAsStream("/objects/RedRose.png"));
            uTool.scaleImage(image , gp.tileSize , gp.tileSize);

        }catch(IOException e) {
            e.printStackTrace();

        }

    }
}
