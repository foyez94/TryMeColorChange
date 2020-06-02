package com.example.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;



public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;

    private int[] colors;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{
                Color.CYAN, Color.GREEN, Color.RED, Color.BLACK, Color.BLUE, Color.YELLOW, Color.MAGENTA,
                Color.LTGRAY, Color.DKGRAY};
        windowView = findViewById(R.id.windowViewId);
        tryMeButton=(Button) findViewById(R.id.TryMeButton) ;
        windowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorArrayLength = colors.length;
                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLength);
                windowView.setBackgroundColor(colors[randomNum]);
//                Log.d("TEST","Tap");
            }
        });


    }}