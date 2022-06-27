package com.example.teamproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static Context mainContext;

    Button newmenu, hambuger, side, drink;
    LinearLayout home_new, home_ham, home_side, home_drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TextView checked = (TextView) findViewById(R.id.checked);
        TextView pay_price = (TextView) findViewById(R.id.pay_price);

        mainContext = this;

        //체크박스 설정
        final CheckBox menu1 = (CheckBox)findViewById(R.id.menu1);
        final CheckBox menu2 = (CheckBox)findViewById(R.id.menu2);
        final CheckBox menu3 = (CheckBox)findViewById(R.id.menu3);
        final CheckBox menu4 = (CheckBox)findViewById(R.id.menu4);

        final CheckBox hbg1 = (CheckBox)findViewById(R.id.hbg1);
        final CheckBox hbg2 = (CheckBox)findViewById(R.id.hbg2);
        final CheckBox hbg3 = (CheckBox)findViewById(R.id.hbg3);
        final CheckBox hbg4 = (CheckBox)findViewById(R.id.hbg4);
        final CheckBox hbg5 = (CheckBox)findViewById(R.id.hbg5);
        final CheckBox hbg6 = (CheckBox)findViewById(R.id.hbg6);
        final CheckBox hbg7 = (CheckBox)findViewById(R.id.hbg7);
        final CheckBox hbg8 = (CheckBox)findViewById(R.id.hbg8);
        final CheckBox hbg9 = (CheckBox)findViewById(R.id.hbg9);

        final CheckBox side1 = (CheckBox)findViewById(R.id.side1);
        final CheckBox side2 = (CheckBox)findViewById(R.id.side2);
        final CheckBox side3 = (CheckBox)findViewById(R.id.side3);
        final CheckBox side4 = (CheckBox)findViewById(R.id.side4);
        final CheckBox side5 = (CheckBox)findViewById(R.id.side5);
        final CheckBox side6 = (CheckBox)findViewById(R.id.side6);

        final CheckBox dk1 = (CheckBox)findViewById(R.id.dk1);
        final CheckBox dk2 = (CheckBox)findViewById(R.id.dk2);
        final CheckBox dk3 = (CheckBox)findViewById(R.id.dk3);
        final CheckBox dk4 = (CheckBox)findViewById(R.id.dk4);
        final CheckBox dk5 = (CheckBox)findViewById(R.id.dk5);
        final CheckBox dk6 = (CheckBox)findViewById(R.id.dk6);

        Button b = (Button)findViewById(R.id.check);
        final TextView tv = (TextView) findViewById(R.id.checked);
        final TextView tv2 = (TextView) findViewById(R.id.pay_price);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String result = "";
                int sum = 0;
                List<Integer> arr = new ArrayList<Integer>(100);
                if(menu1.isChecked()==true){
                    result += menu1.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(menu1.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(menu2.isChecked()==true){
                    result += menu2.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(menu2.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(menu3.isChecked()==true){
                    result += menu3.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(menu3.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(menu4.isChecked()==true){
                    result += menu4.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(menu4.getText().toString().replaceAll("[^\\d]", "")));
                }

                if(hbg1.isChecked()==true){
                    result += hbg1.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(hbg1.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(hbg2.isChecked()==true){
                    result += hbg2.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(hbg2.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(hbg3.isChecked()==true){
                    result += hbg3.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(hbg3.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(hbg4.isChecked()==true){
                    result += hbg4.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(hbg4.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(hbg5.isChecked()==true){
                    result += hbg5.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(hbg5.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(hbg6.isChecked()==true){
                    result += hbg6.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(hbg6.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(hbg7.isChecked()==true){
                    result += hbg7.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(hbg7.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(hbg8.isChecked()==true){
                    result += hbg8.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(hbg8.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(hbg9.isChecked()==true){
                    result += hbg9.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(hbg9.getText().toString().replaceAll("[^\\d]", "")));
                }

                if(side1.isChecked()==true){
                    result += side1.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(side1.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(side2.isChecked()==true){
                    result += side2.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(side2.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(side3.isChecked()==true){
                    result += side3.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(side3.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(side4.isChecked()==true){
                    result += side4.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(side4.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(side5.isChecked()==true){
                    result += side5.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(side5.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(side6.isChecked()==true){
                    result += side6.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(side6.getText().toString().replaceAll("[^\\d]", "")));
                }

                if(dk1.isChecked()==true){
                    result += dk1.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(dk1.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(dk2.isChecked()==true){
                    result += dk2.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(dk2.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(dk3.isChecked()==true){
                    result += dk3.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(dk3.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(dk4.isChecked()==true){
                    result += dk4.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(dk4.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(dk5.isChecked()==true){
                    result += dk5.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(dk5.getText().toString().replaceAll("[^\\d]", "")));
                }
                if(dk6.isChecked()==true){
                    result += dk6.getText().toString().replaceAll("[^\\D]", "");
                    arr.add(Integer.parseInt(dk6.getText().toString().replaceAll("[^\\d]", "")));
                }
                tv.setText(result);

                for (int i : arr) {
                    sum += i;
                }
                tv2.setText(String.valueOf(sum));
            }
        }); //체크박스 설정 끝 체크박스 텍스트에 가격도 있지만 장바구니 출력될 땐 숫자 빼고 메뉴 이름만 출력되게

        //프레임 레이아웃 설정 상단 메뉴 버튼 누르면 그에 맞는 메뉴들 나오게
        newmenu = (Button) findViewById(R.id.newmenu);
        hambuger = (Button) findViewById(R.id.hambuger);
        side = (Button) findViewById(R.id.side);
        drink = (Button) findViewById(R.id.drink);

        home_new = (LinearLayout) findViewById(R.id.home_new);
        home_ham = (LinearLayout) findViewById(R.id.home_ham);
        home_side = (LinearLayout) findViewById(R.id.home_side);
        home_drink = (LinearLayout) findViewById(R.id.home_drink);

        newmenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                home_new.setVisibility(View.VISIBLE);
                home_ham.setVisibility(View.INVISIBLE);
                home_side.setVisibility(View.INVISIBLE);
                home_drink.setVisibility(View.INVISIBLE);
            }
        });
        hambuger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                home_ham.setVisibility(View.VISIBLE);
                home_new.setVisibility(View.INVISIBLE);
                home_side.setVisibility(View.INVISIBLE);
                home_drink.setVisibility(View.INVISIBLE);
            }
        });
        side.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                home_side.setVisibility(View.VISIBLE);
                home_ham.setVisibility(View.INVISIBLE);
                home_new.setVisibility(View.INVISIBLE);
                home_drink.setVisibility(View.INVISIBLE);
            }
        });
        drink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                home_drink.setVisibility(View.VISIBLE);
                home_ham.setVisibility(View.INVISIBLE);
                home_side.setVisibility(View.INVISIBLE);
                home_new.setVisibility(View.INVISIBLE);
            }
        });

        //취소하기 버튼 초기화 설정
        Button cancel=(Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu1.setChecked(false);
                menu2.setChecked(false);
                menu3.setChecked(false);
                menu4.setChecked(false);
                hbg1.setChecked(false);
                hbg2.setChecked(false);
                hbg3.setChecked(false);
                hbg4.setChecked(false);
                hbg5.setChecked(false);
                hbg6.setChecked(false);
                hbg7.setChecked(false);
                hbg8.setChecked(false);
                hbg9.setChecked(false);
                side1.setChecked(false);
                side2.setChecked(false);
                side3.setChecked(false);
                side4.setChecked(false);
                side5.setChecked(false);
                side6.setChecked(false);
                dk1.setChecked(false);
                dk2.setChecked(false);
                dk3.setChecked(false);
                dk4.setChecked(false);
                dk5.setChecked(false);
                dk6.setChecked(false);
                checked.setText(null);
                pay_price.setText(null);
            }
        });

        //결제하기 버튼 누르면 다음 페이지로
        Button pay=(Button) findViewById(R.id.pay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (MainActivity.this, payActivity.class);
                intent.putExtra("sendData",checked.getText().toString()); //주문목록 데이터 다음 액티비티로
                intent.putExtra("sendData1",pay_price.getText().toString());
                startActivity(intent);
            }
        });
    }
}