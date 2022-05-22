/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxiapp;

/**
 *
 * @author USER
 */
public class calculation {
    
    static String pickup = "";
    static String dropOff = "";
    static int num = 0;
    
   static String[] DriverNames = {"David Nkiru", "James Charles", "Emmanuel", "Joy Alu"};
   static String[] CarModel = {"Corolla", "Camry", "Prius", "Mazda"};
   static String[] color = {"Red", "Gold", "Blue", "Black"};
   static String[] price = {"1,200", "3,200", "1,400", "1,100"};
   static String[] contact = {"080962908736", "0756781790", "07076281756", "080962908736"};
   
   
    
    
    public static void main(String[] args){
    }
    
    public static int getRand(int min, int max){
     // define the range
        int range = max - min + 1;
        
       return (int)(Math.random() * range) + min;
    }
    
    public static java.util.Dictionary getDriver(int i){
        java.util.Dictionary driver = new java.util.Hashtable();
        driver.put("name", DriverNames[i]);
        driver.put("car", CarModel[i]);
        driver.put("color", color[i]);
        driver.put("contact", contact[i]);
        driver.put("price", price[i]);
        
        return driver;
    }
    
    public static void storeLocation(int type, String location){
        if(type == 0){pickup = location;}
        else if(type == 1){dropOff = location;}
    }
    
    public static String getLocation(int type){
        if(type == 0){return pickup;}
        else if(type == 1){return dropOff;}
        return "";
    }
    
    public static int getTripTime(){
        return calculation.getRand(10, 55);
    }
    
    public static int getWaitTime(){
        return calculation.getRand(1, 7);
    }
    
    public static int getTaxiAmount(){
        return calculation.getRand(1, 10);
    }
    
    public static void setNum(int n){
        num = n;
    }
    
    public static int getNum(){
        return num; 
    }
}


