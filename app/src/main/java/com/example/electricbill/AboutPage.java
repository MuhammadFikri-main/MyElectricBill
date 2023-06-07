package com.example.electricbill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.profile);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Muhammad Fikri Bin Hasnizam");

        TextView websiteLink = findViewById(R.id.websiteLink);
        websiteLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open the website URL in a browser
                String url = "https://github.com/MuhammadFikri-main/MyElectricBill.git"; // Replace with your actual website URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}