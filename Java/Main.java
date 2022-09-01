class Main {
public static void main(String[] args) {
   System.out.println("Hola Mundo")
   Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
   
   car.passegenger = 4;
   car.printeDataCar();

   Car car2 = new Car("QWE576", new Accountt("Andrea Herrera", "ANDA876"));
   
   car2.passegenger = 3;
   car2.printeDataCar();

}