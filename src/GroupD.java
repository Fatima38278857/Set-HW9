public class GroupD extends Driver {

    public GroupD() {
    }

    public GroupD(String fullName, boolean driverLicense, double experience) {
        super(fullName, driverLicense, experience);
    }


    @Override
    public void startMoving() {
        super.startMoving();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void refuelCar() {
        super.refuelCar();
    }

    @Override
    public String toString() {
        return super.toString() + " Категория - 'D'.";
    }
}

