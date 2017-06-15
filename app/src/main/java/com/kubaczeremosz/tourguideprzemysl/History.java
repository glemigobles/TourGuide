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
        listSightseeing.add(new Offer("Casimir Castle","The Castle erected  after 1340 by King Casimirus the Great on the hill towering over the city in the place of an older settlement. In its yard one can fnd the remnants of the old rotunda and palatium from the time of King \n" +
                "Bolesław I the Brave. The castle, thoroughly renovated in the 16th century in the Renaissance style now houses among others an auditorium of the Aleksander Fredro Amateur Drama Company, the oldest in Poland amateur drama group. In the vicinity of the castle, the beautifully situated Castle Park, which dates back to the year 1842, is worth seeing.",R.drawable.fredreum,"49.780361, 22.765993"));
        listSightseeing.add(new Offer("Fort VIII Łętownia in Kuńkowce","KUŃKOWCE Fort VIII „Łętownia”. It dates back to the years 1854-1855, when the Austrians built one of their artillery earthworks on a hill west of Przemyśl. The fort obtained its present shape between 1881and 1882. ",R.drawable.fort7,"49.810494, 22.712489"));
        listSightseeing.add(new Offer("Fort XI Duńkowiczki","Fort XI Duńkowiczki was built between 1884 and 1886. It was almost identical with Fort XI \"Orzechowce\". However, it was modernized somewhat later. In the gun casemates added in the wings of the barracks newer-type cannons were placed. In the armoured batteries movable armoured turrets were added. The caponiers were not restructed.",R.drawable.fort9,"49.844895, 22.787243"));
        listSightseeing.add(new Offer("The Roman-Catholic Archcathedral","The Roman-Catholic Archcathedral built in the Gothic style in the15th and 16th centuries in place of the older Romanesque one, whose remnants have been preserved in the vaults. It was renovated in the 18th c. in the Baroque style. Next to the cathedral there is the Bishop’s Palace and the late-Baroque 71-metre high belfry, a characteristic element of the Przemyśl panorama. In the upper part of the belfry, on the level of clock faces,  is a view point with a beautiful panorama of the city.",R.drawable.rcc,"49.780950, 22.768231"));
        listSightseeing.add(new Offer("The Franciscan Church","The Franciscan Church built in the 18th c. in place of an old Gothic church combines elements of the late Baroque and the Classicism. The church has an impressive rococo interior with an abundance of sculptures and frescoes.",R.drawable.fc,"49.781535, 22.770574"));
        listSightseeing.add(new Offer("The houses in the Market Square","The houses in the Market Square of 16th-and 17th-c. origin which stand on three sides of the square (once they used to take all four sides). Most of the houses renovated in the 19th c. have retained the original arcades. Of note is also unique, sloping the Market Square itself, where once a Renaissance Town Hall stood, pulled down in 1812 by the Austrian authorities.",R.drawable.hms,"49.782452, 22.768963"));

        OfferAdapter offerAdapter=new OfferAdapter(getContext(), listSightseeing);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_history);
        listView.setAdapter(offerAdapter);
        return rootView;
    }
}
