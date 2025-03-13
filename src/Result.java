import java.util.ArrayList;

public class Result implements Results {
    // Properties
    private ArrayList<Player> players;

    // Constructors
    public Result() {}

    // Methods
    public void addPlayer(Player p){
        this.players.add(p);
    }
    public void addPlayers(ArrayList<Player> p){
        for(Player player : p){
            addPlayer(player);
        }
    }
    
}
