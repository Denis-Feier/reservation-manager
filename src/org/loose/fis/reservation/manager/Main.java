package org.loose.fis.reservation.manager;

import org.loose.fis.reservation.manager.model.Reservation;
import org.loose.fis.reservation.manager.model.User;

import java.util.Arrays;
import java.util.List;

/**
* This is the main class of the reservation manager
* Currently this class contains some dummy users and some dummy reservations.
* Finally, after creating them, the main method of this class prints them out.
*
* Feel free to run the main method at any time. :)
*/


public class Main {
    /**
    * @param args not used
    *
    * this method starts the application :)
    */


    public static void main(String[] args) {
        //creating the users
        
        User user1 = new User("John", "Doe", 43);
        User user2 = new User("Angelina", "Clooney", 25);
        User user3 = new User("George", "Jackson", 58);
        User user4 = new User("Francesca", "Jolie", 19);
        
        //creating reservations
        Reservation reservation1 = new Reservation(user1, "I would like to make a dentists' appointment.");
        Reservation reservation2 = new Reservation(user2, "I would like to make a reservation for a nice restaurant.");
        Reservation reservation3 = new Reservation(user4, "I would like to make an appointment at a nail salon.");
        Reservation reservation4 = new Reservation(user1, "I would like to make a reservation at the best ice cream place in town.");
        Reservation reservation5 = new Reservation(user3, "I would like to go to a concert.");
        Reservation reservation6 = new Reservation(user4, "I would like to get my make up done.");
        Reservation reservation7 = new Reservation(user2, "I would like to make a reservation at the closest movie theater.");
        
        //adding all the reservations to a list
        List<Reservation> reservations = Arrays.asList(reservation1, reservation2, reservation3, reservation4, reservation5, reservation6, reservation7);
        
        //printing out the reservations
        reservations.forEach(System.out::println);
    }
}
