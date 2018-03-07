package com.example.user.gridview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    ArrayList<Items> country=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid=(GridView) findViewById(R.id.gview);
        country.add(new Items("Afghanistan", R.drawable.afghanistan,"https://en.wikipedia.org/wiki/Afghanistan"));
        country.add(new Items("Bangladesh", R.drawable.bangladesh,"https://en.wikipedia.org/wiki/Bangladesh"));
        country.add(new Items("India", R.drawable.india,"https://en.wikipedia.org/wiki/India"));
        country.add(new Items("Sri Lanka", R.drawable.srilanka,"https://en.wikipedia.org/wiki/Sri_lanka"));
        country.add(new Items("Bhutan", R.drawable.bhutan,"https://en.wikipedia.org/wiki/Bhutan"));
        country.add(new Items("Maldive", R.drawable.maldives,"https://en.wikipedia.org/wiki/Maldives"));
        country.add(new Items("Pakistan", R.drawable.pakistan,"https://en.wikipedia.org/wiki/Pakistan"));
        country.add(new Items("Nepal", R.drawable.nepal,"https://en.wikipedia.org/wiki/Nepal"));
        country.add(new Items("United Kingdom", R.drawable.uk,"https://en.wikipedia.org/wiki/United_Kingdom"));
        country.add(new Items("Singapore", R.drawable.singapore,"https://en.wikipedia.org/wiki/Singapore"));
        country.add(new Items("Australia", R.drawable.australia,"https://en.wikipedia.org/wiki/Australia"));
        country.add(new Items("United State of America", R.drawable.usa,"https://en.wikipedia.org/wiki/United_States"));
        CustomGrid adapter=new CustomGrid(this,R.layout.grid_single,country);

        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
               //Toast.makeText(getApplicationContext(),country.get(position).countryName,Toast.LENGTH_SHORT).show();
                Items item = (Items) parent.getItemAtPosition(position);

                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("title", item.getCountryName());
                intent.putExtra("image", item.getCountryFlag());
                intent.putExtra("sites",item.getCountrySite());


                //Start details activity
                startActivity(intent);
            }
        });

    }
}
