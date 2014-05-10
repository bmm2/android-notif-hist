package jim.ytc.notifhistory;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

/**
 * Created by jimytc on 5/10/14.
 */
public class NotificationListener extends NotificationListenerService {
    private static final String TAG = "NotifHist";

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        StringBuilder builder = new StringBuilder();
        builder.append("Posted notification:\n");
        builder.append("Package: ").append(sbn.getPackageName()).append("\n");
        builder.append("Id: ").append(sbn.getId()).append("\n");
        builder.append("Tag: ").append(sbn.getTag()).append("\n");
        builder.append("PostTime: ").append(sbn.getPostTime()).append("\n");
        builder.append("OnGoing? ").append(sbn.isOngoing()).append("\n");
        builder.append("Cleanable? ").append(sbn.isClearable()).append("\n");
        builder.append("Notification: ").append(sbn.getNotification().toString()).append("\n");
        Log.d(TAG, builder.toString());
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        StringBuilder builder = new StringBuilder();
        builder.append("Removed notification:\n");
        builder.append("Package: ").append(sbn.getPackageName()).append("\n");
        builder.append("Id: ").append(sbn.getId()).append("\n");
        builder.append("Tag: ").append(sbn.getTag()).append("\n");
        builder.append("PostTime: ").append(sbn.getPostTime()).append("\n");
        builder.append("OnGoing? ").append(sbn.isOngoing()).append("\n");
        builder.append("Cleanable? ").append(sbn.isClearable()).append("\n");
        builder.append("Notification: ").append(sbn.getNotification().toString()).append("\n");
        Log.d(TAG, builder.toString());
    }
}
