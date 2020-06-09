package labs_examples.objects_classes_methods.labs.objects;

public class Excercise_03_SportController {

    public static void main(String[] args) {

        Excercise_03_Sport sport1 = new Excercise_03_Sport();

        Excercise_03_Sport sport2 = new Excercise_03_Sport("Baseball", 9);

        Excercise_03_Sport sport3 = new Excercise_03_Sport(true, "Football", 11);

        sport1.sport = "Bsketball";
        sport1.players = 5;

        System.out.println("We need " + sport1.players + " players to play " + sport1.sport);
        System.out.println("We need " + sport2.players + " players to play " + sport2.sport);
        System.out.println("We need " + sport2.players + " players to play " + sport2.sport + ". Is today game day? " + sport3.isGameToday );
    }
}
