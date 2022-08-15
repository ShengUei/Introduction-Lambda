public class Dog extends Animal implements Callable {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void call() {
        System.out.println("woof woof");
    }
    
}
