
/*
 * This program explores the concepts of inheritance and polymorphism to represent
 * different types of cars in JAVA. The Vehicle class serves as the parent class to 
 * each of the GasCar, ElectricCar, and HybridCar subclasses. Methods of overloading 
 * and overriding were utilized in order to successfully complete this assignment.
 */

class Vehicle{ //beginning of vehicle class

    protected String make;
    protected String model;
    protected int year;
    protected String plate_num;
    protected int miles_driven;

    public Vehicle(){
        this.make = null;
        this.model = null;
        this.year = 0;
        this.plate_num = null;
        this.miles_driven = 0;
    }

    public Vehicle(String make, String model, int year, String plate_num, int miles_driven){
        this.make = make;
        this.model = model;
        this.year = year;
        this.plate_num = plate_num;
        this.miles_driven = miles_driven;
    }

} //end vehicle class

class GasCar extends Vehicle{ //beginning GasCar subclass

    private float tank_cap;
    private String fuel_type;

    public GasCar(){
        this.tank_cap = 0;
        this.fuel_type = null;
    }

    public GasCar(String make, String model, int year, String plate_num, int miles_driven, float tank_cap, String fuel_type){
        super(make, model, year, plate_num, miles_driven);
        this.tank_cap = tank_cap;
        this.fuel_type = fuel_type;
    }

    public float getFuelEfficiency(float new_miles){
        float mpg = new_miles / tank_cap;
        return mpg;
    }

} //end GasCar subclass

class ElectricCar extends Vehicle{ //beginning ElectricCar subclass
    
    private float battery_cap;

    public ElectricCar(){
        this.battery_cap = 0;
    }

    public ElectricCar(String make, String model, int year, String plate_num, int miles_driven, float battery_cap){
        super(make, model, year, plate_num, miles_driven);
        this.battery_cap = battery_cap;
    }

    public float getFuelEfficiency(float new_miles){
        float cost_1kWh = 2;
        float mpge = (new_miles * cost_1kWh) / battery_cap;
        return mpge;
    }
} //end electric car subclass

class HybridCar extends Vehicle{ //beginning HybridCar subclass

    private float battery_cap;
    private float tank_cap;
    private String fuel_type;

    public HybridCar(){
        this.battery_cap = 0;
        this.tank_cap = 0;
        this.fuel_type = null;
    }

    public HybridCar(String make, String model, int year, String plate_num, int miles_driven, float battery_cap, float tank_cap, String fuel_type){
        super(make, model, year, plate_num, miles_driven);
        this.battery_cap = battery_cap;
        this.tank_cap = tank_cap;
        this.fuel_type = fuel_type;
    }

    public float getFuelEfficiency(float new_miles){
        float mpg = new_miles / tank_cap;
        float cost_1kWh = 2;
        float mpge = (new_miles * cost_1kWh) / battery_cap;
        float mpgh = (mpg + mpge) / 2;
        miles_driven += new_miles;
        return mpgh;
    }
}//end HybridCar subclass

class Tester{ //beginning of Tester class
    public static void main(String[] args) { //instantiating objects in main for each of the previous classes
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Toyota", "Tacoma", 2023, "OSU_POKE", 10000);

        GasCar gasCar1 = new GasCar();
        GasCar gasCar2 = new GasCar("Toyota", "Tacoma", 2023, "OSU_POKE", 10000, 15, "gas");
        float gas_eff = gasCar2.getFuelEfficiency(300); //using getFuelEfficiency method
        System.out.println("Gas Car Fuel Efficiency: " + gas_eff);

        ElectricCar electric1 = new ElectricCar();
        ElectricCar electric2 = new ElectricCar("Tesla", "ModelY", 2020, "ORANGE", 5000, 30);
        float electric_eff = electric2.getFuelEfficiency(400); //using getFuelEfficiency method
        System.out.println("Electric Car Fuel Efficiency: " + electric_eff);

        HybridCar hybrid1 = new HybridCar();
        HybridCar hybrid2 = new HybridCar("Ford", "Maverick", 2024, "OK_STATE", 3000, 20, 20, "gas");
        float hybrid_eff = hybrid2.getFuelEfficiency(400); //using getFuelEfficiency method
        System.out.println("Hybrid Car Fuel Efficiency: " + hybrid_eff);

    }
} //end of Tester class

