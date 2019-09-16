package team.lf.task3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
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
//        EventBus.getDefault().register(this);
        mNavigation = findViewById(R.id.navigation);
        mNavigation.setOnNavigationItemSelectedListener(mListener);
        mRecyclerView  = findViewById(R.id.recycler);
        mAdapter = new CountryAdapter();
        mAdapter.addData(seedData());
        //addData
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(
                new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

//        mAdapter.filterData("Россия", "Греция");

    }

    List<CountryElement> seedData(){
        List<CountryElement> elements = new ArrayList<>();
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3194/3088141290_5dd1879fcd_z.jpg", "Россия", "Россия – крупнейшая страна мира, расположенная в Восточной Европе и Северной Азии и омываемая водами Тихого и Северного Ледовитого океанов. Ландшафт России крайне разнообразен: на ее территории есть и тундра, и леса, и субтропические пляжи. В Большом театре в Москве и Мариинском театре в Санкт-Петербурге выступают балетные труппы, снискавшие всемирную славу. Санкт-Петербург, основанный императором Петром I, известен своим Зимним дворцом в стиле барокко, в котором размещается часть обширной художественной коллекции музея \"Эрмитаж\"."));
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3025/3088137080_05da4fb550_z.jpg", "Исландия", "Исландия – островное государство в северной части Атлантического океана. Рельеф страны определяют вулканы, гейзеры, горячие источники и лавовые поля. В Исландии расположены национальные парки Ватнайёкюдль и Снайфедльсйекюдль, которые известны своими огромными ледниками. Большая часть населения проживает в столице, Рейкьявике, которая значительную часть энергии получает от геотермальной электростанции. В городе стоит посетить Национальный музей и Музей саг, экспозиция которых посвящена истории заселения Исландии викингами."));
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3154/3088131830_1ff453925c_z.jpg", "Швейцария", "Швейцариия, расположенная в Центральной Европе, – это страна бесчисленных озер, деревушек и высокогорных Альп. Во многих городах сохранились средневековые районы. Среди популярных достопримечательностей этой эпохи – Часовая башня в Берне и часовенный деревянный мост в Люцерне. Страна славится своими горнолыжными курортами и пешеходными маршрутами. Банковские и финансовые учреждения играют ведущую роль в экономике страны, а швейцарские часы и шоколад известны во всем мире."));
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3207/3087290743_8ea1f76f21_z.jpg", "Швеция", "Швеция – это государство в Скандинавии, география которого включает тысячи прибрежных островов и внутриматериковых озер, таежные леса и горы, покрытые ледниками. Все крупнейшие города – столица Стокгольм и расположенные на юго-востоке Гётеборг и Мальмё – являются приморскими. Стокгольм занимает 14 островов с более чем 50 мостами. Он известен средневековым районом Гамла-Стан (Старый город), а также королевскими дворцами и музеями, в числе которых музей под открытым небом Скансен." ));
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3096/3087310499_54b47d407c_z.jpg", "Нидерланды", "Нидерланды – равнинная страна на северо-западе Европы, известная своими каналами, полями тюльпанов, ветряными мельницами и велосипедными дорожками. В столице государства Амстердаме расположен художественный музей Рейксмюсеум, Музей Ван Гога и дом, в котором во время Второй мировой войны писала дневник еврейская девочка Анна Франк. С Золотого века Нидерландов (XVII века) сохранились особняки вдоль каналов, а также знаменитые полотна Рембрандта и Вермеера."));
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3223/3087315689_dbe1c6b2c9_z.jpg", "Финляндия", "Финляндия – страна в Северной Европе, граничащая со Швецией, Норвегией и Россией. Столица страны Хельсинки расположена на полуострове и прилегающих к нему островах Балтийского моря. В городе стоит побывать в морской крепости Свеаборг XVIII века, модном Дизайнерском квартале и многочисленных музеях. В огромной арктической провинции Лапландия, которая славится своими национальными парками и горнолыжными курортами, можно увидеть северное сияние."));
        elements.add(new CountryElement("https://jubilee-live.flickr.com/3037/3088157764_68c76df020_z.jpg", "Греция", "Греция – страна в Южной Европе, расположенная на Балканском полуострове и тысячах островов в Эгейском и Ионическом морях. Она является наследницей могущественной Древней Греции, которая считается колыбелью западной цивилизации. Столица Греции Афины славится своей крепостью Акрополь, возведенной в V веке до н. э., и храмом Парфенон. У туристов пользуются популярностью пляжи острова Санторини с черным песком, курорты острова Миконос и другие места летнего отдыха."));
        return elements;
    }

    @Override
    protected void onResume() {
        super.onResume();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void openFlag(OpenEvent event){
        CountryElement element = event.getElement();
        Intent intent = new Intent(this, DescriptionActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", element.getIvUrl());
        bundle.putString("tittle", element.getTvTittle());
        bundle.putString("description", element.getDescription());
        intent.putExtra("bundle", bundle);
        startActivity(intent);
    }
}
