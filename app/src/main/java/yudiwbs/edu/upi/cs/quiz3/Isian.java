package yudiwbs.edu.upi.cs.quiz3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Isian extends AppCompatActivity {

    EditText edNama, edAlamat;
    Button Btn_yes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isian);

        edNama = findViewById(R.id.edNama);
        edNama = findViewById(R.id.edAlamat);
        Btn_yes= findViewById(R.id.btn_Yes);

    }

    public void aksi(View view){

        edAlamat.getText();
        MahasiswaData data = new MahasiswaData();
        int length = data.length();
        data.data[length][0] = edNama.getText().toString();
        data.data[length][1] = edAlamat.getText().toString();



    }

}
