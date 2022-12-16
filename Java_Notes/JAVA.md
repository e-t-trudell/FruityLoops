<!-- File types -->
Either .class or .jar file types

The Java Development Kit is the software you'll need to run Java code. You will use the JDK to compile your java code into .class files which contain a compact version of the source code you write, called bytecode. It can also be compiled into .jar files but for now we'll only compile into .class files. After compiling, we can run the bytecode with tools that are included in the JDK.

<!-- Dynamic versus static language types -->
Java, C, and Swift are statically typed languages. Javascript, Python, and Ruby are dynamically typed.

hese refer to when we assign types to variables. Languages with static typing assign a type to declared variables at compile time and set aside the right amount of memory for that variable, while those with dynamic typing assign types only when the variable declaration code runs during execution and change the memory allocated for the variable as needed - this comes at the cost of program speed while it reorganizes things.

<!-- Terminal commands -->
javac
java

<!-- Other things-->
java.util

<!-- JVM -->
Java Virtual Machine

<!-- Primative data types  -->
will always be distinguished with a lowercase variable
-must give these a security level
-- Integer myInteger = 0; only up to 2.4 billion(wrapper class this is how you add primitive data types to arrays of arrays of lists. Each thing in the list will only be an object so this wrapper makes it an object)
 --public int myInteger = 0; only up to 2.4 billion
 --public long myLong = 0; quintatrillion
 --public double (any floating point number)  myDouble=20.0 huge storge here this will add a decimal when it saves
 double (any floating point number)  myDouble=(Double)20 <!-- casts double with a decimal -->
-- public boolean myBool = false;
--char myChar = 'a';
<!-- structured data types / data structures-->
you muist delcared your varibale type so that the program knows how big it will be and how much space that it needs
int[4] myInts = {0,1,2,3}
import into java file:
import java.util.ArrayList;
ArrayList<Integer>myIntArray = new ArrayList<Integer>();
myIntArray.add(5);
myIntArray.add(3);
myIntArray.remove(feed index here);
String myStrong - "My String";
String otherSting - my string;
<!-- comparing strings is never comparing the content of the string it compares the reference place in memory versus the value -->
to check if any ovbjects equal the other object myString.eqauls(otherString)
System.out.println(myIntArray);
<!-- myString.eqauls(otherString) can go in above print statement -->
.equals cannot be used on primative types but you can use them on the object wrappers

enhaced for loop:
<!-- loops through stored values in existing array -->
for (Integer i : myIntArray) {
}

<!-- Switch Statements and Ternary Operators: -->
the switch statement switchs the value of the day variable or the case to loop through, similar to an if else if statement. Each case must have a break after if for the switch to exit when the right answer is found. default at the end is equivilent to the else. 
int day = 2;
switch(day){
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	default:
		System.out.println("There are only seven days in a week...");
}
<!-- ternary operator -->
boolean isRaining = true;
    
if(isRaining) {
    System.out.println("Bring an umbrella.");
}
else {
    System.out.println("Have fun!");
}
^^Changes to:
System.out.println(isRaining ? "Bring an umbrealla" : "Have fun!");

<!-- STRINGS!!!!! -->
String must always be capitalized because there are no primitive string data types
String myString = " ",
System.out.println(myString.substring(begunIndex:0, endIndex:1));
.trim() - will remove white space from only start and end of string
.toLowerCase will make login not case sensitive
.toUpperCase will make login not case sensitive

<!-- Type casting -->
public class Casting{
	public static void main (String[] args){
<!-- explcit casting bigger to smaller-->
		int i = 120;
		byte b = (byte)i;
<!-- implicit casting smaller to bigger size-->
		byte b = 127;
		int i = b;

		System.out.println(i);
		System.out.println(b);
	}
}

<!-- Springboot -->
cmd +shift+o - imports anything in file that you need access to
<!-- packages -->
just a sub folder in a project
javaexample(java project foler)
|-bin(binary folder where all class files will live)
|-src
	|-main
		|-Test.java
	|-models
	|-Person.java
