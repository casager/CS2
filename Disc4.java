public class Disc4 {
    class Car{
        private String make;
        private int year;
        private double mileage;

        public Car(String make, int year, double mileage){
            this.make = make;
            this.year = year;
            this.mileage = mileage;
        } 
    }
    class GasCar extends Car{
        private double tankCap;

        public GasCar(String make, int year, double mileage, double tankCap){
            super(make, year, mileage);
            this.tankCap = tankCap;
        }
    }
    
    class ElectricCar extends Car{
        private double voltage;

        public ElectricCar(String make, int year, double mileage, double voltage){
            super(make, year, mileage);
            this.voltage = voltage;
        }
    }
    class HybridCar extends Car{
        private double tankCap;
        private double voltage;

        public HybridCar(String make, int year, double mileage, double tankCap, double voltage){
            super(make, year, mileage);
            this.tankCap = tankCap;
            this.voltage = voltage;
        }
    }
}
