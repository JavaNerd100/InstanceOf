public class Animal {

    public static Object getAnimal(String input){
        if (input.contains("DOG")){
            return Dog.class;
        }else {
            return Cat.class;
        }

    }
}
