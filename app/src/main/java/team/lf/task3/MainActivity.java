package team.lf.task3;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private CountryAdapter mAdapter;
    private RecyclerView mRecyclerView;


    private BottomNavigationView mNavigation;
    private BottomNavigationView.OnNavigationItemSelectedListener mListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Toast.makeText(MainActivity.this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNavigation = findViewById(R.id.navigation);
        mNavigation.setOnNavigationItemSelectedListener(mListener);
        mRecyclerView  = findViewById(R.id.recycler);
        mAdapter = new CountryAdapter();
        mAdapter.addData(seedData());
        //addData
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(
                new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

    }

    List<CountryElement> seedData(){
        List<CountryElement> elements = new ArrayList<>();
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3194/3088141290_5dd1879fcd_z.jpg", "Russia"));
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3025/3088137080_05da4fb550_z.jpg", "Iceland"));
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3154/3088131830_1ff453925c_z.jpg", "Swiss"));
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3207/3087290743_8ea1f76f21_z.jpg", "Sweden"));
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3096/3087310499_54b47d407c_z.jpg", "Netherlands"));
        return elements;
    }




}
