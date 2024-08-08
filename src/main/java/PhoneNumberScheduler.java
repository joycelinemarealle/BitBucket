import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhoneNumberScheduler implements VetScheduler{
    @Override
    public List<Pet> schedule(List<Pet> pets) {
        Collections.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet p1, Pet p2) {
                return p1.getOwner().getPhoneNumber().compareTo(p2.getOwner().getPhoneNumber());
            }
        });
        return pets;
    }
}
