package com.example.hsport.catalog;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;


public class ProductListAdapter extends ArrayAdapter<Product> {

    private List<Product> products;

     public ProductListAdapter(Context context, int resource, List<Product>, objects) {
        super(context, resource, objects);
         products = objects;

    }
    
}
