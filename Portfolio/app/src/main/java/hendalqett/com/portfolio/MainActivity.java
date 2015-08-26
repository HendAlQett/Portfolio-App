package hendalqett.com.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void viewToast(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btnSpotifyStreamer:
                Toast.makeText(MainActivity.this, getString(R.string.spotify_message), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnScoresApp:
                Toast.makeText(MainActivity.this, getString(R.string.scores_message), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnLibraryApp:
                Toast.makeText(MainActivity.this, getString(R.string.library_message), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnBuildItBigger:
                Toast.makeText(MainActivity.this, getString(R.string.build_it_bigger_message), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnXYZReader:
                Toast.makeText(MainActivity.this, getString(R.string.xyz_reader_message), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCapstone:
                Toast.makeText(MainActivity.this, getString(R.string.capstone_message), Toast.LENGTH_LONG).show();
                break;
        }
    }


}
