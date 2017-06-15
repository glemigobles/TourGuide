package com.kubaczeremosz.tourguideprzemysl;

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
        listAccommodation.add(new Offer("Hotel Villa Bolestraszyce", "Charming place located 6km from Przemyśl",R.drawable.vb,"49.8154662,22.8491607"));
        listAccommodation.add(new Offer("Zamek dubiecko", "Old Polish Aristocracy Castle located 29km from Przemyśl",R.drawable.zd,"49.8218965,22.3917756"));
        listAccommodation.add(new Offer("Hotel Krasiczyn", "*** Hotel in old Palace",R.drawable.krasiczyn,"49.776357, 22.649975"));


        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listAccommodation);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_accommodation);
        listView.setAdapter(offerAdapter);

        return rootView;
    }
}
