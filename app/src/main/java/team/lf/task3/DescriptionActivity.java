package team.lf.task3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

public class DescriptionActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

//        bck = findViewById(R.id.background);
        ImageView iv = findViewById(R.id.app_bar_image);
        Toolbar tvTittle = findViewById(R.id.toolbar);
        TextView tvDescription = findViewById(R.id.description);
        Bundle bundle = getIntent().getBundleExtra("bundle");
        String url = bundle.getString("url", "");
        String tittle = bundle.getString("tittle", "");
        String description = bundle.getString("description", "");
        Picasso.get().load(url).into(iv);
        tvTittle.setTitle(tittle);
        tvDescription.setText(description);
        findViewById(R.id.fab).setOnClickListener(view -> Snackbar.make(view, "Добавлено в корзину", Snackbar.LENGTH_SHORT).show());
    }
}
