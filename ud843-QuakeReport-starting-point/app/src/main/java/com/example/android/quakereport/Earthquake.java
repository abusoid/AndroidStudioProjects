package com.example.android.quakereport;



public class Earthquake {
    //Название места землетрясения(Сан франциско, Москва и.т.д.)
    private String mLocation;
    //Дата когда произошло землетрясение(Янв 31, 2013)
    private long mDate;
    //Магнитуда землетрясения(5.4, 7.2)
    private double mMag;



    /*
    * Создание нового объекта типа землетрясение{@link Earthquake}
    * @param vDate Дата когда произошло землетрясение(Янв 31, 2013)
    * @param vLocation Название места землетрясения(Сан франциско, Москва и.т.д.)
    * @param vMag Магнитуда землетрясения(5.4, 7.2)
     */
    public Earthquake(/*long vDate, */String vLocation/*, double vMag*/){
       // mDate = vDate;
        mLocation = vLocation;
      //  mMag = vMag;
    }

    //Геттер даты
    public long getDate(){
        return mDate;
    }
    //Геттер места
    public String getLocation(){
        return mLocation;
    }
    //Геттер магнитуды
    public double getMag(){
        return mMag;
    }
}
