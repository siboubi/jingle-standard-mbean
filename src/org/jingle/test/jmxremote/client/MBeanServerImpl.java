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

/**
 * @author siboubib
 *
 */
public class MBeanServerImpl implements MBeanServer, NotificationListener {

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
	 * @see javax.management.MBeanServer#addNotificationListener(javax.management.ObjectName, javax.management.NotificationListener, javax.management.NotificationFilter, java.lang.Object)
	 */
	@Override
	public void addNotificationListener(ObjectName arg0,
			NotificationListener arg1, NotificationFilter arg2, Object arg3)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#addNotificationListener(javax.management.ObjectName, javax.management.ObjectName, javax.management.NotificationFilter, java.lang.Object)
	 */
	@Override
	public void addNotificationListener(ObjectName arg0, ObjectName arg1,
			NotificationFilter arg2, Object arg3)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#createMBean(java.lang.String, javax.management.ObjectName)
	 */
	@Override
	public ObjectInstance createMBean(String arg0, ObjectName arg1)
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
	public ObjectInstance createMBean(String arg0, ObjectName arg1,
			ObjectName arg2) throws ReflectionException,
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
	public ObjectInstance createMBean(String arg0, ObjectName arg1,
			Object[] arg2, String[] arg3) throws ReflectionException,
			InstanceAlreadyExistsException, MBeanRegistrationException,
			MBeanException, NotCompliantMBeanException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#createMBean(java.lang.String, javax.management.ObjectName, javax.management.ObjectName, java.lang.Object[], java.lang.String[])
	 */
	@Override
	public ObjectInstance createMBean(String arg0, ObjectName arg1,
			ObjectName arg2, Object[] arg3, String[] arg4)
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
	public ObjectInputStream deserialize(ObjectName arg0, byte[] arg1)
			throws InstanceNotFoundException, OperationsException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#deserialize(java.lang.String, byte[])
	 */
	@Override
	@Deprecated
	public ObjectInputStream deserialize(String arg0, byte[] arg1)
			throws OperationsException, ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#deserialize(java.lang.String, javax.management.ObjectName, byte[])
	 */
	@Override
	@Deprecated
	public ObjectInputStream deserialize(String arg0, ObjectName arg1,
			byte[] arg2) throws InstanceNotFoundException, OperationsException,
			ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getAttribute(javax.management.ObjectName, java.lang.String)
	 */
	@Override
	public Object getAttribute(ObjectName arg0, String arg1)
			throws MBeanException, AttributeNotFoundException,
			InstanceNotFoundException, ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getAttributes(javax.management.ObjectName, java.lang.String[])
	 */
	@Override
	public AttributeList getAttributes(ObjectName arg0, String[] arg1)
			throws InstanceNotFoundException, ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getClassLoader(javax.management.ObjectName)
	 */
	@Override
	public ClassLoader getClassLoader(ObjectName arg0)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getClassLoaderFor(javax.management.ObjectName)
	 */
	@Override
	public ClassLoader getClassLoaderFor(ObjectName arg0)
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
	public MBeanInfo getMBeanInfo(ObjectName arg0)
			throws InstanceNotFoundException, IntrospectionException,
			ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#getObjectInstance(javax.management.ObjectName)
	 */
	@Override
	public ObjectInstance getObjectInstance(ObjectName arg0)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#instantiate(java.lang.String)
	 */
	@Override
	public Object instantiate(String arg0) throws ReflectionException,
			MBeanException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#instantiate(java.lang.String, javax.management.ObjectName)
	 */
	@Override
	public Object instantiate(String arg0, ObjectName arg1)
			throws ReflectionException, MBeanException,
			InstanceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#instantiate(java.lang.String, java.lang.Object[], java.lang.String[])
	 */
	@Override
	public Object instantiate(String arg0, Object[] arg1, String[] arg2)
			throws ReflectionException, MBeanException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#instantiate(java.lang.String, javax.management.ObjectName, java.lang.Object[], java.lang.String[])
	 */
	@Override
	public Object instantiate(String arg0, ObjectName arg1, Object[] arg2,
			String[] arg3) throws ReflectionException, MBeanException,
			InstanceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#invoke(javax.management.ObjectName, java.lang.String, java.lang.Object[], java.lang.String[])
	 */
	@Override
	public Object invoke(ObjectName arg0, String arg1, Object[] arg2,
			String[] arg3) throws InstanceNotFoundException, MBeanException,
			ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#isInstanceOf(javax.management.ObjectName, java.lang.String)
	 */
	@Override
	public boolean isInstanceOf(ObjectName arg0, String arg1)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#isRegistered(javax.management.ObjectName)
	 */
	@Override
	public boolean isRegistered(ObjectName arg0) {
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
	 * @see javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName, javax.management.ObjectName)
	 */
	@Override
	public void removeNotificationListener(ObjectName arg0, ObjectName arg1)
			throws InstanceNotFoundException, ListenerNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName, javax.management.NotificationListener)
	 */
	@Override
	public void removeNotificationListener(ObjectName arg0,
			NotificationListener arg1) throws InstanceNotFoundException,
			ListenerNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName, javax.management.ObjectName, javax.management.NotificationFilter, java.lang.Object)
	 */
	@Override
	public void removeNotificationListener(ObjectName arg0, ObjectName arg1,
			NotificationFilter arg2, Object arg3)
			throws InstanceNotFoundException, ListenerNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName, javax.management.NotificationListener, javax.management.NotificationFilter, java.lang.Object)
	 */
	@Override
	public void removeNotificationListener(ObjectName arg0,
			NotificationListener arg1, NotificationFilter arg2, Object arg3)
			throws InstanceNotFoundException, ListenerNotFoundException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#setAttribute(javax.management.ObjectName, javax.management.Attribute)
	 */
	@Override
	public void setAttribute(ObjectName arg0, Attribute arg1)
			throws InstanceNotFoundException, AttributeNotFoundException,
			InvalidAttributeValueException, MBeanException, ReflectionException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#setAttributes(javax.management.ObjectName, javax.management.AttributeList)
	 */
	@Override
	public AttributeList setAttributes(ObjectName arg0, AttributeList arg1)
			throws InstanceNotFoundException, ReflectionException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.management.MBeanServer#unregisterMBean(javax.management.ObjectName)
	 */
	@Override
	public void unregisterMBean(ObjectName arg0)
			throws InstanceNotFoundException, MBeanRegistrationException {
		// TODO Auto-generated method stub

	}

}
