/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q2;

/**
 *
 * @author xiaowei
 */
public class Creature {
    private String species,habitat;
    private double magicPower;
    
    public Creature(String species, double magicPower, String habitat){
        this.species = species;
        this.magicPower = magicPower;
        this.habitat = habitat;
    }
    
    public void feed(double foodAmount){
        magicPower += foodAmount;
        System.out.println(species + "'s magic power increased to " + magicPower + ".");
        System.out.println();
    }
    
    public void displayInfo(){
        System.out.println("Species: " + species);
        System.out.println("Magic Power: " + magicPower);
        System.out.println("Habitat: " + habitat);
        System.out.println();
    }
    
    public String getSpecies(){
        return species;
    }
    
}
