package com.example.ave.maze;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

public class Player implements Drawable {

    private Point point;
    private Paint paint;

    public Player(){
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        point = new Point(0, 0);
    }
    public void move(int diffX, int diffY){
        point.x += diffX;
        point.y += diffY;
    }
    @Override
    public void draw(Canvas canvas, Rect rect) {
        canvas.drawRect(point.x, point.y, point.x + 50, point.y + 50, paint);
    }
}
