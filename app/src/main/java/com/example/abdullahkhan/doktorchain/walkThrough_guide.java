package com.example.abdullahkhan.doktorchain;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.lang.reflect.Array;

public class walkThrough_guide extends PagerAdapter {
    Context context;
    View view;

    public walkThrough_guide(Context c){
        this.context = c;
    }

    LayoutInflater layoutInflater;
    int[] background_gradient = {R.drawable.slides_1,R.drawable.slide_02};
    int[] inner_image = {R.drawable.slides_1,R.drawable.slides_2};
    String[] inner_description = {"HelloWorld!!!!","Again_Hello_World!!!"};
    String[] inner_details = {"Hello_world!!!!","Again_Hello_World!!!"};


    @Override
    public int getCount() {
        return background_gradient.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (RelativeLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.activity_walk_through_guide, container, false);
        ImageView background_image = (ImageView) view.findViewById(R.id.imageViewForWalkThrough);
        Glide.with(context).load(background_gradient[position]).centerCrop().into(background_image);
        ImageView slide_image = (ImageView) view.findViewById(R.id.slide_image);
        Glide.with(context).load(inner_image[position]).centerCrop().into(slide_image);
        TextView slide_description = (TextView) view.findViewById(R.id.slide_description);
        slide_description.setText(inner_description[position]);
        TextView slide_content = (TextView) view.findViewById(R.id.slide_content);
        slide_content.setText(inner_details[position]);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
