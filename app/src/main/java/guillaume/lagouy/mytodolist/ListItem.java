package guillaume.lagouy.mytodolist;

import java.util.ArrayList;

/**
 * Created by lagouyg on 15/01/2018.
 */
public final class ListItem {
    private static volatile ListItem instance = null;

    private static ArrayList<String> elements = new ArrayList<>();

    //pas touché !!!
    private ListItem(){
        super();
    }
    public final static ListItem getInstance(){
        if(ListItem.instance == null){
            synchronized (ListItem.class){
                if(ListItem.instance == null){
                    ListItem.instance = new ListItem();
                }
            }
        }
        return ListItem.instance;
    }

    public static ArrayList<String> getElements(){
     return ListItem.elements;
    }
}
