package com.example.ngl_cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     CheckBox checkBox;
     Button btn;
     EditText taikhoan;
     EditText matkhau;
     TextView loi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         checkBox = findViewById(R.id.checkBoxLuuThongTin);
         btn = findViewById(R.id.buttonDangNhap);
         taikhoan = findViewById(R.id.editTextTaiKhoan);
         matkhau = findViewById(R.id.editTextMatKhau);
         loi = findViewById(R.id.textViewLoi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String taikhoanString = taikhoan.getText().toString();
                String matkhauString = matkhau.getText().toString();
                loi.setText("");
                if (taikhoanString.equals("")|| matkhauString.equals("")){

                    loi.setText("Vui lòng nhập cả tài khoản và mật khẩu thông tin!");
                }
                else{
                    if(checkBox.isChecked()){
                       Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",
                               Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
