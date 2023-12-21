package be.intecbrussel.vaccination;

public class Dog extends Animal {
    private boolean hasFoulBreath ;
    public boolean getHasFoulBreath() {return hasFoulBreath;}
    public void setHasFoulBreath(boolean hasFoulBreath) {this.hasFoulBreath = hasFoulBreath;}

    public Dog() {}

    public Dog(String name, boolean isClean, int age, int animalNumber, boolean hasFoulBreath) {
        super(name, isClean, age, animalNumber);
        this.hasFoulBreath = hasFoulBreath;

    }


    @Override
    public void TreatAnimal()
    {   setClean(true);
        if (getHasFoulBreath() == true)
    {
        setHasFoulBreath(false) ;
        System.out.println(getName()+" is treated");
    }
    else
    {System.out.println(getName()+" is not sick ");}
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
        return this.getName() +  "   "+ this.getAge() +" years  " + " number : "
                + this.getAnimalNumber() + "   isClean : " + this.getIsClean() +
                "   hasFoulBreath : " + hasFoulBreath ;
    }
}
