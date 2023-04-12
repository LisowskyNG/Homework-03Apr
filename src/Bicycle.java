public class Bicycle extends Transport {

    protected Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " +getModelName());
        updateTyres();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
    }
}