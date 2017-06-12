package com.kubaczeremosz.tourguideprzemysl;

/**
 * Created by Kuba on 2017-06-10.
 */

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class Accomodation extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.accommodation, container, false);

        ArrayList<Offer> listAccommodation = new ArrayList<>();
        listAccommodation.add(new Offer("Hotel Villa Bolestraszyce", "Charming place located 6km from Przemyśl",R.drawable.bole1,"49.8154662,22.8491607,17"));
        listAccommodation.add(new Offer("Zamek dubiecko", "Old Polish Aristocracy Palace located 29km from Przemyśl",R.drawable.zamekdub1,"49.8218965,22.3917756,17"));

        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listAccommodation);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_accommodation);
        listView.setAdapter(offerAdapter);

        return rootView;
    }
}
