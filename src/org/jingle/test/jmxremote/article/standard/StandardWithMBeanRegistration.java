/**
 * 
 */
package org.jingle.test.jmxremote.article.standard;

import javax.management.MBeanRegistration;
import javax.management.MBeanServer;
import javax.management.ObjectName;

/**
 * StandardWithMBeanRegistration implements the MBeanRegistration interface to change the MBean name before registration.
 * @author siboubib
 *
 */
public class StandardWithMBeanRegistration extends Standard implements
		MBeanRegistration {

	/* (non-Javadoc)
	 * @see javax.management.MBeanRegistration#postDeregister()
	 */
	@Override
	public void postDeregister() {
		System.out.println("Deregister...");
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanRegistration#postRegister(java.lang.Boolean)
	 */
	@Override
	public void postRegister(Boolean registrationDone) {
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanRegistration#preDeregister()
	 */
	@Override
	public void preDeregister() throws Exception {
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanRegistration#preRegister(javax.management.MBeanServer, javax.management.ObjectName)
	 */
	@Override
	public ObjectName preRegister(MBeanServer server, ObjectName name)
			throws Exception {
		return new ObjectName("sample:name="+"standard mbean with mbean registration");
	}

}
