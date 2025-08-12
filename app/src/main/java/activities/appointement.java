package activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.doctorapp.R;

import java.util.ArrayList;

import adapters.DoctorAdapter;
import models.Doctor;

public class appointement extends AppCompatActivity {
    ListView lv;
    DoctorAdapter adapter;
    ArrayList<Doctor> doctorArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_appointement);

        lv =findViewById(R.id.lvappoint);
        doctorArrayList=new ArrayList<>();

        doctorArrayList.add(new Doctor(R.drawable.top2,1,"Ahmed","Kidnys","5 april 2025","6:25 pm","complete"));
        doctorArrayList.add(new Doctor(R.drawable.top3,2,"Hyden","Teeth","6 may 2025","8:35 pm","complete"));
        doctorArrayList.add(new Doctor( R.drawable.top1,3,"Elias","Lungs","7 august 2025","3:00 pm","complete"));
        adapter =new DoctorAdapter(appointement.this,doctorArrayList);
        lv.setAdapter(adapter);


        //declar element
        ImageView back = findViewById(R.id.iv_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(appointement.this, home.class);
                startActivity(intent);
            }

        });

    }
}