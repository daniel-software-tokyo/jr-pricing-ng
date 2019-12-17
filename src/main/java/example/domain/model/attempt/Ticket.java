package example.domain.model.attempt;

import example.domain.model.specification.DepartureDate;
import example.domain.model.specification.Destination;
import example.domain.model.specification.SeatType;
import example.domain.model.specification.TicketType;
import example.domain.model.specification.TrainType;

/**
 * 切符
 */
public class Ticket {

    DepartureDate departureDate;
    Destination destination;

    SeatType seatType;
    TrainType trainType;
    TicketType ticketType;

    public Ticket( DepartureDate departureDate, Destination destination, SeatType seatType, TrainType trainType, TicketType ticketType) {
        this.departureDate = departureDate;
        this.destination = destination;
        this.seatType = seatType;
        this.trainType = trainType;
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        return  "\n出発日=" + departureDate +
                "\n目的地=" + destination +
                "\n座席区分=" + seatType +
                "\n列車種類=" + trainType +
                "\n片道/往復=" + ticketType
                ;
    }
}

