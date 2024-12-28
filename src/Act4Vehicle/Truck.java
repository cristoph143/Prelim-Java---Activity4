/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act4Vehicle;

/**
 *
 * @author iStruck
 */
public class Truck implements Vehicle{
    
  private int maxCargo;

    public Truck(int maxCargo) {
        this.maxCargo = 20;
    }

    public int getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo(int maxCargo) {
        this.maxCargo = 20;
    }
  
  @Override
    public String toString() {
        return maxCargo + "";
    }
  
}
