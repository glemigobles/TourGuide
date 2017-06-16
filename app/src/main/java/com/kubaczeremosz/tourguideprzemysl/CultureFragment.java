package com.kubaczeremosz.tourguideprzemysl;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;


public class CultureFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.culture, container, false);

        ArrayList<Offer> listCulture = new ArrayList<>();
        listCulture.add(new Offer(getString(R.string.fredtitle), getString(R.string.fredtext),R.drawable.fredreum,"49.780361, 22.765993"));
        listCulture.add(new Offer(getString(R.string.beltitle),getString(R.string.belltext),R.drawable.dzwony,"49.7818581,22.7715335"));
        listCulture.add(new Offer(getString(R.string.archimustitle),getString(R.string.archimustext),R.drawable.diecezja,"49.780673, 22.768310"));
        listCulture.add(new Offer(getString(R.string.strmustitle),getString(R.string.strmustext),R.drawable.twierdza,"49.7824039,22.7705683"));
        listCulture.add(new Offer(getString(R.string.natmustitle), getString(R.string.natmustext),R.drawable.mn,"49.783029, 22.771749"));

        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listCulture);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_culture);
        listView.setAdapter(offerAdapter);

        return rootView;
    }
}
