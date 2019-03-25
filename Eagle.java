public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public void takeOff() {
        System.out.println("He just started to fly");
    }

    public int ascend(int meters) {
        return (meters);
    }

    public int descend(int meters) {
        return (meters);
    }

    public void land() {
        System.out.println("He's comming from the moutains to a new land");
    }

    public void glide() {
        System.out.println("It glides into the air. ");
    }
}
