package be.intecbrussel;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import java.util.HashMap;
import java.util.Map;

public class AnimalShelter
{
    private List<Animal> animals ;
    private int animalId ;
    public AnimalShelter (){this.animalId=0;}
    public AnimalShelter (List<Animal> animals , int animalId )
    {
        this.animalId=0;
        this.animals=animals;
    }
    public List<Animal> getAnimals() {return animals;}
    public void setAnimals(List<Animal> animals) {this.animals = animals;}
    public int getAnimalId() {

        setAnimalId(animalId+1);
        return animalId;}
    public void setAnimalId(int animalId)
    {

        this.animalId = animalId;
    }


    public void printAnimals ()                                //Method 1
    {  animals.forEach(System.out::println);}

    public void sortAnimals ()                                 //methode 2
    {  animals.sort(Comparator.comparing(Animal::getAnimalNumber));  printAnimals();
    }

    public void sortAnimalsByName ()                           //methode 3
    {  animals.sort(Comparator.comparing(Animal::getName));          printAnimals(); }

    public void sortAnimalsByAge ()                            //methode 4
    {  animals.sort(Comparator.comparing(Animal::getAge));           printAnimals();   }

    public void printAnimalsNotVaccinated (Disease disease)    //methode 5
    {
        animals.stream().filter(animal -> animal.getIsVaccinated().containsKey(disease)).forEach(System.out::println);
    }

    public Animal findAnimal (int number)                //methode 6
    {  List<Animal> animals1 = animals.stream().filter(animal -> animal.getAnimalNumber()==number).collect(Collectors.toList());

    return animals1.get(0) ;
    }


    public Animal findAnimal (String name)                     //methode 7
    {
        List<Animal> filterAnimal = animals.stream().filter(animal -> animal.getName().equalsIgnoreCase(name)).collect(Collectors.toList());


        if (filterAnimal.size() == 1)
        {
            return filterAnimal.get(0);
        }
        else if (filterAnimal.size() > 1)
        {
            System.out.println("There are many animals those have this name ");
            filterAnimal.forEach(animal -> System.out.println(animal.getName() + " " + animal.getAge() + " years " + " Number " + animal.getAnimalNumber()));
            System.out.println("So please enter its number 15 seconds or we give you the first of them ");
            List<Integer> integers = filterAnimal.stream().map(Animal::getAnimalNumber).collect(Collectors.toList());
            TimerX timer= new TimerX();

            Scanner scanner = new Scanner(System.in);
            timer.start();
            while (timer.isAlive()) {

                try {
                    int i = scanner.nextInt();
                    if (integers.contains(i))
                    { List<Animal> filterAnimal2 = filterAnimal.stream().filter(animal -> animal.getAnimalNumber() == i).collect(Collectors.toList());

                        return filterAnimal2.get(0);
                    }



                } catch (Exception e) {
                    System.out.println("Your input is not suitable , please enter again :");
                    scanner.nextInt();
                }



        }
        } return filterAnimal.get(0);
    }
    public void treatAnimal (int animalNumber)                     //methode 8
    {
        List<Animal> sick = animals.stream().filter(animal -> animal.getAnimalNumber()==animalNumber).collect(Collectors.toList());
        sick.get(0).TreatAnimal();

    }
    public void treatAnimal (String name)                          //methode 9
    {
        List<Animal> sick = animals.stream().filter(animal -> animal.getName().equals(name)).collect(Collectors.toList());
        sick.get(0).TreatAnimal();

    }
    public void treatAllAnimals ()                                 //methode 10
    {
         animals.forEach(animal -> animal.TreatAnimal());
    }
    public Animal findOldestAnimal ()                              //methode 11
    {
        List<Integer> ages = animals.stream().map(Animal::getAge).collect(Collectors.toList());
        int oldestAge = Collections.max(ages);
        List<Animal> filterAnimals = animals.stream().filter(animal -> animal.getAge()==oldestAge ).collect(Collectors.toList());
        return filterAnimals.get(0);

    }
    public int countAnimals ()                                     //methode 12
    {
        return animals.size();
    }
    public void addAnimal (Animal animal )                         //methode 13
    {
        animal.setAnimalNumber(getAnimalId());
        getAnimals().add(animal);

    }





}
