import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private Queue<Transport> queue;

    ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }

    public void addTransport(Transport transport) {
        if (transport.chekTransport()) {
            queue.add(transport);
        }
    }

    public void technicalInspectionCar() {
        if (!queue.isEmpty()) {
            Transport transport = queue.poll();
            transport.maintenance();
        }
    }

     public void carryOutVehicleInspection(Queue<Transport<Driver>> queue) {
        if (queue.isEmpty())
            System.out.println("Уданного транспортного средства нет механика");

        while (!queue.isEmpty()) {
            Transport<Driver> currentTransport = queue.poll();
            LinkedList<Mechanic> mechanics = (LinkedList<Mechanic>) currentTransport.getMechanic();
            for (Mechanic mechanic : mechanics){
             mechanic.performaMaintrnance(currentTransport);
            }
        }
    }


    }




