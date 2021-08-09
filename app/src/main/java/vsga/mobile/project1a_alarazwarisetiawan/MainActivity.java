package vsga.mobile.project1a_alarazwarisetiawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNamaDepan, edtNamaBelakang;
    Button btnTampilkan;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNamaDepan = (EditText) findViewById(R.id.edt_namaDepan);
        edtNamaBelakang = (EditText) findViewById(R.id.edt_namaBelakang);
        btnTampilkan = (Button) findViewById(R.id.btn_tampilkan);
        tvHasil = (TextView) findViewById(R.id.tv_hasil);

        btnTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama_depan = edtNamaDepan.getText().toString();
                String nama_belakang = edtNamaBelakang.getText().toString();
                String hasil = nama_depan + " " + nama_belakang;

                tvHasil.setText(hasil);
            }
        });
    }
}
