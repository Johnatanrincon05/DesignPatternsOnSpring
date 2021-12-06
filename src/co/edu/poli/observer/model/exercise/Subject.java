package co.edu.poli.observer.model.exercise;

import java.util.ArrayList;
import java.util.List;
 
public class Subject{
     
    private List<Observer> observers = new ArrayList<>();
 
    private int state;
    
    public void attach(Observer o) {
        observers.add(o);
    }
 
    public void detach(Observer o) {
        observers.remove(o);
    }
 
    public void notifyUpdate(Message m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
