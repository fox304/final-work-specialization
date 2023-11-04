package allAnimals;

import java.util.ArrayList;

public  class Animals  {


    protected String name;
    protected String bithday;

    protected ArrayList<String> arrayCommands = new ArrayList<>();


    public String getName() {
        return name;
    }

    public String getBithday() {
        return bithday;
    }

    public ArrayList<String> getArrayCommands() {
        return arrayCommands;
    }

    public  void training(String command){
        arrayCommands.add(command);
    }

    @Override
    public String toString() {
        return name;
    }
}
