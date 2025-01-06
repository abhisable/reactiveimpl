package com.reactivedemo.reactiveimpl;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import com.github.javafaker.Faker;

public class SubscriptionImpl implements Subscription {

	Subscriber<? super String> subcriber;
	Faker faker;
	boolean cancel;

	public SubscriptionImpl(Subscriber<? super String> s) {
		super();
		this.subcriber = s;
		this.faker = new Faker();
	}

	@Override
	public void request(long n) {

		if (cancel == true)
			return;

		for (int i = 0; i < n; i++) {

			subcriber.onNext(faker.name().firstName() + " " + faker.name().lastName());

		}
		
		

	}

	@Override
	public void cancel() {
		this.cancel = true;

	}

}
