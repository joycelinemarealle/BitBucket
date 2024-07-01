package GenericsPractices;

public class BagUtils {

    public static <T> void printMyBag (Bag<T> bag){
        for (T item : bag){
            System.out.println(item + ":" + bag.getCount(item));
        }
    }
}
