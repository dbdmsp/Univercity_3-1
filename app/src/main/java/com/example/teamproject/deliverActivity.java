package com.example.teamproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class deliverActivity extends AppCompatActivity {

    Button bt;
    TextView tvaddress,tvname;
    View dialogView;
    EditText dlgEdtaddress, dlgEdtname;
    Button CardBtn, PayBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deliver);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        tvaddress = (TextView)findViewById(R.id.addressEntry);
        tvname = (TextView) findViewById(R.id.nameEntry);
        bt = (Button)findViewById(R.id.btnaddress);

        //다이얼로그 창 띄우는 버튼
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //dialog.xml 파일 인플레이트
                dialogView = (View) View.inflate(deliverActivity.this,R.layout.address,null);

                //alertDialog.Builder 생성
                AlertDialog.Builder dlg = new AlertDialog.Builder(deliverActivity.this);
                dlg.setTitle("주소 입력");
                dlg.setIcon(R.drawable.pencil);
                dlg.setView(dialogView); //인플레이트한 것을 대화상자로 사용

                dlg.setPositiveButton("확인",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dlgEdtaddress = (EditText)dialogView.findViewById(R.id.Edtaddress);
                                dlgEdtname = (EditText)dialogView.findViewById(R.id.Edtname);

                                tvaddress.setText(dlgEdtaddress.getText().toString());
                                tvname.setText(dlgEdtname.getText().toString());

                                Toast.makeText(getApplicationContext(),"주소가 입력되었습니다.",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                dlg.setNegativeButton("취소",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"주소 입력이 취소되었습니다.",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                dlg.show(); //dialog창 보이기
            }
        });

        CardBtn = (Button) findViewById(R.id.card2);
        PayBtn = (Button) findViewById(R.id.pay2);

        CardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "결제 중입니다... 잠시만 기다려주세요.",Toast.LENGTH_LONG);
                toast.show();
                Toast toast1 = Toast.makeText(getApplicationContext(), "결제가 완료되었습니다. 배달 주소를 입력해주세요.",Toast.LENGTH_SHORT);
                toast1.show();
            }
        });

        PayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "주문 전달 중입니다... 잠시만 기다려주세요.",Toast.LENGTH_LONG);
                toast.show();
                Toast toast1 = Toast.makeText(getApplicationContext(), "완료되었습니다. 배달 주소 입력 후 다음 단계를 눌러주세요.",Toast.LENGTH_SHORT);
                toast1.show();
            }
        });

        Button button = (Button) findViewById(R.id.btnnext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),lastDeliverActivity.class);
                startActivity(intent);
            }
        });
    }
}
