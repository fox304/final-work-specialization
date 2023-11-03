import allAnimals.Animals;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public  int printMenu(){
        System.out.println("----------------------------");
        System.out.println("1) Завести животное");
        System.out.println("2) Правильный класс");
        System.out.println("3) Список команд, которое выполняет животное");
        System.out.println("4) Обучить животное новым командам");

        return scanner.nextInt();

    }

    public int printAnimals(){
        System.out.println("------------------------");
        System.out.println("1) Dog");
        System.out.println("2) Cat");
        System.out.println("3) Hamster");
        System.out.println("4) Horse");
        System.out.println("5) Camel");
        System.out.println("6) Donkey");

        return scanner.nextInt();
    }

    public int printAllCommands(){
        System.out.println("--------------------------");
        System.out.println("1) Sit");
        System.out.println("2) Play dead");
        System.out.println("3) Jump");
        System.out.println("4) Up");
        System.out.println("5) Back up");
        System.out.println("6) Go to bed");
        System.out.println("7) Stand");
        System.out.println("8) Left");
        System.out.println("9) Place");
        System.out.println("10) Right");
        System.out.println("11) Eat");
        System.out.println("12) Search");

        return scanner.nextInt();
    }

    public int printAllAnimals(AnimalList animalList){
        System.out.println("-------------------------");
        int i = 0;
        System.out.println("Выберите животное, которое хотели бы обучить командам:");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (Animals an : animalList.getAnimals()) {
            System.out.printf(" %s) %s \n",++i,an);

        }
        return scanner.nextInt();

    }


}
