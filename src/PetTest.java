import java.util.Random;
import java.util.Scanner;

public class PetTest {

    private static int getRandomValue(int low, int high){
        Random random = new Random();
        return random.nextInt(high-low) + low;
    }

    public static void main(String[] args) {
//        Cat myCat = new Cat("Pixel", 4, "Tabby");
//        Dog myDog = new Dog("Rex", 10, "Terrier");
//        System.out.println(myCat.speak());
//        System.out.println(myDog.speak());

        String[] catBreeds = {"siamese", "Burnese", "Tobby", "Persian", "mANX"};
        String[] dogBreeds = {"Terrier", "Greyhound", "Alsatian", "Spaniel", "Mongrel"};

        Scanner input = new Scanner(System.in);
        Pet[] pets = new Pet[5];

        String breed, name, animalType;
        int age;

        for (int i = 0; i < pets.length; i++ ) {
            age = getRandomValue(1, 15);
            System.out.print("What type of animal would you like (cat/dog)? > ");
            animalType = input.next();
            System.out.print("Please provide the name of this animal > ");
            name = input.next();
            if (animalType.equals("cat")){
                breed = catBreeds[getRandomValue(0,  catBreeds.length)];
                pets[i] = new Cat(name, age, breed);
            }else {
                breed = dogBreeds[getRandomValue(0, dogBreeds.length)];
                pets[i] = new Dog(name, age, breed);
            }
        }
           System.out.println("There are " + Cat.getNumCats() + " cats and " +
                   Dog.getNumDogs() + " dogs.");

           boolean finished = false;
           boolean found = false;
           int i;
           while (!finished) {
               System.out.print("Who would you like to speak next? > ");
               name = input.next();
               if (name.equals("Exit")) finished = true;
               else {
                   found = false;
                   i = 0;
                   while (i < pets.length && ! found) {
                       if (pets[i].getName().equals(name)) found = true;
                       else i++;
                   }
                   if (found) System.out.println(pets[i].speak());
                   else System.out.println("I don't know an animal called " + name);

               }
           }



    }
}