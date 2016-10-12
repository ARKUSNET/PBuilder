package pattern_builder;
import pattern_builder.component.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by a.kuspakov on 11.10.2016.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
       allMenus.print();
    }
}
