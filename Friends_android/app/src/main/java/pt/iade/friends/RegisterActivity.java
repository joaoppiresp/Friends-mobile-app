package pt.iade.friends;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class RegisterActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundary);
//        Intent intent = getIntent();

        Button travelButton = findViewById(R.id.travelButton);
        travelButton.setOnClickListener(view -> {
         Intent intent1 = new Intent(getApplicationContext(), MapFriend.class);
         startActivity(intent1);
        });
    }
}
