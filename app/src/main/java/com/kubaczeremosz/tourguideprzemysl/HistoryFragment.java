package com.kubaczeremosz.tourguideprzemysl;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.history, container, false);

        ArrayList<Offer> listSightseeing = new ArrayList<>();
        listSightseeing.add(new Offer(getString(R.string.casimirtitle),getString(R.string.casimircastletext),R.drawable.fredreum,"49.780361, 22.765993"));
        listSightseeing.add(new Offer(getString(R.string.fort8title),getString(R.string.fort8text),R.drawable.fort7,"49.810494, 22.712489"));
        listSightseeing.add(new Offer(getString(R.string.fort11title),getString(R.string.fort11text),R.drawable.fort9,"49.844895, 22.787243"));
        listSightseeing.add(new Offer(getString(R.string.archicatedtaltitle),getString(R.string.archicatedraltext),R.drawable.rcc,"49.780950, 22.768231"));
        listSightseeing.add(new Offer(getString(R.string.franciscantitle),getString(R.string.franciscantext),R.drawable.fc,"49.781535, 22.770574"));
        listSightseeing.add(new Offer(getString(R.string.markettitle),getString(R.string.markettext),R.drawable.hms,"49.782452, 22.768963"));

        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listSightseeing);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_history);
        listView.setAdapter(offerAdapter);
        return rootView;
    }
}
