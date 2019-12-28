/**
 * Creates diamond art
 * @author Darpan
 * @since 12/27/2019
 */

public class DiamondArt {
    public static void main(String[] args) {
        printHeader();
        for (int j = 0; j < 8; j++) {
            System.out.print("|");
            int realJ = j;
            if (j > 3) {
                realJ = 7 - j;
            }
            int dots = (int) Math.pow(2, realJ);
            if (dots == 1) {
                dots = 0;
            }
            printChar(8 - dots, ' ');
            System.out.print("<>");
            printChar(dots * 2, '.');
            System.out.print("<>");
            printChar(8 - dots, ' ');
            System.out.println("|");
        }
        printHeader();
    }

    /**
     * Prints out a character ... times
     *
     * @param freq amount of times you want to print out character
     * @param c    character you want to print out
     */
    public static void printChar(int freq, char c) {
        for (int i = 0; i < freq; i++) {
            System.out.print(c);
        }
    }

    /**
     * Makes the header
     */
    public static void printHeader() {
        System.out.print("#");
        for (int i = 1; i <= 20; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }
}






