import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class MyVetPractice implements VetPractice {
    private List<Owner> owners = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();
    private List<Pet> bookingQueue = new ArrayList<>();
    private VetScheduler scheduler; //manual injection


    public MyVetPractice(List<Owner> owners, List<Pet> pets, List<Pet> bookingQueue, VetScheduler scheduler) {
        this.owners = owners;
        this.pets = pets;
        this.bookingQueue = bookingQueue;
        this.scheduler = scheduler;
    }

    Pet pet = new Pet();
    Owner owner = new Owner();

    @Override
    public boolean registerPet(Pet p) {
        //check if pet in list of pets if not then add to list
      if(pets.contains(pet)){
          System.out.println("Pet exists!");
          return false;
      }
      pets.add(pet);
      System.out.println("Successfully registered pet");
      return true;
    }

    @Override
    public boolean registerOwner(Owner o) {
        if (owners.contains(owner)){
            System.out.println("Owner exists");
            return false;
        }
        owners.add(owner);
        System.out.println("Successfully registered owner");
        return true;
    }

    @Override
    public List<Pet> getPets() {
        return pets;
    }

    @Override
    public List<Owner> getOwners() {
        return owners;
    }

    @Override
    public void queueBooking(Pet p) {
        if (pets.contains(pet)){
            bookingQueue.add(pet);
        } else{
            System.out.println("Pet not found. Please register");
        }
    }

    @Override
    public List<Pet> scheduleAppointments() {
        //sort by pet name
        List <Pet> sortedQueue = new ArrayList<>(bookingQueue);
        Collections.sort(sortedQueue, new Comparator<Pet>() {
            @Override
            public int compare(Pet p1, Pet p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        //pets.sort(Comparator.comparing(Pet::getName))
        //pets.sort(Comparator.comparing(o) -> o.getOwner.getNumber())
        //Collections.sort(bookingQueue, (p1,p2) -> p1.getName().compareTo(p2.getName()));

        //Clear BookingQueue to show all appointment have been handled
        bookingQueue.clear();

        //return sortedList;
        return sortedQueue;
    }
}