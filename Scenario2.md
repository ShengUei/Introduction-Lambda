# Scenario 2

假設今天動物園又需要新增魚的種類，若直接去繼承 Animal 會遇到一些問題

建立 Fish 類別
```java
public class Fish extends Animal {

    public Fish() {
    }

    public Fish(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void call() {}
}
```

由於魚不會有叫聲，所以會產生一個沒有內容的 call() 方法，這樣非常奇怪

為了解決這問題，我們可以使用 Interface 來解決

建立一個 Callable 的介面
```java
public interface Callable {

    void call();
    
}
```

改寫 Animal 類別
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

Dog 類別去實作 Callable 的介面
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

Cat 類別去實作 Callable 的介面
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

改寫 Fish 類別
```java
public class Fish extends Animal {

    public Fish() {
    }

    public Fish(String name, int age) {
        super(name, age);
    }
    
}
```
