package be.intecbrussel;

import java.util.HashMap;
import java.util.Map;

public class Cat extends Animal {
    private boolean hasLongNails ;
    public Cat() {}
    public Cat(String name,boolean isClean, int age, int animalNumber, boolean hasLongNails)
    {
        super(name,isClean, age, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    public boolean getHasLongNails() {return hasLongNails;}

    public void setHasLongNails(boolean hasLongNails) {this.hasLongNails = hasLongNails;}


    @Override
    public void TreatAnimal()
    {
        setClean(true);
        {  if (getHasLongNails() == true)
        {
            setHasLongNails(false); ;
            System.out.println(getName()+" is treated");
        }
        else
        {System.out.println(getName()+" is not sick , Its nails are short ");}
        }

    }

    @Override
    public void vaccinateAnimal(Disease disease)
    {
        if (!getIsVaccinated().get(disease))
        {
            getIsVaccinated().put(disease,true);
            setIsVaccinated(getIsVaccinated());
            { System.out.println(getName() + "  vaccination is done !" ); }
        }
        else
        { System.out.println(getName() + "  is vaccinated against " +disease); }

    }

    @Override
    public String toString() {
        return this.getName() +  "   "+this.getAge() +" years  " + " number : " + this.getAnimalNumber() +
        "   isClean : " + this.getIsClean() + "   hasLongNails : " +hasLongNails ;
    }
}
