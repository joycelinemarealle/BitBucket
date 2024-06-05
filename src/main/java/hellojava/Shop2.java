package hellojava;

public class Shop2 {
    public static void  main (String[] args){
        //Sale sale defined in sale
        Sale1 sale = new Sale1 (" Tissue ", 3.45);
       //Sale  Sale2 = new Sale (" Juice ", 5.76);
       Purchase1 purchase1 =  new Purchase1 (sale, 4);
        System.out.println(sale +"Sale ");
        //System.out.println(Sale2 +"Sale2");
        System.out.println(purchase1);

    }
}
//record is a class
record Sale1 (String name , double price) {

}
//need to also use the same small name little sale in here too
record Purchase1 ( Sale1 sale, int quantity){

}