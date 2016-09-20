package www.webbuildersconsulting.com.rss_bill;

/**
 * Created by billskrzypczak on 3/30/16.
 */
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class second extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        WebView w1=(WebView)findViewById(R.id.webView);
        w1.loadUrl("http://www.bestradioyouhaveneverheard.com/podcasts/index.xml");
    }
}

