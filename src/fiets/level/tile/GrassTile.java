/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiets.level.tile;

import fiets.graphics.Screen;
import fiets.graphics.Sprite;
import fiets.level.Sizes;

/**
 *
 * @author Jerry
 */
public class GrassTile extends Tile {
    
    public GrassTile(Sprite sprite) {
        super(sprite);
    }
    
    @Override
    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << (int)(Math.sqrt((double)Sizes.TILE.getSize())), y << (int)(Math.sqrt((double)Sizes.TILE.getSize())), this);
    }
    
}
