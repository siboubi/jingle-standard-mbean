/**
 * 
 */
package org.jingle.test.jmxremote.article.standard;

import java.util.Date;

import javax.management.AttributeChangeNotification;
import javax.management.ListenerNotFoundException;
import javax.management.MBeanNotificationInfo;
import javax.management.NotificationBroadcaster;
import javax.management.NotificationBroadcasterSupport;
import javax.management.NotificationFilter;
import javax.management.NotificationListener;

/**
 * StandardWithNotificationBroadcaster implements NotificationBroadcaster and 
 * delegates all related operations to the internal NotificationBroadcasterSupport. 
 * The setNumber() method is overridden to emit an AttributeChangeNotification 
 * when the Number attribute is set to a different value.
 * @author siboubib
 *
 */
public class StandardWithNotificationBroadcaster extends Standard implements
		NotificationBroadcaster {
	// Attribute -------------------------------------------------------------------------------------------
	NotificationBroadcasterSupport notificationBroadcasterSupport = new NotificationBroadcasterSupport();
	
	@Override
	public void setNumber(int number) {
		int oldNumber = getNumber();
		super.setNumber(number);
		int newNumber = getNumber();
		if (oldNumber != newNumber) {
			notificationBroadcasterSupport.sendNotification(
					new AttributeChangeNotification(
							"StandardWithNotificationBroadcaster", 
							1, 
							new Date().getTime(), 
							"number changed", 
							"Number", 
							Integer.TYPE.getName(), 
							new Integer(oldNumber), 
							new Integer(newNumber)
					)
			);
		}
	}

	/* (non-Javadoc)
	 * @see javax.management.NotificationBroadcaster#addNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, java.lang.Object)
	 */
	@Override
	public void addNotificationListener(NotificationListener listener,
			NotificationFilter filter, Object handback)
			throws IllegalArgumentException {
		notificationBroadcasterSupport.addNotificationListener(listener, filter, handback);
	}

	/* (non-Javadoc)
	 * @see javax.management.NotificationBroadcaster#getNotificationInfo()
	 */
	@Override
	public MBeanNotificationInfo[] getNotificationInfo() {
		return notificationBroadcasterSupport.getNotificationInfo();
	}

	/* (non-Javadoc)
	 * @see javax.management.NotificationBroadcaster#removeNotificationListener(javax.management.NotificationListener)
	 */
	@Override
	public void removeNotificationListener(NotificationListener listener)
			throws ListenerNotFoundException {
		notificationBroadcasterSupport.removeNotificationListener(listener);
	}

}
