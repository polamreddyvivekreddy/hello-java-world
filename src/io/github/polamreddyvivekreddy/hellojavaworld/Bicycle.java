package io.github.polamreddyvivekreddy.hellojavaworld;

public class Bicycle {

    private int gear;
    private int speed;

    public Bicycle(int startGear, int startSpeed) {
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public int getGear() {
        return gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
