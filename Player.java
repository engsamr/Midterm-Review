import java.util.ArrayList;

public class Player extends Member {
    private int shirtNo;
    private int[] cards = new int[3];
    private static ArrayList<Player> players = new ArrayList<>();

    public Player(String name, int shirtNo) {
        super(name);
        this.shirtNo = shirtNo;
    }

    public int getShirtNo() {
        return shirtNo;
    }

    public void setShirtNo(int shirtNo) {
        this.shirtNo = shirtNo;
    }

    public int[] getCards() {
        return cards;
    }

    public void setCards(int[] cards) {
        this.cards = cards;
    }

    public static ArrayList<Player> getPlayers() {
        return players;
    }

    public static void setPlayers(ArrayList<Player> players) {
        Player.players = players;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s, Shirt Number: %d", this.getName(), shirtNo);
    }

    public ArrayList<String> getRCP() {
        ArrayList<String> RCP = new ArrayList<>();
        for (Player p : players) {
            if (p.cards[2] > 0) {
                RCP.add(p.getName());
            }
        }
        return RCP;
    }
}
