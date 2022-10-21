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

public class List_3_Fragment extends Fragment {

    private RecyclerView recThuVien;
    private List<ThuVien> thuVienList;
    private ThuVienAdapter thuVienAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_3_, container, false);
        recThuVien = (RecyclerView) view.findViewById(R.id.rc_list3);
        thuVienList = new ArrayList<>();

        ThuVien thuvien1 = new ThuVien("Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", "A1+A2", R.drawable.img_list3_tthv);
        ThuVien thuvien2 = new ThuVien("Không gia đình", "Hector Malot", "A3+A4", R.drawable.img_list3_kgd);
        ThuVien thuvien3 = new ThuVien("Hai số phận", "Jeffrey Archer", "B", R.drawable.img_list3_hsp);
        ThuVien thuvien4 = new ThuVien("Cuốn theo chiều gió", "Margaret Mitchel", "C", R.drawable.img_list3_ctcg);
        ThuVien thuvien5 = new ThuVien("Don Quixote", "Nhà quý tộc tài ba xứ Mancha", "Kệ sát cửa", R.drawable.img_list3_dq);
        ThuVien thuvien6 = new ThuVien("Đắc nhân tâm", "Đời sống", "Tầng 2", R.drawable.img_list3_dnt);
        ThuVien thuvien7 = new ThuVien("Truyện cổ của Andersen", "Andersen", "Tầng 2", R.drawable.img_list3_adx);

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