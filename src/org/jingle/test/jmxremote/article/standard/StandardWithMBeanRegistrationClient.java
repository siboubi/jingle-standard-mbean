/**
 * 
 */
package org.jingle.test.jmxremote.article.standard;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.jingle.test.jmxremote.article.Client;
import org.jingle.test.jmxremote.client.MBeanServerImpl;

/**
 * Run StandardWithMBeanRegistrationClient, and you will find that the MBean name is standard mbean with mbean registration.
 * @author siboubib
 *
 */
public class StandardWithMBeanRegistrationClient extends Client {
	@Override
	protected void doOper() {
		try {
			MBeanServer server = new MBeanServerImpl(conn);
			Standard mbean = new StandardWithMBeanRegistration();
			server.registerMBean(mbean, new ObjectName("sample:name=standard MBean"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new StandardWithMBeanRegistrationClient().run();
	}

}
