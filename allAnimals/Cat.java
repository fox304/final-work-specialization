package allAnimals;

public class Cat extends Pets {


    public Cat(String n, String b) {
        this.name = n;
        this.bithday = b;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bith='" + bithday + '\'' +

                '}';
    }


}
