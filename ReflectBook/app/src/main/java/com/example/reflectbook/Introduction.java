package com.example.reflectbook;

import android.content.Intent;
import android.gesture.Gesture;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Introduction extends AppCompatActivity implements GestureDetector.OnGestureListener{

    //position of the swipe feature
    private static final String TAG = "Swipe position";
    private float x1,x2,y1,y2;
    private static int MIN_DISTANCE = 150;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

        this.gestureDetector = new GestureDetector(Introduction.this,this);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        gestureDetector.onTouchEvent(event);

        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Start_regsiter();
                break;
        }

        return super.onTouchEvent(event);
    }

    public void Start_regsiter(){
        Intent intent = new Intent(this,register.class);
        startActivity(intent);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
