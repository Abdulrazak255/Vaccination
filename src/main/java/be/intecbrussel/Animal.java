package be.intecbrussel;

import java.util.Map;

public abstract class Animal implements Treatable,VaccinateAble {
    private String name;
    private boolean isClean;
    private int age;
    private int animalNumber;
    private Map<Disease, Boolean> isVaccinated;

    public Animal() {
    }

    public Animal(String name, boolean isClean, int age, int animalNumber) {
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        isVaccinated.put(Disease.CHICKENPOCKS, false);
        isVaccinated.put(Disease.HEPATITISA, false);
        isVaccinated.put(Disease.POLIO, false);
        isVaccinated.put(Disease.FLUE, false);

        this.isVaccinated = isVaccinated;
    }


    public boolean getIsClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }


    //public abstract void vaccinateAnimal();


    @Override
    public String toString() {
        return name + "   isClean :" + isClean + "   "
                + age +" years  " + " number=" + animalNumber ;
    }
}
