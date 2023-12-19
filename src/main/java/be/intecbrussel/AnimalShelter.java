package be.intecbrussel;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnimalShelter
{
    private List<Animal> animals ;
    private int animalId ;
    public AnimalShelter (){}
    public AnimalShelter (List<Animal> animals , int animalId )
    {
        this.animalId=animalId;
        this.animals=animals;
    }
    public List<Animal> getAnimals() {return animals;}
    public void setAnimals(List<Animal> animals) {this.animals = animals;}
    public int getAnimalId() {return animalId;}
    public void setAnimalId(int animalId) {this.animalId = animalId;}
    public void printAnimals ()
    {
        animals.forEach(System.out::println);

    }
    public void sortAnimals ()
    {  animals.sort(Comparator.comparing(Animal::getAnimalNumber));   }
    public void sortAnimalsByName ()
    {  animals.sort(Comparator.comparing(Animal::getName));    }
    public void sortAnimalsByAge ()
    {  animals.sort(Comparator.comparing(Animal::getAge));     }


    public void printAnimalsNotVaccinated (Disease disease) {}
    public Animal findAnimal (int animalNumber)
    {
        return (Animal) animals.stream().filter(animal -> animal.getAnimalNumber()==animalNumber).collect(Collectors.toList());


    }
    public Animal findAnimal (String name) {
        List<Animal> filterAnimal = animals.stream().filter(animal -> animal.getName().equalsIgnoreCase(name)).collect(Collectors.toList());

        if (filterAnimal.size()==1)
        {return filterAnimal.get(0);}

        else {
            System.out.println("There are many animals those have this name ");
        animals.forEach(animal -> System.out.println(animal.getName()+" "+animal.getAge()+" years"));
        System.out.println("So please if you know its number during 10 seconds or we give you random animal ");
        Scanner scanner = new Scanner(System.in);
        while (true)
        try {

            filterAnimal.stream().filter(animal -> animal.getName().equals(name)).collect(Collectors.toList());
        }
        catch (Exception e )
        {
            System.out.println("Your input is not suitable , please enter again :");
            scanner.nextInt();
        }
        return filterAnimal.get(0); }}
    public Animal treatAnimal (int animalNumber) { return null;}
    public Animal treatAnimal (String name) {return  null ; }
    public void treatAllAnimals (){}
    public Animal findOldestAnimal (String name) { return null;}
    public int countAnimals (){return  0;}
    public void addAnimal (){}







}
