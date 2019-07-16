import java.util.Scanner;

public class Bucky {
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);

        Tuna tunaObject = new Tuna();
        System.out.println("Enter your name");
        String name = bucky.nextLine();

        tunaObject.simpleMessage(name);


    }

}
