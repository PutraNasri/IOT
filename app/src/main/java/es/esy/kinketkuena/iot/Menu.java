package es.esy.kinketkuena.iot;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Activity {
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        sp = (Spinner) findViewById(R.id.spinner);
        List<String> item = new ArrayList<String>();
        item.add("Pilih No Kandang");
        item.add("No 1");
        item.add("No 2");
        item.add("No 3");
        item.add("No 4");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Menu.this,android.R.layout.simple_spinner_dropdown_item,item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
    }
    public void proses (View view){
        if(sp.getSelectedItem().toString().equals("Pilih No Kandang")){
            AlertDialog.Builder a_builder = new AlertDialog.Builder(Menu.this);
            a_builder.setMessage("Nomor kandang belum di pilih")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = a_builder.create();
            alert.setTitle("Info");
            alert.show();
        }
        else {
        Intent intent = new Intent(Menu.this, Menu_awal.class);
        startActivity(intent);
        finish();
        }
    }
}
