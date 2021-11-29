package pt.iade.friends.models.Views;

import java.sql.Timestamp;

public interface SpotEventView {
    String getSptName();
    String getSptAddress();
    Timestamp getEvYear();
    Timestamp getEvMonth();
    Timestamp getEvDay();
    Timestamp getEvHour();
    Timestamp getEvMin();
    int getType();
    int getSpotFk();
}
