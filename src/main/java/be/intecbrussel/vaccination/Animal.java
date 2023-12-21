package be.intecbrussel.vaccination;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Treatable, VaccinateAble {
    private String name;
    private boolean isClean;
    private int age;
    private int animalNumber;
    private Map<Disease, Boolean> isVaccinated;

    public Animal()
    {

        Map<Disease , Boolean > hashMap = new HashMap<>();

        for (Disease disease : Disease.values())
        { hashMap.put(disease, false); }  // default is false
        isVaccinated = hashMap;
    }
    public Animal(String name, boolean isClean, int age, int animalNumber) {
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
        Map<Disease , Boolean > hashMap = new HashMap<>();

        for (Disease disease : Disease.values())
        { hashMap.put(disease, false); }
        isVaccinated = hashMap;
    }

    public Map<Disease, Boolean> getIsVaccinated()
    {


        return isVaccinated ;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated)
    {


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




    @Override
    public String toString() {
        return name + "   isClean :" + isClean + "   "
                + age +" years  " + " number=" + animalNumber  ;
    }
}
