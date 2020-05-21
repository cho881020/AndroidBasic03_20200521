package kr.co.tjoeun.androidbasic03_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.androidbasic03_20200521.databinding.ActivityEditUserNickNameBinding;

public class EditUserNickNameActivity extends BaseActivity {

    ActivityEditUserNickNameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_user_nick_name);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nickName = binding.nickNameEdt.getText().toString();

                Intent myIntent = new Intent();
                myIntent.putExtra("editNickName", nickName);

                setResult(RESULT_OK, myIntent);

                finish();
            }
        });

    }

    @Override
    public void setValues() {

    }
}
