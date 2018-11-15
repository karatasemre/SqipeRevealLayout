package emre.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.chauthai.swipereveallayout.SwipeRevealLayout;

public class MainActivity extends AppCompatActivity implements SwipeRevealLayout.SwipeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwipeRevealLayout sw = findViewById(R.id.swipe_layout_1);
        sw.setSwipeListener(this);

    }

    public void layoutOneOnClick(View v) {
        Toast.makeText(MainActivity.this, "Layout 1 clicked", Toast.LENGTH_SHORT).show();
    }

    public void layoutTwoOnClick(View v) {
        Toast.makeText(MainActivity.this, "Layout 2 clicked", Toast.LENGTH_SHORT).show();
    }

    public void layoutThreeOnClick(View v) {
        Toast.makeText(MainActivity.this, "Layout 3 clicked", Toast.LENGTH_SHORT).show();
    }

    public void layoutFourOnClick(View v) {
        Toast.makeText(MainActivity.this, "Layout 4 clicked", Toast.LENGTH_SHORT).show();
    }

    public void moreOnClick(View v) {
        Toast.makeText(MainActivity.this, "More clicked", Toast.LENGTH_SHORT).show();
    }

    public void deleteOnClick(View v) {
        Toast.makeText(MainActivity.this, "Delete clicked", Toast.LENGTH_SHORT).show();
    }

    public void archiveOnClick(View v) {
        Toast.makeText(MainActivity.this, "Archive clicked", Toast.LENGTH_SHORT).show();
    }

    public void helpOnClick(View v) {
        Toast.makeText(MainActivity.this, "Help clicked", Toast.LENGTH_SHORT).show();
    }

    public void searchOnClick(View v) {
        Toast.makeText(MainActivity.this, "Search clicked", Toast.LENGTH_SHORT).show();
    }

    public void starOnClick(View v) {
        Toast.makeText(MainActivity.this, "Star clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClosed(SwipeRevealLayout view) {
        Log.e("onClosed","onClosed");
        Toast.makeText(MainActivity.this,"Closed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onOpened(SwipeRevealLayout view) {
        Log.e("onOpened","onOpened");
        Toast.makeText(MainActivity.this,"Opened", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSlide(SwipeRevealLayout view, float slideOffset) {
        Log.e("onSlide","onSlide"+slideOffset);
    }
}
