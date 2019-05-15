package br.com.franciscochaves.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar mSeekbar;
    private TextView mTextoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSeekbar = findViewById(R.id.seekBar_escala_diversao);
        mTextoExibicao = findViewById(R.id.text_exibicao);

        mSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Quando move a barra de progresso
                mTextoExibicao.setText("Progresso: " + progress + " / "+ seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Quando pressiona a barra de progresso
                Toast.makeText(getApplicationContext(),"Seekbar pressionado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Quando soltar a barra de progresso
                Toast.makeText(getApplicationContext(),"Seekbar não está pressionado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
