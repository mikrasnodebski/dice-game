package casino;

public class Casino implements Playable {
    private LinkedList<Integer> players;

    public Casino(LinkedList<Integer> players){
        this.players = players;
    }

    public Casino(){
        this.players = new LinkedList<Integer>();
    }

}