package com.example.bas.baszwanenburg_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    CheckBox  checkBox1, checkBox2, checkBox3, checkBox4, checkBox5,
              checkBox6, checkBox7, checkBox8, checkBox9, checkBox10;
    ImageView imageView1, imageView2, imageView3, imageView4, imageView5,
              imageView6, imageView7, imageView8, imageView9, imageView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);
        checkBox10 = findViewById(R.id.checkBox10);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        int imageViewValue1 = imageView1.getVisibility();
        int imageViewValue2 = imageView2.getVisibility();
        int imageViewValue3 = imageView3.getVisibility();
        int imageViewValue4 = imageView4.getVisibility();
        int imageViewValue5 = imageView5.getVisibility();
        int imageViewValue6 = imageView6.getVisibility();
        int imageViewValue7 = imageView7.getVisibility();
        int imageViewValue8 = imageView8.getVisibility();
        int imageViewValue9 = imageView9.getVisibility();
        int imageViewValue10 = imageView10.getVisibility();
        outState.putInt("imgView1", imageViewValue1);
        outState.putInt("imgView2", imageViewValue2);
        outState.putInt("imgView3", imageViewValue3);
        outState.putInt("imgView4", imageViewValue4);
        outState.putInt("imgView5", imageViewValue5);
        outState.putInt("imgView6", imageViewValue6);
        outState.putInt("imgView7", imageViewValue7);
        outState.putInt("imgView8", imageViewValue8);
        outState.putInt("imgView9", imageViewValue9);
        outState.putInt("imgView10", imageViewValue10);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        int imageViewValue1Restored = inState.getInt("imgView1");
        int imageViewValue2Restored = inState.getInt("imgView2");
        int imageViewValue3Restored = inState.getInt("imgView3");
        int imageViewValue4Restored = inState.getInt("imgView4");
        int imageViewValue5Restored = inState.getInt("imgView5");
        int imageViewValue6Restored = inState.getInt("imgView6");
        int imageViewValue7Restored = inState.getInt("imgView7");
        int imageViewValue8Restored = inState.getInt("imgView8");
        int imageViewValue9Restored = inState.getInt("imgView9");
        int imageViewValue10Restored = inState.getInt("imgView10");
        imageView1.setVisibility(imageViewValue1Restored);
        imageView2.setVisibility(imageViewValue2Restored);
        imageView3.setVisibility(imageViewValue3Restored);
        imageView4.setVisibility(imageViewValue4Restored);
        imageView5.setVisibility(imageViewValue5Restored);
        imageView6.setVisibility(imageViewValue6Restored);
        imageView7.setVisibility(imageViewValue7Restored);
        imageView8.setVisibility(imageViewValue8Restored);
        imageView9.setVisibility(imageViewValue9Restored);
        imageView10.setVisibility(imageViewValue10Restored);
    }

    public void checked1(View view) {
        if (checkBox1.isChecked()) {
            imageView1.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView1.setVisibility(View.INVISIBLE);
        }
    }

    public void checked2(View view) {
        if (checkBox2.isChecked()) {
            imageView2.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView2.setVisibility(View.INVISIBLE);
        }
    }

    public void checked3(View view) {
        if (checkBox3.isChecked()) {
            imageView3.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView3.setVisibility(View.INVISIBLE);
        }
    }

    public void checked4(View view) {
        if (checkBox4.isChecked()) {
            imageView4.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView4.setVisibility(View.INVISIBLE);
        }
    }

    public void checked5(View view) {
        if (checkBox5.isChecked()) {
            imageView5.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView5.setVisibility(View.INVISIBLE);
        }
    }

    public void checked6(View view) {
        if (checkBox6.isChecked()) {
            imageView6.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView6.setVisibility(View.INVISIBLE);
        }
    }

    public void checked7(View view) {
        if (checkBox7.isChecked()) {
            imageView7.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView7.setVisibility(View.INVISIBLE);
        }
    }

    public void checked8(View view) {
        if (checkBox8.isChecked()) {
            imageView8.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView8.setVisibility(View.INVISIBLE);
        }
    }

    public void checked9(View view) {
        if (checkBox9.isChecked()) {
            imageView9.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView9.setVisibility(View.INVISIBLE);
        }
    }

    public void checked10(View view) {
        if (checkBox10.isChecked()) {
            imageView10.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView10.setVisibility(View.INVISIBLE);
        }
    }

}
