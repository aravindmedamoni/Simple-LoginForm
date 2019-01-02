package com.example.medamoniaravind.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class LocationActivity extends AppCompatActivity {
    GridView list;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        list = findViewById(R.id.lv);
        String[] c = {"HYD", "MUM", "KLKT", "CHENNAI", "DELHI", "PUNE", "KLKY", "JAIPUR"};
        Integer[] d = {R.drawable.charminar, R.drawable.mum, R.drawable.kolkata, R.drawable.chennai, R.drawable.newdelhi, R.drawable.pune, R.drawable.klky, R.drawable.japur};
        CustomAdapter ca = new CustomAdapter(LocationActivity.this, c, d);
        list.setAdapter(ca);
    /*    ArrayAdapter aa=new ArrayAdapter(LocationActivity.this,android.R.layout.simple_list_item_1,c);
        list.setAdapter(aa);
        Intent i=getIntent();
        String a=i.getStringExtra("ü");
        String b=i.getStringExtra("p");
        text=findViewById(R.id.tv);
        text.setText("welcome\n"+a);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, cView view, int position, long id) {
             switch (position){
                 case 0:
                     Toast.makeText(LocationActivity.this, "Clicked on HYD", Toast.LENGTH_SHORT).show();
                     break;
                 case 1:
                     Toast.makeText(LocationActivity.this, "Clicked on MUM", Toast.LENGTH_SHORT).show();
                     break;
                 case 2:
                     Toast.makeText(LocationActivity.this, "Clicked on KLKT", Toast.LENGTH_SHORT).show();
                     break;
                 case 3:
                     Toast.makeText(LocationActivity.this, "Clicked on CHENNAI", Toast.LENGTH_SHORT).show();
                     break;
                 case 4:
                     Toast.makeText(LocationActivity.this, "Clicked on DELHI", Toast.LENGTH_SHORT).show();
                     break;
                 case 5:
                     Toast.makeText(LocationActivity.this, "Clicked on PUNE", Toast.LENGTH_SHORT).show();
                     break;
                 case 6:
                     Toast.makeText(LocationActivity.this, "Clicked on KLKY", Toast.LENGTH_SHORT).show();
                     break;
                 case 7:
                     Toast.makeText(LocationActivity.this, "Clicked on JAIPUR", Toast.LENGTH_SHORT).show();
                     break;

             }
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.location,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch(id){
            case R.id.profile:
                Toast.makeText(this, "clicked on profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.privacy:
                Toast.makeText(this, "clicked on privacy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(this, "clicked on settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.inviteFriend:
                Toast.makeText(this, "clicked on inviteFriend", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}


