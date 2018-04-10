package com.appestan.points2viewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.DrawingPoint;
import com.Points2View;

import static com.DisplayMeasurement.DP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Points2View points2View = findViewById(R.id.point2view);
        DrawingPoint drawingPoint_0 = new DrawingPoint(0, 200);
        DrawingPoint drawingPoint_1 = new DrawingPoint(200, 200);
        DrawingPoint drawingPoint_2 = new DrawingPoint(200, 400);
        DrawingPoint drawingPoint_3 = new DrawingPoint(0, 400);

        points2View.setPointsToDraw(drawingPoint_0);
        points2View.setPointsToDraw(drawingPoint_1);
        points2View.setPointsToDraw(drawingPoint_2);
        points2View.setPointsToDraw(drawingPoint_3);
        points2View.setViewColor(R.color.colorAccent);
        points2View.setMeasurement(DP);
        points2View.draw();
    }
}
