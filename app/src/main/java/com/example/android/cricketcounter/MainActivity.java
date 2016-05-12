package com.example.android.cricketcounter;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {
int quantity;
  int  quantityw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment1(View view) {
        quantity=++quantity;
        display(quantity);}

    public void increment4(View view) {
        quantity=quantity+4;
        display(quantity);}

    public void increment6(View view) {
        quantity = quantity + 6;
        display(quantity);}


    public void reset(View view) {
        quantity = 0 ;
        quantityw=0;
        display(quantity);
        display1(quantityw);
    }

       public void increment0(View view) {
           while(quantityw>=11) {
               return;
           }
           display1(quantityw);
               ++quantityw;

           }

    private void display(int quantity) {
        TextView scoreView = (TextView) findViewById(R.id.textView);
        scoreView.setText(String.valueOf(quantity));
    }


    private void display1(int quantityw) {
        TextView scoreView = (TextView) findViewById(R.id.textView3);
        scoreView.setText(String.valueOf(quantityw));


    }



}
