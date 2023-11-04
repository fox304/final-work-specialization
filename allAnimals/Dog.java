package allAnimals;

public class Dog extends Pets {


    public Dog(String n, String b) {

        this.name = n;
        this.bithday = b;


    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bith='" + bithday + '\'' +

                '}';
    }


}
