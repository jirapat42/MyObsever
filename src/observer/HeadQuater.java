/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author sarun
 */
public class HeadQuater extends Observable  {
    private final ArrayList<Observable> list;
    private int someData;

    public HeadQuater() {
        this.list = new ArrayList<Observable>();
    }
    public void setSomeData(int aData) {
	someData = aData;
        setChanged();
	notifyObservers();
    }
    public int getSomeData() {
	return someData;
    }
    
    public void register (Observable observer) {
        list.add(observer);
    }
     
   public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
    
}
