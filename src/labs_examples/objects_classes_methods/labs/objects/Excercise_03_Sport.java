package labs_examples.objects_classes_methods.labs.objects;

public class Excercise_03_Sport {

    String sport;
    int players;
    boolean isGameToday;

    public Excercise_03_Sport() {};

    public Excercise_03_Sport(String sport, int players) {
        this.sport = sport;
        this.players = players;
    }

    public Excercise_03_Sport(boolean isGameToday, String sport, int players) {
        this.isGameToday = isGameToday;
        this.sport = sport;
        this.players = players;
    }

}
