package com;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created with love and care by shervin on 04/10/2018.
 */

public class Utils {

    public static void setContext(Context context) {
        Utils.context = context;
    }

    private static Context context;

    public static int convertPxToDp(int px) {
        if (context == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, px,
                Utils.context.getResources().getDisplayMetrics());
    }
}
