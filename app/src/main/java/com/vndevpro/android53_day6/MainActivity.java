package com.vndevpro.android53_day6;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DBHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

    }

    private void initData() {
        mDbHelper = new DBHelper(this);

        ProductModel productModel = new ProductModel();
        productModel.setTitle("iPhone X");
        productModel.setDescription("An apple mobile which is nothing like apple");
        productModel.setPrice(549);
        productModel.setDiscountPercentage(12.96);
        productModel.setRating(4.69);
        productModel.setStock(94);
        productModel.setBrand("Apple");
        productModel.setCategory("smartphones");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/1/thumbnail.jpg");

        List<String> images = new ArrayList<>();
        images.add("https://i.dummyjson.com/data/products/1/1.jpg");
        images.add("https://i.dummyjson.com/data/products/1/2.jpg");
        images.add("https://i.dummyjson.com/data/products/1/3.jpg");
        images.add("https://i.dummyjson.com/data/products/1/4.jpg");
        productModel.setImages(images);
//        mDbHelper.addProduct(productModel);
//        mDbHelper.addProduct(productModel);
//        mDbHelper.addProduct(productModel);
//        mDbHelper.addProduct(productModel);
//        mDbHelper.updateProduct(2,productModel);
//        mDbHelper.deleteProduct(2);
        Log.d("TAG", "initData: "+mDbHelper.getProducts().size());
    }
}