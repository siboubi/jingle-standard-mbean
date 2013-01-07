/**
 * A standard MBean is a type of MBean that has well-known, static management interfaces. A dynamic MBean uses metadata classes to describe its management interfaces at runtime in a generic fashion. A model MBean is a special dynamic MBean whose management interface is defined outside of the MBean and inserted into the MBean via a setter method. For detailed information about these types of MBeans, please refer to the reference section for JMX-related books.
 * 
 * MBeanServerImpl can register the above three kinds of MBeans.
 * Take the standard MBean as an example.
 */
package org.jingle.test.jmxremote.article.standard;

/**
 * @author siboubib
 *
 */
public interface StandardMBean {
	public void setNumber(int number);
	public int getNumber();
	public boolean guessNumber(int number);
}
