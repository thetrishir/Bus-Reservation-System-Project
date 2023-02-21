package gui;

import java.io.Serializable;

public class BusDetails implements Serializable {
    private String source;
    private String destination;
    private String busname;
    private String busroute;
    private String bustype;
    private int seats;
    private String deperaturetime;
    private String arrivaltime;
    private int seatbook;

    public BusDetails(String source, String destination, String busname,
                      String busroute, String bustype, int seats, String arrivaltime,
                      String deperaturetime, int seatbook) {
        super();
        this.source = source;
        this.destination = destination;
        this.busname = busname;
        this.busroute = busroute;
        this.bustype = bustype;
        this.seats = seats;
        this.arrivaltime = arrivaltime;
        this.deperaturetime = deperaturetime;
        this.seatbook = seatbook;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getBusname() {
        return busname;
    }

    public String getBusroute() {
        return busroute;
    }

    public String getBustype() {
        return bustype;
    }

    public int getSeats() {
        return seats;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public String getDeperaturetime() {
        return deperaturetime;
    }

    public int getSeatbook() {
        return seatbook;
    }

    public void setSeatbook(int seatbook) {
        this.seatbook = seatbook;
    }

}
