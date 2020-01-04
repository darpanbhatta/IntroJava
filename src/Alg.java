import java.util.Scanner;

public class Alg {
    private static double totalWeight;
    private static double totalScore;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        midtermHandler(sc);

        hwHandler(sc);

        System.out.println("Total weighted points: " + totalScore + " / " + totalWeight);
        double grade = totalScore / totalWeight * 100;
        if (grade >= 90) {
            System.out.println("Final grade: A");
        } else if (grade >= 80) {
            System.out.println("Final grade: B");
        } else if (grade >= 70) {
            System.out.println("Final grade: C");
        } else if (grade >= 60) {
            System.out.println("Final grade: D");
        } else if (grade < 60) {
            System.out.println("Final grade: F");
        }
    }

    private static void midtermHandler(Scanner sc) {
        System.out.print("Number of midterms? ");
        int numMidterms = sc.nextInt();

        for (int i = 1; i <= numMidterms; i++) {
            System.out.println("Midterm " + i + ":");
            System.out.print("Weight (1-100) ? ");
            double weight = sc.nextDouble();
            totalWeight += weight;
            System.out.print("Score? ");
            double score = sc.nextDouble();
            System.out.print("Scores bumped? (1 = yes, 2 = no) ");
            if (sc.nextInt() == 1) {
                System.out.print("Bump amount? ");
                score += sc.nextDouble();
            }
            totalScore += score;
            System.out.println("Raw points: " + score + " / 100");
            System.out.println("Weighted points: " + (score / 100 * weight) + " / " + weight);
        }
    }

    public static void hwHandler(Scanner sc) {
        System.out.println("Homeworks:");
        System.out.print("What is the weight? ");
        double weight = sc.nextDouble();
        totalWeight += weight;
        System.out.print("Number of homeworks? ");
        int numHw = sc.nextInt();
        System.out.print("What is it out of? ");
        int outOf = sc.nextInt() * numHw;
        double totalHwScore = 0;
        for (int i = 1; i <= numHw; i++) {
            System.out.print("Homework " + i + " score? ");
            totalHwScore += sc.nextDouble();
        }
        totalScore += totalHwScore;
        System.out.println("Raw points: " + totalHwScore + " / " + outOf);
        System.out.println("Weighted points: " + (totalHwScore / outOf * weight) + " / " + weight);
    }
}
