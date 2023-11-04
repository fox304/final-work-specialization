package control;

public class Start {
    Menu menu = new Menu();
    AnimalManager animalManager = new AnimalManager();
    boolean flag = true;
    public void startProgramm(){

        animalManager.originAnimals();// инициализация первоначального списка животных
        while (flag){
            int numberMenu = menu.printMenu();
            animalManager.choiceCommand(numberMenu);
        }

    }

}
