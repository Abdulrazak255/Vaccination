package be.intecbrussel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VaccinationApp {
    public static void main(String[] args) {


        Animal dog1 = new Dog("Dodo", true, 3, 1, true);
        Animal dog2 = new Dog("Ji", true, 12, 2, false);
        Animal dog3 = new Dog("Zor", false, 2, 3, false);
        Animal cat1 = new Cat("Mio", false, 5, 4, true);
        Animal cat2 = new Cat("Haro", true, 2, 5, false);
        Animal cat3 = new Cat("Gimo", true, 7, 6, true);
        Animal monkey1 = new Monkey("Riko", false, 4, 7, true);
        Animal monkey2 = new Monkey("Siko", true, 5, 8, false);
        Animal monkey3 = new Monkey("Zolo", true, 8, 9, true);
        Animal monkey4 = new Monkey("Daloo", false, 4, 7, true);

        Map<Disease, Boolean> map1 = new HashMap<>();


        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(monkey1);
        animals.add(monkey2);
        animals.add(monkey3);
        animals.add(monkey4);

        AnimalShelter shelter = new AnimalShelter(animals, 1);
        shelter.sortAnimalsByName();
        shelter.printAnimals();




    }
}