class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passegenger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        passegenger = 3;
        System.out.println("passenger:" + passegenger);
    }

    void printeDataCar() {
        System.out.println("License: " + license + "Driver" + driver.name + " Passengers: " + passegenger);
    }
}