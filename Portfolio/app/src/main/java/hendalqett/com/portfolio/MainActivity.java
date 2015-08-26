package hendalqett.com.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {


//    Button btnSpotifyStreamer, btnScoresApp, btnLibraryApp,btnBuildItBigger, btnXYZReader, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btnSpotifyStreamer = (Button) findViewById(R.id.btnSpotifyStreamer);
//        btnScoresApp = (Button) findViewById(R.id.btnScoresApp);
//        btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
//        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
//        btnXYZReader = (Button) findViewById(R.id.btnXYZReader);
//        btnCapstone = (Button) findViewById(R.id.btnCapstone);

//        btnSpotifyStreamer.setOnClickListener(this);
//        btnScoresApp.setOnClickListener(this);
//        btnLibraryApp.setOnClickListener(this);
//        btnBuildItBigger.setOnClickListener(this);
//        btnXYZReader.setOnClickListener(this);
//        btnCapstone.setOnClickListener(this);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }



//    @Override
//    public void onClick(View view) {
//
//    }
    public void viewToast(View view)
    {
        int id=view.getId();
        switch (id)
        {
            case R.id.btnSpotifyStreamer:
                Toast.makeText(MainActivity.this,getString(R.string.spotify_message),Toast.LENGTH_LONG).show();
                break;
            case R.id.btnScoresApp:
                Toast.makeText(MainActivity.this,getString(R.string.scores_message),Toast.LENGTH_LONG).show();
                break;
            case R.id.btnLibraryApp:
                Toast.makeText(MainActivity.this,getString(R.string.library_message),Toast.LENGTH_LONG).show();
                break;
            case R.id.btnBuildItBigger:
                Toast.makeText(MainActivity.this,getString(R.string.build_it_bigger_message),Toast.LENGTH_LONG).show();
                break;
            case R.id.btnXYZReader:
                Toast.makeText(MainActivity.this,getString(R.string.xyz_reader_message),Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCapstone:
                Toast.makeText(MainActivity.this,getString(R.string.capstone_message),Toast.LENGTH_LONG).show();
                break;
        }
    }
    void viewToastMessage(int messageId)
    {
        Toast.makeText(MainActivity.this,getString(messageId),Toast.LENGTH_LONG).show();
    }
}
