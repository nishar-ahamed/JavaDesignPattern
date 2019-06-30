package com.javadesignpatterns.creational.abstractfactory.gcp;

import com.javadesignpatterns.creational.abstractfactory.Instance;
import com.javadesignpatterns.creational.abstractfactory.Instance.Capacity;
import com.javadesignpatterns.creational.abstractfactory.ResourceFactory;
import com.javadesignpatterns.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
