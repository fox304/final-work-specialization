package allAnimals;

public class Hamster extends Pets {
    public Hamster(String n, String b) {

        this.name = n;
        this.bithday = b;

    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                ", bith='" + bithday + '\'' +

                '}';
    }



}
