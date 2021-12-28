package interfaceex;

import java.util.ArrayList;

class Shelf {
    protected ArrayList<String> shelf;

    public Shelf(){
        shelf = new ArrayList<String>();
    }
    public ArrayList<String> getShelf(){
        return shelf;
    }
    public int getCount(){
        return shelf.size();
    }
}
