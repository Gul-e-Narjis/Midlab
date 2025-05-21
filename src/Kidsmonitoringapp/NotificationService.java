/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kidsmonitoringapp;

/**
 *
 * @author Gule Narjis
 */
public class NotificationService {
    private ParentDevice parentDevice;

    public NotificationService(ParentDevice parentDevice) {
        this.parentDevice = parentDevice;
    }

    public void triggerAlert() {
        System.out.println("NotificationService: Triggering alert to parent device...");
        parentDevice.sendAlert("Loud noise in Room A");
    }
}
