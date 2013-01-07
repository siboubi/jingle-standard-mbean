package org.jingle.test.jmxremote.article;

import java.util.HashMap;

import javax.management.*;
import javax.management.remote.*;
import javax.management.remote.rmi.*;
import com.sun.jdmk.comm.*;
import com.sun.jndi.rmi.registry.*;

public class Server {
  protected MBeanServer server = null;
  String serviceURL = "service:jmx:rmi:" +
  "//localhost/jndi/rmi://localhost:1099/test";
  public void run() {
    try {
    // create MBean server
    	System.out.println(
    		      "create MBean server");
      server = MBeanServerFactory.
                 createMBeanServer("test");
      
      
      
      // create JMXConnectorServer MBean
      System.out.println(
    	      "create JMXConnectorServer MBean");
      HashMap<String, String> map =
           new HashMap<String, String>();
      map.put (
    		  "java.naming.factory.initial",
    		  RegistryContextFactory.class.getName()
      );
      map.put (
    		  RMIConnectorServer.JNDI_REBIND_ATTRIBUTE, 
    		  "true"
      );
      
      JMXConnectorServer connector =
        JMXConnectorServerFactory
        .newJMXConnectorServer (
            new JMXServiceURL(serviceURL),
            map, 
            server
        );
      // register the connector server as an MBean
      System.out.println("register the connector server as an MBean");
      server.registerMBean(
    		  connector,
              new ObjectName("system:name=rmiconnector")
      );
      // start the connector server
      System.out.println("start the connector server");
      connector.start();
      
      
      // create HtmlAdapterServer MBean
      System.out.println(
    	      "start the connector server");
      HtmlAdaptorServer adapter =
          new HtmlAdaptorServer();
      
      ObjectName httpName =
          new ObjectName("system:name=http");
      // register the adapter server as an MBean
      server.registerMBean(adapter, httpName);
      // start the adaptor server
      adapter.setPort(9293);
      adapter.start();
      
      
      doOper();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  protected void doOper() {
    System.out.println(
      "Server is ready to serve");
  }
  public static void main(String[] args) {
	  System.out.println(
		      "Server is starting ...");
    new Server().run();
  }
}