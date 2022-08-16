# Scenario 5

Lambda 比較常應用的地方是 Java8 所提供的 Stream 介面。

Stream 提供了方便且容易操作 Collection(List, Set) 的方法。

Stream 分成了兩種 Operator
- intermediate
- terminal

組成方式為**多個** intermediate Operator 加上**一個** terminal Operator 。

![Stream diagram](https://s29840.pcdn.co/wp-content/uploads/2020/06/238.Java-streams.jpg)


- forEach():

```java
List<Integer> numberList = Arrays.asList(6, 77, 46, 2, 10, 66, 5);

numberList.stream()
           .forEach(System.out::print);
```

output:
```java
6, 77, 46, 2, 10, 66, 5
```

- filter():

```java
List<Integer> numberList = Arrays.asList(6, 77, 46, 2, 10, 66, 5);

numberList.stream()
           .filter(x -> x <= 10)
           .forEach(System.out::print);
```

output:
```java
6, 2, 10, 5
```


- sorted():

```java
List<Integer> numberList = Arrays.asList(6, 77, 46, 2, 10, 66, 5);

numberList.stream()
           .sorted()
           .filter(x -> x <= 10)
           .forEach(System.out::print);
```

output:
```java
2, 5, 6, 10
```
