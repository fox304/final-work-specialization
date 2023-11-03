package allAnimals;

import java.util.ArrayList;

public abstract class Animals  {

    protected ArrayList<String> arrayCommands = new ArrayList<>();
    protected String name;
    protected String bithday;

    public ArrayList<String> getArrayCommands() {
        return arrayCommands;
    }

    public  void training(String command){
        arrayCommands.add(command);
    }

}
