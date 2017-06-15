package com.kubaczeremosz.tourguideprzemysl;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Kuba on 2017-06-10.
 */

public class Food_Drinks extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_drinks, container, false);

        ArrayList<Offer> listRestaurants = new ArrayList<>();
        listRestaurants.add(new Offer("Bosko","Modern kitchen", R.drawable.bosko,"49.7830998,22.7752845,17"));
        listRestaurants.add(new Offer("Hotel Krasiczyn","Traditional polish kitchen",R.drawable.krasiczyn,"49.776357, 22.649975"));
        listRestaurants.add(new Offer("Hotel Villa Bolestraszyce","Traditional polish kitchen",R.drawable.vb,"49.8154662,22.8491607,17"));
        listRestaurants.add(new Offer("Monarchia","Traditional galitian kitchen",R.drawable.monarchia,"49.778489, 22.783430"));
        listRestaurants.add(new Offer("Na górce","Fusion kitchen",R.drawable.nagorce,"49.806883, 22.763987"));
        listRestaurants.add(new Offer("Zamek dubiecko","Traditional polish kitchen",R.drawable.zd,"49.8218965,22.3917756,17"));

        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listRestaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_food_drinks);
        listView.setAdapter(offerAdapter);
        return rootView;
    }
}
