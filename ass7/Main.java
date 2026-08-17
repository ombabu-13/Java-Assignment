class Parent{
    Parent(){
        System.out.println("Parent class Constructor");
     }
 }
 class Child extends Parent{
     Child(){
         super();
         System.out.println("Child class Constructor");
     }
 }
 public class Main{
     public static void main(String args[]){
        new Child();
     }
 }