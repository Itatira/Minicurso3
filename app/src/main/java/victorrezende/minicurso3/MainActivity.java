package victorrezende.minicurso3;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);


        Uri uri=Uri.parse("https://pbs.twimg.com/profile_images/749112581181153280/N9mUbd0n.jpg");
        SimpleDraweeView simpleDraweeView=
                (SimpleDraweeView)
                        findViewById(R.id.image);

        simpleDraweeView.setImageURI(uri);

    }
}
