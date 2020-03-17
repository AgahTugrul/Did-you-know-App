package com.teamtreehouse.funfacts;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    //declare view variables
    private TextView factTextView;
    private Button factButton;
    private ConstraintLayout constraintLayout;
    private  ColorBank colorBank = new ColorBank();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //assign values
        factTextView = (TextView)findViewById(R.id.factTextView);
        factButton = (Button) findViewById(R.id.showFactButton);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        factButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factTextView.setText(factBook.getFact());
                int color = colorBank.getColor();
                constraintLayout.setBackgroundColor(color);
                factButton.setTextColor(color);
            }
            
        }
        );
        // Toast.makeText(this, "Welcome!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We're logging from the onCreate method");
    }
}
