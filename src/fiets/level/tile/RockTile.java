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
public class RockTile extends Tile {

    public RockTile(Sprite sprite) {
        super(sprite);
    }
    
    @Override
    public boolean solid() {
        return true;
    }
    
}
