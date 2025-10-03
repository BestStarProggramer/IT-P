package lab2;

abstract class Appliance {
    protected String brand;
    protected String model;
    protected double power;

    public Appliance() {
        this("Unknown", "Unknown", 0);
    }

    public Appliance(String brand, String model, double power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getPower() { return power; }
    public void setPower(double power) { this.power = power; }

    public abstract void turnOn();
    public abstract void turnOff();

    public void printInfo() {
        System.out.println("Appliance: " + brand + " " + model + ", power: " + power + " W");
    }
}

class Fridge extends Appliance {
    private int capacity;
    private boolean noFrost;
    private int temperature;

    private static int counter = 0;

    public Fridge() {
        this("Unknown", "Unknown", 0, 0, true, 0);
    }

    public Fridge(String brand, String model, double power, int capacity, boolean noFrost, int temperature) {
        super(brand, model, power);
        this.capacity = capacity;
        this.noFrost = noFrost;
        this.temperature = temperature;
        counter++;
    }

    public static int getCounter() { return counter; }

    @Override
    public void turnOn() {
        System.out.println("Fridge is on and cooling to " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        System.out.println("Fridge is off.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Capacity: " + capacity + " L, NoFrost: " + noFrost + ", Temperature: " + temperature + "°C");
    }
}

class Dishwasher extends Appliance {
    private int programs;
    private boolean drying;
    private int waterConsumption;

    public Dishwasher() {
        this("Unknown", "Unknown", 0, 0, true, 0);
    }

    public Dishwasher(String brand, String model, double power, int programs, boolean drying, int waterConsumption) {
        super(brand, model, power);
        this.programs = programs;
        this.drying = drying;
        this.waterConsumption = waterConsumption;
    }

    @Override
    public void turnOn() {
        System.out.println("Dishwasher started. Programs: " + programs);
    }

    @Override
    public void turnOff() {
        System.out.println("Dishwasher is off.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Programs: " + programs + ", Drying: " + drying + ", Water consumption: " + waterConsumption + " L");
    }
}

class VacuumCleaner extends Appliance {
    protected int suctionPower;
    protected double dustContainerVolume;
    protected boolean isWireless;

    public VacuumCleaner() {
        this("Unknown", "Unknown", 0, 0, 0, false);
    }

    public VacuumCleaner(String brand, String model, double power, int suctionPower, double dustContainerVolume, boolean isWireless) {
        super(brand, model, power);
        this.suctionPower = suctionPower;
        this.dustContainerVolume = dustContainerVolume;
        this.isWireless = isWireless;
    }

    @Override
    public void turnOn() {
        System.out.println("Vacuum cleaner is on. Suction power: " + suctionPower + " W");
    }

    @Override
    public void turnOff() {
        System.out.println("Vacuum cleaner is off.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Suction power: " + suctionPower + " W, Container: " + dustContainerVolume + " L, Wireless: " + isWireless);
    }
}

class RobotVacuum extends VacuumCleaner {
    private boolean autoNavigation;
    private int batteryLife;
    private boolean mopFunction;

    public RobotVacuum() {
        this("Unknown", "Unknown", 0, 0, 0, false, false, 0, false);
    }

    public RobotVacuum(String brand, String model, double power, int suctionPower, double dustContainerVolume, boolean isWireless,
                       boolean autoNavigation, int batteryLife, boolean mopFunction) {
        super(brand, model, power, suctionPower, dustContainerVolume, isWireless);
        this.autoNavigation = autoNavigation;
        this.batteryLife = batteryLife;
        this.mopFunction = mopFunction;
    }

    @Override
    public void turnOn() {
        System.out.println("Robot vacuum started cleaning. Auto navigation: " + autoNavigation);
    }

    @Override
    public void turnOff() {
        System.out.println("Robot vacuum finished cleaning and returned to base.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Auto navigation: " + autoNavigation + ", Battery life: " + batteryLife + " min, Mop function: " + mopFunction);
    }
}

public class OOP {
    public static void main(String[] args) {
        Appliance fridge = new Fridge("Samsung", "RT32", 150, 300, true, 5);
        Appliance dishwasher = new Dishwasher("Bosch", "Serie6", 1800, 6, true, 12);
        Appliance vacuum = new VacuumCleaner("Dyson", "V11", 545, 200, 2, true);
        Appliance robotVacuum = new RobotVacuum("Xiaomi", "Mi Robot", 50, 120, 0.6, true, true, 150, true);

        fridge.printInfo();
        fridge.turnOn();
        fridge.turnOff();

        System.out.println();

        dishwasher.printInfo();
        dishwasher.turnOn();
        dishwasher.turnOff();

        System.out.println();

        vacuum.printInfo();
        vacuum.turnOn();
        vacuum.turnOff();

        System.out.println();

        robotVacuum.printInfo();
        robotVacuum.turnOn();
        robotVacuum.turnOff();

        System.out.println("\nTotal fridges created: " + Fridge.getCounter());
    }
}
