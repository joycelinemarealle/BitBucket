package mySolution;

import java.time.LocalDate;
import java.util.*;

public class LotteryGame {
    public static void main(String[] args) {
        String name = getName();
        LocalDate dateOfBirth = getDateOfBirth();
        LocalDate today = LocalDate.of(2024, 6, 10);

        boolean canPlay = isAgeOver18(dateOfBirth, today);
        // if age check passes play game else end game
        if (canPlay) {
            System.out.println("Let's play the Lottery! Good Luck " + name + "!");
            // The below loop allows user to play the game multiple times.
            while (true) {
                playGame();
                if (!userPlayAgain()) {
                    break;
                }
            }
        } else {
            System.out.println("You are too young to play!! Good Bye!");
        }

    }

    static boolean userPlayAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play again ? ");
        if (sc.nextLine().equals("yes")) {
            return true;
        }

        return false;
    }

    static void playGame() {
        int choice = getGameChoice();  // User or Lucky
        int[] userNumbers;
        int minNumber = 1, maxNumber = 49, picksNeeded = 6;

        if (choice == 1) { // User picks numbers
            userNumbers = getUserPickNumbers(minNumber, maxNumber, picksNeeded);
        } else {  // Program generates user numbers (Lucky Dip)
            userNumbers = getProgramPickNumbers(minNumber, maxNumber, picksNeeded);
        }

        System.out.println("User numbers are : " + Arrays.toString(userNumbers));

        // Get winning numbers
        int[] winNumbers = getProgramPickNumbers(minNumber, maxNumber, picksNeeded);
        System.out.println("Winning numbers are: " + Arrays.toString(winNumbers));

        // Get number of matches between user's numbers and winning numbers
        int numOfMatches = getNumOfMatches(userNumbers, winNumbers);
        // Get Prize Amount for number of matches
        int prize = getPrize(numOfMatches);

        System.out.println("You got " + numOfMatches + " match(es)!");
        System.out.println("Your prize is " + prize + " pounds!");
    }

    static int getPrize(int matches) {
        int prize = switch (matches) {
            case 2 -> 4;
            case 3 -> 500;
            case 4 -> 1000;
            case 5 -> 500000;
            case 6 -> 1000000;
            default -> 0;
        };

        return prize;
    }

    static int getNumOfMatches(int[] userNumbers, int[] winNumbers) {
        int matches = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < winNumbers.length; j++) {
                if (userNumbers[i] == winNumbers[j]) {
                    matches++;
                }
            }
        }
        return matches;
    }

    static int[] getUserPickNumbers(int min, int max, int numNeeded) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[numNeeded];
        int numbersChosen = 0;
        System.out.println("PLease enter " + numNeeded + " non-repeating numbers.");
        System.out.println("Numbers must be between " + min + " and " + max + ".");

        while (numbersChosen < numNeeded) {
            System.out.println("Number?");
            int numberEntered = sc.nextInt();

            if (arrayContainsValue(numbers, numberEntered)) {
                System.out.println("You've entered a duplicate number. Try Again.");
            } else if (numberEntered < min || numberEntered > max) {
                System.out.println("Your number must be between" + min + " and " + max + ". Try Again.");
            } else {
                numbers[numbersChosen] = numberEntered;
                numbersChosen++;
            }
        }

        return numbers;
    }

    static int[] getProgramPickNumbers(int min, int max, int numNeeded) {
        Random random = new Random();
        int[] numbers = new int[numNeeded];

        int numbersChosen = 0;

        while (numbersChosen < numNeeded) {
            int randomNumber = random.nextInt(max - min + 1) + min;

            if (!arrayContainsValue(numbers, randomNumber)) {
                numbers[numbersChosen] = randomNumber;
                numbersChosen++;
            }
        }
        return numbers;
    }

    static boolean arrayContainsValue(int[] array, int value) {
        boolean valExists = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                valExists = true;
                break;
            }
        }

        return valExists;
    }

    static int getGameChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 to choose your own numbers or 2 for Lucky Dip:");
        int choice = 0;
        do {
            choice = sc.nextInt();
        } while (choice != 1 && choice != 2);

        sc.nextLine(); // Reset the scanner after reading int.
        return choice;
    }

    public static boolean isAgeOver18(LocalDate dateOfBirth, LocalDate today) {
        if (dateOfBirth.plusYears(18).isBefore(today)) {
            return true;
        }
        return false;
    }

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        return name;
    }


    // get date of birth and validate the input
    public static LocalDate getDateOfBirth() {
        boolean reEnterDate;
        String dateString;
        int month, day, year;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter dob in format mm/dd/yyyy ie. 03/06/2001 ");
            dateString = sc.nextLine();
            // get Date and confirm format is correct.
            String[] dayMonthYear = dateString.split("/");

            month = Integer.parseInt(dayMonthYear[0]);
            day = Integer.parseInt(dayMonthYear[1]);
            year = Integer.parseInt(dayMonthYear[2]);

            if (month < 1 || month > 12) {
                System.out.println("Invalid Month!");
                reEnterDate = true;
            } else if (day < 0 || day > 31) {
                System.out.println("Invalid Day!!");
                reEnterDate = true;
            } else if (year < 1900 || year > 2024) {
                System.out.println("Invalid Year!!");
                reEnterDate = true;
            } else {
                reEnterDate = false;
            }
        } while (reEnterDate);

        LocalDate date = LocalDate.of(year, month, day);
        return date;
    }


}
