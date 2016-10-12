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

    public void printVegatarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try{
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e){}
        }
    }
}
