public class Human extends Animal {

    public Human() {
    }

    public Human(String name, int age) {
        super(name, age);
    }

    public void speak(Callable callable) {
        callable.call();
    }
}
