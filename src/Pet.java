public class Pet {
    //instance variables
    private String name;
    private int age;

    //default constructor
    public Pet() {
        name = "";
        age = 0;

    }

   //constructor with values
    public Pet(String aName, int anAge) {
        name = aName;
        age = anAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int anAge) {
        age = anAge;
    }

    public String toString() {
        return "I am " + name + ", a " + age + " year old";
    }
    public String speak() {
        return "";
    }
}





