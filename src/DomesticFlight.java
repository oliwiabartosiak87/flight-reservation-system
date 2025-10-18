// DomesticFlight.java
//dziedziczy po klasie bazowej Flight,  LOT KRAJOWY
public class DomesticFlight extends Flight { //extends dziedziczy klase flight
    private boolean isPriorityBoarding; //pierwszenstwo wejscia na podklad
    private String departureGate; // brama z ktorej odlatuje samolot
    private final int MAX_HAND_LUGGAGE_KG = 10;

    public DomesticFlight(String flightNumber, String destination, String date, int totalSeats) {
        super(flightNumber, destination, date, totalSeats, totalSeats); //wywolanie konstruktora klasy nadrzednej flight
        this.isPriorityBoarding = true;
        this.departureGate = "Domyślna A1";
    }
    public void printRules() {
        System.out.println("--- ZASADY LOTU KRAJOWEGO ---");
        String priorityStatus;
        if (isPriorityBoarding) {
            priorityStatus = "AKTYWNE";
        } else {
            priorityStatus = "NIEAKTYWNE";
        }
        System.out.println("Priorytetowe wejście: " + priorityStatus);
        System.out.println("Cel podróży: " + getDestination());
        System.out.println("Maksymalny bagaż podręczny: " + MAX_HAND_LUGGAGE_KG + " kg.");
        System.out.println("Odprawa w: " + departureGate);
    }
}
