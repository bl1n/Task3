package team.lf.task3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView.OnNavigationItemSelectedListener mItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.app_bar_search:{
                    Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                    return true;
                }
                case R.id.app_bar_fav:{
                    Toast.makeText(MainActivity.this, "Favorite", Toast.LENGTH_SHORT).show();
                    return true;
                }
                case R.id.app_bar_settings:{
                    Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                    return true;
                }
                case R.id.app_bar_trip:{
                    Toast.makeText(MainActivity.this, "Trip", Toast.LENGTH_SHORT).show();
                    return true;
                }
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = findViewById(R.id.navigation);

        navigation.setOnNavigationItemSelectedListener(mItemSelectedListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        return true;
    }
}
