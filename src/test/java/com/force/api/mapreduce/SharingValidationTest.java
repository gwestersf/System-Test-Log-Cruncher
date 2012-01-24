package com.force.api.mapreduce;

import org.junit.Test;

/**
 * 
 * @author gregoryw
 *
 */
public class SharingValidationTest {

	@Test
	public void testSharingValidation() throws Exception {
		SharingValidation test = new SharingValidation();
		test.run("data/clientlog.txt", "data/dmllog.txt", "sharingresult.txt");
	}
}
