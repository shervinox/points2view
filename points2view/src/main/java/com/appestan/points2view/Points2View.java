package com.appestan.points2view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

/**
 * Created with love and care by shervin on 04/10/2018.
 */

public class Points2View extends View {
    private Paint bgPaint;
    private DisplayMeasurement displayMeasurement;
    public ArrayList<DrawingPoint> pointsToDraw;

    public Points2View(Context context) {
        super(context);
        init();
    }

    public Points2View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Points2View(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public Points2View(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        bgPaint = new Paint();
        bgPaint.setFlags(Paint.ANTI_ALIAS_FLAG);
        bgPaint.setStyle(Paint.Style.FILL);
    }

    public void setViewColor(int color) {
        if (color == 0) {
            return;
        }
        bgPaint.setColor(getResources().getColor(color));
    }

    public void setViewAlpha(int alpha) {
        bgPaint.setAlpha(alpha);
    }

    public void setMeasurement(DisplayMeasurement displayMeasurement) {
        this.displayMeasurement = displayMeasurement;
    }

    public ArrayList<DrawingPoint> getPointsToDraw() {
        return pointsToDraw;
    }

    public void setPointsToDraw(DrawingPoint pointToDraw) {
        if (pointsToDraw == null) {
            pointsToDraw = new ArrayList<DrawingPoint>();
        }
        this.pointsToDraw.add(pointToDraw);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getContext() == null || this.pointsToDraw == null || this.pointsToDraw.size() <= 2) {
            return;
        }

        Path path = new Path();

        if (this.displayMeasurement == DisplayMeasurement.DP) {

            Utils utils = new Utils();
            utils.setContext(getContext());

            path.moveTo(utils.convertPxToDp(pointsToDraw.get(0).getW()), utils.convertPxToDp(pointsToDraw.get(0).getH()));

            for (int i = 1; i < pointsToDraw.size(); i++) {
                path.lineTo(utils.convertPxToDp(pointsToDraw.get(i).getW()), utils.convertPxToDp(pointsToDraw.get(i).getH()));
            }
        } else {
            // PX
            path.moveTo(pointsToDraw.get(0).getW(), pointsToDraw.get(0).getH());

            for (int i = 1; i < pointsToDraw.size(); i++) {
                path.lineTo(pointsToDraw.get(i).getW(), pointsToDraw.get(i).getH());
            }

        }


        path.close();
        canvas.drawPath(path, bgPaint);
    }

    public void draw() {
        this.invalidate();
    }


}
