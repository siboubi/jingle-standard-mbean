/**
 * 
 */
package org.jingle.test.jmxremote.article.standard;

import java.io.IOException;

import javax.management.AttributeChangeNotification;
import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.MalformedObjectNameException;
import javax.management.Notification;
import javax.management.NotificationListener;
import javax.management.ObjectName;

import org.jingle.test.jmxremote.article.Client;

/**
 * StandardNotificationListenerClient implements NotificationListener. It registers itself to the standard MBean to receive notifications, and expects the notifications to contain a handback object: client. Once the standard MBean emits an AttributeChangeNotification, it will print out the notification details.
 * @author siboubib
 *
 */
public class StandardNotificationListenerClient extends Client implements
		NotificationListener {
	@Override
	protected void doOper() {
		try {
			ObjectName standardName = new ObjectName("sample:name=standard mbean");
			conn.addNotificationListener(standardName, this, null, "Client");
		} catch (InstanceNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MalformedObjectNameException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	}

	/* (non-Javadoc)
	 * @see javax.management.NotificationListener#handleNotification(javax.management.Notification, java.lang.Object)
	 */
	@Override
	public void handleNotification(Notification notification, Object handback) {
		String type = notification.getType();
		if (type.equals(AttributeChangeNotification.ATTRIBUTE_CHANGE)) {
			System.out.println("notification = " + notification);
			System.out.println("oldValue = " + ((AttributeChangeNotification)notification).getOldValue());
			System.out.println("newValue = " + ((AttributeChangeNotification)notification).getNewValue());
			System.out.println("handback = " + handback);
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new StandardNotificationListenerClient().run();
	}

}
