/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personbmi;

/**
 *
 * @author MERC-LAB-01
 */
public class Person {
    String name;
    int age;
    double ht;
    double wt;
    double bmi;
    
    public Person(){
        System.out.println("new class is created");
        
    }
    public Person(String provideAname){
        System.out.println("new class is created with a name");
        name=provideAname;}
        
        public Person (String provideAname, double provideAwt, double provideAht){
         System.out.println("new class created with name");
         name= provideAname;
         wt=provideAwt;
         ht=provideAht;
        
               
    }
    public void calculateBmi(){
        bmi=wt/(ht*ht);
    }
    
}
