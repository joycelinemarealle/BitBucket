import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class MyVetPractice implements VetPractice {
    private List<Owner> owners = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();
    private List<Pet> bookingQueue = new ArrayList<>();
    private VetScheduler scheduler;


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

   // @Override
    //public List<Pet> scheduleAppointments() {
        //sort by pet name, return list , then clear booking quue
        //sortedlist = Collections.sort(bookingQueue);
       //sortedlist = Collections.sort(bookingQueue.get(1).getName());
        //return sortedList;
    //}
}