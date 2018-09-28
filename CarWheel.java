package Homework5;

public class CarWheel {

    private float tire;

    public CarWheel() {
        tire = 1;
    }

    public CarWheel(float tire) {
        this.tire = tire;
    }


   /* public void setTire(float tire) {
        this.tire = tire;
    }*/


    public void newTire() {
    tire = 1;
    }

    public void clearTheTire(float percents) {
        tire =  100*(100 - percents);

    }

    public float getTire() {
        return tire;
    }



    public void show(){

        System.out.println("tire condition " + tire );
    }
}
