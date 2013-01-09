/**
 * 
 */
package org.jingle.test.jmxremote.article.standard;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.jingle.test.jmxremote.article.Client;
import org.jingle.test.jmxremote.client.MBeanServerImpl;

/**
 * @author siboubib
 *
 */
public class StandardClient extends Client {
	
	@Override
	protected void doOper() {
	    try {
	      MBeanServer server =
	                       new MBeanServerImpl(conn);
	      Standard mbean = new Standard();
	      server.registerMBean(mbean, new ObjectName(
	                  "sample:name=standard mbean"));
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    new StandardClient().run();

	}

}
