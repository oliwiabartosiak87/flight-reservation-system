public class Main {
    public static void main(String[] args) {
     Flight flight = new Flight("LOT222", "Paris", "2025-01-10");
     System.out.println("Numer lotu: " + flight.getFlightNumber());
     System.out.println("Cel: " + flight.getDestination());
     System.out.println(("Data: " + flight.getDate()));
    }
}
