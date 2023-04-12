public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " +getModelName());
        updateTyres();
        System.out.println();
        checkEngine();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
    }
}