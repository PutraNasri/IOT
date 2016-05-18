package es.esy.kinketkuena.iot;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class Menu_awal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);
        Intent intent = getIntent();
    }
    public void food(View view){
        Intent intent = new Intent(Menu_awal.this, Food.class);
        startActivity(intent);
        finish();
    }
    public void temp(View view){
        Intent intent = new Intent(Menu_awal.this, Temperature.class);
        startActivity(intent);
        finish();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {

            Intent intent = new Intent(Menu_awal.this, Menu.class);
            startActivity(intent);
            finish();

            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
