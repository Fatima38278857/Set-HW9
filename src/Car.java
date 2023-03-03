import java.util.List;

public class Car extends Transport<GroupB> implements Competing {

    private BobyEypes bobyEypes;

    public Car(String make, String model, double engineCapacity, GroupB driver, BobyEypes bobyEypes, List<Mechanic> mechanic) {
        super(make, model, engineCapacity, driver, mechanic);
        this.bobyEypes = bobyEypes;
    }


    public BobyEypes getType() {
        return bobyEypes;
    }

    public void printType() {
        System.out.println(bobyEypes != null ? bobyEypes : "Данных по транспортному средству недостаточно");
    }


    public BobyEypes getBobyEypes() {
        return bobyEypes;
    }

    public void setBobyEypes(BobyEypes bobyEypes) {
        this.bobyEypes = bobyEypes;
    }

    public void startMoving() {
        System.out.println("Hачать движение");
    }

    public void finishMovement() {
        System.out.println("Остановить движение");
    }

    @Override
    public void pitStop() {
        System.out.println(getMake() + " Заехал на пит-стоп");
    }

    @Override
    public void bestTimeLap() {
        System.out.println(getMake() + "Лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость ");
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Прийдите диагностику для легкогого автомобиля");

    }



    @Override
    public String toString() {
        return "Транспортным средством " + super.toString() + " "+ bobyEypes.toString();
    }


}


