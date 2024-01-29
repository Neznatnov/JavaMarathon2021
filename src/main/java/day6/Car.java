package day6;

public class Car {
    private String model;
    private String color;
    private int productionYear;

    public String getModel() {
        return model;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int carProductionYear) {
        productionYear = carProductionYear;
    }

    public void info() {
        System.out.println("Это автомобиль: ");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - productionYear);
        /*return inputYear - productionYear;*/
    }
}
