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


public class Culture extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.culture, container, false);

        ArrayList<Offer> listCulture = new ArrayList<>();
        listCulture.add(new Offer("Fredreum Theatre", "Small theatre located in Przemyśl Casimir Castle ",R.drawable.fredreum,"49.780361, 22.765993"));
        listCulture.add(new Offer(" The Museum of Bells and Pipes"," located in the renovated Clock Tower at ul. Władycze.",R.drawable.dzwony,"49.7818581,22.7715335"));
        listCulture.add(new Offer(" The Archicatedral Museum"," great collection of medieval sacral arts",R.drawable.diecezja,"49.780673, 22.768310"));
        listCulture.add(new Offer(" The Museum of Przemysl Stronghold"," museum dedicated to one of the greatest stronghold in 18th century Europe",R.drawable.twierdza,"49.7824039,22.7705683"));
        listCulture.add(new Offer("National Museum of Przemysl", "The National Museum of the Przemyśl Land includes several branches. Its collections amount to more than 200 thousands exhibits from the area of archaeology, history, numismatics, art, ethnography and nature, more than 3,300 deposits and various auxiliary materials. ",R.drawable.mn,"49.783029, 22.771749"));

        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listCulture);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_culture);
        listView.setAdapter(offerAdapter);

        return rootView;
    }
}
