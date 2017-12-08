package com.example.asus.herb4health;

import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetail extends AppCompatActivity {

    private ImageView image;
    private TextView tvBreed, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        image = (ImageView) findViewById(R.id.image);
        tvBreed = (TextView) findViewById(R.id.tvBreed);
        tvDescription = (TextView) findViewById(R.id.tvDescription);

        //herb
        ImageView imageView = (ImageView) findViewById(R.id.herbimage);
        TextView textView = (TextView) findViewById(R.id.nameherb);
        TextView textView1 = (TextView) findViewById(R.id.herbdes_show);

        int resId = getIntent().getIntExtra("image", 0);
        String breed = getIntent().getStringExtra("breed");
        String description = getIntent().getStringExtra("description");
        int resId2 = getIntent().getIntExtra("herbimage", 0);
        String breed2 = getIntent().getStringExtra("herbname");
        String description2 = getIntent().getStringExtra("herbdetail");

        image.setImageResource(resId);
        tvBreed.setText(breed);
        tvDescription.setText(description);
        imageView.setImageResource(resId2);
        textView.setText(breed2);
        textView1.setText(description2);
        //Log.d("Herb","resID ="+resId);
        //Log.d("Herb","breed ="+breed);
        // Log.d("Herb","description ="+description);




    }
    public void GoFirebase(View view){
        Intent a = new Intent(this,FetchImageFirebase.class);
            startActivity(a);
    }
}
