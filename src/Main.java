void main() {
    System.out.println("=== Vehicle Management System ===\n");

    // Create Car instances
    Car car1 = new Car("Toyota Camry", 2020, 25000.0, 4);
    Car car2 = new Car("Honda Civic", 2018, 20000.0, 4);

    // Create Bus instances
    Bus bus1 = new Bus("Mercedes Sprinter", 2019, 50000.0, 20);
    Bus bus2 = new Bus("Volvo 9700", 2015, 80000.0, 50);

    // Display Car information
    System.out.println("CARS:");
    System.out.println(car1);
    System.out.println("Age: " + car1.getAge(2025) + " years");
    System.out.println("Insurance Fee: $" + String.format("%.2f", car1.calculateInsuranceFee()));
    System.out.println();

    System.out.println(car2);
    System.out.println("Age: " + car2.getAge(2025) + " years");
    System.out.println("Insurance Fee: $" + String.format("%.2f", car2.calculateInsuranceFee()));
    System.out.println();

    // Display Bus information
    System.out.println("BUSES:");
    System.out.println(bus1);
    System.out.println("Age: " + bus1.getAge(2025) + " years");
    System.out.println("Insurance Fee: $" + String.format("%.2f", bus1.calculateInsuranceFee()));
    System.out.println();

    System.out.println(bus2);
    System.out.println("Age: " + bus2.getAge(2025) + " years");
    System.out.println("Insurance Fee: $" + String.format("%.2f", bus2.calculateInsuranceFee()));
    System.out.println();

    // Demonstrate polymorphism
    System.out.println("=== Polymorphism Demo ===");
    Vehicle[] vehicles = {car1, car2, bus1, bus2};
    double totalInsurance = 0;

    for (Vehicle vehicle : vehicles) {
        System.out.println(vehicle.getModel() + " - Insurance: $" +
                String.format("%.2f", vehicle.calculateInsuranceFee()));
        totalInsurance += vehicle.calculateInsuranceFee();
    }

    System.out.println("\nTotal Insurance Fees: $" + String.format("%.2f", totalInsurance));
}
