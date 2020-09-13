package com.example.xuiapply.pictureSelector;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xuiapply.R;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.entity.LocalMedia;
import com.xuexiang.xui.widget.alpha.XUIAlphaButton;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PictureSelectorActivity extends AppCompatActivity {

    @BindView(R.id.button)
    XUIAlphaButton button;
    @BindView(R.id.button_no_camera)
    XUIAlphaButton buttonNoCamera;
    @BindView(R.id.button_one_photo)
    XUIAlphaButton buttonOnePhoto;
    @BindView(R.id.button_photo_gif)
    XUIAlphaButton buttonPhotoGif;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private ImageSelectGridAdapter mAdapter;

    private List<LocalMedia> mSelectList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_selector);
        ButterKnife.bind(this);
    }

    protected void initViews() {
        GridLayoutManager manager = new GridLayoutManager(this, 4, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(mAdapter = new ImageSelectGridAdapter(PictureSelectorActivity.this, (ImageSelectGridAdapter.OnAddPicClickListener) this));
        mAdapter.setSelectList(mSelectList);
        mAdapter.setSelectMax(8);
//        mAdapter.setOnItemClickListener((position, v) -> PictureSelector.create(this).themeStyle(R.style.XUIPictureStyle).openExternalPreview(position, mSelectList));
    }
}
