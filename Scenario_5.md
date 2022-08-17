# Scenario 5

Lambda 比較常應用的地方是 Java8 所提供的 Stream 介面。

Stream 提供了方便且容易操作 Collection(List, Set) 的方法。

Stream 分成了兩種 Operator
- intermediate
- terminal

組成方式為**多個** intermediate Operator 加上**一個** terminal Operator 。

![Stream diagram](https://s29840.pcdn.co/wp-content/uploads/2020/06/238.Java-streams.jpg)


- forEach() 將進行依序取出 :

```java
List<Integer> numberList = Arrays.asList(6, 77, 46, 2, 10, 66, 5);

numberList.stream()
           .forEach(System.out::print);
```

output:
```java
6, 77, 46, 2, 10, 66, 5
```

- filter() 在 intermediate 階段，將 Stream 中的資料進行條件篩選 :

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

- sorted() 在 intermediate 階段，將 Stream 中的資料進行排序 :

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

- map() 在 intermediate 階段，將 Stream 中的資料進行操作 :

```java
List<Integer> numberList = Arrays.asList(6, 77, 46, 2, 10, 66, 5);

numberList.stream()
           .map(x -> x * x)
           .forEach(System.out::print);
```

output:
```java
36, 5929, 2116, 4, 100, 4356, 25
```

- reduce() 將進行依序取出，並與前一筆資料進行處裡，最後輸出一個結果 :

```java
List<Integer> numberList = Arrays.asList(6, 77, 46, 2, 10, 66, 5);

numberList.stream()
           .filter(i -> i < 10)
           .reduce(0, (tempSum, i) -> tempSum + i);
           
System.out.println(sum);
```

output:
```java
13
```

- list 轉成 map

```java
List<Integer> numberList = Arrays.asList(6, 77, 46, 2, 10, 66, 5);


Map<Integer, Integer> numberMap = numberList.stream()
                                             .sorted()
                                             .collect(Collectors.toMap(x -> x, x -> x * x));
                                             

numberMap.keySet().stream()
                  .sorted()
                  .forEach(k -> System.out.println(k + " : " + numberMap.get(k)));                                             
```

output:
```java
2 : 4
5 : 25
6 : 36
10 : 100
46 : 2116
66 : 4356
77 : 5929
```
