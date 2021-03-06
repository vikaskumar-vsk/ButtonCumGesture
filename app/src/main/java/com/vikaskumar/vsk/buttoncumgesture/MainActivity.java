package com.vikaskumar.vsk.buttoncumgesture;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.widget.RelativeLayout;
import android.graphics.Color;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private TextView buckysMessage;
    private GestureDetectorCompat gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///Layout///

        RelativeLayout buckysLayout = (RelativeLayout) findViewById(R.id.RelativeLayout);
        buckysLayout.setBackgroundColor(Color.YELLOW);


        ////Begin Button and Text Activity////

        final Button buckysButton = (Button) findViewById(R.id.buckysButton);

        buckysButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView buckysText = (TextView) findViewById(R.id.buckysText);
                        buckysText.setText("Good job Hoss!");
                    }
                }
        );


        buckysButton.setOnLongClickListener(
                new View.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        TextView buckysText = (TextView) findViewById(R.id.buckysText);
                        buckysText.setText("Holy moly, that was long Hoss!");
                        return true;
                    }
                }
        );

        ////End Button and Text Activity////


        buckysMessage = (TextView) findViewById(R.id.buckysText);
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);

    }


    ////Begin Gestures////


    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        buckysMessage.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        buckysMessage.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        buckysMessage.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        buckysMessage.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        buckysMessage.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        buckysMessage.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        buckysMessage.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        buckysMessage.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        buckysMessage.setText("onFling");

        return true;
    }

    ////End Gestures////


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

}
