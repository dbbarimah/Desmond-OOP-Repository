import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your height (in meters): ");
        double height = input.nextDouble();
        System.out.print("Enter your weight (in pounds): ");
        double weight = input.nextDouble();
        System.out.print("Enter your jersey number: ");
        int jersey_num = input.nextInt();

        double pound = 0.45359237;
        int meter = 100;
        int new_weight = (int)(weight * pound);
        int new_height = (int)(height * meter);
        double cast_weight = (float) new_weight;

        String eligible;
        System.out.println();
        boolean eligibility = (age >= 18 && age <= 35 && new_weight < 90);
        if (eligibility) {
            eligible = "Eligible";
        } else {
            eligible = "Not eligible";
        }

        String category;
        boolean rising_star = (age < 20);
        boolean prime_player = (age >= 20 && age <= 30);
        boolean veteran = (age >= 31);
        if (rising_star) {
            category = "Rising Star";
        } else if (prime_player) {
            category = "Prime Player";
        } else if (veteran) {
            category = "Veteran Player";
        } else {
            category = "Player's age is invalid.";
        }

        String position;
        switch(jersey_num) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                position = "Player position is not known";
        }

        String attacker;
        switch(jersey_num) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
                attacker = "No";
                break;
            case 9:
                attacker = "Yes";
                break;
            default:
                attacker = "Player position is not known";
        }

        String lineup_decision;
        if (prime_player) {
            if (cast_weight < 80) {
                lineup_decision = "Starting Lineup";
            } else {
                lineup_decision = "Bench";
            }
        } else {
            lineup_decision = "Bench";
        }
        String final_status = (eligibility) ? "Play" : "Rest";

        System.out.println();
        System.out.println("FINAL PLAYER REPORT");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age  + " (" + category + ")");
        System.out.println("Height: " + new_height + "cm");
        System.out.println("Weight: " + cast_weight + "kg");
        System.out.println("Jersey Number: " + jersey_num);
        System.out.println("Position: " + position);
        System.out.println("Attacker Jersey: " + attacker);
        System.out.println("Eligibility: " + eligible);
        System.out.println("Lineup Decision: " + lineup_decision);
        System.out.println("Final: " + final_status);

    }
}