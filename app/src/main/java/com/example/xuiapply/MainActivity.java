package com.example.xuiapply;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatCallback;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        new MaterialDialog.Builder(this)
                .iconRes(R.drawable.icon_tip)
                .title(R.string.tip_infos)
                .content(R.string.content_simple_confirm_dialog)
                .positiveText(R.string.lab_submit)
                .show();
    }
}
