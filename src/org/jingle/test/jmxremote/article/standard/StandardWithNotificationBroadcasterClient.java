/**
 * 
 */
package org.jingle.test.jmxremote.article.standard;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import org.jingle.test.jmxremote.article.Client;
import org.jingle.test.jmxremote.client.MBeanServerImpl;

/**
 * The StandardWithNotificationBroadcasterClient is used to register the StandardWithNotificationBroadcaster MBean to the remote MBean server.
 * @author siboubib
 *
 */
public class StandardWithNotificationBroadcasterClient extends Client {
	@Override
	protected void doOper() {
		MBeanServer server = new MBeanServerImpl(conn);
		Standard mbean = new StandardWithNotificationBroadcaster();
		try {
			server.registerMBean(mbean, new ObjectName("sample:name=standard mbean"));
		} catch (InstanceAlreadyExistsException e) {
			e.printStackTrace();
		} catch (MBeanRegistrationException e) {
			e.printStackTrace();
		} catch (NotCompliantMBeanException e) {
			e.printStackTrace();
		} catch (MalformedObjectNameException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new StandardWithNotificationBroadcasterClient().run();
	}

}
