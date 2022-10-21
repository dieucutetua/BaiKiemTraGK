package com.example.taoapptonghop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ThuVienAdapter extends RecyclerView.Adapter<ThuVienAdapter.ThuVienViewHolder>{
    private List<ThuVien> thuVienList;
    IClickItemThuVien iClickItemThuVien;

    public ThuVienAdapter(List<ThuVien> thuVienList, IClickItemThuVien iClickItemThuVien) {
        this.iClickItemThuVien = iClickItemThuVien;
        this.thuVienList = thuVienList;
    }

    public ThuVienViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_listview,parent,false);
        return new ThuVienViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThuVienViewHolder holder, int position) {
        ThuVien thuVien = thuVienList.get(position);
        if(thuVien == null){
            return;
        }
        holder.tvTenSach.setText(thuVien.getTenSach());
        holder.tvTacGia.setText(thuVien.getChitiet());
        holder.tvViTri.setText(thuVien.getVitri());
        holder.imgHinh.setImageResource(thuVien.getHinh());

        holder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iClickItemThuVien.onClickThuVien(thuVien);
            }
        });
    }



    @Override
    public int getItemCount() {
        if(thuVienList !=null){
            return thuVienList.size();
        }
        return 0;
    }

    class ThuVienViewHolder extends RecyclerView.ViewHolder{

        private RelativeLayout layoutItem;
        private TextView tvTenSach,tvTacGia,tvViTri;
        private ImageView imgHinh;
        public ThuVienViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutItem = itemView.findViewById(R.id.layout_item);
            tvTenSach = itemView.findViewById(R.id.tv_name);
            tvTacGia = itemView.findViewById(R.id.tv_infor);
            tvViTri = itemView.findViewById(R.id.tv_vitri);
            imgHinh = itemView.findViewById(R.id.imgAvatar);
        }
    }
    public interface IClickItemThuVien {
        void onClickThuVien(ThuVien thuVien);
    }
}
