package yudiwbs.edu.upi.cs.quiz3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Isian extends AppCompatActivity {

    EditText edNama, edAlamat;
    Button Btn_yes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isian);

        edNama = findViewById(R.id.edNama);
        edAlamat = findViewById(R.id.edAlamat);
        Btn_yes= findViewById(R.id.btn_Yes);

    }

    public void aksi(View view) {

        edAlamat.getText();
        //  MainActivity main = new MainActivity();
        //main.list.add(edNama.getText().toString(),edAlamat.getText().toString());
        //  public static ArrayList<Mahasiswa>   {

    }
}
