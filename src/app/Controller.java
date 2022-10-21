package app;
import cooling.AC;
import buildingunit.Room;
import building.House;

import java.util.Scanner;

public class Controller {

    public static void main (String[] args){

        AC.acStats();
        Room kitchen = new Room("Kitchen", "White", 15.5, 10.0, 78.0);
        kitchen.roomStats("");

        Room livingRoom = new Room("Living Room", "Tan",25.00,20.70,76.50);
        livingRoom.roomStats("");

        Room bathroom = new Room("Bathroom", "White", 15.00, 10, 74.3);
        bathroom.roomStats("");

        Room bedroom = new Room("Bedroom", "Blue", 8.00, 8, 78);
        bedroom.roomStats("");

        House myHouse = new House(kitchen, livingRoom, bathroom, bedroom);
        myHouse.displayInfo();

        System.out.println("-------------------------------------------------");
        System.out.println("What is the house's total square feet: " + myHouse.getHouseSquareFeet());
        System.out.println("-------------------------------------------------");
        System.out.println();

        AC.acStats();

        System.out.println("-------------------------------------------------");
        System.out.println("Call by Value ");
        System.out.println("-------------------------------------------------");
        System.out.println();

        AC.changeTemperatureDown(livingRoom.getTemperature(), 5);
        livingRoom.roomStats("");

        AC.changeTemperatureDown(myHouse.getKitchen().getTemperature(), 3);
        myHouse.getKitchen().roomStats("");

        AC.acStats();

        System.out.println("-------------------------------------------------");
        System.out.println("Call by Reference ");
        System.out.println("-------------------------------------------------");
        System.out.println();

        AC.changeTemperatureDown(livingRoom, 5);
        livingRoom.roomStats("");

        AC.changeTemperatureDown(myHouse.getKitchen(), 3);
        myHouse.getKitchen().roomStats("");

        AC.acStats();

    }
}
