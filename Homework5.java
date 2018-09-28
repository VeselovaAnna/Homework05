package Homework5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        CarDoor car1 = new CarDoor();

        car1.openORClosedWindow();
        car1.openORClosedDoor();
        car1.openORClosedWindow();
        car1.openORClosedDoor();

        CarWheel car2 = new CarWheel(0.6f);
        car2.show();


        Car car3 = new Car("2018", "turbo", 180, 5, 7, 2, 60);
        car3.show();

    }
}





