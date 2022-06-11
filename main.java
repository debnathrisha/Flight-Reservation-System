package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Passanger passanger = new Passanger("Risha", "9644014163", "debnath.risha@gmail.com", "25", "Jabalpur", "Madhya Pradesh");

        System.out.println(passanger.getContactDetails());
        System.out.println(passanger.getAddressDetails());

        Flight flight = new Flight("ac-1111", "indigo", 100, 1);

        System.out.println(flight.getFlightDetails());

        if (flight.getCapacity() > flight.getSeatBooked()) {
            RegularTicket regularTicket = new RegularTicket("Reg-125", "Jabalpur", "Delhi",
                    "19/06/2022 10:00:00", "19/06/2022 16:00:00",
                    5, 4000, flight, passanger, "food");
            System.out.println("Regular Ticket for passanger " + passanger.getName() + " is booked");
            printTicketDetails(regularTicket);
        } else {
            System.out.println("No seat available");
        }

        ArrayList<String> location = new ArrayList<String>(Arrays.asList("filpcart", "Ajio", "Bragg", "Amazon"));

        if (flight.getCapacity() > flight.getSeatBooked()) {
            TouristTicket touristTicket = new TouristTicket("Tou-123", "Jabalpur", "Mumbai",
                    "12/01/2021 10:00:00", "12/01/2021 14:00:00",
                    12, 2000, flight, passanger, "JWM , Gandhi Nagar, Mumbai", location);
            System.out.println("Tourist Ticket for passanger " + passanger.getName() + " is booked");

            printTicketDetails(touristTicket);
        } else {
            System.out.println("No seat available");
        }

    }
    public static void printTicketDetails(Ticket ticket) {
        System.out.println("PNR Number: " + ticket.getPnrNumber());
    }
        }

