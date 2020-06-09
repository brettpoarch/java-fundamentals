package labs_examples.objects_classes_methods.labs.objects;

public class Excercise_02_FamilyController {

    public static void main(String[] args) {

        Excercise_02_FamilyAge mamaAge = new Excercise_02_FamilyAge(36);
        Excercise_02_FamilyTitle mamaTitle = new Excercise_02_FamilyTitle("Mama");

        System.out.println("Regina is the " + mamaTitle.title + " and she is " + mamaAge.age + " years old");
    }
}
