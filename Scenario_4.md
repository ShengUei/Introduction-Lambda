# Scenario 4

利用 Lambda 寫法來簡化匿名函式
```java
public class Main {
    public static void main(String[] args) {
        Human peter = new Human();

        peter.speak(new Callable() {
            @Override
            public void call() {
                System.out.println("My name is Peter.");
            }
        });

        peter.speak(() -> System.out.println("Hi Kathy"));

        Human amy = new Human();

        amy.speak(new Callable() {
            @Override
            public void call() {
                System.out.println("Hello World.");
            }
        });

        amy.speak(() -> System.out.println("My name is Amy"));
    }
}
```
由此我們可以發現 Lambda 的作用與匿名函式相同，但寫起來比較簡潔
