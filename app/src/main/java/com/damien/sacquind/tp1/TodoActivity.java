package com.damien.sacquind.tp1;

        import android.app.Activity;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.ArrayList;

/**
 * Created by gayale on 15/01/2018.
 */
public class TodoActivity extends Activity implements View.OnClickListener {

    private Button btnValider, btnClear;
    private ArrayList<String> listItems = new ArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);

        btnValider = (Button)findViewById(R.id.btnValider);
        btnClear = (Button)findViewById(R.id.emptybutton);

        btnValider.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnValider) {
            EditText edit = (EditText) findViewById(R.id.inputText);
            TextView view = (TextView) findViewById(R.id.listView);
            lvlistView = (ListView)findViewById(R.id.lvListView);
            lvlistView.setAdapter(new ArrayAdapter(getApplicationContext(),
                    android.R.layout.simple_list_item_1, listItems));
        }
        else {
        }
    }
}