package com.yahyaubaid.kopibenihid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailKopi extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kopi);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);
        TextView tvHarga = findViewById(R.id.tv_item_harga);

        Kopi kopi = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (kopi != null) {
            Glide.with(this)
                    .load(kopi.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(kopi.getName());
            tvDeskripsi.setText(kopi.getDetail());
            tvHarga.setText(kopi.getHarga());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Kopi");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}