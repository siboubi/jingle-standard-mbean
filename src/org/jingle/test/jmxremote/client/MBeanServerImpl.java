/**
 * 
 */
package org.jingle.test.jmxremote.client;

import java.io.ObjectInputStream;
import java.util.Set;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.AttributeNotFoundException;
import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import javax.management.IntrospectionException;
import javax.management.InvalidAttributeValueException;
import javax.management.ListenerNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MBeanServerConnection;
import javax.management.NotCompliantMBeanException;
import javax.management.Notification;
import javax.management.NotificationFilter;
import javax.management.NotificationListener;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
import javax.management.OperationsException;
import javax.management.QueryExp;
import javax.management.ReflectionException;
import javax.management.loading.ClassLoaderRepository;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

/**
 * @author siboubib
 *
 */
public class MBeanServerImpl implements MBeanServer, NotificationListener {
	   // Constants ------------------------------------------------------

	   /**
	    * No parameters array
	    */
	   private static final Object[] NOPARAMS = new Object[0];

	   /**
	    * No signature array
	    */
	   private static final String[] NOSIG = new String[0];

	   // Attributes ----------------------------------------------------

	/**
	 * 
	 */
	public MBeanServerImpl(MBeanServerConnection connection) {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see javax.management.NotificationListener#handleNotification(javax.management.Notification, java.lang.Object)
	 */
	@Override
	public void handleNotification(Notification notification, Object handback) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * 
	 * Adds a listener to a registered MBean.
	 *
	 * A notification emitted by the MBean will be forwarded by the MBeanServer to the listener.
	 * If the source of the notification is a reference to the MBean object, the MBean server will replace
	 * it by the MBean's ObjectName. Otherwise the source is unchanged.
	 * 
	 *     Specified by:
	 *         addNotificationListener in interface MBeanServer
	 * 
	 *     Parameters:
	 *         name - The name of the MBean on which the listener should be added.
	 *         listener - The listener object which will handle the notifications emitted by the registered MBean.
	 *         filter - The filter object. If filter is null, no filtering will be performed before handling notifications.
	 *         handback - The context to be sent to the listener when a notification is emitted. 
	 *     Throws:
	 *         InstanceNotFoundException - The MBean name provided does not match any of the registered MBeans.
	 * 
	 * 
	 * @see javax.management.MBeanServer#addNotificationListener(javax.management.ObjectName, javax.management.NotificationListener, javax.management.NotificationFilter, java.lang.Object)
	 */
	@Override
	public void addNotificationListener(ObjectName name, NotificationListener listener,
			NotificationFilter filter, Object handback)
			throws InstanceNotFoundException {
		MBenEntry entry = registry.get(name);

	}

	/* (non-Javadoc)
	 * 
	 * Adds a listener to a registered MBean.
	 *
	 * A notification emitted by the MBean will be forwarded by the MBeanServer to the listener.
	 * If the source of the notification is a reference to the MBean object, the MBean server will replace
	 * it by the MBean's ObjectName. Otherwise the source is unchanged.
	 *
	 * The listener object that receives notifications is the one that is registered with the given name at the time this
	 * method is called. Even if it is subsequently unregistered, it will continue to receive notifications.
	 * 
	 *     Specified by:
	 *         addNotificationListener in interface MBeanServer
	 * 
	 *     Parameters:
	 *         name - The name of the MBean on which the listener should be added.
	 *         listener - The object name of the listener object which will handle the notifications emitted by the registered MBean.
	 *         filter - The filter object. If filter is null, no filtering will be performed before handling notifications.
	 *         handback - The context to be sent to the listener when a notification is emitted. 
	 *     Throws:
	 *         InstanceNotFoundException - The MBean name provided does not match any of the registered MBeans.
	 * 
	 * 
	 * @see javax.management.MBeanServer#addNotificationListener(javax.management.ObjectName, javax.management.ObjectName, javax.management.NotificationFilter, java.lang.Object)
	 */
	@Override
	public void addNotificationListener(ObjectName name, ObjectName listener,
			NotificationFilter filter, Object handback)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#createMBean(java.lang.String, javax.management.ObjectName)
	 */
	@Override
	public ObjectInstance createMBean(String className, ObjectName name)
			throws ReflectionException, InstanceAlreadyExistsException,
			MBeanRegistrationException, MBeanException,
			NotCompliantMBeanException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#createMBean(java.lang.String, javax.management.ObjectName, javax.management.ObjectName)
	 */
	@Override
	public ObjectInstance createMBean(String className, ObjectName name,
			ObjectName loaderName) throws ReflectionException,
			InstanceAlreadyExistsException, MBeanRegistrationException,
			MBeanException, NotCompliantMBeanException,
			InstanceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#createMBean(java.lang.String, javax.management.ObjectName, java.lang.Object[], java.lang.String[])
	 */
	@Override
	public ObjectInstance createMBean(String className, ObjectName name,
			Object[] params, String[] signature) throws ReflectionException,
			InstanceAlreadyExistsException, MBeanRegistrationException,
			MBeanException, NotCompliantMBeanException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#createMBean(java.lang.String, javax.management.ObjectName, javax.management.ObjectName, java.lang.Object[], java.lang.String[])
	 */
	@Override
	public ObjectInstance createMBean(String className, ObjectName name,
			ObjectName loaderName, Object[] params, String[] signature)
			throws ReflectionException, InstanceAlreadyExistsException,
			MBeanRegistrationException, MBeanException,
			NotCompliantMBeanException, InstanceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#deserialize(javax.management.ObjectName, byte[])
	 */
	@Override
	@Deprecated
	public ObjectInputStream deserialize(ObjectName name, byte[] data)
			throws InstanceNotFoundException, OperationsException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#deserialize(java.lang.String, byte[])
	 */
	@Override
	@Deprecated
	public ObjectInputStream deserialize(String className, byte[] data)
			throws OperationsException, ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#deserialize(java.lang.String, javax.management.ObjectName, byte[])
	 */
	@Override
	@Deprecated
	public ObjectInputStream deserialize(String className, ObjectName loaderName,
			byte[] data) throws InstanceNotFoundException, OperationsException,
			ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getAttribute(javax.management.ObjectName, java.lang.String)
	 */
	@Override
	public Object getAttribute(ObjectName name, String attribute)
			throws MBeanException, AttributeNotFoundException,
			InstanceNotFoundException, ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getAttributes(javax.management.ObjectName, java.lang.String[])
	 */
	@Override
	public AttributeList getAttributes(ObjectName name, String[] attributes)
			throws InstanceNotFoundException, ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getClassLoader(javax.management.ObjectName)
	 */
	@Override
	public ClassLoader getClassLoader(ObjectName name)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getClassLoaderFor(javax.management.ObjectName)
	 */
	@Override
	public ClassLoader getClassLoaderFor(ObjectName name)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getClassLoaderRepository()
	 */
	@Override
	public ClassLoaderRepository getClassLoaderRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getDefaultDomain()
	 */
	@Override
	public String getDefaultDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getDomains()
	 */
	@Override
	public String[] getDomains() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getMBeanCount()
	 */
	@Override
	public Integer getMBeanCount() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getMBeanInfo(javax.management.ObjectName)
	 */
	@Override
	public MBeanInfo getMBeanInfo(ObjectName name)
			throws InstanceNotFoundException, IntrospectionException,
			ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getObjectInstance(javax.management.ObjectName)
	 */
	@Override
	public ObjectInstance getObjectInstance(ObjectName name)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#instantiate(java.lang.String)
	 */
	@Override
	public Object instantiate(String className) throws ReflectionException,
			MBeanException {
		try {
			return instantiate(className, (ObjectName)null, NOPARAMS, NOSIG);
		} catch (InstanceNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#instantiate(java.lang.String, javax.management.ObjectName)
	 */
	@Override
	public Object instantiate(String className, ObjectName loaderName)
			throws ReflectionException, MBeanException,
			InstanceNotFoundException {
		// TODO Auto-generated method stub
		return instantiate(className, (ObjectName)null, NOPARAMS, NOSIG);
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#instantiate(java.lang.String, java.lang.Object[], java.lang.String[])
	 */
	@Override
	public Object instantiate(String className, Object[] params, String[] signature)
			throws ReflectionException, MBeanException {
		try {
			return instantiate(className, (ObjectName)null, params, signature);
		} catch (InstanceNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#instantiate(java.lang.String, javax.management.ObjectName, java.lang.Object[], java.lang.String[])
	 */
	@Override
	public Object instantiate(String className, ObjectName loaderName, Object[] params,
			String[] signature) throws ReflectionException, MBeanException,
			InstanceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#invoke(javax.management.ObjectName, java.lang.String, java.lang.Object[], java.lang.String[])
	 */
	@Override
	public Object invoke(ObjectName name, String operationName, Object[] params,
			String[] signature) throws InstanceNotFoundException, MBeanException,
			ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#isInstanceOf(javax.management.ObjectName, java.lang.String)
	 */
	@Override
	public boolean isInstanceOf(ObjectName name, String className)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#isRegistered(javax.management.ObjectName)
	 */
	@Override
	public boolean isRegistered(ObjectName name) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#queryMBeans(javax.management.ObjectName, javax.management.QueryExp)
	 */
	@Override
	public Set<ObjectInstance> queryMBeans(ObjectName arg0, QueryExp arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#queryNames(javax.management.ObjectName, javax.management.QueryExp)
	 */
	@Override
	public Set<ObjectName> queryNames(ObjectName arg0, QueryExp arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#registerMBean(java.lang.Object, javax.management.ObjectName)
	 */
	@Override
	public ObjectInstance registerMBean(Object inst, ObjectName name)
			throws InstanceAlreadyExistsException, MBeanRegistrationException,
			NotCompliantMBeanException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * 
     * Removes a listener from a registered MBean.
     *
     * If the listener is registered more than once, perhaps with different filters or callbacks,
     * this method will remove all those registrations.
	 * @see javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName, javax.management.ObjectName)
	 */
	@Override
	public void removeNotificationListener(ObjectName name, ObjectName listener)
			throws InstanceNotFoundException, ListenerNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * 
     * Removes a listener from a registered MBean.
     *
     * If the listener is registered more than once, perhaps with different filters or callbacks,
     * this method will remove all those registrations.
	 * @see javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName, javax.management.NotificationListener)
	 */
	@Override
	public void removeNotificationListener(ObjectName name,
			NotificationListener listener) throws InstanceNotFoundException,
			ListenerNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
     * Removes a listener from a registered MBean.
     *
     * The MBean must have a listener that exactly matches the given listener, filter, and handback parameters.
     * If there is more than one such listener, only one is removed.
     *
     * The filter and handback parameters may be null if and only if they are null in a listener to be removed.
	 * @see javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName, javax.management.ObjectName, javax.management.NotificationFilter, java.lang.Object)
	 */
	@Override
	public void removeNotificationListener(ObjectName name, ObjectName listener,
			NotificationFilter filter, Object handback)
			throws InstanceNotFoundException, ListenerNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
     * Removes a listener from a registered MBean.
     *
     * The MBean must have a listener that exactly matches the given listener, filter, and handback parameters.
     * If there is more than one such listener, only one is removed.
     *
     * The filter and handback parameters may be null if and only if they are null in a listener to be removed.
	 * @see javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName, javax.management.NotificationListener, javax.management.NotificationFilter, java.lang.Object)
	 */
	@Override
	public void removeNotificationListener(ObjectName name,
			NotificationListener listener, NotificationFilter filter, Object handback)
			throws InstanceNotFoundException, ListenerNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#setAttribute(javax.management.ObjectName, javax.management.Attribute)
	 */
	@Override
	public void setAttribute(ObjectName name, Attribute attribute)
			throws InstanceNotFoundException, AttributeNotFoundException,
			InvalidAttributeValueException, MBeanException, ReflectionException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#setAttributes(javax.management.ObjectName, javax.management.AttributeList)
	 */
	@Override
	public AttributeList setAttributes(ObjectName name, AttributeList attributes)
			throws InstanceNotFoundException, ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#unregisterMBean(javax.management.ObjectName)
	 */
	@Override
	public void unregisterMBean(ObjectName name)
			throws InstanceNotFoundException, MBeanRegistrationException {
		// TODO Auto-generated method stub

	}

}
