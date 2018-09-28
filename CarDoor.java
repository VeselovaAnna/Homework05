package Homework5;

public class CarDoor { //class open or closed
    private boolean door;
    private boolean window;

    public CarDoor() {

    }

    public CarDoor(boolean door, boolean window) {
        this.door = door;
        this.window = window;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }

    public void setWindow(boolean window) {
        this.window = window;
    }

    public boolean getDoor() {
        return door;
    }

    public boolean getWindow() {
        return window;
    }

    private boolean openTheDoor() {
        this.door = true;
        {
            System.out.println("Open the door");
        }
        return door;
    }


    private boolean closedTheDoor() {
        this.door = false;
        {
            System.out.println(" Closed the door");
        }
        return door;
    }

    public void openORClosedDoor() {
        if (door == true) {
            closedTheDoor();

        } else {
            openTheDoor();

        }
    }

    private boolean openTheWindow() {
        this.window = true;
        {
            System.out.println("Open the window ");
        }
        return window;
    }


    private boolean closedTheWindow() {
        this.window = false;
        {
            System.out.println(" Closed the window ");
        }
        return window;
    }

    public void openORClosedWindow() {
        if (window == true) {
            closedTheWindow();

        } else {
            openTheWindow();

        }
    }

    public void show() {
        System.out.println(door);
        System.out.println(window);
    }
}
