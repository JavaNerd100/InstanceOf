public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main instanceof Main );

        /**
         * The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
         *The instanceof in java is also known as type comparison operator because it compares the instance with type. It returns either true or false.
         * If we apply the instanceof operator with any variable that has null value, it returns false.
         */

        Object animal = Animal.getAnimal("DOG");
        if (animal instanceof Dog ){
            Dog.sayBowBow();
        }else if (animal instanceof Cat){
            Cat.SayMeow();
        }
    }
}
