package org.poc.bb.child1;
import org.junit.Assert;
import org.junit.Test;
public class SampleBB1Test {

	@Test
	public void testMultiply(){
		SampleBB1 obj1 = new SampleBB1();
		int actual = obj1.multiple(4, 5);
		Assert.assertEquals(20, actual);
	}
}
