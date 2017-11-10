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
    
    public static Level spawn = new SpawnLevel("/levels/level.png");
    
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
        int x0 = xScroll >> (int)(Math.sqrt((double)Sizes.TILE.getSize())); //coordinaat van linkerkant van het scherm
        int x1 = (xScroll + screen.width + Sizes.TILE.getSize()) >> (int)(Math.sqrt((double)Sizes.TILE.getSize())); //rechterkant van het scherm
        int y0 = yScroll >> (int)(Math.sqrt((double)Sizes.TILE.getSize())); //bovenkant
        int y1 = (yScroll + screen.height + Sizes.TILE.getSize()) >> (int)(Math.sqrt((double)Sizes.TILE.getSize())); //onderkant
        
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
        
        if (tiles[x+y*width] == Tile.COL_GRASS) return Tile.grass;
        if (tiles[x+y*width] == Tile.COL_FLOWER) return Tile.flower;
        if (tiles[x+y*width] == Tile.COL_ROCK) return Tile.rock;
        if (tiles[x+y*width] == Tile.COL_THONKING) return Tile.thonking;
        
        return Tile.voidTile;
    }
    
}
