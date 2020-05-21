package kr.co.tjoeun.androidbasic03_20200521;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.androidbasic03_20200521.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(mContext, EditUserNickNameActivity.class);
                startActivityForResult(myIntent, 1001);
            }
        };

        binding.editNickNameBtn.setOnClickListener(ocl);

    }

    @Override
    public void setValues() {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1001) {
            if (resultCode == RESULT_OK) {

                String nick = data.getStringExtra("editNickName");

                binding.userNickNameTxt.setText(nick);

            }
        }

    }
}












