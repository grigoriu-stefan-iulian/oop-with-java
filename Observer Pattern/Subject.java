// Observer Pattern

/*
A design pattern in which an object, called the subject, mantains a list of its dependencies, 
called observers and notifies them automatically of any state changes, usually by calling 
one of their methods.
*/ 

// This interface handles adding, deleting and updating
// all observers 

public interface Subject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
	
}