 # Scenario 1
 
 假設今天要來寫一個動物園程式，裡面有狗和貓。
 
 所以我們可以快速的利用繼承的方式來實作
 
 建立 Animal 類別
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
    
    public void call() {
        System.out.println();
    }
    
}
```

建立 Dog 類別
```java
public class Dog extends Animal {

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

建立 Cat 類別
```java
public class Cat extends Animal {

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
