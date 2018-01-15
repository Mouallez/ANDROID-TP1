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

/**
 * Created by gayale on 15/01/2018.
 */
public class TodoActivity extends Activity implements View.OnClickListener {

    private Button btnValider, btnClear;
    private EditText editTextTache;

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
        if(v.getId() == btnValider.getId()) {
            EditText edit = (EditText) findViewById(R.id.inputText);
            TextView view = (TextView) findViewById(R.id.listView);
            view.setText(edit.getText().toString());
        }
        if(v.getId() == btnClear.getId()) {

        }
    }
}