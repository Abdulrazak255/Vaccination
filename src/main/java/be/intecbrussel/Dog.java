package be.intecbrussel;

public class Dog extends Animal {
    private boolean hasFoulBreath ;
    public boolean getHasFoulBreath() {return hasFoulBreath;}
    public void setHasFoulBreath(boolean hasFoulBreath) {this.hasFoulBreath = hasFoulBreath;}

   // public Dog(){}
 //   public Dog(boolean hasFoulBreath){this.hasFoulBreath=hasFoulBreath;}

    public Dog() {}

    public Dog(String name, boolean isClean, int age, int animalNumber, boolean hasFoulBreath) {
        super(name, isClean, age, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }


    @Override
    public void TreatAnimal() {}

    @Override
    public void vaccinateAnimal(Disease disease) {}
}
