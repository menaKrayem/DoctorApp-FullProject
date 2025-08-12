package activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.doctorapp.R;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //declar element
        ImageView iv_calender = findViewById(R.id.iv_calender);
        ImageView home = findViewById(R.id.iv_home);
        Button editProfile = findViewById(R.id.btn_editprofile);

        //event in calender
        iv_calender.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(profile.this, appointement.class);

            @Override
            public void onClick(View v) {
                iv_calender.setImageResource(R.drawable.calendarblue);
                startActivity(intent);
            }
        });
        //event in profile
        home.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(profile.this, home.class);

            @Override
            public void onClick(View v) {
                home.setImageResource(R.drawable.homeblue);
                startActivity(intent);
            }
        });
        //event in edit profile
        editProfile.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(profile.this, EditProfile.class);

            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}