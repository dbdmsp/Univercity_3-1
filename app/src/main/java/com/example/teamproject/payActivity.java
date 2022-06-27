package com.example.teamproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class payActivity extends AppCompatActivity {
    TextView checked;
    TextView pay_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //앞 주문목록에서 장바구니 내용 전달받기
        Intent intent = getIntent();
        String receiveStr = intent.getExtras().getString("sendData");// 전달한 값을 받을 때
        checked = (TextView)findViewById(R.id.pay_menu);
        checked.setText(receiveStr);

        Intent intent1 = getIntent();
        String receiveStr1 = intent1.getExtras().getString("sendData1");// 전달한 값을 받을 때
        pay_price = (TextView)findViewById(R.id.pay_price);
        pay_price.setText(receiveStr1);

        //포장
        Button button = (Button) findViewById(R.id.pay_pickup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),pickupActivity.class);
                startActivity(intent);
            }
        });

        //배달
        Button button1 = (Button) findViewById(R.id.pay_deliver);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),deliverActivity.class);
                startActivity(intent);
            }
        });

        checked = (TextView) findViewById(R.id.checked);
        pay_price = (TextView) findViewById(R.id.pay_price);
    }
}
