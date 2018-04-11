package com.appestan.points2view;

/**
 * Created with love and care by shervin on 04/10/2018.
 */

public class DrawingPoint {
    int w;
    int h;
    String loc;

    public DrawingPoint(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
