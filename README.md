# Java-8-2023
### 1. Lamda Expression
Lambda function are those which are nameless and no need to pass type for arguments

### 2. Functional Interface
1. Functional Interface are those which contains only one abstract method  . 
2. Lambda expression can be used to represent the instance of a functional interface
    #### Why functional interface has only one abstract method:
    <hr/>
    lambda function can only provide the implementation for 1 method it is mandatory for the functional interface 
    to have ONLY one abstract method

### 3. Default Methods
1. default methods are newely introduced in Java 8 and before that if any class implementing any interface then
its compulsory to implement all the methods present in that interface
2. main reason to add default methods in interface is to add new features if needed and to provide backward
compatibility
3. Default methods are those which you can't able to access directly using interface name
To access default methods you need to implement them in class

### 4. Static Methods
1. Static methods can be used to create utility classes that contain general-purpose methods
2. The interface static methods are similar to static methods of class
3. Overriding of interface static method is not allowed
4. Child classes can use interface static method just by using interface reference name only

### 5. Predicate
1. Predicate is a Functional Interface that contains one abstract method called test
2. Predicate is used to check some conditions and based on that it will return boolean value 
```
3. Predicate<TypeOfInputParameter> p = ()->{};
```
```
4. interface Predicate<T>{
      public boolean test(T t);
   }
```


### 6. Predicate Joining
1. Predicate Joining are three methods means you can check two conditions for same case
2. AND, OR, NEGATE
3. p1.and(p2) --> should satisfy p1 and p2
4. p2.OR(p3) --> should satisfy p1 or p2
5. p4.negate(p1) --> should satisfy p4 and not p1

### 6. Functions

1. Function is a FunctionalInterface which takes input of type T and return output of type R which you can
mention
2. Function is a FunctionalInterface which contains one abstract method called apply 
```
3. public interface Function<T,R>{
      void apply(T t)
   }
```

### 7. Consumer
1. Consumer is a functional interface that accepts arguments and produce data without returning result
2. Consumer is an functional interface which contains one abstract method which is accept
```
3. interface Consumer<T>{
      void accept(T t);
   }
```


### 8. Supplier
1. Supplier is a functional interface that returns result without taking any input
2.  Supplier is a functional interface that contains only abstract method called get
```
3. interface Supplier<T>{
      T get(T t);
   }
```

### 9. Streams

1. filter --> used to filter data based on condition
2. map --> used to perform operation and change data on same list/array
3. count --> used to count data
4. min --> used to find max in all data
5. max --> used to find min in all data
6. sum --> used to sum up all the data 
7. convertArrayToList --> used to convert array to list
8. convertListToArray --> used to convert list to array

