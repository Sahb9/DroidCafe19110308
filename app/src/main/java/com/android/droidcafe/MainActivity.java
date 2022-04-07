package com.android.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgDonut,imgIce_Cream,imgFroyo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();

    }
    void addControls()
    {
        imgDonut = (ImageView) findViewById(R.id.donut);
        imgIce_Cream = (ImageView) findViewById(R.id.ice_cream);
        imgFroyo = (ImageView) findViewById(R.id.froyo);

    }
    void addEvents()
    {
        imgDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDonutOrder(view);
            }
        });
        imgIce_Cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showIceCreamOrder(view);
            }
        });
        imgFroyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFroyoOrder(view);
            }
        });
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    public void showDonutOrder(View view) {
        displayToast(getString(R.string.donut_order_message));
    }

    public void showIceCreamOrder(View view) {
        displayToast(getString(R.string.ice_cream_order_message));
    }

    /**
     * Shows a message that the froyo image was clicked.
     */
    public void showFroyoOrder(View view) {
        displayToast(getString(R.string.froyo_order_message));
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}