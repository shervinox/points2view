# points2view
Create custom flexibaly shaped view out of points (dp or px) with different color &amp; opacity

## Features:
Create Custom view no matter what shape it is
Set Color and Opacity to it
Get Screen Width and Height fast and easy

### Installing

Add jitpack to your project build.gradle: 

```
allprojects {
    repositories {
        // other repos
        maven { url 'https://jitpack.io' }
    }
}
```

And add the following line to your app build.gradle:

```
compile 'com.github.shervinox:points2view:67232a8697'
```

### Usage

Add the following to your layout:

```
 <com.appestan.points2view.Points2View
            android:id="@+id/point2view"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
```

place the following in your activity:

```
        Points2View points2View = findViewById(R.id.point2view);
        DrawingPoint drawingPoint_0 = new DrawingPoint(Utils.getScreenWidth(getWindowManager()), Utils.getScreenHeight(getWindowManager())/3);
        DrawingPoint drawingPoint_1 = new DrawingPoint(Utils.getScreenHeight(getWindowManager()), Utils.getScreenHeight(getWindowManager()));
        DrawingPoint drawingPoint_2 = new DrawingPoint(0, Utils.getScreenHeight(getWindowManager()));
        DrawingPoint drawingPoint_3 = new DrawingPoint(0, Utils.getScreenHeight(getWindowManager())/2);

        points2View.setPointsToDraw(drawingPoint_0);
        points2View.setPointsToDraw(drawingPoint_1);
        points2View.setPointsToDraw(drawingPoint_2);
        points2View.setPointsToDraw(drawingPoint_3);
        points2View.setViewColor(R.color.colorBlack);
        points2View.draw();
```
<img src="https://user-images.githubusercontent.com/27724396/38596412-9f9408e0-3d66-11e8-958d-f1eac9760b8b.png" width="250">
