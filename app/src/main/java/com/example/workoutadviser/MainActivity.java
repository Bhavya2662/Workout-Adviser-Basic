package com.example.workoutadviser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findWorkout(View view){
        TextView textView = findViewById(R.id.text);
        Spinner workoutType = findViewById(R.id.spinner);

        String workout = String.valueOf(workoutType.getSelectedItem());
        //textView.setText(workout);

        List <String> workoutList = expert.getWorkouts(workout);
        StringBuilder workoutFormatted = new StringBuilder();
        for(String work : workoutList){
            workoutFormatted.append(work).append("\n");
        }
        textView.setText(workoutFormatted);
    }
}