package com.example.namuiwan.Josue.ArrastrarFiguras;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.core.view.DragStartHelper;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.namuiwan.R;

import java.io.File;

public class ArrastrarSoltar extends AppCompatActivity {
    ImageView imgV1, imgV2;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrastrar_soltar);

        iniciaArrastre();
        eventoArrastre();
        /*soltarOrigen();*/
        soltarOrigen1();

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void iniciaArrastre(){
        imgV1 = findViewById(R.id.imgV1);
        ImageView imgV1 = new ImageView(this);
        imgV1.setTag(IMAGEVIEW_TAG);
        imgV1.setOnClickListener( view -> {
            ClipData.Item item = new ClipData.Item((CharSequence) view.getTag());
            ClipData dragData = new ClipData(
                    (CharSequence) view.getTag(),
                    new String[] { ClipDescription.MIMETYPE_TEXT_PLAIN}, item
            );
            View.DragShadowBuilder myShadow = new View.DragShadowBuilder(imgV1);
            view.startDragAndDrop(dragData,myShadow,null,0);
            return;
        });
    }
    private static final String IMAGEVIEW_TAG = "ICON BITMAP";

    private  static class MyDragShadowBuilder extends View.DragShadowBuilder{
        private static Drawable shadow;

        public MyDragShadowBuilder (View view){
            super(view);
            shadow = new ColorDrawable(Color.LTGRAY);
        }
        @Override
        public void onProvideShadowMetrics (Point size, Point touch){
            int width, height;
            width = getView().getWidth() / 2;
            height = getView().getHeight() / 2;
            shadow.setBounds(0,0,width,height);
            size.set(width,height);
            touch.set(width /2,height /2);
        }
        @Override
        public void onDrawShadow(Canvas canvas){
            shadow.draw(canvas);
        }
    }

    private void eventoArrastre(){
        View imgV1 = new ImageView(this);
        imgV1.setOnDragListener((view, e) -> {
            switch (e.getAction()){
                case DragEvent.ACTION_DRAG_STARTED:
                    if(e.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)){
                        ((ImageView)view).setColorFilter(Color.BLUE);
                        view.invalidate();
                        return true;
                    }
                    return false;
                case DragEvent.ACTION_DRAG_ENTERED:
                    ((ImageView)view).setColorFilter(Color.GREEN);
                    view.invalidate();
                    return true;

                case DragEvent.ACTION_DRAG_LOCATION:
                    return true;

                case DragEvent.ACTION_DRAG_EXITED:
                    ((ImageView)view).setColorFilter(Color.BLUE);
                    view.invalidate();
                    return true;

                case DragEvent.ACTION_DROP:
                    ClipData.Item item = e.getClipData().getItemAt(0);
                    CharSequence dragData = item.getText();
                    Toast.makeText(this, "Dragged data is" + dragData, Toast.LENGTH_SHORT).show();
                    ((ImageView)view).clearColorFilter();
                    view.invalidate();
                    return true;

                case DragEvent.ACTION_DRAG_ENDED:
                    ((ImageView)view).clearColorFilter();
                    view.invalidate();
                    if(e.getResult()){
                        Toast.makeText(this, "La caída fue manejada", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "La caída no funcionó", Toast.LENGTH_SHORT).show();
                    }
                    return true;
                default:
                    Log.e("DragDrop Example","Unknown action type received by View.OnDragListener.");
                    break;
            }
            return false;
        });
    }
/*
    @RequiresApi(api = Build.VERSION_CODES.N)
    private void soltarOrigen(){
        File internalImagesDir = new File(Context.getFilesDir(),"images");
        File imageFile = new File(internalImagesDir, imageFilaname);
        final Uri uri = FileProvider.getUriForFile(Context, contentAhority, imageFile);

        ImageView srcImageView = findViewById(R.id.imageView);
        new DragStartHelper(srcImageView, (view,helper)->{
           ClipData clipData = new ClipData(new ClipDescription("Image Description", new String[]{"image/*"}), new ClipData.Item(uri));
           int flags = View.DRAG_FLAG_GLOBAL | View.DRAG_FLAG_GLOBAL_URI_READ;
           return view.startDragAndDrop(clipData, new View.DragShadowBuilder(view),null,flags);
        }).attach();
    }*/

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void soltarOrigen1(){
        ImageView targetImageView = findViewById(R.id.imgV2);

        targetImageView.setOnDragListener( (view, event) -> {

            switch (event.getAction()) {
                case DragEvent.ACTION_DROP:
                    ClipData.Item imageItem = event.getClipData().getItemAt(0);
                    Uri uri = imageItem.getUri();
                    DragAndDropPermissions dropPermissions =
                            requestDragAndDropPermissions(event);
                    ((ImageView)view).setImageURI(uri);
                    dropPermissions.release();
                    return true;
                default:
                    Log.e("DragDrop Example","Unknown action type received by View.OnDragListener.");
                    break;
            }

            return false;
        });
    }

}