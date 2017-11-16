/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personbmi;

import javax.swing.JOptionPane;

/**
 *
 * @author MERC-LAB-01
 */
public class PersonBmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person i1 = new Person();
        i1.name= JOptionPane.showInputDialog("name");
        i1.ht= Double.parseDouble(JOptionPane.showInputDialog ("ht"));
        i1.wt = Double.parseDouble(JOptionPane.showInputDialog("wt"));
        i1.calculateBmi();
        JOptionPane.showMessageDialog(null, i1 . name + " your BMI"+ i1.bmi);
        
        
                Person p1 = new Person();
    p1.name = "Buddhika";
    p1.ht = 1.56;
    p1.wt =85;
    p1.age = 42;
    p1.calculateBmi();
        System.out.println(p1.name+" p1.bmi= "+p1.bmi);
        
    Person p2 = new Person("Ajith",50,1.2);
            
        p2.name ="Ajith";
        p2.ht=2;
        p2.wt=67;
        p2.age=34;
        p2.calculateBmi();
        System.out.println(p2.name+"p2.bmi =" +p2.bmi);
    }

  
}
