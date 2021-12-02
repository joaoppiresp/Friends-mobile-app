package pt.iade.friends.models.Views;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface SpotEventView {
    BigDecimal getPrice();
    String getSptName();
    String getSptAddress();
    LocalDateTime getEvYear();
    LocalDateTime getEvMonth();
    LocalDateTime getEvDay();
    LocalDateTime getEvHour();
    LocalDateTime getEvMin();
    LocalDateTime getType();
}
