package co.edu.poli.observer.model.exercise;

public class Client {

    public static void main(String[] args) 
    {
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();
         
        Subject p = new Subject();
         
        p.attach(s1);
        p.attach(s2);
         
        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update
         
        p.detach(s1);
        p.attach(s3);
         
        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}