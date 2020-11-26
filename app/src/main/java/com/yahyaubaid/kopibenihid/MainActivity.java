package com.yahyaubaid.kopibenihid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.yahyaubaid.kopibenihid.adapter.ListKopiAdapter;
import com.yahyaubaid.kopibenihid.adapter.OnItemClickCallback;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvKopi;
    private ArrayList<Kopi> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKopi = findViewById(R.id.rv_kopi);
        rvKopi.setHasFixedSize(true);

        list.addAll(KopiData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvKopi.setLayoutManager(new LinearLayoutManager(this));
        ListKopiAdapter listKopiAdapter = new ListKopiAdapter(list);
        rvKopi.setAdapter(listKopiAdapter);

        listKopiAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Kopi kopi) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailKopi.class);
                moveIntent1.putExtra(DetailKopi.ITEM_EXTRA, kopi);
                startActivity(moveIntent1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kontak_id) {
            Intent moveIntent = new Intent(MainActivity.this, KontakActivity.class);
            startActivity(moveIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}