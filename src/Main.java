public class Main {
    public static void main(String[] args) {
        Bicycle[] bicycles = {
                new Bicycle ("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };
        Car[] cars = {
                new Car ("car1", 4),
                new Car("car2", 4)
        };
        Truck[] trucks = {
                new Truck ("truck1", 6),
                new Truck("truck2", 8)
        };

        ServiceStation serviceStation = new ServiceStation();
        service(serviceStation, bicycles, cars, trucks);

    }

    private static void service(ServiceStation serviceStation, Bicycle[] bicycles, Car[] cars, Truck[] trucks) {
        serviceStation.service(bicycles);
        serviceStation.service(cars);
        serviceStation.service(trucks);
    }



}