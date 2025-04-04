package roomscheduler.entity;

import java.time.LocalDate;

public class Booking {
    private int bookingID;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String userName;
    private int roomNumber;
    private boolean appreved;

    public Booking(int bookingID, LocalDate checkIn, LocalDate checkOut, String userName, int roomNumber, boolean appreved) {
        this.bookingID = bookingID;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.userName = userName;
        this.roomNumber = roomNumber;
        this.appreved = appreved;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAppreved() {
        return appreved;
    }

    public void setAppreved(boolean appreved) {
        this.appreved = appreved;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", userName='" + userName + '\'' +
                ", roomNumber=" + roomNumber +
                ", appreved=" + appreved +
                '}';
    }
}
