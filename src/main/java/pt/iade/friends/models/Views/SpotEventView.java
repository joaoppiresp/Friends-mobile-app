package pt.iade.friends.models.Views;

import java.math.BigDecimal;

public interface SpotEventView {
    BigDecimal getPrice();
    String getSptName();
    String getSptAddress();
    String getEvYear();
    String getEvMonth();
    String getEvDay();
    String getEvHour();
    String getEvMin();
    String getType();
}
