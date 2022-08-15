# Scenario 3

由於動物園內一定會有人，而人也是一隻動物

建立 Human 類別
```java
public class Human extends Animal implements Callable {

    public Human() {
    }

    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public void call() {
        System.out.println("bra bra bra");
    }
}
```

由於人會發出的聲音很多種，但每發出一種聲音都要去建立一個新的類別是很麻煩的，所以這時候可以利用介面

改寫 Human 類別
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
在 speak() 方法中，放入 Callable 介面來當參數，在呼叫 Callable 的 call() 方法
