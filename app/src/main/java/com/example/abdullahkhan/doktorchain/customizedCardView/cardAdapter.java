package com.example.abdullahkhan.doktorchain.customizedCardView;

import android.support.v7.widget.CardView;

public interface cardAdapter {

    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();

}
