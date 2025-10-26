package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] fleet = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        System.out.println("--- Starting construction equipment ---");
        for (Machine m : fleet) {
            m.doWork();
        }

        System.out.println("\n--- Stopping construction equipment ---");
        for (Machine m : fleet) {
            m.stopWork();
        }
    }
}