package com.example.baitaplon;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private List<product> productList;
    private Context context;

    // Constructor
    public ProductAdapter(List<product> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate layout cho mỗi item trong RecyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        // Lấy đối tượng product từ danh sách productList
        product product = productList.get(position);

        // Set giá trị cho từng thuộc tính của product
        holder.productName.setText(product.getName());
        holder.productPrice.setText(product.getPrice());

        // Set hình ảnh sản phẩm (nếu có)
        holder.productImage.setImageResource(product.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,chitietsanpham.class);
                // truyền ảnh của sản phẩm vào
                Intent intent1 = intent.putExtra("productImage", product.getImage());

                // Truyền thêm các dữ liệu khác nếu cần
                intent.putExtra("productName", product.getName());
                intent.putExtra("productPrice", product.getPrice());

                // Khởi chạy Activity8
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return productList.size(); // Trả về số lượng item
    }

    // ViewHolder chứa các thành phần của layout item
    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView productName, productPrice;
        ImageView productImage;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.productName);
            productPrice = itemView.findViewById(R.id.productPrice);
            productImage = itemView.findViewById(R.id.productImage);
        }
    }

    }
