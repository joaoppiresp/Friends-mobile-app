package pt.iade.friends.models.Views;

import java.math.BigDecimal;


public interface SpotEventView {
    BigDecimal getPrice();
    String getSptName();
    String getSptAddress();
    Double getEvYear();
    Double getEvMonth();
    Double getEvDay();
    Double getEvHour();
    Double getEvMin();
    Double getType();
}
