package hendalqett.com.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnSpotifyStreamer, btnScoresApp, btnLibraryApp,btnBuildItBigger, btnXYZReader, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpotifyStreamer = (Button) findViewById(R.id.btnSpotifyStreamer);
        btnScoresApp = (Button) findViewById(R.id.btnScoresApp);
        btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnXYZReader = (Button) findViewById(R.id.btnXYZReader);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);

        btnSpotifyStreamer.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXYZReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id)
        {
            case R.id.btnSpotifyStreamer:
                viewToastMessage(R.string.spotify_message);
                break;
            case R.id.btnScoresApp:
                viewToastMessage(R.string.scores_message);
                break;
            case R.id.btnLibraryApp:
                viewToastMessage(R.string.library_message);
                break;
            case R.id.btnBuildItBigger:
                viewToastMessage(R.string.build_it_bigger_message);
                break;
            case R.id.btnXYZReader:
                viewToastMessage(R.string.xyz_reader_message);
                break;
            case R.id.btnCapstone:
                viewToastMessage(R.string.capstone_message);
                break;
        }
    }
    void viewToastMessage(int messageId)
    {
        Toast.makeText(MainActivity.this,getString(messageId),Toast.LENGTH_LONG).show();
    }
}
