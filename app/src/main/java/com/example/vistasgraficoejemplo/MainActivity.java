package com.example.vistasgraficoejemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MiPropiaVista(this));
    }

    public class MiPropiaVista extends View {

        public MiPropiaVista(Context context) {
            super(context);
        }
        protected void onDraw(Canvas canvas){
//            Paint miPincel = new Paint();
//            miPincel.setColor(0xff00ffff);
//            miPincel.setColor(Color.argb(185, 168, 155, 255));
//            miPincel.setStrokeWidth(8);
//            miPincel.setStyle(Paint.Style.STROKE);
//            canvas.drawCircle(500, 500, 500, miPincel);

//            Relleno
//            int miColor;

//            miColor = ContextCompat.getColor(getContext(), R.color.rellenoCirculo);
//            miPincel.setColor(miColor);
//            miPincel.setStyle(Paint.Style.FILL);
//            canvas.drawCircle(500, 500, 500, miPincel);

            Path miTrazo = new Path();
            miTrazo.addCircle(350, 350, 200, Path.Direction.CCW);
            Paint miPincel = new Paint();
            miPincel.setColor(Color.RED);
            miPincel.setStrokeWidth(8);
            miPincel.setStyle(Paint.Style.STROKE);
            canvas.drawPath(miTrazo, miPincel);
            miPincel.setStrokeWidth(1);
            miPincel.setStyle(Paint.Style.FILL);
            miPincel.setTextSize(40);
            miPincel.setTypeface(Typeface.SANS_SERIF);
            canvas.drawTextOnPath("Curso Android Píldoras Informáticas", miTrazo, 40, 60, miPincel);
        }
    }
}