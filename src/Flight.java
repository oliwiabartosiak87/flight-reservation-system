//klasa nadrzędna
public class Flight {
    protected  String flightNumber;
    protected String destination;
    protected String date;

    public Flight(String flightNumber, String destination, String date) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.date = date;
    }

    // enkapsulacja - prywatne pole/gettery/settery, nie mozna nadpisac obiektu
    // Getter (metoda pobierająca) zwraca wartość pola,
    //setter (metoda ustawiająca) pozwala na jej zmianę


    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber;} //setter
    public String getDestination() {return  destination;} //getter
    public void setDestination(String destination) { this.destination = destination; }
    public String getDate() { return  date; }
    public void setDate(String date) { this.date = date; }
}
