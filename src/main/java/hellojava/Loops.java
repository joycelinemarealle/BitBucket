package hellojava;

public class Loops {
    public static void main (String[] args) {
        //question 1
        int i = 1;
        int count = 0;
        while (i < 21) {
            count = count + i;
            i++;
        }
        System.out.println("the sum between 1 and 20 is " + count);

        // question 2
        System.out.println("\n Start of question 2");
        for (int v = 1; v < 101; v++) { //can't initialize outsize since need the v value formula???
            int sum = 0;
            int formula = (v * (v + 1)) / 2;

            //Calculate the sum manually
            for (int k=1; k <= v; k++) {
                sum = sum + k;

            }//compare results
            if (sum != formula) { //comparing the total sum after all numbers are calculated
                System.out.println("Error: Formula does not match");
                System.out.println("The sum is : " +sum);
                System.out.println ("The formula value is : " + formula);
            }
            else {
                System.out.println("The sum: " + sum + " is equal to formula: " + formula);

            }

            }
        }
    }



