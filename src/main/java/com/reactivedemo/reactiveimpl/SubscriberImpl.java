package com.reactivedemo.reactiveimpl;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class SubscriberImpl implements Subscriber<String> {

	Subscription subscription;
	
	@Override
	public void onSubscribe(Subscription s) {
		System.out.println("onsubcriber method called");
		this.subscription=s;
		s.request(10);

	}

	@Override
	public void onNext(String t) {
		System.out.println(t);

	}

	@Override
	public void onError(Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onComplete() {
		System.out.println("on complete method called");

	}

	public Subscription getSubscription() {
		return subscription;
	}

	

}
