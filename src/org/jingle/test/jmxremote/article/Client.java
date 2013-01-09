package org.jingle.test.jmxremote.article;

import java.io.IOException;
import java.util.HashMap;
import javax.management.*;
import javax.management.remote.*;

import com.sun.jndi.rmi.registry.*;

public class Client {
  String serviceURL =
    "service:jmx:rmi:" +
    "//localhost/jndi/rmi://localhost:1099/test";

  protected MBeanServerConnection conn = null;
  final String SERVER_DELEGATE = "JMImplementation:type=MBeanServerDelegate";


  public void run() {
    try {
      JMXConnector connector = JMXConnectorFactory.connect(new JMXServiceURL(serviceURL));
      conn = connector.getMBeanServerConnection();
      doOper();
      synchronized (this) {
        this.wait();
      }
      connector.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected void doOper() {
    try {
      System.out.println("MBean count = " +
          conn.getMBeanCount());
    } catch (IOException e) {
      e.printStackTrace();
    }
    try {
		ObjectName bean = new ObjectName(SERVER_DELEGATE);
		MBeanInfo info = conn.getMBeanInfo(bean);
		info.g
	} catch (MalformedObjectNameException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NullPointerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  public static void main(String[] args) {
    new Client().run();
  }
}
