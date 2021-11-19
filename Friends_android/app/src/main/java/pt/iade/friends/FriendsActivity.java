package pt.iade.friends;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FriendsActivity extends AppCompatActivity {

    private Friends myFriend;
    EditText fName, fEmail, fNumber;
    Button addFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        this.myFriend = new Friends("User");

        fName = findViewById(R.id.fname);
        fEmail = findViewById(R.id.femail);
        fNumber = findViewById(R.id.fnumber);
        addFriend = findViewById(R.id.add);
    }

    public void AddFriend(View view) {
        String name = " ";
        String email = " ";
        String number = " ";

        if (!fName.getText().toString().isEmpty()) {
            name = fName.getText().toString();
            Log.i("NAME: ", name);

            if (!fEmail.getText().toString().isEmpty()) {
                name = fEmail.getText().toString();
                Log.i("Friend Email: ", email);

                if (!fNumber.getText().toString().isEmpty()) {
                    name = fNumber.getText().toString();
                    Log.i("Friend Number: ", number);
                }
            }
        }
    }

    public void checkFriend(View v){
        Toast.makeText(this,"Friends: " + this.myFriend.numeroFriend(), Toast.LENGTH_SHORT).show();
    }
}