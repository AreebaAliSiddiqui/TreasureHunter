package tile;

import Main.GamePanel;
import Main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class TileManager {

    GamePanel gp ;
    public Tile[] tile;
    public int mapTileNum [][];



    public TileManager(GamePanel gp) {

        this.gp = gp;

        tile = new Tile[50];
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage ();
        loadMap("/maps/worldV2.txt");

    }
    public void getTileImage () {

        // PLACEHOLDER
            setup(0,"grasstile", false);
            setup(1 ,"grasstile", false);
            setup(2 , "grasstile" , false);
            setup(3 , "grasstile" , false);
            setup(4 , "grasstile" , false);
            setup(5 , "grasstile" , false);
            setup(6 , "grasstile" , false);
            setup(7 , "grasstile" , false);
            setup(8 , "grasstile" , false);
            setup(9 , "grasstile" , false);
            setup(10 , "grasstile" , false);

            // place

            setup(11 , "grasstile" , false);
            setup(12 , "water00" , true);
            setup(13 , "water01" , true);
            setup(14 , "water02" , true);
            setup(15 , "water03" , true);
            setup(16 , "water04" , true);
            setup(17 , "water05" , true);
            setup(18 , "water06" , true);
            setup(19 , "water07" , true);
            setup(20 , "water08" , true);
            setup(21 , "water09" , true);
            setup(22 , "water10" , true);
            setup(23 , "water11" , true);
            setup(24 , "water12" , true);
            setup(25 , "water13" , true);
            setup(26 , "road00" , false);
            setup(27 , "road01" , false);
            setup(28 , "road02" , false);
            setup(29 , "road03" , false);
            setup(30 , "road04" , false);
            setup(31 , "road05" , false);
            setup(32 , "road06" , false);
            setup(33 , "road07" , false);
            setup(34 , "road08" , false);
            setup(35 , "road09" , false);
            setup(36 , "road10" , false);
            setup(37 , "road11" , false);
            setup(38 , "road12" , false);
            setup(39 , "earth" , false);
            setup(40 , "wall" , false);
            setup(41 , "tree" , false);

    }

    public void setup(int index ,String imageName , boolean collision){

        UtilityTool uTool = new UtilityTool();

        try{
            tile[index]=new Tile();
            tile[index].image= ImageIO.read(getClass().getResourceAsStream("/tiles/" + imageName +".png"));
            tile[index].image =uTool.scaleImage(tile[index].image, gp.tileSize , gp.tileSize);
            tile[index].collision = collision;

        }catch(IOException e){
            e.printStackTrace();

        }

    }
    public void loadMap(String filePath) {
        try {
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int row = 0;
            String line;

            while ((line = br.readLine()) != null && row < gp.maxWorldRow) {
                String[] numbers = line.trim().split("\\s+"); // Split by one or more spaces
                for (int col = 0; col < numbers.length && col < gp.maxWorldCol; col++) {
                    try {
                        mapTileNum[col][row] = Integer.parseInt(numbers[col]);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid number at row " + row + ", col " + col + ": " + numbers[col]);
                        mapTileNum[col][row] = 0; // Default value
                    }
                }
                row++;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public void draw(Graphics2D g2) {

        int worldCol = 0;
        int worldRow = 0;


        while ( worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {

            int tileNum = mapTileNum[ worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
               worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
               worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
               worldY - gp.tileSize < gp.player.worldY + gp.player.screenY )  {

            g2.drawImage( tile [tileNum].image , screenX, screenY, gp.tileSize , gp.tileSize ,null);
            }
            worldCol ++;


            if ( worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow ++;


            }
        }
}

}
