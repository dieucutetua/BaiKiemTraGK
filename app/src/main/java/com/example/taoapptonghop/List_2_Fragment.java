package com.example.taoapptonghop;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class List_2_Fragment extends Fragment {

    private RecyclerView recThuVien;
    private List<ThuVien> thuVienList;
    private ThuVienAdapter thuVienAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_2_, container, false);
        recThuVien = (RecyclerView) view.findViewById(R.id.rc_list2);
        thuVienList = new ArrayList<>();

        ThuVien thuvien1 = new ThuVien("Pháp luật đại cương", "Đại Cương", "A1+A2", R.drawable.img_list2_pldc);
        ThuVien thuvien2 = new ThuVien("Luật Kinh Tế", "Đại Cương", "A3+A4", R.drawable.img_list2_lkt);
        ThuVien thuvien3 = new ThuVien("Luật dân sự", "Đại Cương", "B", R.drawable.img_list2_lds);
        ThuVien thuvien4 = new ThuVien("Pháp luật và đời sống", "Pháp luật và đời sống", "C", R.drawable.img_list2_plds);
        ThuVien thuvien5 = new ThuVien("Báo", "Kinh Tế, Thể Thao , ..", "Kệ sát cửa", R.drawable.img_bao);

        thuVienList.add(thuvien1);
        thuVienList.add(thuvien2);
        thuVienList.add(thuvien3);
        thuVienList.add(thuvien4);
        thuVienList.add(thuvien5);
        thuVienAdapter = new ThuVienAdapter(thuVienList, new ThuVienAdapter.IClickItemThuVien() {
            @Override
            public void onClickThuVien(ThuVien thuVien) {
                onClickGoToDeatail(thuVien);
            }
        });
        recThuVien.setAdapter(thuVienAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recThuVien.setLayoutManager(layoutManager);
        return view;


    }

    public void onDestroy() {
        super.onDestroy();
    }

    private void onClickGoToDeatail(ThuVien thuVien) {
        Intent intent = new Intent(getContext(), DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_thuvien", thuVien);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}