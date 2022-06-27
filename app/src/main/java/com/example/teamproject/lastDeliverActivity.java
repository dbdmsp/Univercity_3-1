package com.example.teamproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class lastDeliverActivity extends AppCompatActivity {

    TextView textView[] = new TextView[6];
    int arr_textview_id[] = {R.id.rnb1, R.id.rnb2, R.id.rnb3,
            R.id.rnb4, R.id.rnb5, R.id.rnb6};

    Button mbtn_random;

    Integer arr_random_num[] = new Integer[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deliver_last);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //텍스트뷰 아이디 지정
        for(int i = 0; i <arr_textview_id.length; i++){
            final int index;
            index = i;
            textView[index] = findViewById(arr_textview_id[index]);
        }

        mbtn_random = findViewById(R.id.rbtn1);

        mbtn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //버튼클릭시 램덤발생
                Random random = new Random();
                for(int i = 0; i < arr_random_num.length; i++){

                    //0~5까지 6개의 숫자중 랜덤발생 +1을 해줘서 1~6으로 바꿈
                    arr_random_num[i] = random.nextInt(6) + 1;
                    //랜덤숫자를 텍스트뷰에 대입
                    textView[i].setText(Integer.toString(arr_random_num[i]));
                }

            }
        });
    }
}
