/**
 * Created by Kris on 4/18/2016.
 */
public class Chapter5 {

    /*Abstract Classes
    * */
    public abstract class Animal {
        protected int age;

        public void eat() {
            System.out.println("Animal is eating");
        }

        public abstract String getName();
    }

    public class Swan extends Animal {
        public String getName() {
            return "Swan";
        }
    }
    /*
    Abstract Class Definition Rules:
    */
    //1. Abstract classes cannot be instantiated directly.
    //Animal animal = new Animal();

    /*2.Abstract classes may be defined with any number, including zero, of abstract and nonabstract methods.*/
    public abstract class Empty {
    }

    ;

    /*3.Abstract classes may not be marked as private or final.*/
    public abstract class Goat {
        //   public static void main(String[] args) {
        //       final Animal animal = new Animal();}
    }

    /*4.An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods.*/
   /*
   public class Walrus extends Animal {
    }
    */
    /*5.The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods.*/
    /*concrete class-->First non-abstract subclass that extends an abstract class*/
    Swan swan = new Swan();

    /*Abstract Method Definition Rules:*/
    /*1.Abstract methods may only be defined in abstract classes.*/
    /*2.Abstract methods may not be declared private or final.*/
    /*3.Abstract methods must not provide a method body/implementation in the abstract class for which is it declared.*/
    /*4.Implementing an abstract method in a subclass follows the same rules for overriding a method.
    For example, the name and signature must be the same, and the visibility of the method in the subclass must be at least as accessible as the method in the parent class.*/


    /*Interfaces*/
    /*
    * Java doesn't allow multiple inheritance,it does allow classes to implement any number of interfaces.
    * Interface is an abstract data type that defines a list of abstract public methods that
    .* any class implementing the interface MUST provide
    * */

    public interface Herbivore {
        public void eatPlants();
    }

    public interface Omnivore {
        public void eatPlants();

        public void eatMeat();
    }

    public class Bear implements Herbivore, Omnivore {
        public void eatMeat() {
            System.out.println("Eating meat");
        }

        public void eatPlants() {
            System.out.println("Eating plants");
        }
    }

    public interface WalksOnTwoLegs {
    }

    /*1.Interfaces cannot be instantiated directly.*/
    // WalksOnTwoLegs example = new WalksOnTwoLegs();
    /*2.An interface is not required to have any methods.*/
    /*3.An interface may not be marked as final.*/
    // public final interface WalksOnEightLegs {  }
    /*5.All nondefault methods in an interface are assumed to have the modifiers abstract and public in their definition.
        Therefore, marking a method as private, protected, or final will trigger compiler errors as these are incompatible with the abstract and public keywords.*/
    public interface CanFly {
        void fly(int speed);

        abstract void takeoff();
        //     private double dive();
    }


    /*Polymorphism*/
    /*Java object may be accessed using a reference with the same type as the object
    * */
    public class Primate {
        public boolean hasHair() {
            return true;
        }
    }

    public interface HasTail {
        public boolean isTailStriped();
    }

    public class Lemur extends Primate implements HasTail {
        public boolean isTailStriped() {
            return false;
        }

        public int age = 10;

    }

    public void runlemur() {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());
    }

    public static void main(String[] args) {
        Chapter5 chapter5 = new Chapter5();
        chapter5.runlemur();

    }
}
