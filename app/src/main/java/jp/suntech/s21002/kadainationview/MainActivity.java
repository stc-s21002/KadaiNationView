package jp.suntech.s21002.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView printlist = findViewById(R.id.COULIST);
        printlist.setOnItemClickListener(new ListItemClickListener());
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String item = (String) adapterView.getItemAtPosition(i);
            String show = item;
            Toast.makeText(MainActivity.this, show, Toast.LENGTH_SHORT).show();

            TextView output = findViewById(R.id.ANSTEXT);
            output.setText(show);
        }
    }
}