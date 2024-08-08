import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlphabeticalVetScheduler implements VetScheduler{

    @Override
    public List<Pet> schedule(List<Pet> pets) {
        //returns appointment in order of pet name
            Collections.sort(pets, new Comparator<Pet>() {
                @Override
                public int compare(Pet p1, Pet p2) {
                    return p1.getName().compareTo(p2.getName());
                }
            });
            return pets;
        }
    }

