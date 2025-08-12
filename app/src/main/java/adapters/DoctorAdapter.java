package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.doctorapp.R;

import java.util.ArrayList;
import models.Doctor;

public class DoctorAdapter extends BaseAdapter{
    Context context;
    ArrayList<Doctor> doctorArrayList =new ArrayList<>();
    LayoutInflater inflater;

    public DoctorAdapter(Context context, ArrayList<Doctor> doctorArrayList) {
        this.context = context;
        this.doctorArrayList = doctorArrayList;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return doctorArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return doctorArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return doctorArrayList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View root = inflater.inflate(R.layout.doctor_design,null);
        ImageView doctorimg = root.findViewById(R.id.iv_doctorimg);
        TextView doctorname = root.findViewById(R.id.tv_doctorName);
        TextView doctorspecialize = root.findViewById(R.id.tv_specializeName);

        TextView datetext = root.findViewById(R.id.tv_datetext);
        TextView timetext = root.findViewById(R.id.tv_timetext);
        TextView statetext = root.findViewById(R.id.tv_statetext);

        //link item with data
        doctorimg.setImageResource(doctorArrayList.get(position).getImage());
        doctorname.setText(doctorArrayList.get(position).getName());
        doctorspecialize.setText(doctorArrayList.get(position).getSpecialize());
        datetext.setText(doctorArrayList.get(position).getDate());
        timetext.setText(doctorArrayList.get(position).getTime());
        statetext.setText(doctorArrayList.get(position).getState());

        return root;
    }
}

