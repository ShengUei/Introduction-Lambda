# Introduction Lambda
利用範例來介紹 Lambda

Lambda 使用條件:
1. 必須有 interface
2. 該 interface 只能有一個方法

Lambda 語法:
input -> body
ex :
```java
  1. () -> System.out.println("run me!");
  2. (String s) ->  System.out.println(s);
  3. (x, y) -> return x + y
  4. (int x, int y) -> {
                          x++;
                          y += 8;
                          return x + y 
                        }
```

- Scenario 1:
  - 簡單介紹繼承
- Scenario 2:
  - 簡單介紹介面
- Scenario 3:
  - 利用介面當參數，並透過匿名函式來實作介面中的方法
- Scenario 4:
  - 利用 Lambda 來實作介面中的方法
- Scenario 5:
  - 介紹 Stream api

