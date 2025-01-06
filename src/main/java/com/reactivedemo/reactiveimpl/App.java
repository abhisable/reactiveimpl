package com.reactivedemo.reactiveimpl;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;


public class App 
{
    public static void main( String[] args )
    {
        Publisher<String> publisher=new PublisherImpl();
        SubscriberImpl subscriber=new SubscriberImpl();
        publisher.subscribe(subscriber);
        
       subscriber.getSubscription().request(5);
    }
}
