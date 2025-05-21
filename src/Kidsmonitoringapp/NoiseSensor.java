/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kidsmonitoringapp;

/**
 *
 * @author Gule Narjis
 */
public class NoiseSensor extends Subject {

    // Jab noise detect hota hai
    public void detectNoise() {
        System.out.println("NoiseSensor: Noise detected!");
        notifyObservers();  // sab observers ko notify karta hai
    }
}

