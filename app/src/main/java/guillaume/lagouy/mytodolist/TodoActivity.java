package guillaume.lagouy.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by lagouyg on 15/01/2018.
 */
public class TodoActivity extends Activity implements View.OnClickListener{
    private Button btnValider;
    private Button btnVider;
    private TextView textView;
    private EditText editText;
    private ListView listViewItems;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        btnValider = (Button)findViewById(R.id.buttonValider);
        btnValider.setOnClickListener(this);

        btnVider = (Button)findViewById(R.id.buttonVider);
        btnVider.setOnClickListener(this);

        textView = (TextView)findViewById(R.id.textViewId);
        editText = (EditText)findViewById(R.id.editTextId);
        listViewItems = (ListView)findViewById(R.id.listViewItems);
    }
    @Override
    public void onClick(View v){
        if(v instanceof Button){
            Button b = (Button)v;
            if(b == btnValider){
                Toast.makeText(getApplicationContext(),"Validate", Toast.LENGTH_SHORT).show();
                String item_text = editText.getText().toString();
                ListItem.getElements().add(item_text);

            }
            else if(b == btnVider){
                Toast.makeText(getApplicationContext(),"Empty list", Toast.LENGTH_SHORT).show();
                textView.setText("");
            }
        }
    }
}
