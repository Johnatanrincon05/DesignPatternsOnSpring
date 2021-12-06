package co.edu.poli.observer.model.exercise;

public class MessageSubscriberTwo implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}