<!-- Twp dimensional array - array that each item in it is another array -->
-data type
-
public class VendingMachine{
	<!-- indicating another dimension array after item call -->
	private Item[][] contents = new Item[4][3];
	private Double deposited = 0.0;
	
	public VendingMachine(){};
	public VendingMachine(Item[][] contents){
		this.countents = contents;
	}

<!-- psuedo code for things and stuff -->
	public Double despositMoney(Double amount){
		<!-- increment deposited by amount if amount is greater than start point-->
		if (amount > 0.0){
			this.deposited += amount;
		}
		return deposited;
	}
	public Double refund(){
		Double amountRefunded = deposited;
		deposited = 0.0;
		return amountRefunded;
	}
	public Item buy(String selection){
		<!-- customer makes selection: String"<letter>, <number>" -->
		<!-- Below(in here): where to split and then how many items in the array -->
		String[] selectArr = selection.split(",",2);
		if(selectArr[0].toLowerCase() != "a" && selectArr[0].toLowerCase() != "b" && selectArr[0].toLowerCase()!="c"){
			return null;
		}
		if(Integer.parseInt(selectArr[1])< 0)|| Integer.parseInt(selectArr[1])>3){
			return null;
		}
		*** ### ***START HERE ### ***
		return null;
		<!-- validate that String is in letter number format. Failed validation returns null -->
		
		<!-- translate that String into x,y coordinates -->
		<!-- check deposited versus item.price. check item.quantityInStock > 0  -->
		<!-- if bopth are true - item.cost from deposited -->
		<!-- decrement item.quantityInStock -1 -->
		<!-- return item object: -->
		return Item;
	}
<!-- generate getters and setters here -->
	public Item[][] getContents(){
		return contents;
	}
	public void setContents(Item[][] contents){
		this.contents = contents;
	}
	public Double getDesposited(){
		return deposited;
	}
}
<!-- HashMap -->

<!-- This keyword -->
class Person {
    private int age;
    private String name;
    public Person(int ageParam, String nameParam) {
        this.age = ageParam;
        this.name = nameParam;
    }
}

is the same as 

class Person {
    private int age;
    private String name;
    public Person(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
    }
}

Must use this if your parameter varibale shares the same name as your member variable!
class Person {
    private int age;
    private String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        
        // this will not set the attribute value. 'age' is a local variable in the constructor method and its value is the very first argument.
        age = age 
    }
}

Imagine that you have written out a constructor that takes an int, a string, and another int, but you also want there to be an empty constructor with default values. You could implement such a thing as shown:
In this case, it must be the first statement in your constructor, and it will call the other constructor for you.

public class Person {
    private int age;
    private int cmHeight;
    private String name;
    public Person() {
        this(20, "John Doe", 171);
    }
    <!-- first statement calls the empty constructor with default values-->
    public Person(int age, String name, int cmHeight) {
        this.age = age;
        this.name = name;
        this.cmHeight = cmHeight;
    }

<!-- Object super class has methods that all other classes can use you must use this. keyword chain -->
person.java
class Person {
    private int age;
    private String name;
    public Person(int ageParam, String nameParam) {
        this.age = ageParam;
        this.name = nameParam;
    }
    public void objectMethods(Person anotherObject) {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherObject));
    }
}
persontest.java
class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(10, "Person1");
        Person person2 = new Person(5, "Person2");
        person1.objectMethods(person2);
    }
}
output:
Class name: Person
toString: Person@7852e922
Equals: false

<!-- Tries -->
class Node{
	HashMap<Character, Node> children;
	boolean is completed word;
}

Dictionary:
car
card
chip
trie
try

top node in tree is hashmap children
bottom of node is "is complete?"

