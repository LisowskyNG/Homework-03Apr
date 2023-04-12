public class Main {
    public static void main(String[] args) {

        Maintanable[] maintanables = new Maintanable[]{
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 3),
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8)
                };
        ServiceStation station = new ServiceStation();
        for (Maintanable maintanable : maintanables) {
            station.check(maintanable);
        }
    };
}