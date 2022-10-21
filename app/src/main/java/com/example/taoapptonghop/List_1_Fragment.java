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


public class List_1_Fragment extends Fragment {
    private RecyclerView recThuVien;
    private List<ThuVien> thuVienList;
    private ThuVienAdapter thuVienAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_list_1_, container, false);
        recThuVien = (RecyclerView) view.findViewById(R.id.rc_list);
        thuVienList = new ArrayList<>();

        ThuVien thuvien1 = new ThuVien("Lập trình cơ bản với C", "Khoa Công Nghệ Số", "Tủ 1", R.drawable.img_list1_ltc);
        ThuVien thuvien2 = new ThuVien("Giải tích I", "Sách đại cương", "Kệ 1 - Tủ 2", R.drawable.img_list1_gt);
        ThuVien thuvien3 = new ThuVien("Triết học Mác-Lênin", "Đại cương", "B", R.drawable.img_list1_triet);
        ThuVien thuvien4 = new ThuVien("Cấu trúc máy tính", "Khoa Công Nghệ Số", "C", R.drawable.img_list1_ctmt);
        ThuVien thuvien5 = new ThuVien("Cơ sở dữ liệu", "Khoa Công Nghệ Số", "Kệ sát cửa", R.drawable.img_list1_csdl);
        ThuVien thuvien6 = new ThuVien("Kinh tế chính trị", "Đại cương", "Tầng 2", R.drawable.img_list1_ktct);
        ThuVien thuvien7 = new ThuVien("Lập Trình Trên ĐTDĐ", "Khoa Công Nghệ Số", "Tầng 2", R.drawable.img_list1_lttdtdd);

        thuVienList.add(thuvien1);
        thuVienList.add(thuvien2);
        thuVienList.add(thuvien3);
        thuVienList.add(thuvien4);
        thuVienList.add(thuvien5);
        thuVienList.add(thuvien6);
        thuVienList.add(thuvien7);
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

    public void onDestroy(){
        super.onDestroy();
    }
    private void onClickGoToDeatail(ThuVien thuVien) {
        Intent intent = new Intent(getContext(), DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_thuvien",thuVien);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}