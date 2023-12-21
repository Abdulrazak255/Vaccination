package be.intecbrussel.vaccination;

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
    public void TreatAnimal()
    {
        setClean(true);
        if (getHyperActive() == true)
        {
            setHyperActive(false);
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
        return this.getName() + "   "+this.getAge() +" years  " + " number : " + this.getAnimalNumber() + "   isClean : " + this.getIsClean() +
                "   isHyperActive : " + isHyperActive ;
    }
}

