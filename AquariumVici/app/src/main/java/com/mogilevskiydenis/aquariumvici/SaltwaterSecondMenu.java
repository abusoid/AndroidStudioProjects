package com.mogilevskiydenis.aquariumvici;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SaltwaterSecondMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_menu);
    }
    //Выбор во втором меню раздела Рыбы
    public void freshwaterFishClick(View view){
       /* Intent freshwaterIntent = new Intent(SecondMenu.this, FishesMenu.class);

        // Start the new activity
        startActivity(freshwaterIntent);*/
        setContentView(R.layout.item_menu_list);

        //Создание списка
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Морской Неон", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Морской Меченосец", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Морской Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Морской Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Морской Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Морской Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Морской Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Морской Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));

        //Создание ссылки на{@link ItemAdapter}, который дает параметры создания листа
        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_saltwater);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        // реализация кликабельности каждого элемента ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                setContentView(R.layout.description_window);
                TextView title = (TextView) findViewById(R.id.description_title);
                title.setText(items.get(i).getName());
                // Выводим сообщение с текстом выбранного элемента
                //Toast.makeText(getApplicationContext(), "Вы выбрали: " + Name, Toast.LENGTH_SHORT).show();
                ImageView image = (ImageView) findViewById(R.id.description_image);
                image.setImageResource(items.get(i).getImageResourceId());
                TextView description = (TextView) findViewById(R.id.description_text);
                description.setText(items.get(i).getDescriptionText());
            }
        });
    }
    //Выбор во втором меню раздела Растения
    public void freshwaterPlantClick(View view){
        setContentView(R.layout.item_menu_list);

        //Создание списка
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Валинснерия", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Роголистник", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));

        //Создание ссылки на{@link ItemAdapter}, который дает параметры создания листа
        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_freshwater);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        // реализация кликабельности каждого элемента ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                setContentView(R.layout.description_window);
                TextView title = (TextView) findViewById(R.id.description_title);
                title.setText(items.get(i).getName());
                // Выводим сообщение с текстом выбранного элемента
                //Toast.makeText(getApplicationContext(), "Вы выбрали: " + Name, Toast.LENGTH_SHORT).show();
                ImageView image = (ImageView) findViewById(R.id.description_image);
                image.setImageResource(items.get(i).getImageResourceId());
                TextView description = (TextView) findViewById(R.id.description_text);
                description.setText(items.get(i).getDescriptionText());
            }
        });
    }
    public void freshwaterInvertebratesClick(View view){
        setContentView(R.layout.item_menu_list);

        //Создание списка
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));
        items.add(new Item("Улиточка", R.mipmap.ic_launcher, "Маленькая красивая рыбка"));
        items.add(new Item("Креветочка", R.drawable.ic_launcher_background, "рыбка чуть побольше"));

        //Создание ссылки на{@link ItemAdapter}, который дает параметры создания листа
        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_calc);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        // реализация кликабельности каждого элемента ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                setContentView(R.layout.description_window);
                TextView title = (TextView) findViewById(R.id.description_title);
                title.setText(items.get(i).getName());
                // Выводим сообщение с текстом выбранного элемента
                //Toast.makeText(getApplicationContext(), "Вы выбрали: " + Name, Toast.LENGTH_SHORT).show();
                ImageView image = (ImageView) findViewById(R.id.description_image);
                image.setImageResource(items.get(i).getImageResourceId());
                TextView description = (TextView) findViewById(R.id.description_text);
                description.setText(items.get(i).getDescriptionText());
            }
        });
    }

}
