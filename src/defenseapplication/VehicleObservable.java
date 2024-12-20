/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defenseapplication;

/**
 *
 * @author ha
 */
public interface VehicleObservable {
    public void RecievePrivateMsg(String msg);
    public String returnName();
    public int SendAmmoCount();
    public int SendSoldierCount();
    public void updateAreaClear(boolean isSelected);
    public void RecieveMassegetoVehicle(String massege);
    public boolean isPositioned();
    public void enableBtns();
    public void setStrengthLevel(int strengthvalue);
      public void sendMsgToMain();
    
}
