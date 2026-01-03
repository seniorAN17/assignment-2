public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors < 2 || numberOfDoors > 5) {
            throw new IllegalArgumentException("Number of doors must be between 2 and 5");
        }
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        // Insurance fee formula for cars: basePrice * 0.05 + age * 100
        int age = getAge(2025);
        return getBasePrice() * 0.05 + age * 100;
    }

    @Override
    public String toString() {
        return String.format("Car [id=%d, model=%s, year=%d, basePrice=%.2f, numberOfDoors=%d]",
                           getId(), getModel(), getYear(), getBasePrice(), numberOfDoors);
    }
}
