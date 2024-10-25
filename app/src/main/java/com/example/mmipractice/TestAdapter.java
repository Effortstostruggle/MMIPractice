package com.example.mmipractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestAdapter extends ArrayAdapter<Test> {

    private int resourceId;

    public TestAdapter(@NonNull Context context, int resource, @NonNull List<Test> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Test test = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView testImage = view.findViewById(R.id.test_image);
        TextView testName = view.findViewById(R.id.test_name);
        testImage.setImageResource(test.getImageId());
        testName.setText(test.getName());
        return view;
    }
}
