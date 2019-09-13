package team.lf.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DescriptionActivity extends AppCompatActivity {

    private ImageView iv;
    private TextView tvTittle;
    private TextView tvDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        iv = findViewById(R.id.app_bar_image);
        tvTittle = findViewById(R.id.app_bar_tv);
        tvDescription = findViewById(R.id.description);
        Bundle bundle = getIntent().getBundleExtra("bundle");
        String url = bundle.getString("url", "");
        String tittle = bundle.getString("tittle", "");
        String description = bundle.getString("description", "");
        Picasso.get().load(url).into(iv);
        tvTittle.setText(tittle);
        tvDescription.setText(description);
    }
}
