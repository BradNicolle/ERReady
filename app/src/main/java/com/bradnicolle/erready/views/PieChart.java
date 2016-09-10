package com.bradnicolle.erready.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class PieChart extends View {
    private Paint outerCirclePaint;
    private Paint innerCirclePaint;
    private Paint textPaint;
    private float completePercent = 50;
    private String centralText = "6h";

    public PieChart(Context context, AttributeSet attrs) {
        super(context, attrs);
        outerCirclePaint = new Paint();
        outerCirclePaint.setColor(Color.parseColor("#42A5F5"));
        outerCirclePaint.setStrokeWidth(10);
        innerCirclePaint = new Paint();
        innerCirclePaint.setColor(Color.parseColor("#EEEEEE"));
        textPaint = new Paint();
        textPaint.setColor(Color.DKGRAY);
        textPaint.setTextSize(180);
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    public void setPercentComplete(float percent) {
        completePercent = percent;
    }

    public void setCentralText(String text) {
        centralText = text;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int w = getMeasuredWidth();
        int h = getMeasuredHeight();
        canvas.drawCircle(w/2, w/2, w/2 - 25, innerCirclePaint);
        int textY = (int) ((w / 2) - ((textPaint.descent() + textPaint.ascent()) / 2));
        canvas.drawArc(0, 0, w, w, -90, (completePercent/100)*360, true, outerCirclePaint);
        canvas.drawCircle(w/2, w/2, w/2-50, innerCirclePaint);
        canvas.drawText(centralText, w/2, textY, textPaint);
    }
}
