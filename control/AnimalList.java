package control;

import allAnimals.Animals;

import java.util.ArrayList;

public class AnimalList {

    private final ArrayList<Animals> animals = new ArrayList<>();

    public ArrayList<Animals> getAnimals() {

        return animals;
    }
    public void addedAnimal(Animals ani){
        animals.add(ani);
    }



}
