package com.vishdha.android.myappportfolio.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Toast toast;
// this method will show popular movies toast message.
    public void popularMovies(View view) {
         toast = Toast.makeText(getApplicationContext(),"This button will launch my Popular Movies app!",Toast.LENGTH_SHORT);
        toast.show();
    }
    // this method will show stock hawk toast message.
    public void stockHawk(View view) {
         toast = Toast.makeText(getApplicationContext(),"This button will launch my Stock Hawk app!",Toast.LENGTH_SHORT);
        toast.show();
    }
    // this method will show buildItBigger toast message.
    public void buildItBigger(View view) {
        toast = Toast.makeText(getApplicationContext(),"This button will launch my Build It Bigger app!",Toast.LENGTH_SHORT);
        toast.show();
    }

    // this method will show make your app material toast message.
    public void makeApp(View view) {
        toast = Toast.makeText(getApplicationContext(),"This button will launch my make your app material app!",Toast.LENGTH_SHORT);
        toast.show();
    }

    // this method will show goUbiquitous toast message.
    public void goUbiquitous(View view) {
        toast = Toast.makeText(getApplicationContext(),"This button will launch my Go Ubiquitous app!",Toast.LENGTH_SHORT);
        toast.show();
    }

    // this method will show goUbiquitous toast message.
    public void capStone(View view) {
        toast = Toast.makeText(getApplicationContext(),"This button will launch my Capstone app!",Toast.LENGTH_SHORT);
        toast.show();
    }




}
