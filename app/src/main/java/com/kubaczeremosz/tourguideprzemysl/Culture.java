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

        ArrayList<Offer> listAccommodation = new ArrayList<>();
        listAccommodation.add(new Offer("Fredreum Theatre", "Small theatre located in Przemyśl Casimir Castle ",R.drawable.fredreum,"Teatr Fredreum"));
        listAccommodation.add(new Offer("National Museum of Przemysl", "The National Museum of the Przemyśl Land includes several branches. Its collections amount to more than 200 thousands exhibits from the area of archaeology, history, numismatics, art, ethnography and nature, more than 3,300 deposits and various auxiliary materials. ",R.drawable.muzeum1,"Muzeum Narodowe Ziemi Przemyskliej"));

        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listAccommodation);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_culture);
        listView.setAdapter(offerAdapter);

        return rootView;
    }
}
