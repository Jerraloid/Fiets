/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiets.entity.mob;

import fiets.graphics.Screen;
import fiets.graphics.Sprite;
import fiets.input.Keyboard;

/**
 *
 * @author Jerry
 */
public class Player extends Mob {
    
    private Keyboard input;
    private Sprite sprite;
    private int animation = 0;
    private boolean walking = false;
    
    public Player(Keyboard input) {
        this.input = input;
        sprite = Sprite.player_down;
    }
    
    public Player(int x, int y, Keyboard input) {
        this.x = x;
        this.y = y;
        this.input = input;
    }
    
    @Override
    public void update() {
        int xAs = 0, yAs = 0;
        
        if (animation < 7500) animation++; //zodat ie niet crasht als iemand de game telang open laat
        else animation = 0;
        
        if (input.up) yAs--;
        if (input.down) yAs++;
        if (input.left) xAs--;
        if (input.right) xAs++;
        
        if (xAs != 0|| yAs != 0) { 
            move(xAs, yAs);
            walking = true;
        }
        else {
            walking = false;
        }
    }
    
    @Override
    public void render(Screen screen) {
        int flip = 0;
        
        if (dir == 0)  {
            sprite = Sprite.player_up;
            if (walking) {
                if (animation % 20 > 10) {
                    sprite = Sprite.player_up_1;
                }
                else {
                    sprite = Sprite.player_up_2;
                }
            }
        }
        if (dir == 1) {
            sprite = Sprite.player_side;
            if (walking) {
                if (animation % 20 > 10) {
                    sprite = Sprite.player_side_1;
                }
                else {
                    sprite = Sprite.player_side_2;
                }
            }
        }
        if (dir == 2) { 
            sprite = Sprite.player_down;
            if (walking) {
                if (animation % 20 > 10) {
                    sprite = Sprite.player_down_1;
                }
                else {
                    sprite = Sprite.player_down_2;
                }
            }
        }
        if (dir == 3) {
            sprite = Sprite.player_side;
            flip = 1;
            if (walking) {
                if (animation % 20 > 10) {
                    sprite = Sprite.player_side_1;
                }
                else {
                    sprite = Sprite.player_side_2;
                }
            }
        }
        
        screen.renderPlayer(x-16, y-16, sprite, flip);
    }
    
}
