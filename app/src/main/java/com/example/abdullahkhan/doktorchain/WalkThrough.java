package com.example.abdullahkhan.doktorchain;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;

import com.example.abdullahkhan.doktorchain.customizedCardView.cardItemString;
import com.example.abdullahkhan.doktorchain.customizedCardView.cardPagerAdapter;
import com.itsronald.widget.ViewPagerIndicator;
import com.wajahatkarim3.easyflipviewpager.CardFlipPageTransformer;

public class WalkThrough extends AppCompatActivity {
    ViewPager viewPager;

    int background_gradient[] = {R.drawable.slides_1,R.drawable.slide_02};
    int inner_image[] = {R.drawable.slides_1,R.drawable.slides_2};
    String inner_description[] = {"HelloWorld!!!!","Again_Hello_World!!!"};
    String inner_details[] = {"Hello_world!!!!","Again_Hello_World!!!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk_through);

        viewPager = findViewById(R.id.viewPager);
//        walkThrough_guide walkThrough_guide = new walkThrough_guide(this);
//        viewPager.setAdapter(walkThrough_guide);

        cardPagerAdapter cardPagerAdapter = new cardPagerAdapter(this);

        for(int i = 0; i<background_gradient.length;i++){
            cardPagerAdapter.addCardItems(new cardItemString( background_gradient[i],inner_image[i],inner_description[i],inner_details[i] ));
        }

        viewPager.setAdapter(cardPagerAdapter);



        final ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
        layoutParams.width = ViewPager.LayoutParams.MATCH_PARENT;
        layoutParams.height = ViewPager.LayoutParams.WRAP_CONTENT;
        layoutParams.gravity = Gravity.BOTTOM;

        final ViewPagerIndicator viewPagerIndicator = new ViewPagerIndicator(this);
        viewPager.addView(viewPagerIndicator, layoutParams);

        // Create an object of page transformer
        CardFlipPageTransformer cardFlipPageTransformer = new CardFlipPageTransformer();

    // Enable / Disable scaling while flipping. If false, then card will only flip as in Poker card example.
    // Otherwise card will also scale like in Gallery demo. By default, its true.
        cardFlipPageTransformer.setScalable(false);

    // Set orientation. Either horizontal or vertical. By default, its vertical.
        cardFlipPageTransformer.setFlipOrientation(CardFlipPageTransformer.VERTICAL);

    // Assign the page transformer to the ViewPager.
        viewPager.setPageTransformer(true, cardFlipPageTransformer);


    }
}
