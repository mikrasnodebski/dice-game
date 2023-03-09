package player;

public class Player{
    private String name;
    private int points;
    private ArrayList<Integer> dice;

    public Player(String name){
        this.name = name;
        this.points = 0;
        this.dice = new ArrayList<Integer>();
    }
}