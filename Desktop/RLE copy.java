import java.util.*;

public class RLE {

    public static int numOfDigits(int num) { //method 1
        int lengthOfNumber = num; //change num to the int when scanned in main
        return lengthOfNumber; ////https://stackoverflow.com/questions/30410753/how-to-count-the-number-of-digits-in-an-int-value
        toCharArray(lengthOfNumber, char strChar);
    }

    public static char[] toCharArray(int charCount, char strchar) { //Method 2
        char letterCount;
        int counter = 0; //for the letters
        int length = charCount;
        for (char ch = 'A'; ch <= 'z'; ch++) { //will go through ascii values to account for each letter
            counter = 0;
            for (int j = 0; j < length; j++) {
                letterCount = userString.charAt(j); //FIXME
                if (letterCount == ch)
                    counter++;
            }
            if (counter == 1){ //account for if count of letter is 1, doesn't print the number
                String chAsString = Character.toString(ch);
                System.out.println(ch); //possibly get rid of this bc it might be a tester
            }
            else if ((counter != 0) && (counter != 1)) { //not including one
                //System.out.print(counter);
                //System.out.print(ch);
                String counterAsString = Integer.toString(counter); //http://javadevnotes.com/java-integer-to-string-examples
                String chAsString = Character.toString(ch); //https://examples.javacodegeeks.com/core-java/character/how-to-convert-character-to-string-and-a-string-to-character-array-in-java/
                String counterChTogether = counterAsString + "" + chAsString; //so i can put in method 2
                System.out.println(counterChTogether);

                char [] characterArray = counterChTogether.toCharArray();
                System.out.print(characterArray);
            }
        }
        return characterArray; //FIXME
    }

    public static int findEncodeLength(String inputString) { //Method 3, pre-determine size of array
        int variable = 0;
        int stringLength = inputString.length();
        int i;
        for (i = 0; i < stringLength; i++) {
            if (i != (stringLength - 1)) {
                if (inputString.charAt(i) == inputString.charAt(i + 1)) {
                    variable += 0;
                }
                if (inputString.charAt(i) != inputString.charAt(i + 1)) {
                    variable += 1;
                }
            }
            else if (i == (stringLength - 1)) { //for fixing bounds
                variable += 1;
            }
        }
        System.out.println(variable); //only for checking if correct
        return variable;

    }

    public static int findDecodeLength(String rleString) { //Method 4
        char letterCount;
        int counter = 0;
        int totalCounter = 0;
        int length = rleString.length();  //FIXME (used to be userString.length)
        for (char ch = 'A'; ch <= 'z'; ch++) { //will go through ascii values to account for each letter
            counter = 0;
            for (int j = 0; j < length; j++) {
                letterCount = rleString.charAt(j); //FIXME (used to be userString.length)
                if (letterCount == ch)
                    counter++;
            }
            if (counter == 1){ //account for if count of letter is 1, doesn't print the number
                System.out.print(ch); //possibly get rid of this bc it might be a tester
            }
            else if ((counter != 0) && (counter != 1)) { //not including one
                System.out.print(counter);
                System.out.print(ch);

            }
            totalCounter += counter;
        }
        System.out.println("\n" + totalCounter); //might take this out because tester
        return totalCounter;
    }

    public static char[] decodeRLE(String rleString) { //Method 6

    }

    public static char[][] encodeRLE(String inputString) { //Method 6

    }

    public static void main(String[] args) {

        String userString = ""; //Defined outside so can access in menuOptions

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1.Input string to be encoded");
            System.out.println("2.View encoded string");
            System.out.println("3.View decoded string");
            System.out.println("4.Exit program \n Option: ");

            Scanner scanner = new Scanner(System.in);
            int menuOption = scanner.nextInt();
            System.out.println(menuOption);

//            Scanner scn = new Scanner(System.in);
//            int lengthDigits = scn.nextInt();
//            numOfDigits(lengthDigits); //works for char, reference line 121

            //for method 3
            if (menuOption == 1) {
                System.out.println("Enter message: ");
                Scanner scn2 = new Scanner(System.in); //scanner for string input
                userString = scn2.nextLine();
                int userStringLength = userString.length();
                numOfDigits(userStringLength);
                findEncodeLength(userString);
                findDecodeLength(userString);
            }
            if (menuOption == 2) {
                System.out.println("The encoded data is: " + encodeRLE(userString)); //FIXME
            }
            if (menuOption == 3) {
                System.out.println("The decoded data is: " + decodeRLE(userString));
            }
            if (menuOption == 4) {
                break;
            }

        }


        //find way to increment through a string 'eeeegghttt' so that it counts the occurance of a letter then moves on to next letter



    }
}


//while loop with the main reference in it textMenu(1,2,3,4)