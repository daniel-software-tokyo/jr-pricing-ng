package example.domain.model.discount;

import java.math.BigDecimal;

public enum PassengerType {

    大人,
    小人;

    private PassengerType() {}

    public BigDecimal discountRate() {
        return new BigDecimal(this == 大人 ? 1 : 0.5);
    }
}