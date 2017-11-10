/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiets.entity.mob;

import fiets.entity.Entity;
import fiets.graphics.Sprite;
import fiets.level.Sizes;

/**
 *
 * @author Jerry
 */
public abstract class Mob extends Entity {
    
    protected Sprite sprite;
    protected int dir = 2; //is de direction, richting waar ie heen loopt: 0 noord, 1 oost, 2 zuid, 3 west
    protected boolean moving = false;
    
    public void move(int xAs, int yAs) {
        if (xAs > 0) dir = 1;
        if (xAs < 0) dir = 3;
        if (yAs > 0) dir = 2;
        if (yAs < 0) dir = 0;
        
        if (!collision(xAs, yAs)) {
            x += xAs;
            y += yAs;
        }
    }
    
    @Override
    public void update() {
        
    }
    
    private boolean collision(int xAs, int yAs) {
        boolean solid = false;
        
        if (level.getTile((x + xAs)/Sizes.TILE.getSize(), (y + yAs)/Sizes.TILE.getSize()).solid()) 
            solid = true;
        
        return solid;
    }
    
    public void render() {
        
    }
    
}
