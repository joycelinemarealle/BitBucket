package hellojava;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util. *;

public class ProgrammingFundamentalsProject {

    public static void main(String[] args) {

        /*Capture user age
         * Convert user string age to date format
         * validate date
         * calculate age
         * test if greater than 18 year old */

        // FR1 Over 18s only
        // create new object
        Scanner scanner = new Scanner(System.in);

        // Ask user for name
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        //Loop until a valid date is added and user > age

        LocalDate birthDate = null; //initialize birthdate as empty. put outside loop so accessible when calculating age
        boolean	dateIsValid = false; //assume false until proven otherwise when a valid output is added

        // Ask user for date in format Month-day-year format
        while(!dateIsValid) { //while dateIsValid not true
            System.out.println("\nEnter your date of birth in MONTH-DAY-YEAR format. For example 12-13-1980");
            String birthDateStr= scanner.nextLine(); // initialze name variable + get string date from user

            //Parse and Validate the date format
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy"); //object for date formatter
                birthDate = LocalDate.parse(birthDateStr, formatter); //converts user string to date format, if converted then date valid
                dateIsValid = true; //date format is valid

                //If date valid now Calculate age
                LocalDate today = LocalDate.now(); //?? how to check date is June 10th 2024
                Period age = Period.between(birthDate, today); //calculate time difference (yrs, month,days ) between birthdate date now
                int years = age.getYears();

                //Test to see if 18 years and above
                if (years >=  18) {
                    System.out.println("\nYour age is " + years + "\nyears");
                    break; //exit loop if age > 18
                } else
                {System.out.println("\nYou need to be 18 years old to participate in the Lottery System. ");
                    birthDateStr= scanner.nextLine(); // Ask again user to their date of birth
                }

                //if date not valid then print error and prompt user to enter valid date
            } catch(DateTimeParseException e) {
                System.out.println("Invalid Date. Enter a valid date");
                continue; //skip to the top to ask user for birthdate
            }



        }

    }
}