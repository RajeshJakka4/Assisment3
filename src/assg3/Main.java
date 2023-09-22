package assg3;




class Dog implements Animal {
 
 public void eat() {
     System.out.println("Dog is eating.");
 }

 
 public void sleep() {
     System.out.println("Dog is sleeping.");
 }
}


class Cat implements Animal {
 
 public void eat() {
     System.out.println("Cat is eating.");
 }

 
 public void sleep() {
     System.out.println("Cat is sleeping.");
 }
}

public class Main {
 public static void main(String[] args) {
    
     Dog myDog = new Dog();
     Cat myCat = new Cat();

    
     myDog.eat();
     myDog.sleep();

     myCat.eat();
     myCat.sleep();
 }
}


