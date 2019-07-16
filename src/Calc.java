import java.util.Scanner;
public class Calc {

    public static void main(String[] args){

        Scanner bucky= new Scanner(System.in);
       double fnum, snum, answer;
       char sign;

       char youWantAgain = 'y';

       while(youWantAgain == 'y') {
           System.out.println(" Enter first num ");
           fnum = bucky.nextDouble();
           System.out.println("Enter second num");
           snum = bucky.nextDouble();
           System.out.println("what sign do you want?");
           sign = bucky.next().charAt(0);
           answer = 0;
           if (sign == '+') {
               answer = fnum + snum;
           } else if (sign == '-') {
               answer = fnum - snum;
           } else if (sign == '*') {
               answer = fnum * snum;
           } else if (sign == '/') {
               answer = fnum / snum;
           }


           System.out.println(answer);

           System.out.println("Another calculation? y\\n");
           youWantAgain = bucky.next().charAt(0);
       }


    }
}
