package Animal;

public class Animal { //testing
    private String type;
    private String name;
    private int age;

    //empty constructor


    public Animal() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "App{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
