package pattern_builder;

import pattern_builder.component.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 12.10.2016.
 */
public class Menu extends MenuComponent {
    Iterator iterator = null;
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Iterator createIterator(){
        if(iterator == null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return  iterator;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print(){
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
