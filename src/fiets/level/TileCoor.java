/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiets.level;

/**
 *
 * @author Jerry
 */
public class TileCoor {
    
    private int x, y;
    private final int TILE_SIZE = Sizes.TILE.getSize();
    
    public TileCoor(int x, int y) {
        this.x = x * TILE_SIZE;
        this.y = y * TILE_SIZE;
    }
    
    public int x() {
        return x;
    }
    
    public int y() {
        return y;
    }
    
    public int[] xy() {
        return new int[]{x, y};
    }
}
