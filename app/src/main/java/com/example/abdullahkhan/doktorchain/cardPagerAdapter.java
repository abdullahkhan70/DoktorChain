package com.example.abdullahkhan.doktorchain;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class cardPagerAdapter extends PagerAdapter implements cardAdapter {
    Context c;
    private List<CardView> mViews;
    private List<cardItemString> mData;
    private float mBaseElevation;

    public cardPagerAdapter(Context c) {
        mViews = new ArrayList<>();
        mData = new ArrayList<>();
        this.c = c;
    }

    public void addCardItems(cardItemString items){
        mViews.add(null);
        mData.add(items);
    }


    @Override
    public float getBaseElevation() {
        return mBaseElevation;
    }

    @Override
    public CardView getCardViewAt(int position) {
        return mViews.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext())
                .inflate(R.layout.activity_walk_through_guide,container,false);
        container.addView(view);
        bind(mData.get(position),view);
        CardView cardView = view.findViewById(R.id.cardView);

        if(mBaseElevation == 0){
            mBaseElevation = cardView.getCardElevation();
        }

        cardView.setMaxCardElevation(mBaseElevation * MAX_ELEVATION_FACTOR);
        mViews.set(position,cardView);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
        mViews.set(position,null);
    }

    private void bind(cardItemString item, View view){
        ImageView imageViewForWalkThrough = view.findViewById(R.id.imageViewForWalkThrough);
        ImageView slide_image = (ImageView) view.findViewById(R.id.slide_image);
        TextView slide_description = (TextView) view.findViewById(R.id.slide_description);
        TextView slide_content = (TextView) view.findViewById(R.id.slide_content);
        Glide.with(c).load(item.getBackground_images()).centerCrop().into(imageViewForWalkThrough);
        Glide.with(c).load(item.getInner_images()).centerCrop().into(slide_image);
        slide_content.setText(item.getInner_content());
        slide_description.setText(item.getInner_description());

    }
}
