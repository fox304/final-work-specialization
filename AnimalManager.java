import allAnimals.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalManager {

    AnimalList animalList = new AnimalList();
    Menu menu = new Menu();


    public void originAnimals(){
        Animals[] listA;
        ArrayList<Animals> arr;

        Animals dog1 = new Dog("FRED","2018-07-04");
        Animals cat1 = new Cat("TODDY","2020-02-23");
        Animals hamster1 = new Hamster("KITTY","2016-11-01");
        Animals horse1 = new Horse("ROCKY","2020-10-24");
        Animals camel1 = new Camel("SNOWY","2018-01-01");
        Animals donkey1 = new Donkey("PERKY","2022-04-03");


        listA = new Animals [] {dog1,cat1,hamster1,horse1,camel1,donkey1};
        arr = new ArrayList<>(Arrays.asList(listA));
        animalList.getAnimals().addAll(arr);

    }

    public  void addAnimal(){

      int num = menu.printAnimals();
      choiceAnimal(num);
    }

    public void addCommand(){
        int num = menu.printAllAnimals(animalList);
        int num2 = menu.printAllCommands();
        Animals an = animalList.getAnimals().get(num - 1);
        String str = learningCommands(num2);
        an.training(str);

    }

    public void showAnimalCommands(){
        int num = menu.printAllAnimals(animalList);
        Animals an = animalList.getAnimals().get(num - 1);
        System.out.println(an.getArrayCommands());
    }

    public void choiceCommand(int num) {

        switch (num) {
            case 1:
                addAnimal();
                break;
            case 2:
//                animalManager.choiceOfPrice();
                break;
            case 3:
                showAnimalCommands();
                break;
            case 4:
                addCommand();
                break;
        }
    }

    public void choiceAnimal(int num){
        switch (num) {
            case 1 -> animalList.addedAnimal(new Dog("TUT", "2017-04-03"));
            case 2 -> animalList.addedAnimal(new Cat("LUCKY", "2020-05-18"));
            case 3 -> animalList.addedAnimal(new Hamster("PAUL", "2022-03-03"));
            case 4 -> animalList.addedAnimal(new Horse("QUEEN", "2021-12-18"));
            case 5 -> animalList.addedAnimal(new Camel("CUDDLES", "2019-06-28"));
            case 6 -> animalList.addedAnimal(new Donkey("CAVALIER", "2022-04-18"));
        }
    }

    public String learningCommands(int num){

        switch (num) {
            case 1 -> {
                return "Sit";
            }
            case 2 -> {
                return "Play dead";
            }

            case 3 -> {
                return "Jump";
            }
            case 4 -> {
                return "Up";
            }
            case 5 -> {
                return "Back up";
            }
            case 6 -> {
                return "Go to bed";
            }
            case 7 -> {
                return "Stand";
            }
            case 8 -> {
                return "Left";
            }
            case 9 -> {
                return "Place";
            }
            case 10 -> {
                return "Right";
            }
            case 11 -> {
                return "Eat";
            }
            case 12 -> {
                return "Search";
            }
        }
        return "trgtrg";
    }

}
