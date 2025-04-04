package roomscheduler.entity;

import java.time.LocalDate;

public class Booking {
    private int bookingID;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String userName;
    private int roomNumber;
    private boolean approved;

    public Booking(int bookingID, LocalDate checkIn, LocalDate checkOut, String userName, int roomNumber, boolean approved) {
        setBookingID(bookingID);
        setCheckIn(checkIn);
        setCheckOut(checkOut);
        setUserName(userName);
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

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", userName='" + userName + '\'' +
                ", roomNumber=" + roomNumber +
                ", approved=" + approved +
                '}';
    }
}
