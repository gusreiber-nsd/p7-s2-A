
public class Control {

    private Cave map;
    private GUI gui;

    public Control(){
        map = new Cave(5,5);
        gui = new GUI(this);
    }

    public Location getLocation(int x, int y) {
        return map.getLocation(x,y);
    }

    public Cave getCave() {
        return map;
    }

    void placePlayer(Player player, int x, int y) {
        map.getLocation(x, y).add(player);
    }

}
