package com.example.teamproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pickupActivity extends AppCompatActivity {

    Button CardBtn, PayBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pickup);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        CardBtn = (Button) findViewById(R.id.card1);
        PayBtn = (Button) findViewById(R.id.pay1);

        CardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "결제 중입니다... 잠시만 기다려주세요.",Toast.LENGTH_LONG);
                toast.show();
                Toast toast1 = Toast.makeText(getApplicationContext(), "결제가 완료되었습니다.",Toast.LENGTH_SHORT);
                toast1.show();
            }
        });

        PayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "주문 전달 중입니다... 잠시만 기다려주세요.",Toast.LENGTH_LONG);
                toast.show();
                Toast toast1 = Toast.makeText(getApplicationContext(), "완료되었습니다. 다음 단계를 눌러주세요.",Toast.LENGTH_SHORT);
                toast1.show();
            }
        });

        Button button = (Button) findViewById(R.id.btnnext1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),lastPickupActivity.class);
                startActivity(intent);
            }
        });
    }
}
