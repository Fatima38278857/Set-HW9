import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mechanic mechanic1 = new Mechanic("Майк Джонс", "Moto");
        Mechanic mechanic2 = new Mechanic("Джон Тернер", "Moto");
        Mechanic mechanic3 = new Mechanic("Клейтон Мерч", "работает с любым авто");


        List<Transport> transports = new ArrayList();
        Car toyota = new Car("Toyota", "SA", 3.5, new GroupB("Sasha", true, 12.), BobyEypes.d, List.of(mechanic1));
        Bus gaz = new Bus("Gazel", "PA1", 3.4, new GroupC("Dasha", true, 10.), NumberOfSeats.Average, List.of(mechanic2));
        Trucks kama = new Trucks("Камаз", "BH", 5.5, new GroupD("Vova", true, 25.), LoadCapacity.N3, List.of(mechanic3));

        List<Transport> motorist = new ArrayList<>();
        motorist.add(toyota);
        motorist.add(gaz);
        motorist.add(kama);


        System.out.println("Для транспорта" + " " + toyota + " - " + toyota.maintenance());
        System.out.println("Для транспорта" + " " + toyota + " - " + toyota.carRepairs());
        System.out.println();
        System.out.println("Для транспорта" + " " + gaz + " - " + gaz.maintenance());
        System.out.println("Для транспорта" + " " + gaz + " - " + gaz.carRepairs());
        System.out.println();
        System.out.println("Для транспорта" + " " + kama + " - " + kama.maintenance());
        System.out.println("Для транспорта" + " " + kama + " - " + kama.carRepairs());

        Queue<Transport> transportsSTO = new ArrayDeque<>();


        ServiceStation sto = new ServiceStation(transportsSTO);

        for (Transport transport : motorist) {
            sto.addTransport(transport);
        }
        for (int j = 0; j <= transportsSTO.size(); j++) {

        }
        // Первый способ
        Map<String, String> carMechanic = new HashMap<>();
        carMechanic.put("toyota", " Майк Джонс");
        carMechanic.put("gaz", "Джон Тернер");
        carMechanic.put("kama", "Клейтон Мерч");

        for (Map.Entry<String, String> contact : carMechanic.entrySet()) {
            System.out.println("Ключ - " + contact.getKey() + ": Значение -" + contact.getValue());
        }

        // Второй способ
        Map<Transport, Mechanic> carMechanics = new HashMap<>();
        carMechanics.put(toyota, mechanic1);
        carMechanics.put(gaz, mechanic2);
        carMechanics.put(kama, mechanic3);

        for (Map.Entry<Transport, Mechanic> contact : carMechanics.entrySet()) {
            System.out.println("Ключ - " + contact.getKey() + ": Значение -" + contact.getValue());

        }
        System.out.println();

        Set<Transport> motorist1 = new HashSet<>();
        motorist1.add(toyota);
        motorist1.add(gaz);
        motorist1.add(kama);


        Iterator<Transport> itermotorist1 = motorist1.iterator();

        System.out.println(motorist1);
    }
    }
