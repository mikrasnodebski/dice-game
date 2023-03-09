package casino;
import player.Player;

public class Casino implements Playable {
    private LinkedList<Player> players;

    public Casino(LinkedList<Player> players){
        this.players = players;
    }

    public Casino(){
        this.players = new LinkedList<Player>();
    }

}