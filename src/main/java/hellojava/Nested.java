package hellojava;

public class Nested {
    public static void main(String[] args) {
        int weeks =3;
        int days = 7;

        //outer loop
        for (int i = 0; i <weeks; i++){
            System.out.println("Week " + i);

            //inner loop
            for ( int j = 0 ; j < days; j++){
                System.out.println ("Day " + j);
            }
        } //outer loop

    }
}
