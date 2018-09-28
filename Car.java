package Homework5;

public class Car {
    private String date; //дата изотовления
    private String type; //тип двигателя
    private float maxSpeed; //макс скорость
    private int time; //время разгона до 100 км
    private int maxPassenger;//макс скорость
    private int countPassenger;
    private float currentCarSpeed;
    public int[] door = {1, 2, 3, 4, 5};
    public float[] wheel = {1.0f, 0.8f, 0.4f, 0.6f};
    int[] arrWheels = {1, 1, 1};

    public Car(String date) {
        this.date = date;
    }

    public Car(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public Car(String date, String type, int maxSpeed, int time, int maxPassenger, int countPassenger, int currentCarSpeed) {
        this.date = date;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.time = time;
        this.maxPassenger = maxPassenger;
        this.countPassenger = countPassenger;
        this.currentCarSpeed = currentCarSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setCurrentCarSpeed(int currentCarSpeed) {
        this.currentCarSpeed = currentCarSpeed;
    }

    public float getCurrentCarSpeed() {
        return currentCarSpeed;
    }

    public void setDoor(int[] door) {
        this.door = door;
    }

    public int[] getDoor() {
        return door;
    }

    public void setWheel(float[] wheel) {
        this.wheel = wheel;
    }

    public void getWheel(float[] wheel) {
        return;
    }


    public void changeSpeedOfCar() {
        if (maxSpeed > currentCarSpeed) {
            currentCarSpeed = currentCarSpeed + 10;
            System.out.println("Go fast " + currentCarSpeed);
        } else if (maxSpeed == currentCarSpeed) {
            currentCarSpeed = currentCarSpeed - 10;
            System.out.println("Go slow " + currentCarSpeed);
        }
    }

    public void addPassenger() {
        if (maxPassenger > countPassenger) {
            countPassenger++;
            System.out.println("Sit down please " + countPassenger);
        } else {
            System.out.println("Car is full");
        }
    }


    public void indexDoor() {
        int indexDoor = 0;
        for (int i = 0; i < door.length; i++) {
            if (door[i] > door[indexDoor])
                indexDoor = i;
            System.out.println("index door " + i);
        }
    }

    public void removeAllWheels() {
        for (int i = 0; i < wheel.length; i++) {
            wheel[i] = 0;
            System.out.println("remove all wheels " + wheel[i]);
        }
    }

    public void indexWheel() { //получить колесо по идексу
        int indexWheel = 0;
        for (int n = 0; n < wheel.length; n++) {
            if (wheel[n] > wheel[indexWheel])
                indexWheel = n;
            System.out.println("index wheel " + n);
        }
    }

    public float extraWheels() {
        float sum = 0;
        for (int i = 0; i < wheel.length; i++) {
            sum = sum + wheel[i];
        }
        return sum;
    }


    public void sumWheels() {
        int sum = wheel.length + arrWheels.length;
        System.out.println("sum " + sum);
    }

    public void possibleMaxSpeed() {
        if ((maxSpeed == 0) || (countPassenger == 0)) {

            System.out.println("Car is not a driver ");
        } else {
            float min = wheel[0];
            for (int i = 0; i < wheel.length; i++) {
                if (wheel[i] < min) {
                    min = wheel[i];
                }
            }
            currentCarSpeed = (int) maxSpeed * min;
            System.out.println("Current Car Speed " + currentCarSpeed);
        }
    }


    public void show() {
        System.out.println(" Date of manufacture \t " + date + " Engine's type  \t" + type);
        System.out.println(" Top speed \t " + maxSpeed + " Acceleration time machine\t " + maxPassenger);
        System.out.println(" Count passenger\t " + countPassenger + " Current Car Speed\t " + currentCarSpeed);
        possibleMaxSpeed();

    }


}
