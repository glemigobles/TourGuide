package com.kubaczeremosz.tourguideprzemysl;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class AccomodationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.accommodation, container, false);

        ArrayList<Offer> listAccommodation = new ArrayList<>();
        listAccommodation.add(new Offer(getString(R.string.vbtitle), getString(R.string.vbtext),R.drawable.vb,"49.8154662,22.8491607"));
        listAccommodation.add(new Offer(getString(R.string.zdtitle), getString(R.string.zdtext),R.drawable.zd,"49.8218965,22.3917756"));
        listAccommodation.add(new Offer(getString(R.string.hktitle), getString(R.string.hktext),R.drawable.krasiczyn,"49.776357, 22.649975"));


        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listAccommodation);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_accommodation);
        listView.setAdapter(offerAdapter);

        return rootView;
    }
}
