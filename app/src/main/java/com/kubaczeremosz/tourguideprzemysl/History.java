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

public class History extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.history, container, false);

        ArrayList<Offer> listSightseeing = new ArrayList<>();
        listSightseeing.add(new Offer("Fredreum Theatre",R.drawable.fredreum,"49.780361, 22.765993"));
        listSightseeing.add(new Offer("Fredreum Theatre",R.drawable.fredreum,"49.780361, 22.765993"));

        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listSightseeing);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_history);
        listView.setAdapter(offerAdapter);
        return rootView;
    }
}
