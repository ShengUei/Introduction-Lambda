# Scenario 5

Lambda 比較常應用的地方是 Java8 所提供的 Stream 介面。

Stream 提供了方便且容易操作 Collection 的方法。

Stream 分成了兩種 Operator
- intermediate
- terminal

組成方式為**多個** intermediate Operator 加上**一個** terminal Operator 。

![Stream diagram](https://s29840.pcdn.co/wp-content/uploads/2020/06/238.Java-streams.jpg)
