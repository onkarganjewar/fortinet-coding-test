# Fortinet-Coding-Challenge

### Questions:

1. Reverses a single list.  The Node of this single list as the following:

```java

class Node{
    Node next;
    int value;
}
// Your resolution 
// Time complexity:  
// Space complexity:  
public Node reverse(Node head){
}
// JUnit test cases 
```

2. Sum of multidimensional Array. require no extra space, no recursion. 

```java
class MultiDimensionArray {
    // This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
        //... 
        return value;
    }
    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
   // Your resolution 
   // Time complexity:  
   // Space complexity: 
    return sum;
    }
 ```
 
 3. Given a list of numbers, see if you can separate them in to k groups such that each group has the same sum. 

```java
public boolean separate(List<Integer> list, int k){
   // Your resolution 
   // Time complexity:  
   // Space complexity: 
}
  // JUnit test cases 
```

4. Implements of  Singleton or Dynamic Proxy
Assume you are using Java 7+

5. When the project is using Spring 4.3  and Hibernate 5.2, how to write the JUnit test without bounded with concrete DB closely. In other words, How to mock DB in JUnit test for service method.  If not possible give the reason else list cases for the different scenario. 



### Answers

> Answers for __Q.1__ to __Q.4__ can be found within the project [solution](https://github.com/onkarganjewar/fortinet-coding-test/tree/master/solution) with their respective [packages](https://github.com/onkarganjewar/fortinet-coding-test/tree/master/solution/src/main/java/com/fortinet/jjse/challenge) named as per the questions (one to four).

5. We can mock DB in the JUnit test for testing service methods with the help of *__in-memory H2 database__*. We can configure our Spring application to use H2 database instead of concrete database. It will be created automatically upon app configuration and dumped as soon as the JVM exits. All the tests will be run on this mocked database. Sample properties file for this H2-database can be like [this](fortinet-coding-test/spring4-hibernate5-example/src/test/resources/persistence-h2.properties). The [H2DBTest](fortinet-coding-test/spring4-hibernate5-example/src/test/java/com/fortinet/jjse/test/spring4_hibernate5/H2DBTest.java) class wil create an in-memory database with the help of [H2DBConfig](fortinet-coding-test/spring4-hibernate5-example/src/main/java/com/fortinet/jjse/test/spring4_hibernate5/config/H2DBConfig.java) class, then execute tests, close the database, and dump the database in the end. 
