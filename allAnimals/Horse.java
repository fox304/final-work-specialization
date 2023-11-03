package allAnimals;

public class Horse extends PackAnimals {
    public Horse(String n, String b) {
        this.name = n;
        this.bithday = b;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", bith='" + bithday + '\'' +

                '}';
    }


}
