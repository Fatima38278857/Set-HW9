public abstract class Driver {


    private String fullName;  // ФИО
    private boolean driverLicense; // Наличие водительских прав
    private double experience; // Стаж

    public Driver(String fullName, boolean driverLicense, double experience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public Driver() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }


    public void startMoving() {
        System.out.println(" Пора начать  движение");
    }


    public void stop() {
        System.out.println("Надо остановиться");
    }


    public void refuelCar() {
        System.out.println("Время заправиться");
    }

    @Override
    public String toString() {
        return "Водитель " + fullName + " с опытом " + experience;
    }
}


