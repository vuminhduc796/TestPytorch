package com.example.myapplication;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    int cameraRequestCode = 001;
    InputStream inputStream;
    Bitmap bitmap;
    Classifier classifier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        try {
            inputStream = getAssets().open("3.png");
            bitmap = BitmapFactory.decodeStream(inputStream);
            Log.d("test", 12313 + "");
        } catch (IOException e) {
            e.printStackTrace();
        }

        classifier = new Classifier(Utils.assetFilePath(this, "labeldroid.pt"));


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
    }
}


