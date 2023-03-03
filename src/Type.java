public enum Type {
    ;


    private Car car;
    private Bus bus;
    private Trucks trucks;

    Type(Car car, Bus bus, Trucks trucks) {
        this.car = car;
        this.bus = bus;
        this.trucks = trucks;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Trucks getTrucks() {
        return trucks;
    }

    public void setTrucks(Trucks trucks) {
        this.trucks = trucks;
    }
}


