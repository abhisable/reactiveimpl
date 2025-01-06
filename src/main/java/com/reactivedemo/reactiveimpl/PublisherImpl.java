package com.reactivedemo.reactiveimpl;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class PublisherImpl implements Publisher<String> {

	@Override
	public void subscribe(Subscriber<? super String> s) {
		Subscription subcription=new SubscriptionImpl(s);
		s.onSubscribe(subcription);
		
	}

	

}
