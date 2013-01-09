package org.jingle.test.jmxremote.article;

import java.util.HashMap;

import javax.management.*;
import javax.management.remote.*;
import javax.management.remote.rmi.*;
import com.sun.jdmk.comm.*;
import com.sun.jndi.rmi.registry.*;

public class Server {
  protected MBeanServer mbeanServer = null;
  String serviceURL = "service:jmx:rmi:" +
  "//localhost/jndi/rmi://localhost:1099/test";
  public void run() {
    try {
    // create an MBean server
    	System.out.println(
    		      "create MBean server");
      mbeanServer = MBeanServerFactory.
                 createMBeanServer("test");
      
      
      
      // create JMXConnectorServer MBean
      System.out.println(
    	      "create JMXConnectorServer MBean");
      // Specify environment parameters for the behavior of the connector serve
      // in order to listen for RMI-based connections from remote clients
      HashMap<String, String> environment =
           new HashMap<String, String>();
      environment.put (
    		  "java.naming.factory.initial",
    		  RegistryContextFactory.class.getName()
      );
      environment.put (
    		  RMIConnectorServer.JNDI_REBIND_ATTRIBUTE, 
    		  "true"
      );
      // A connector server is attached to an MBean server. 
      // It listens for client connection requests and creates a connection for each one.
      // A connector server is associated with an MBean server either by registering it in that MBean server, or by passing the MBean server to its constructor.
      // In this case, our connector server <<connector>> is associated with an MBean server by passing the MBean server <<mbeanServer>> to its constructor.
      JMXConnectorServer connector =
        JMXConnectorServerFactory
        .newJMXConnectorServer (
            new JMXServiceURL(serviceURL),
            environment, 
            mbeanServer
        );
      // register the connector server as an MBean
      System.out.println("register the connector server as an MBean");
      mbeanServer.registerMBean(
    		  connector,
              new ObjectName("system:name=rmiconnector")
      );
      // A connector server is inactive when created. 
      // It only starts listening for client connections when the start method is called.
      // start the connector server
      System.out.println("start the connector server");
      connector.start();
      
      
      // create HtmlAdapterServer MBean
      System.out.println(
    	      "start the connector server");
      HtmlAdaptorServer adapter =
          new HtmlAdaptorServer();
      
      // register the adapter server as an MBean
      mbeanServer.registerMBean(
    		  adapter, 
    		  new ObjectName("system:name=http")
      );
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