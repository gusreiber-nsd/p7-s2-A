public class Cave {
    
    private int width;
    private int height;
    private Location[][] locs;

    public Cave(int width, int height){
        this.width = width;
        this.height = height;
        locs = new Location[height][width];
        for(int y = 0 ; y < height; y++)
            for(int x = 0; x < width; x++) 
                locs[y][x] = new Location(); 
        
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Location getLocation(int x, int y) {
        return locs[y][x];
    }
}
