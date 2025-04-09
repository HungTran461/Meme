package com.example.b514.studywme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by B516 on 4/9/2025.
 */
public class MyAdapter extends ArrayAdapter<Person> {

    Context context;
    int resource;
    ArrayList<Person> myList;
    public MyAdapter(Context context, int resource, ArrayList<Person> myList) {
        super(context, resource, myList);
        this.context = context;
        this.resource = resource;
        this.myList = myList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context
        return super.getView(position, convertView, parent);
    }
}
