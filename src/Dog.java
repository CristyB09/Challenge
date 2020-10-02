public class Dog extends Pet {
    private String breed;
    private static int numDogs = 0;

    public static int getNumDogs() {
        return numDogs;
    }

    public Dog(){
        super();
        breed = "";
        numDogs++;
    }

    public Dog(String aName, int anAge, String aBreed) {
        super(aName, anAge);
        breed = aBreed;
        numDogs++;
    };

    public String speak() {
        return "Woof!" + this + breed;
    }

}
