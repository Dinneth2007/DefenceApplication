/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defenseapplication;

import java.util.ArrayList;

/**
 *
 * @author ha
 */
public class Controller {
   private ArrayList<VehicleObservable> observableList=new ArrayList<>();
   private ArrayList<String> nameList=new ArrayList<>();
   
    public void addVehicle(VehicleObservable vehicle){
        observableList.add(vehicle);
    }
    public void updateAreaCleared(boolean isSelected){
        for (VehicleObservable vehicleObservable : observableList) {
            vehicleObservable.updateAreaClear(isSelected);
        }
    }
    
    public void SendMsgToVehicles(String msg){
        for (VehicleObservable vehicleObservable : observableList) {
            vehicleObservable.RecieveMassegetoVehicle(msg);
        }
    }
    
}