if starting letter is not part of hashmap create noode with that letter(first word car first node c, t)
<!-- bottom of node indicates false if it is not the end of the word -->
second letter of word; add node if letter is not in hashmap(a,h)
third letter of word; add node it letter is not in hashmap(r)
<!-- always add one more node at the end of the word with true for word complete-->
in next word(chip) add letters to nodes as you go down the path of nodes(see above)
on i; make new node and add letter to hashmap(i)
p; same as above(p)
<!-- third word trie -->
create new node after adding t to the first node
r; create new node and add to hashmap(r,y)
i; same as above(i)
e; create new node(e)
create new empty node
<!-- fourth word -->
try

<!-- To print HashMap keys that share the same node path with multiple nodes for the dictionary: -->
<!-- trie.root.children(this is the HashMap you are pulling from!!) -->
this prints the chilldren of the root only. To go deeper trie.root.children.get("c").children.keySet();
Set<Character> keys = trie.root.children.keySet();
for (Character key: keys){
	System.out.println(key);
	<!-- System.out.println(trie.root.children.get.(key)); -->
}
<!-- SpringBoot -->
When creating a new Spring Starter Project fill out fields:
name;your project name
group;com.<companyname>.<yourprojectname>
artifact;<yourprojectname>
description;short description about the project
package;same as the group field

Dependencies;
Web > Spring Web

<!-- Steps to create a Spring Boot App -->
***1)new project name as above***
***2)src/main/java > new packages; controllers, models, views***
***3)src/main/resources > application properties:***
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
# Data Persistence
#spring.datasource.url=jdbc:mysql://localhost:3306/<<YOUR_SCHEMA_NAME>>
#spring.datasource.username=root
#spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
# For Update and Delete method hidden inputs
spring.mvc.hiddenmethod.filter.enabled=true

***4)pom.xml add dependencies:***
<!-- DEPENDENCIES FOR STARTING SPRING PROJECTS-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <!-- DEPENDENCIES FOR DISPLAYING JSPS AND USING JSTL TAGS -->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>
        <!-- DEPENDENCIES FOR INTEGRATING SQL DATABASE AND USING JPA -->
        <!-- Note: Project will not run until a schema has been created and the 
            proper settings in application properties are present for 
            connecting to a database. -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <!-- DEPENDENCY FOR USING VALIDATION ANNOTATIONS -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <!-- DEPENDENCY FOR USING BCRYPT  -->
        <dependency>
            <groupId>org.mindrot</groupId>
            <artifactId>jbcrypt</artifactId>
            <version>0.4</version>
        </dependency>
        <!-- DEPENDENCIES FOR BOOTSTRAP -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>webjars-locator</artifactId>
            <version>0.30</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>5.0.1</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>jquery</artifactId>
            <version>3.6.0</version>
        </dependency>

***5)src/main/webapp/WEB-INF > name of view .jsp file (saves changes to template):***
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Brownies</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   <!-- Add page content here -->
</body>
</html>

***6)right click project folder > Maven > Update Project***

7)

Run;
run as Spring Boot App
once server is running visit in webpage: localhost:8080
first visit will display Whitelabel Error Page

naming conventions for maven spring projects
com.codingdojo.maven.firstproject
com.<companyname>.framework.<projectname>

<!-- add notes about restController and Request mapping -->
when making changes to the files you must restart the server and refresh the webpage

<!-- JSP files -->
create a .jsp file in the src/main/appname folder
add the following dependency to your pom.xml inside dependencies list
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
<!-- JSTL - Java Server Pages Standard Tag Library -->
create a .jsp file in the src/main/appname folder
add the following dependency to your pom.xml inside dependencies list
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
</dependency>

then inport this into your .jsp file
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- c:out -->
to display information dynamically use
<h1>Two plus two is: <h1>
<h2><c:out value="${2+2}"/></h2>

<!-- Dynamic Rending -->
1) create the src/main/webapp folder if it doesnt exist
2) create the src/main/webapp/WEB_INF folder
3) edit the src/main/resources/applications/properties file to contain:
spring.mvc.view.prefix=/WEB-INF/



