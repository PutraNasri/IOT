package es.esy.kinketkuena.iot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class Temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        Intent intent = getIntent();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {

            Intent intent = new Intent(Temperature.this, Menu_awal.class);
            startActivity(intent);
            finish();

            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
