package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("HelloWorldActivity","______________onCreate execute______________");

        Button btn1 = findViewById(R.id.btn1);
        final TextView tv1 = findViewById(R.id.tv1);
        final TextView tv2 = findViewById(R.id.tv2);
        //final TextView tv3 = findViewById(R.id.tv3);
        final RadioButton rb1 = findViewById(R.id.rb1);
        final RadioButton rb2 = findViewById(R.id.rb2);
        final EditText edit1 = findViewById(R.id.edit1);
        final ImageView image = findViewById(R.id.image);
        final SeekBar seek1 = findViewById(R.id.seek1);

        image.setVisibility(View.INVISIBLE);
        seek1.setVisibility(View.INVISIBLE);
        //tv3.setVisibility(View.INVISIBLE);
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setVisibility(View.INVISIBLE);             // 隐藏按键
                edit1.setVisibility(View.INVISIBLE);

                String inputText = edit1.getText().toString();      // 根据输入欢迎xx
                Log.i("name", "写入名字");

                inputText = "Welcome " + inputText + " !";
                tv1.setText(inputText);


                image.setVisibility(View.VISIBLE);
                seek1.setVisibility(View.VISIBLE);
                //tv3.setVisibility(View.VISIBLE);
                rb1.setVisibility(View.VISIBLE);
                rb2.setVisibility(View.VISIBLE);


                if (rb1.isChecked()){
                    Toast.makeText(MainActivity.this,"学习",Toast.LENGTH_SHORT).show();
                    Log.i("choose", "这学期学习");

                }
                if (rb2.isChecked()){
                    Toast.makeText(MainActivity.this,"努力学习",Toast.LENGTH_SHORT).show();
                    Log.i("choose", "这学期努力学习");

                }

            }

        });

        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {     // SeekBar滑块
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //动态改变图片的透明度
                image.setImageAlpha(progress);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
