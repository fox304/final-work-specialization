package control;

import allAnimals.Animals;

import java.util.Scanner;

public class Menu {

    String [] commands = new String[] {"Sit","Play dead","Jump","Up","Back up","Go to bed",
                                        "Stand","Left","Place","Right","Eat","Search"};
    String [] mainMunu = new String[] {"Завести животное","Показать класс животного",
                                        "Список команд, которое выполняет животное",
                                        "Обучить животное новым командам","Закончить работу с программой"};
    String [] speciesAnimals = new String[] {"Dog","Cat","Hamster","Horse","Camel","Donkey"};

    /**
     * печать меню
     * @return номер меню
     */
    public  int printMenu(){
        System.out.println("--------------Введите номер из меню--------------");
        for (int i = 0; i < mainMunu.length; i++){
            System.out.printf("%s) %s\n", i + 1, mainMunu[i]);
        }
        return errorHandling(mainMunu.length);
    }

    /**
     * вывод видов животных
     * @return номер вида животного
     */
    public int printSpeciesAnimals(){

        System.out.println("---------Введите номер вида животного-----------------");
        for (int i = 0; i < speciesAnimals.length;i++){
            System.out.printf("%s) %s \n",i + 1, speciesAnimals[i]);
        }

        return errorHandling(speciesAnimals.length);
    }

    /**
     * вывод команд животного
     * @return  номер команды животного
     */
    public int printAllCommands(){

        System.out.println("-----------Введите номер команды---------------");
        for (int i = 0; i < commands.length;i++){
            System.out.printf("%s) %s \n",i + 1, commands[i]);
        }

        return errorHandling(commands.length);
    }

    /**
     * вывод всех животных
     * @return размер списка всех животных
     */
    public int printAllAnimals(AnimalList animalList){

        int i = 0;
        System.out.println("-------- Выберите животное ---------");
        for (Animals an : animalList.getAnimals()) {
            System.out.printf(" %s) кличка - %s,\t днюха -  %s\n",
                    ++i,an.getName(),an.getBithday());

        }
        return errorHandling(animalList.getAnimals().size());

    }

    /**
     * обработка ошибок на целое число и диапазон
     * @return обработанный номер
     */
    public int errorHandling(int size){

        int num = 0;
        while (true){
            try {
                num = new Scanner(System.in).nextInt();
                break;
            } catch (RuntimeException e){
                System.out.println("неверный ввод");
            }
        }

        while (true){
            if (num > 0 || num <= size){
                return num;
            }
            System.out.printf("цифра должна быть больше ноля и меньше или равно %s\n",size);
        }

    }

}
