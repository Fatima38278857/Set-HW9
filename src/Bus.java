import java.util.List;

public class Bus extends Transport <GroupC> implements Competing {


    private NumberOfSeats numberOfSeats;


    public Bus() {

    }

    public Bus(String make, String model, double engineCapacity, GroupC driver, NumberOfSeats numberOfSeats, List<Mechanic> mechanic) {
        super(make, model, engineCapacity, driver, mechanic);
        this.numberOfSeats = numberOfSeats;
    }

    public NumberOfSeats getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(NumberOfSeats numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void startMoving() {
        System.out.println("Hачать движение");
    }

    public void finishMovement() {
        System.out.println("Остановить движение");
    }

    @Override
    public NumberOfSeats getType() {
        return numberOfSeats;
    }

    @Override
    public void printType() {
        System.out.println(numberOfSeats != null ? numberOfSeats : "Данных по транспортному средству недостаточно");
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшие время из тех кто учавствовал");
    }

    @Override
    public void maxSpeed() {

    }
    public void diagnose() {
        try {
            throw new TransportTypeException("Автобусам не нужно проходить диагностику");
        } catch (TransportTypeException t) {
            System.err.println(t.getMessage());
        }
        finally {
            System.out.println("Автобусам не нужно проходить диагностику");
        }
}



    @Override
    public String toString() {
        return "Транспортным средством " + super.toString() + " " + numberOfSeats.toString();
    }



}

