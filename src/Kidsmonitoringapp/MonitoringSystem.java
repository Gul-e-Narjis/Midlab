/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kidsmonitoringapp;

/**
 *
 * @author Gule Narjis
 */
public class MonitoringSystem implements Observer {
    private AlertAnalyzer alertAnalyzer;
    private NotificationService notificationService;

    public MonitoringSystem(AlertAnalyzer alertAnalyzer, NotificationService notificationService) {
        this.alertAnalyzer = alertAnalyzer;
        this.notificationService = notificationService;
    }

    // Jab noise detect hota hai, yeh method call hota hai (update)
    @Override
    public void update() {
        System.out.println("MonitoringSystem: Notified of noise event.");
        boolean dangerous = alertAnalyzer.analyzeNoiseLevel();
        System.out.println("MonitoringSystem: AlertAnalyzer says dangerous = " + dangerous);
        if (dangerous) {
            triggerAlert();
        } else {
            System.out.println("MonitoringSystem: Noise not dangerous. No alert triggered.");
        }
    }

    private void triggerAlert() {
        System.out.println("MonitoringSystem: Triggering alert via NotificationService...");
        notificationService.triggerAlert();
    }
}
