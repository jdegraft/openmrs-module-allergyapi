/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.allergyapi.api;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.openmrs.api.context.Context;
import org.openmrs.test.BaseModuleContextSensitiveTest;

/**
 * Tests allergy methods in {@link ${PatientService}}.
 */
public class  AllergyServiceTest extends BaseModuleContextSensitiveTest {
	
	private static final String ALLERGY_TEST_DATASET = "allergyTestDataset.xml";

	private PatientService patientService;
	
	@Before
	public void runBeforeAllTests() throws Exception {
		if (patientService == null) {
			patientService = Context.getService(PatientService.class);
		}
		executeDataSet(ALLERGY_TEST_DATASET);
	}
	
	@Test
	public void shouldSetupContext() {
		assertNotNull(Context.getService(PatientService.class));
	}
}
