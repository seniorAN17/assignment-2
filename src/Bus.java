public class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        setPassengerCapacity(passengerCapacity);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity <= 0) {
            throw new IllegalArgumentException("Passenger capacity must be greater than 0");
        }
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        // Insurance fee formula for buses: basePrice * 0.08 + age * 150 + passengerCapacity * 10
        int age = getAge(2025);
        return getBasePrice() * 0.08 + age * 150 + passengerCapacity * 10;
    }

    @Override
    public String toString() {
        return String.format("Bus [id=%d, model=%s, year=%d, basePrice=%.2f, passengerCapacity=%d]",
                           getId(), getModel(), getYear(), getBasePrice(), passengerCapacity);
    }
}
