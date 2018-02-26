import java.util.*;

public class RLE {
    public static void textMenu (int menuOption) { //somehow link this to the menu options so when the user hits one, it goes to main
        System.out.println("What would you like to do?");
        System.out.println("1.Input string to be encoded");
        System.out.println("2.View encoded string");
        System.out.println("3.View decoded string");
        System.out.println("4.Exit program"); //have this whole thing in a loop so that when user hits 4 it exits
        System.out.println("Option: ");
        return;

    }
    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("1.Input string to be encoded");
        System.out.println("2.View encoded string");
        System.out.println("3.View decoded string");
        System.out.println("4.Exit program"); //have this whole thing in a loop so that when user hits 4 it exits
        System.out.print("Option: ");

        Scanner scn = new Scanner(System.in);
        int menuOption = scn.nextInt();
        Scanner character = new Scanner(System.in);
        char userString = character.next().charAt(0);

        while (true) {
            if (menuOption == 1) {
                System.out.println("\n Enter message: " + userString);
                textMenu(1);
            }
            if (menuOption == 2) {
                System.out.println("The encoded data is: ");
                System.out.print("\n");
                textMenu(2);
            }
            if (menuOption == 3) {
                System.out.println("The decoded data is: ");
                System.out.print("\n");
                textMenu(3);
            }
            if (menuOption == 4) {
                break;
            }
        }

    }
}


//while loop with the main reference in it textMenu(1,2,3,4)