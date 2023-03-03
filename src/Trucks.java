import java.util.List;

public class Trucks extends Transport <GroupD> implements Competing {

    private LoadCapacity loadCapacity;

    public Trucks() {
    }

    public Trucks(String make, String model, double engineCapacity, GroupD driver, LoadCapacity loadCapacity, List<Mechanic> mechanic) {
        super(make, model, engineCapacity, driver, mechanic);
        this.loadCapacity = loadCapacity;
    }


    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void startMoving() {
        System.out.println("Hачать движение");
    }

    public void finishMovement() {
        System.out.println("Остановить движение!");
    }

    public LoadCapacity getType() {
        return loadCapacity;
    }

    @Override
    public void printType() {
        System.out.println(loadCapacity != null ? loadCapacity : "Данных по транспортному средству недостаточно");
    }

    @Override
    public void pitStop() {
        System.out.println();
    }

    @Override
    public void bestTimeLap() {

    }

    @Override
    public void maxSpeed() {

    }

    @Override
    public void passDiagnostics() {
        System.out.println("Пора пройти диагностику для Грузовых автомобилей");
    }



        @Override
        public String toString() {
            return "Транспортным средством " + super.toString() + " " + loadCapacity.toString();
        }
    }


