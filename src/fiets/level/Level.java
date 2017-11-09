/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiets.level;

import fiets.graphics.Screen;
import fiets.level.tile.Tile;

/**
 *
 * @author Jerry
 */
public class Level {
    
    protected int width, height;
    protected int[] tilesInt;
    protected int[] tiles;
    
    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        tilesInt = new int[width * height];
        generateLevel();
    }
    
    public Level(String path) {
        loadLevel(path);
        generateLevel();
    }
    
    protected void generateLevel() {
        
    }
    
    protected void loadLevel(String path) {
        
    }
    
    public void update() {
        
    }
    
    private void time() {
        
    }
    
    public void render(int xScroll, int yScroll, Screen screen) {
        screen.setOffset(xScroll, yScroll);
        int x0 = xScroll >> 4; //coordinaat van linkerkant van het scherm
        int x1 = (xScroll + screen.width + 16) >> 4; //rechterkant van het scherm
        int y0 = yScroll >> 4; //bovenkant
        int y1 = (yScroll + screen.height + 16) >> 4; //onderkant
        
        for (int y = y0; y < y1; y++) {
            for (int x = x0; x < x1; x++) {
                getTile(x, y).render(x, y, screen); //rendert een tile op het scherm
            }
        }
    }
    
    //grass = 0x00FF21
    //flower = 0xFF0000
    //rock = 0x808080
    //thonking = 0xFFD800
    public Tile getTile(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) return Tile.voidTile; //ga je out of map? geef een void tile
        
        if (tiles[x+y*width] == 0xff00FF21) return Tile.grass;
        if (tiles[x+y*width] == 0xffFF0000) return Tile.flower;
        if (tiles[x+y*width] == 0xff808080) return Tile.rock;
        if (tiles[x+y*width] == 0xffFFD800) return Tile.thonking;
        
        return Tile.voidTile;
    }
    
}
