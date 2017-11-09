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
public class ThonkingTile extends Tile {

    public ThonkingTile(Sprite sprite) {
        super(sprite);
    }
    
    @Override
    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }
    
}
