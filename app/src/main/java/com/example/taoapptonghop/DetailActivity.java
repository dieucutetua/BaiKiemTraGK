package com.example.taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();

        Bundle bundle = getIntent().getExtras();
        if(bundle == null ){
            return;
        }
        ThuVien thuVien = (ThuVien) bundle.get("object_thuvien");
        TextView textName = (TextView) findViewById(R.id.tvname);
        TextView textTacGia = (TextView) findViewById(R.id.tvinfor);
        TextView textViTri = (TextView) findViewById(R.id.tvvitri);
        ImageView imgAnh = (ImageView) findViewById(R.id.tvAnh);
        textName.setText(thuVien.getTenSach());
        textTacGia.setText(thuVien.getChitiet());
        textViTri.setText(thuVien.getVitri());
        imgAnh.setImageResource(thuVien.getHinh());

    }
}