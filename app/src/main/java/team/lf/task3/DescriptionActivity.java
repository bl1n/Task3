package team.lf.task3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

public class DescriptionActivity extends AppCompatActivity {

    private ImageView iv;
    private Toolbar tvTittle;
    private TextView tvDescription;
    private View bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

//        bck = findViewById(R.id.background);
        iv = findViewById(R.id.app_bar_image);
        tvTittle = findViewById(R.id.toolbar);
        tvDescription = findViewById(R.id.description);
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
