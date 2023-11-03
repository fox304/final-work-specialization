package allAnimals;

public class Camel extends PackAnimals {

    public Camel(String n, String b) {
        this.name = n;
        this.bithday = b;
    }

    @Override
    public String toString() {
        return "Camel{" +
                "name='" + name + '\'' +
                ", bith='" + bithday + '\'' +

                '}';
    }




}
