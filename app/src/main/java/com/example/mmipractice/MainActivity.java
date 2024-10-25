package com.example.mmipractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Test> testList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits(); // 初始化水果数据
        TestAdapter adapter = new TestAdapter(MainActivity.this,
                R.layout.test_item, testList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Test test = testList.get(i);
                Toast.makeText(MainActivity.this, test.getName(), Toast.LENGTH_SHORT).show();
                switch (i){
                    case 0:
                        Intent intent = new Intent(MainActivity.this, DisplayTest.class);
                        startActivity(intent);
                        break;
                    case 1:
                        break;

                }
            }
        });
    }

    private void initFruits() {
            Test version = new Test("Version", R.drawable.camera);
            testList.add(version);
            Test emmc = new Test("EMMC ", R.drawable.camera);
            testList.add(emmc);
            Test sim = new Test("SIM ", R.drawable.camera);
            testList.add(sim);
            Test sdCard = new Test("SD card", R.drawable.camera);
            testList.add(sdCard);
            Test display = new Test("Display", R.drawable.camera);
            testList.add(display);
            Test cam = new Test("Cam", R.drawable.camera);
            testList.add(cam);
            Test vibration = new Test("Vibration", R.drawable.camera);
            testList.add(vibration);
            Test receiver = new Test("Receiver", R.drawable.camera);
            testList.add(receiver);
            Test speaker = new Test("Speaker", R.drawable.camera);
            testList.add(speaker);
            Test backCamera = new Test("Back Camera", R.drawable.camera);
            testList.add(backCamera);


    }
}
