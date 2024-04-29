package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        canvas.drawCircle(100, 100, 50, new Paint());

        Paint pait2 = new Paint();
        pait2.setStyle(Style.STROKE);
        canvas.drawCircle(300, 100, 50, pait2);

        Paint pait3 = new Paint();
        pait3.setColor(Color.BLUE);
        pait3.setStyle(Style.FILL);
        canvas.drawCircle(100, 300, 50, pait3);

        Paint pait4 = new Paint();
        pait4.setStyle(Style.STROKE);
        pait4.setStrokeWidth(4);
        canvas.drawCircle(300, 300, 50, pait4);
    }
}
