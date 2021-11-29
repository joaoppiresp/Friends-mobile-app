package pt.iade.friends.models.Views;

import java.sql.Timestamp;

public interface SpotEventView {
    String getsptName();
    String getsptaddress();
    Timestamp getevyear();
    Timestamp getevmonth();
    Timestamp getevday();
    Timestamp getevhour();
    Timestamp getevmin();
    int gettype();
    int getspotFK();
}
