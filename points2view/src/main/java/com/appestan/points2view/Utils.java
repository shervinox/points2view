package com.appestan.points2view;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;

/**
 * Created with love and care by shervin on 04/10/2018.
 */

public class Utils {

    private static Context context;

    public static void setContext(Context context) {
        Utils.context = context;
    }

    public static int getScreenWidth(WindowManager windowManager) {
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }

    public static int getScreenHeight(WindowManager windowManager) {
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;
    }

    public static int convertPxToDp(int px) {
        if (context == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, px,
                Utils.context.getResources().getDisplayMetrics());
    }
}
