package com.example.lwork4oop_polevik32;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestShape extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shape);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    Shape s1 = new Rectangle("Red", 4, 8);
    Shape s2 = new Triangle("green", 5, 3);

    public void RectangleObject (View v){
        this.s1 = s1;
        TextView text = (TextView) findViewById(R.id.textViewRes);
        text.setText("s1: " + s1);

        TextView text1 = (TextView) findViewById(R.id.textViewArea2);
        text1.setText("Area of this rectangle is: " + s1.getArea());
    }


    public void TriangleObject (View v){
        this.s2 = s2;
        TextView text = (TextView) findViewById(R.id.textViewRes);
        text.setText("s2: " + s2);

        TextView text1 = (TextView) findViewById(R.id.textViewArea2);
        text1.setText("Area of this triangle is: " + s2.getArea());
    }

}