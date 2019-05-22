package com.javadesignpattern.creational.abstractfactory.gcp;

import com.javadesignpattern.creational.abstractfactory.Instance;
import com.javadesignpattern.creational.abstractfactory.Instance.Capacity;
import com.javadesignpattern.creational.abstractfactory.ResourceFactory;
import com.javadesignpattern.creational.abstractfactory.Storage;

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
