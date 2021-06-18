package com.example.workoutadviser;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    List<String> getWorkouts (String workoutTypes){
        List<String> workout = new ArrayList<>();
        if(workoutTypes.equals("Chest")){
            workout.add("Bench Press");
            workout.add("Cable Flys");
        }
        else if(workoutTypes.equals("Shoulder")){
            workout.add("Tricep Ext");
            workout.add("Tricep Pushdowns");
        }
        else if(workoutTypes.equals("Biceps")){
            workout.add("Bicep Curls");
        }
        return workout;
    }
}
