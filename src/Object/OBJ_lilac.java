package Object;

import Main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_lilac extends SuperObject {

    GamePanel gp;

    public OBJ_lilac (GamePanel gp) {

        this.gp = gp;
        name= "lilac";
        try {

            image = ImageIO.read(getClass().getResourceAsStream("/objects/lilac.png"));
            uTool.scaleImage(image , gp.tileSize , gp.tileSize);

        }catch(IOException e) {
            e.printStackTrace();

        }

    }
}
