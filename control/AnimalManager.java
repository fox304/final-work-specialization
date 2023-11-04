package control;

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

    public  void addAnimal() throws Exception{
        try (CounterClass count = new CounterClass()){
            count.add();
        }
        System.out.println("Какого животного хотите завести?");
        int num = menu.printSpeciesAnimals();
        choiceAnimal(num);
        ArrayList<Animals> arr = animalList.getAnimals();
        System.out.printf("Вы завели: %s\n ",arr.get(arr.size()-1));
    }

    public void addCommand(){
        System.out.println("Какое животное хотите обучить командам?");
        int num = menu.printAllAnimals(animalList); // номер конкретного животного
        int num2 = menu.printAllCommands(); // номер конкретной команды
        Animals an = animalList.getAnimals().get(num - 1); // конкретное животное
        an.training(menu.commands[num2-1]); // обучение выбранного животного в классе Animals
        System.out.printf(" Животное %s обучилось команде %s\n",an.getName(), menu.commands[num2-1]);

    }

    public void showAnimalCommands(){
        System.out.println("У какого животного показать список команд?");
        int num = menu.printAllAnimals(animalList);
        Animals an = animalList.getAnimals().get(num - 1);
        System.out.println("Животное обучено командам:");
        for (String str:an.getArrayCommands()) {
            System.out.printf(" %s ,",str);
        }
        System.out.println();

    }

    public void whichClass(){
        System.out.println("Класс какого животного показать?");
        int num = menu.printAllAnimals(animalList); // распечатка всех животных
        Animals an = animalList.getAnimals().get(num - 1);
        System.out.printf("Животное %s принадлежит классу %s\n",
                an.getName(),an.getClass().getSimpleName());
    }

    public void choiceCommand(int num) throws Exception {

        switch (num) {
            case 1 -> addAnimal();
            case 2 -> whichClass();
            case 3 -> showAnimalCommands();
            case 4 -> addCommand();
            case 5 -> Start.flag = false;
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
}
