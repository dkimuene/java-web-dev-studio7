package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public CD(String name, String releaseDate, double capacity, String discType, int minSpeed, int maxSpeed) {
        super(name, releaseDate, capacity, discType, minSpeed, maxSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of "+this.getMinSpeed() + " - "+getMaxSpeed());
    }

    @Override
    public void playDisc() {
        System.out.println(getName()+" is currently playing");
    }

    @Override
    public void stopDisc() {
        System.out.println(this.getName()+" has stopped playing");

    }

    @Override
    public void rewindDisc() {
        System.out.println(this.getName()+" is rewinding");
    }
}
