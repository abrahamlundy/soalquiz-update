package yudiwbs.edu.upi.cs.quiz3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    public ArrayList<Mahasiswa> list;
    RecyclerView daftar;
    String nama;
    String coba = "Nama : Lundy Van Kevin \nNIM: 1407229" ;
    TextView tvNamaBeranda;

    /*
    * Nama : Lundy Van Kevin
    * NIM : 1407229
    * */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        tvNamaBeranda = findViewById(R.id.tvNama);


        //Handling list dalam adapter
        daftar= findViewById(R.id.rvAlamat);
        daftar.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(MahasiswaData.getListData());
        showRecyclerList();
    }

    // void untuk nampilin list final
    private void showRecyclerList(){
        daftar.setLayoutManager(new LinearLayoutManager(this));
        ListHandler listHandler = new ListHandler(this);
        listHandler.setListMahasiswa(list);
        daftar.setAdapter(listHandler);
    }

    //Untuk menambahkan menu ke dalam tampilan dasat
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    //Untuk menambahkan aksi pada pilihan menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.mIsiNama:
                Toast.makeText(getApplicationContext(), "Nama Terisi..", Toast.LENGTH_LONG).show();
                tvNamaBeranda.setText(coba);
                //lengkapi
                return true;
            case R.id.mIsiTabel:

                Mahasiswa mahasiswa = null;
                ArrayList<Mahasiswa> input = new ArrayList<>();
                    mahasiswa = new Mahasiswa();
                    mahasiswa.setNama("Kevin Juliano");
                    mahasiswa.setAlamat("Bandung Raya");
                    input.add(mahasiswa);
                    list.addAll(input);
                    showRecyclerList();

              /*
                Intent next = new Intent(this, Isian.class);
                startActivity(next);
                Toast.makeText(getApplicationContext(), "Nama dan alamat terisi", Toast.LENGTH_LONG).show();
                */

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }




}
