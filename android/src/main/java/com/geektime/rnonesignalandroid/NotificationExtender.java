import android.support.v4.app.NotificationCompat;
import android.content.SharedPreferences;
import android.util.Log;
import com.onesignal.OSNotificationPayload;
import com.onesignal.NotificationExtenderService;

public class NotificationExtender extends NotificationExtenderService {
    @Override
    protected boolean onNotificationProcessing(OSNotificationReceivedResult receivedResult) {
            // Read properties from result.
            Log.d(null, 'Received result' + receivedResult);
            // Return true to stop the notification from displaying.
            return false;
    }
}