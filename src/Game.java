import java.util.ArrayList;

public class Game{
    private ArrayList<Player> players;
    
    public Game(){

    }

    public void addPlayer(Player p){
        this.players.add(p);
    }

    public boolean canMove(Player p, Location l){
        for(Location a:l.getAdjacents())
            if(p.getLocation() == a) return true;
        return false;
    }

}