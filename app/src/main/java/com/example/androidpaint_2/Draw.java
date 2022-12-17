package com.example.androidpaint_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Draw extends View {
    public Draw(Context context) {
        super(context);
    }
    float rotate_center_x = 850; //центр поворота холста по оси X
    float rotate_center_y = 1150; // центр поворота холста по оси Y
    float rotate_angle = -35; //угол поворота

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setSubpixelText(true); // Субпиксельное сглаживание для текста
        paint.setAntiAlias(true);

        paint.setColor(Color.BLUE);
        canvas.drawPaint(paint);

        paint.setColor(Color.WHITE);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2 - 300, 150, paint);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2 + 40, 200, paint);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2 + 500, 300, paint);

        paint.setColor(Color.BLACK);
        canvas.drawCircle(getWidth() / 2 + 50, getHeight() / 2 - 300, 20, paint);
        canvas.drawCircle(getWidth() / 2 - 50, getHeight() / 2 - 300, 20, paint);

        paint.setColor(Color.GRAY);

        canvas.drawRect(getWidth() / 2 - 130, 400, getWidth() / 2 + 130,650, paint);

        canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);

        canvas.drawRect(getWidth() / 2 + 200, getHeight() / 2 - 30, getWidth() / 2 + 500 ,getHeight() / 2 + 30, paint);

        canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);




    }
}
