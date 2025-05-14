package Main;

import Object.OBJ_Key;
import Object.OBJ_Door;
import Object.OBJ_Chest;
import Object.OBJ_RedRose;
import Object.OBJ_YellowRose;
import Object.OBJ_lilac;
import Object.OBJ_Boots;

public class AssetSetter {

    GamePanel gp ;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;

    }
    public void setObject() {

        gp.obj[0 ]= new OBJ_Key(gp);
        gp.obj[0 ].worldX = 23 * gp.tileSize;
        gp.obj[0 ].worldY = 7 * gp.tileSize;

        gp.obj[1]= new OBJ_Key (gp);
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 40 * gp.tileSize;

     //   gp.obj[2]= new OBJ_Key (gp);
     //   gp.obj[2].worldX = 38 * gp.tileSize;
     //   gp.obj[2].worldY = 8 * gp.tileSize;

        gp.obj[3]= new OBJ_Door (gp);
        gp.obj[3].worldX = 10 * gp.tileSize;
        gp.obj[3].worldY = 13 * gp.tileSize;

        gp.obj[4]= new OBJ_Door (gp);
        gp.obj[4].worldX = 8 * gp.tileSize;
        gp.obj[4].worldY = 28 * gp.tileSize;

        gp.obj[5]= new OBJ_Door (gp);
        gp.obj[5].worldX = 23 * gp.tileSize;
        gp.obj[5].worldY = 8 * gp.tileSize;

        gp.obj[6]= new OBJ_Chest (gp);
        gp.obj[6].worldX = 10 * gp.tileSize;
        gp.obj[6].worldY = 9 * gp.tileSize;

        gp.obj[7]= new OBJ_RedRose(gp);
        gp.obj[7].worldX = 26 * gp.tileSize;
        gp.obj[7].worldY = 10 * gp.tileSize;

        gp.obj[8]= new OBJ_RedRose (gp);
        gp.obj[8].worldX = 25 * gp.tileSize;
        gp.obj[8].worldY = 19 * gp.tileSize;

        gp.obj[9]= new OBJ_RedRose (gp);
        gp.obj[9].worldX = 25 * gp.tileSize;
        gp.obj[9].worldY = 12 * gp.tileSize;

        gp.obj[10]= new OBJ_YellowRose (gp);
        gp.obj[10].worldX = 26 * gp.tileSize;
        gp.obj[10].worldY = 11 * gp.tileSize;

        gp.obj[11]= new OBJ_YellowRose (gp);
        gp.obj[11].worldX = 40 * gp.tileSize;
        gp.obj[11].worldY = 12 * gp.tileSize;

        gp.obj[12]= new OBJ_YellowRose (gp);
        gp.obj[12].worldX = 20 * gp.tileSize;
        gp.obj[12].worldY = 12 * gp.tileSize;

        gp.obj[13]= new OBJ_lilac (gp);
        gp.obj[13].worldX = 20 * gp.tileSize;
        gp.obj[13].worldY = 12 * gp.tileSize;

        gp.obj[14]= new OBJ_lilac (gp);
        gp.obj[14].worldX = 26 * gp.tileSize;
        gp.obj[14].worldY = 12 * gp.tileSize;

        gp.obj[15]= new OBJ_lilac (gp);
        gp.obj[15].worldX = 25 * gp.tileSize;
        gp.obj[15].worldY = 23 * gp.tileSize;

        gp.obj[16]= new OBJ_RedRose (gp);
        gp.obj[16].worldX = 21 * gp.tileSize;
        gp.obj[16].worldY = 19 * gp.tileSize;

        gp.obj[17]= new OBJ_YellowRose (gp);
        gp.obj[17].worldX = 21 * gp.tileSize;
        gp.obj[17].worldY = 23 * gp.tileSize;

        gp.obj[18]= new OBJ_lilac(gp);
        gp.obj[18].worldX = 20 * gp.tileSize;
        gp.obj[18].worldY = 9 * gp.tileSize;

        gp.obj[19]= new OBJ_RedRose (gp);
        gp.obj[19].worldX = 20 * gp.tileSize;
        gp.obj[19].worldY = 8 * gp.tileSize;

        gp.obj[20] = new OBJ_YellowRose (gp);
        gp.obj[20].worldX = 20 * gp.tileSize;
        gp.obj[20].worldY = 7 * gp.tileSize;

        gp.obj[21]= new OBJ_lilac (gp);
        gp.obj[21].worldX = 21 * gp.tileSize;
        gp.obj[21].worldY = 7 * gp.tileSize;

        gp.obj[22]= new OBJ_RedRose (gp);
        gp.obj[22].worldX = 22 * gp.tileSize;
        gp.obj[22].worldY = 7 * gp.tileSize;

        gp.obj[23]= new OBJ_YellowRose(gp);
        gp.obj[23].worldX = 24 * gp.tileSize;
        gp.obj[23].worldY = 7 * gp.tileSize;

        gp.obj[24]= new OBJ_lilac (gp);
        gp.obj[24].worldX = 25 * gp.tileSize;
        gp.obj[24].worldY = 7 * gp.tileSize;

        gp.obj[25]= new OBJ_RedRose (gp);
        gp.obj[25].worldX = 26 * gp.tileSize;
        gp.obj[25].worldY = 7 * gp.tileSize;

        gp.obj[26]= new OBJ_YellowRose(gp);
        gp.obj[26].worldX = 26 * gp.tileSize;
        gp.obj[26].worldY = 8 * gp.tileSize;

        gp.obj[27]= new OBJ_lilac (gp);
        gp.obj[27].worldX = 26 * gp.tileSize;
        gp.obj[27].worldY = 9 * gp.tileSize;

        gp.obj[28]= new OBJ_RedRose (gp);
        gp.obj[28].worldX = 20 * gp.tileSize;
        gp.obj[28].worldY = 10 * gp.tileSize;

        gp.obj[29]= new OBJ_YellowRose(gp);
        gp.obj[29].worldX = 20 * gp.tileSize;
        gp.obj[29].worldY = 11 * gp.tileSize;

        gp.obj[30]= new OBJ_lilac (gp);
        gp.obj[30].worldX = 41 * gp.tileSize;
        gp.obj[30].worldY = 12 * gp.tileSize;

        gp.obj[31]= new OBJ_RedRose (gp);
        gp.obj[31].worldX = 21 * gp.tileSize;
        gp.obj[31].worldY = 12* gp.tileSize;

        gp.obj[32]= new OBJ_YellowRose(gp);
        gp.obj[32].worldX = 37 * gp.tileSize;
        gp.obj[32].worldY = 7 * gp.tileSize;

        gp.obj[33]= new OBJ_lilac (gp);
        gp.obj[33].worldX = 36 * gp.tileSize;
        gp.obj[33].worldY = 7 * gp.tileSize;

        gp.obj[34]= new OBJ_RedRose (gp);
        gp.obj[34].worldX = 35 * gp.tileSize;
        gp.obj[34].worldY = 7 * gp.tileSize;

        gp.obj[35]= new OBJ_YellowRose(gp);
        gp.obj[35].worldX = 34 * gp.tileSize;
        gp.obj[35].worldY = 7 * gp.tileSize;

        gp.obj[36]= new OBJ_lilac (gp);
        gp.obj[36].worldX = 34 * gp.tileSize;
        gp.obj[36].worldY = 8 * gp.tileSize;

        gp.obj[37]= new OBJ_YellowRose (gp);
        gp.obj[37].worldX = 34 * gp.tileSize;
        gp.obj[37].worldY = 9 * gp.tileSize;

        gp.obj[38]= new OBJ_Boots(gp);
        gp.obj[38].worldX = 37 * gp.tileSize;
        gp.obj[38].worldY = 42 * gp.tileSize;

    }
}
