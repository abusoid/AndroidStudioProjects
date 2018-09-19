package com.mogilevskiydenis.aquariumvici;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class calcMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_menu);
        TextView volume = (TextView) findViewById(R.id.freshwater_fish);
        volume.setText("Объем аквариума");
        TextView cheto = (TextView) findViewById(R.id.freshwater_plant);
        cheto.setText("Еще чего-то");
        TextView chetoto = (TextView) findViewById(R.id.freshwater_invertebrates);
        chetoto.setText("И еще чего-то");
    }
    //Выбор во втором меню раздела Рыбы
    public void freshwaterFishClick(View view){
        Intent calcVolume = new Intent(calcMenu.this, Volume.class);
        startActivity(calcVolume);
    }
    //Выбор во втором меню раздела Растения
    public void freshwaterPlantClick(View view){

    }
    public void freshwaterInvertebratesClick(View view){

    }
}
