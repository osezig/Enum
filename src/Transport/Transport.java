package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engine) {
        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.engineVolume = engine;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engineVolume;
    }

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void printType();
}