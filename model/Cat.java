public class Cat extends Animal implements Callable {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void call() {
        System.out.println("meow meow");
    }
    
}
