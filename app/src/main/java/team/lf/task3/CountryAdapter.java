package team.lf.task3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {

    private List<CountryElement> mList = new ArrayList<>();

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.country_view_holder, parent,false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        CountryElement element = mList.get(position);
        holder.bind(element);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void addData(List<CountryElement> elements){
        mList.clear();
        mList.addAll(elements);
        notifyDataSetChanged();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView tv;

        CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.card_iv);
            tv = itemView.findViewById(R.id.card_tittle);
        }

        void bind(final CountryElement element){
            Picasso.get().load(element.getIvUrl()).into(iv);
            tv.setText(element.getTvTittle());
            itemView.setOnClickListener(v-> EventBus.getDefault().post(new OpenEvent(element)));
        }
    }


}
