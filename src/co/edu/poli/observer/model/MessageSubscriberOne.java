package co.edu.poli.observer.model;

public class MessageSubscriberOne implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}
