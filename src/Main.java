import com.engeto.hotel.Booking;
import com.engeto.hotel.Guests;
import com.engeto.hotel.Rooms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guests guest = new Guests ("Adéla", "Malíková",LocalDate.of(1993,3,13));
        Guests guest1 = new Guests ("Jan", "Dvořáček",LocalDate.of(1995, 5, 5));

    Rooms room = new Rooms (1+2,1,true,true, 1000);
    Rooms room1 = new Rooms (3,3,false, true,2400);

    Booking booking = new Booking ("Adelá Malíková", 1, 1,
            LocalDate.of(2021,7,19),
            LocalDate.of(2021,7,26),false);

    Booking booking1= new Booking ("Adéla Malíková a Jan Dvořáček", 3,
            2,LocalDate.of(2021,9,1), LocalDate.of(2021,9,
            14), false);

    List<Booking> bookingList = new ArrayList<>();
    bookingList.add(booking);
    bookingList.add(booking1);

    Booking booking2 = bookingList.get(1);

    System.out.println("Všechny rezervace:"+bookingList.size()+".");

    int i = 0;
    for (Booking book : bookingList) {
      System.out.println(i+":  "+book.getName());
      System.out.println ("Číslo pokoje je:"+book.getNumberOfRooms());
      System.out.println("Počet hostů je:"+book.getNumberOfGuests());
      System.out.println("Datum pobytu je od:"+book.getDate()); System.out.println("do:"+book.getDate2());

      i++;
    }

    }
}