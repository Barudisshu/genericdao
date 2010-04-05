/**
 * $Id$
 * $URL$
 * GenericDaoTest.java - genericdao - Apr 25, 2008 5:28:03 PM - azeckoski
 **************************************************************************
 * Copyright (c) 2008 Aaron Zeckoski
 * Licensed under the Apache License, Version 2
 * 
 * A copy of the Apache License, Version 2 has been included in this 
 * distribution and is available at: http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * Aaron Zeckoski (azeckoski@gmail.com) (aaronz@vt.edu) (aaron@caret.cam.ac.uk)
 */

package org.sakaiproject.genericdao.springjdbc;

import org.sakaiproject.genericdao.test.AbstractTestGenericDao;

/**
 * Testing the {@link org.sakaiproject.genericdao.api.GenericDao}
 * 
 * @author Aaron Zeckoski (aaronz@vt.edu)
 */
public class GenericDaoTest extends AbstractTestGenericDao {

	@Override
	protected String[] getConfigLocations() {
		// point to the spring-*.xml file, must be on the classpath
		// (add component/src/webapp/WEB-INF to the build path in Eclipse)
		return new String[] {"spring-common.xml","spring-jdbc.xml"};
	}

	// TODO test the jdbc specific stuff

}
