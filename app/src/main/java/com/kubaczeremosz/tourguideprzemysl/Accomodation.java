package com.kubaczeremosz.tourguideprzemysl;

/**
 * Created by Kuba on 2017-06-10.
 */
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Accomodation extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.accommodation, container, false);

        ArrayList<Offer> listAccommodation = new ArrayList<>();
        listAccommodation.add(new Offer("Hotel Villa Bolestraszyce", "Charming place located 6km from Przemyśl",R.drawable.bole1,"https://www.google.pl/maps/place/Villa+Bolestraszyce/@49.8154662,22.849166,17z/data=!3m1!4b1!4m5!3m4!1s0x473b7958a2c6e92b:0x7b44409a31d2c5e0!8m2!3d49.8154662!4d22.8513547"));
        listAccommodation.add(new Offer("Zamek dubiecko", "Old Polish Aristocracy Palace located 29km from Przemyśl",R.drawable.zamekdub1,"https://www.google.pl/maps/place/Zamek+Dubiecko/@49.8218999,22.3917756,17z/data=!3m1!4b1!4m5!3m4!1s0x473c61a99c685243:0xe143207463cca73f!8m2!3d49.8218965!4d22.3939696"));

        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listAccommodation);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_accommodation);
        listView.setAdapter(offerAdapter);

        return rootView;
    }
}
