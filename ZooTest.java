/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q2;

import java.util.Scanner;

/**
 *
 * @author xiaowei
 */
public class ZooTest {
    public static void main(String[] args) {
//        //Test Case 1
//        Zoo myZoo = new Zoo(3);
//        
//        myZoo.addCreature("Panda", 150.0, "Mountains");
//        myZoo.addCreature("Dragon", 300.0, "Cave");
//        myZoo.addCreature("Master Oogway", 200.0, "Forest");
//        
//        myZoo.addCreature("Patrick Star", 250.0, "Rock");
//        
//        myZoo.displayAllCreatures();
//        
//        myZoo.feedCreature("Dragon", 50.0);
//        
//        myZoo.displayAllCreatures();
//        
        //Test Case 2
        Zoo myZoo = new Zoo(2);
        myZoo.addCreature("Giraffe", 100.0, "Mountains");
        myZoo.addCreature("Elephant", 250.0, "Forest");
        myZoo.addCreature("Dragon", 200.0, "Cave");
        
        myZoo.displayAllCreatures();
        
        myZoo.feedCreature("Dragon", 50.0);
        myZoo.feedCreature("Giraffe", 100.0);
        myZoo.feedCreature("Elephant", 50.0);

        myZoo.displayAllCreatures();
    }
}







































