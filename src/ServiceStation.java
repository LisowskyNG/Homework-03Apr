public class ServiceStation {

    public void service(Bicycle[] bicycles) {
        for (Bicycle bicycle : bicycles) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int j = 0; j < bicycle.getWheelsCount(); j++) {
                updateTyre();
            }
            System.out.println();
        }
    }

    public void service (Car[] cars) {
        for (Car car : cars) {
            System.out.println("Обслуживаем " + car.getModelName());
            checkEngine();
            for (int j = 0; j < car.getWheelsCount(); j++) {
                updateTyre();
            }
            System.out.println();
        }
    }

    public void service(Truck[] trucks) {
        for (Truck truck : trucks) {
            System.out.println("Обслуживаем " + truck.getModelName());
            checkEngine();
            checkTrailer();
            for (int j = 0; j < truck.getWheelsCount(); j++) {
                updateTyre();
            }
            System.out.println();
        }
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void checkEngine() {
        System.out.println("Обслуживаем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Сбслуживаем прицеп");
    }
}
