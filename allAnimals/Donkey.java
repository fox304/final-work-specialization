package allAnimals;

public class Donkey extends PackAnimals {
    public Donkey(String n, String b) {
        this.name = n;
        this.bithday = b;
    }

    @Override
    public String toString() {
        return "Donkey{" +
                "name='" + name + '\'' +
                ", bith='" + bithday + '\'' +

                '}';
    }


}
