package com.appestan.points2viewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.appestan.points2view.DrawingPoint;
import com.appestan.points2view.Points2View;
import com.appestan.points2view.Utils;

import static com.appestan.points2view.DisplayMeasurement.DP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Points2View points2View = findViewById(R.id.point2view_0);
//        firstExampleInit(points2View);
        secondExampleInit(points2View);
        points2View.setViewColor(R.color.colorBlack);
//        points2View.setMeasurement(DP);
        points2View.draw();
    }

    private void firstExampleInit(Points2View points2View) {
        DrawingPoint drawingPoint_0 = new DrawingPoint(0, 200);
        DrawingPoint drawingPoint_1 = new DrawingPoint(200, 200);
        DrawingPoint drawingPoint_2 = new DrawingPoint(200, 400);
        DrawingPoint drawingPoint_3 = new DrawingPoint(0, 400);

        points2View.setPointsToDraw(drawingPoint_0);
        points2View.setPointsToDraw(drawingPoint_1);
        points2View.setPointsToDraw(drawingPoint_2);
        points2View.setPointsToDraw(drawingPoint_3);
    }

    private void secondExampleInit(Points2View points2View) {
        DrawingPoint drawingPoint_0 = new DrawingPoint(Utils.getScreenWidth(getWindowManager()), Utils.getScreenHeight(getWindowManager())/3);
        DrawingPoint drawingPoint_1 = new DrawingPoint(Utils.getScreenHeight(getWindowManager()), Utils.getScreenHeight(getWindowManager()));
        DrawingPoint drawingPoint_2 = new DrawingPoint(0, Utils.getScreenHeight(getWindowManager()));
        DrawingPoint drawingPoint_3 = new DrawingPoint(0, Utils.getScreenHeight(getWindowManager())/2);

        points2View.setPointsToDraw(drawingPoint_0);
        points2View.setPointsToDraw(drawingPoint_1);
        points2View.setPointsToDraw(drawingPoint_2);
        points2View.setPointsToDraw(drawingPoint_3);
    }
}
