# Introduction Lambda
利用範例來介紹Lambda

```java
public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
```

```java
public interface Callable {

    void call();
    
}
```

```java
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
```

```java
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
```

```java
public class Fish extends Animal {

    public Fish() {
    }

    public Fish(String name, int age) {
        super(name, age);
    }
    
}
```

```java
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
```
