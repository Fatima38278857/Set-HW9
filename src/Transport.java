import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> {

    private String make; // Марка
    private String model; // Модель
    private double engineCapacity;  // Обьем двиголеля
    private T driver; // водитель
    public List<Mechanic> mechanic;

    public Transport() { // Пустой конструктор
        super();
    }

    public Transport(String make, String model, double engineCapacity, T driver, List<Mechanic> mechanic) {
        this.make = make;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.driver = driver;
        this.mechanic = new ArrayList<>(mechanic);

    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public List<Mechanic> getMechanic() {
        return mechanic;
    }

    public void setMechanic(List<Mechanic> mechanic) {
        this.mechanic = mechanic;
    }

    public void startMoving() {  // Метод отвечает за движение
        System.out.println("Hачать движение");
    }

    public void finishMovement() { // Метод отвечает за остановку движения
        System.out.println("Остановить движение");
    }

    public abstract Enum getType();

    public abstract void printType();


    public void passDiagnostics() {

    }
    public boolean chekTransport() {
        passDiagnostics();

        return true;
    }
    public void bestTimeLap(String timeLap) {
        System.out.println("Лучшее время проезда круга" + timeLap);
    }

    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость " + maxSpeed + " " + " км/ч");

    }

    public String maintenance() {
        return "ТО проведен";
    }

    public String carRepairs() {
        return "Ремонт проведем";
    }


    @Override
    public String toString () {
        return " " + make + " " + model + " объем двигателя " + engineCapacity + "механик" + " " + mechanic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineCapacity, engineCapacity) == 0 && make.equals(transport.make) && model.equals(transport.model) && driver.equals(transport.driver) && mechanic.equals(transport.mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanic);
    }
}



