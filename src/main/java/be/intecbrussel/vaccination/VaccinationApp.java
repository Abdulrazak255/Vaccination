package be.intecbrussel;

import java.util.*;
import java.util.Timer;
import java.util.stream.Collectors;

public class VaccinationApp {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Dodo", true, 3, 1, true);
        Dog dog2 = new Dog("Ji", true, 12, 2, false);
        Dog dog3 = new Dog("Zor", false, 2, 3, false);
        Cat cat1 = new Cat("Mio", false, 5, 4, true);
        Cat cat2 = new Cat("Haro", true, 2, 5, false);
        Cat cat3 = new Cat("Gimo", true, 7, 6, true);
        Monkey monkey1 = new Monkey("Riko", false, 4, 7, true);
        Monkey monkey2 = new Monkey("Siko", true, 5, 8, false);
        Monkey monkey3 = new Monkey("Zor", true, 8, 9, true);
        Monkey monkey4 = new Monkey("Daloo", false, 4, 7, true);


        List<Animal> animals = new ArrayList<>();
        AnimalShelter shelter = new AnimalShelter(animals, 1);
        shelter.addAnimal(cat1);
        shelter.addAnimal(cat2);
        shelter.addAnimal(cat3);
        shelter.addAnimal(dog1);
        shelter.addAnimal(dog2);
        shelter.addAnimal(dog3);
        shelter.addAnimal(monkey1);
        shelter.addAnimal(monkey2);
        shelter.addAnimal(monkey3);
        shelter.addAnimal(monkey4);

        while (true) {
            try {


                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome in the Animal Shelter \n Please enter the number of the methode to do it : ");
                System.out.println("1 - Print animals          2 - Sort animals            3 - Sort animals ByName\n" +
                        "4 - Sort animals by age    5 - Print animals not vaccinated against a disease\n" +
                        "6 - Find animal by number  7 - Find Animal by name     8 - Treat animal by number \n" +
                        "9 - Treat Animal by name   10 - Treat all animals     11 - Find oldest Animal \n" +
                        "12 - Count animals         13 - Add animal\n" +
                        "14 - Vaccinate animal\n");

                int i = scanner.nextInt();
                switch (i) {
                    case 1: {
                        shelter.printAnimals();
                        break;
                    }
                    case 2: {
                        shelter.sortAnimals();
                        break;
                    }
                    case 3: {
                        shelter.sortAnimalsByName();
                        break;
                    }
                    case 4: {
                        shelter.sortAnimalsByAge();
                        break;
                    }
                    case 5: {
                        System.out.println("Please enter the disease : ");
                        shelter.printAnimalsNotVaccinated(checkDisease());
                        break;
                    }

                    case 6: {
                        System.out.println("Please enter the number : ");
                        System.out.println(shelter.findAnimal(checkNumber(animals)));
                        break;
                    }

                    case 7: {
                        System.out.println("Please enter the name : ");
                        System.out.println(shelter.findAnimal(checkName(animals)));
                        break;
                    }

                    case 8: {
                        System.out.println("Please enter the number : ");
                        shelter.treatAnimal(checkNumber(animals));
                        break;
                    }

                    case 9: {
                        System.out.println("Please enter the name : ");
                        shelter.treatAnimal(checkName(animals));
                        break;
                    }

                    case 10: {
                        shelter.treatAllAnimals();
                        break;
                    }
                    case 11: {
                        System.out.println(shelter.findOldestAnimal());
                        break;
                    }
                    case 12: {
                        System.out.println(shelter.countAnimals());
                        break;
                    }
                    case 13: {
                        shelter.addAnimal(new Dog("dd", false, 5, 7, false));
                        break;
                    }
                    case 14: {
                        dog2.vaccinateAnimal(Disease.HEPATITISA);
                        break;
                    }
                    default:
                        break;

                }
            }
            catch (Exception e)
            {System.out.println("Your input is not correct , choice the methode :");}

        }
    }
    public static String checkName(List<Animal> animals)
    {
        Scanner scanner = new Scanner(System.in);
        List <String> strings = animals.stream().map(Animal::getName).collect(Collectors.toList());
        while (true) {
            try {
                String name = scanner.nextLine();
                if (strings.contains(name)) {
                    return name;
                } else {
                    System.out.println("The name is not exist in / please enter a correct name");
                }
            }
            catch (Exception e) {System.out.println("The input is not correct or is not exist");
                scanner.nextLine();}

        }
    }

    public static int checkNumber(List<Animal> animals) {
        Scanner scanner2 = new Scanner(System.in);
        List <Integer> integers = animals.stream().map(Animal::getAnimalNumber).collect(Collectors.toList());
        while (true) {

            try {
                int    choice = scanner2.nextInt();
                if (integers.contains(choice)) {
                    return choice;
                } else {
                    System.out.println("The number is not exist  / please enter a correct number");

                }
            } catch (Exception e)
            {
                System.out.println("The input is not correct or is not exist");
                scanner2.nextInt();
            }


        }
    }

    public static Disease checkDisease() {
        Disease[] diseases = Disease.values();
        int j = 1;
        for (Disease dis : diseases)
        {
            System.out.println(j + " - " + dis);
            j++;
        }
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                int i = scanner.nextInt();

                if (i == 1) {
                    return Disease.CHICKENPOCKS;
                } else if (i == 2) {
                    return Disease.FLUE;
                }

                if (i == 3) {
                    return Disease.POLIO;
                }

                if (i == 4) {
                    return Disease.HEPATITISA;
                } else {
                    System.out.println("The disease is not exist in / please enter the correct disease");
                    return null;
                }
            } catch (Exception e) {
                System.out.println("The input is not correct or is not exist / Try again :");
                scanner.nextInt();
            }

        }
    }

}