/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q2;

/**
 *
 * @author xiaowei
 */
public class Zoo {
    private Creature[] creatures;
    private int count;
    
    public Zoo(int capacity){
        creatures = new Creature[capacity];
        count = 0;
    }
    
    public void addCreature(String species, double magicPower, String habitat){
        if (count < creatures.length){
            creatures[count] = new Creature(species, magicPower, habitat);
            count ++;
            System.out.println(species + " added to the zoo.");
        } else {
            System.out.println("Zoo is full! Cannot add more creatures.");
        }
    }
    
    public void feedCreature(String species, double foodAmount){
        for (int i = 0; i < count; i++){
            if (creatures[i].getSpecies().equals(species)){
                creatures[i].feed(foodAmount);
                return;
            }
        }
        System.out.println("Creature not found in the zoo.");
        System.out.println();
    }
    
    public void displayAllCreatures(){
        for (int i = 0; i < count; i++){
            creatures[i].displayInfo();
        }
    }
}
