public class Main {
    public static void main(String[] args) {
     Flight flight = new Flight("LOT222", "Paris", "2025-01-10");
     System.out.println("Numer lotu: " + flight.getFlightNumber());
     System.out.println("Cel: " + flight.getDestination());
     System.out.println(("Data: " + flight.getDate()));
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        ArrayList<String> flights = new ArrayList<>();
//przykladfowe zrobienie lotu
//                Flight flight1 = new Flight("LOT222", "Paris", "2025-01-10");
//                System.out.println("Numer lotu: " + flight1.getFlightNumber());
//                System.out.println("Cel: " + flight1.getDestination());
//                System.out.println(("Data: " + flight1.getDate()));


        //ten akapit nie usuwamy
        System.out.print("number: ");
        String number = scanner.nextLine();
        Flight.flightNumber=number;
        System.out.println("Numer lotu: " + Flight.flightNumber);

        System.out.print("destination: ");
        String destination = scanner.nextLine();
        Flight.flightdestination=destination;
        System.out.println("destination lotu: " + Flight.flightdestination);

        System.out.print("date: ");
        String date = scanner.nextLine();
        Flight.flightdate=date;
        System.out.println("data lotu: " + Flight.flightdate);
    //ten akapit nie usuwamy

        Flight flight1 = new Flight();

//ten akapit nie usuwamy
flight1.CreateFlight();
//ten akapit nie usuwamy


        // Print details of each flight
//        if (!flights.isEmpty()) {
//            System.out.println("Lista lotów nie jest pusta.");  // List is not empty
//        } else {
//            System.out.println("Lista lotów jest pusta.");  // List is empty
//        }

            }
        }



