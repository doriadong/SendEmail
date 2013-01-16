package dd.SendEmail;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class SendEmailActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Uri uri = Uri.parse("mailto:625504178@qq.com");
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        startActivity(it); 
    }
}