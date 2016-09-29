package jUnit;

import org.junit.Test;

import junit.framework.Assert;
import patronesDeDise�o.Singleton;

public class SingletonTests {

	@Test
	public void singletonTest(){
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Assert.assertSame(singleton, singleton2);
	}
}
