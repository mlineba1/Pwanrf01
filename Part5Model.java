/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITCS3166Project;

import java.util.ArrayList;

/**
 *
 * @author Lantzen Lowe
 */
public class Part5Model {
    private String ipAdd;
    // private ArrayList<String> ipAdds;
    private String chosenInterface;
    private ArrayList<String> interfaces;

    public Part5Model() {
        //ipAdds = new ArrayList<>();
        ipAdd = "";
        interfaces = new ArrayList<>();
    }

    public String getIpAdd() {
        return ipAdd;
    }

    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd;
    }

    public String getChosenInterface() {
        return chosenInterface;
    }

    public void setChosenInterface(String chosenInterface) {
        this.chosenInterface = chosenInterface;
    }

    /*
    public void addIpAddress(String ip) {
        ipAdds.add(ip);
    }
    */
    
    public void addRoutedAddress(String designatedInterface) {
        interfaces.add(designatedInterface);
    }
    
    /*
    public boolean removeIpAddress(String ip) {
        if(!ipAdds.contains(ip)) return false;
        ipAdds.remove(ip);
        return true;
    }
    */
    
    public boolean removeRoutedAddress(String designatedInterface) {
        if(!interfaces.contains(designatedInterface)) return false;
        interfaces.remove(designatedInterface);
        return true;
    }
    
    
}
