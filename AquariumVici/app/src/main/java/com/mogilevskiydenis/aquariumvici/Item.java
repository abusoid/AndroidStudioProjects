package com.mogilevskiydenis.aquariumvici;


public class Item {
    //Название рыбы
    private String mName;
    //id картинки к рыбе
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    //константа на случай если нет изображения к рыбке
    private static final int NO_IMAGE_PROVIDED = -1;

    private String mDescriptionText;


    public Item(String Name, int imageResourceId, String descriptionText){
        mName = Name;
        mImageResourceId = imageResourceId;
        mDescriptionText = descriptionText;

    }

    public String getName() { return mName; }

    public int getImageResourceId(){ return mImageResourceId; }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public String getDescriptionText () {
        return mDescriptionText;
    }
}