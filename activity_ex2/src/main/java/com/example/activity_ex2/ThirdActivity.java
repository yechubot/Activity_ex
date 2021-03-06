package com.example.activity_ex2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        //버튼 만들지 않고 메인으로 돌아가보기
        ActionBar bar = getSupportActionBar();
        bar.setTitle("3번째 액티비티");
        bar.setDisplayHomeAsUpEnabled(true);//-> 뒤로가기 버튼 생김
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: // 안드로이드에 있는 메뉴 -> 뒤로가기 버튼을 말함
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

/*            When you successfully handle a menu item, return true.
             If you don't handle the menu item, you should call the superclass implementation of onOptionsItemSelected()
             (the default implementation returns false)*/
        }

    }
}