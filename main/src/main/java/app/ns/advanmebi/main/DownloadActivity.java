package app.ns.advanmebi.main;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DownloadActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        ImageView imageView = (ImageView) findViewById(R.id.imgLoading);
        Glide.with(this).load(R.drawable.loading_2).into(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DownloadActivity.this,ResultActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
