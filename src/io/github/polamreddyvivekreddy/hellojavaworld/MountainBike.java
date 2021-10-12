package io.github.polamreddyvivekreddy.hellojavaworld;

public class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int startGear, int startSpeed, int startSeatHeight) {
        super(startGear, startSpeed);
        this.seatHeight = startSeatHeight;
    }

    public void setSeatHeight(int newValue) {
        this.seatHeight = newValue;
    }
}
