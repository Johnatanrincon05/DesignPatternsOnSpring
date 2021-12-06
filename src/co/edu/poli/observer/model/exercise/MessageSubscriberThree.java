package co.edu.poli.observer.model.exercise;

public class MessageSubscriberThree implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}