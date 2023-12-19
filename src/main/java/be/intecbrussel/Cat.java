package be.intecbrussel;

public class Cat extends Animal {
    private boolean hasLongNails ;
public Cat(){}
        public Cat(String name,boolean isClean, int age, int animalNumber, boolean hasLongNails) {
        super(name,isClean, age, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    public boolean getHasLongNails() {return hasLongNails;}

    public void setHasLongNails(boolean hasLongNails) {this.hasLongNails = hasLongNails;}


    @Override
    public void TreatAnimal() {

    }

    @Override
    public void vaccinateAnimal(Disease disease) {

    }
}
