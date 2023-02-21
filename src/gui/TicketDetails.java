package gui;

import java.io.Serializable;

public class TicketDetails implements Serializable {
    private String name;
    private String address;
    private String mobileNo;
    private String source;
    private String destination;
    private String busName;
    private String route;
    private String busType;
    private int seat;
    private int ticketNumber;
    private String departureTime;
    private String arrivalTime;
    private String date;

    public TicketDetails(String name, String address, String mobileNo, String source, String destination,
                         String busName, String route, String busType, int seat, int ticketNumber, String departureTime,
                         String arrivalTime, String date) {
        super();
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.source = source;
        this.destination = destination;
        this.busName = busName;
        this.route = route;
        this.busType = busType;
        this.seat = seat;
        this.ticketNumber = ticketNumber;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDate() {
        return date;
    }



}
