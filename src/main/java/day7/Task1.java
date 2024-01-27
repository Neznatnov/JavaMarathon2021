package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 1878, 30, 33, 0);
        Airplane airplane2 = new Airplane("Airbus", 1863, 32, 35, 0);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}