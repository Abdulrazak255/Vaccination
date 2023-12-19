package be.intecbrussel;

import java.util.Map;

public class Monkey extends Animal{
    private boolean isHyperActive ;

    public Monkey() {}

    public Monkey(String name, boolean isClean, int age, int animalNumber, boolean isHyperActive) {
        super(name, isClean, age, animalNumber);
        this.isHyperActive = isHyperActive;
    }

    public boolean getHyperActive() {return isHyperActive;}
    public void setHyperActive(boolean hyperActive) {isHyperActive = hyperActive;}


    @Override
    public void TreatAnimal() {}

    @Override
    public void vaccinateAnimal(Disease disease) {}
}
