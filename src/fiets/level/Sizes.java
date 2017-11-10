package fiets.level;

/**
 *
 * @author Jerry
 */
public enum Sizes {
    
    TILE(16), // de grootte van 1 tile is 16x16
    PLAYER(32); //de grootte van je mannetje is NOG 32x32
    
    private final int size;
    
    Sizes(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
    
}
