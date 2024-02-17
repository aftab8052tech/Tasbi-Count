package com.mastercoding.tasbicount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView , textView1;
Button button , button2;
int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.textview1);
        button2 = findViewById(R.id.button2);
        if(count == 0){
            textView1.setText("ASSALAAM WALEKUM" );
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText( " " + counter());

                if(count>0){
                    button.setText("TAP");
                }

              if(count >= 1 && count<34) {
                  textView1.setText(" Read ' SUBHANALLAH ' 33 times \n " + "Read from 1 to 33 \n"+"count -> " + counter1());
                 }
                else if(count >=34 && count <67 ){
                  textView1.setText(" NOW \n\n"+"Read ' ALHAMDULILLAH ' 33 times \n " + "Read from 34 to 66 \n"+ "count -> " + counter1());
                }
               else if(count >=67 && count < 100 ){
                  textView1.setText(" NOW \n\n "+" Read ' ALLAH-HU-AKBAR ' 33 times \n " + "Read from 67 to 99 \n"+"count -> " + counter1());
                }
               else{
                   textView.setText("Finished");
                   textView1.setText("FINISHED ! \n\n" + "If you want to read anything else PRESS 'Reset' ");
              }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(" " + reset());
                if(count == 0){
                    textView1.setText("BISMILLAHEREHMANERAHEEM ! \n\n Read Again ...");
                    button.setText("START");
                }


            }
        });
    }
    public int counter(){
        return ++count;

    }
    public int reset(){

        return count = 0;
    }
public int counter1(){

        return count;
}
}