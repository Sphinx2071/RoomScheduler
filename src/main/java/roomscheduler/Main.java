package roomscheduler;


import roomscheduler.entity.Booking;
import roomscheduler.entity.UserProfile;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("Tim", "1234", true);
        Booking booking = new Booking(12345, LocalDate.now(), LocalDate.of(2025, 04, 15), "Tim", 1, true);

        System.out.println("helloworld " + userProfile + booking);
    }
}