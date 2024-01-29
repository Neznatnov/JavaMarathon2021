package day5;

public class Motorbike {
    private final String model;
    private final String color;
    private final int productionYear;

    public Motorbike(String model, String color, int productionYear) {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

}
