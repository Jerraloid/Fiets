/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiets.level.tile;

import fiets.graphics.Screen;
import fiets.graphics.Sprite;

/**
 *
 * @author Jerry
 */
public class Tile {
    
    public int x, y;
    public Sprite sprite;
    
    public static Tile grass = new GrassTile(Sprite.grass);
    public static Tile flower = new FlowerTile(Sprite.flower);
    public static Tile rock = new RockTile(Sprite.rock);
    public static Tile thonking = new ThonkingTile(Sprite.thonking);
    public static Tile voidTile = new VoidTile(Sprite.voidSprite);
    
    public static final int COL_GRASS = 0xff00FF21;
    public static final int COL_FLOWER = 0xffFF0000;
    public static final int COL_ROCK = 0xff808080;
    public static final int COL_THONKING = 0xffFFD800;
    
    Tile(Sprite sprite) {
        this.sprite = sprite;
    }
    
    public void render(int x, int y, Screen screen) {
        
    }
    
    public boolean solid() {
        return false;
    }
    
}
