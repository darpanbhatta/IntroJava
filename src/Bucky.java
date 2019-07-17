import java.util.Scanner;

public class Bucky {
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);

        /*
        Tuna tunaObject = new Tuna();
        System.out.println("Enter your name");
        String name = bucky.nextLine();

        tunaObject.simpleMessage(name);

        */

        Dog jeff = new Dog(false, "Jeff",0,5.5);

        System.out.println(jeff.isSpotted());
        jeff.setSpotted(false);
        System.out.println(jeff.isSpotted());


    }

}
