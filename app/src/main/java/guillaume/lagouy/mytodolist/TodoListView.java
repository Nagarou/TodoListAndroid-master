package guillaume.lagouy.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by lagouyg on 15/01/2018.
 */
public class TodoListView extends Activity implements AdapterView.OnItemClickListener{
    private ListView lvMyListView;
    private String[] listitems = ListItem.getElements().toArray(new String[0]);
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        lvMyListView = (ListView)findViewById(R.id.listViewItems);
        lvMyListView.setAdapter(new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1, listitems));
        lvMyListView.setOnClickListener(this);
    }

}
