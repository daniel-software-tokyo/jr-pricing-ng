package example.domain.model.attempt;

import example.domain.model.bill.Amount;
import example.domain.model.specification.DepartureDate;
import example.domain.model.specification.Destination;

/*
* 乗車券
*/
public class ExpressTicket {

    DepartureDate departureDate;
    Destination destination;

    public ExpressTicket(DepartureDate departureDate, Destination destination) {
        this.departureDate = departureDate;
        this.destination = destination;
    }

    public Amount price() {
        return new Amount(0);
    }
}