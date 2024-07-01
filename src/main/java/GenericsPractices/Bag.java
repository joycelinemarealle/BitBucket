package GenericsPractices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag <E> implements Iterable <E> {
    private Map<E, Integer > elements = new HashMap<>();


    public void add (E el){
        if (elements.containsKey(el)) {

            //if it is in the bag increment the count
            elements.put(el, elements.get(el) +1);
        } else {
            //if it is not in the bag, add it
            elements.put(el, 1);
        }

        // hashMap and add() omitted
        public void remove (E el){
            if(elements.containsKey(el)){
                int val = elements.get(el);
                if (val == 1){
                    elements.remove(el);
                } else{
                    elements.put(el, val-1);
                }
            }
        }
    }

    //add words to Bag of Strings
    Bag <String> bagOfWords = new Bag<>();
    bagOfWords.add("Generic");
    bagOfWords.add("Type")
            bagOfWords.add("Generic");
    bagOfWords.add("Class")


    for (String s : bagOfWords){
        System.out.printf(s + ":" + bagOfWords.getCount(s));
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}


