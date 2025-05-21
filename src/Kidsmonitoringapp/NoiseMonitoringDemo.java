/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kidsmonitoringapp;

/**
 *
 * @author Gule Narjis
 */
public class NoiseMonitoringDemo {
    public static void main(String[] args) {
        ParentDevice parentDevice = new ParentDevice();
        NotificationService notificationService = new NotificationService(parentDevice);
        AlertAnalyzer alertAnalyzer = new AlertAnalyzer();
        MonitoringSystem monitoringSystem = new MonitoringSystem(alertAnalyzer, notificationService);

        NoiseSensor noiseSensor = new NoiseSensor();
        noiseSensor.registerObserver(monitoringSystem);  // observer register kar diya

        // Noise detect karo - ye automatically monitoring system ko notify karega
        noiseSensor.detectNoise();
    }
}

