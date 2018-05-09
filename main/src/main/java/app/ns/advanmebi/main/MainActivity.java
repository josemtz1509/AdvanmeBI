package app.ns.advanmebi.main;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
                Intent intent = new Intent(MainActivity.this,DownloadActivity.class);
                startActivity(intent);

            }
        });
        Init();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Init(){
        try{
            LineChart chart = findViewById(R.id.chart);
            List<Entry> entries = new ArrayList<>();
            entries.add(new Entry(5f, 1));
            entries.add(new Entry(8f, 2));
            entries.add(new Entry(9f, 3));
            LineDataSet dataSet = new LineDataSet(entries, "# of Calls"); // add entries to dataset

//            ArrayList<String> labels = new ArrayList<>();
//            labels.add("January");
//            labels.add("Febrary");
//            labels.add("March");
//            labels.add("April");
//            labels.add("May");
//            labels.add("June");

            //dataSet.setColor(R.color.blue);
            //dataSet.setValueTextColor(R.color.primaryText);

            LineData lineData = new LineData(dataSet);
            chart.setData(lineData);
            Description description = new Description();
            description.setText("TEST");
            chart.setDescription(description);

        }catch (Exception ex){
            String message = ex.getMessage();
            ex.printStackTrace();
        }

    }


}
