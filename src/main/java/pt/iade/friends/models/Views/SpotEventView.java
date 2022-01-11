package pt.iade.friends.models.Views;

import java.math.BigDecimal;


public interface SpotEventView {
    BigDecimal getPrice();
    String getSptName();
    String getSptAddress();
    String getType();
}
