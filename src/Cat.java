public class Cat extends Pet{
       private String breed;
       private static int numCats = 0;

       public static int getNumCats() {
           return numCats;
       }

       public Cat(){
           super();
           breed = "";
           numCats++;

       }

      public Cat(String aName, int anAge, String aBreed){
           super(aName, anAge);
           breed = aBreed;
           numCats++;
      }
      public String speak() {
           return "Miaow!" + this + breed;
      }

}
