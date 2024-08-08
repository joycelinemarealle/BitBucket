import java.util.Collections;
import java.util.List;

public class QueueVetScheduler implements VetScheduler{
    @Override
    public List<Pet> schedule(List<Pet> pets) {
        // returns list of pets in order they were added to the list
        return pets;
    }

}
