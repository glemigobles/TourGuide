package com.kubaczeremosz.tourguideprzemysl;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kuba on 2017-03-28.
 */

public class OfferAdapter extends ArrayAdapter<Offer> {

    private int listposition=0;

    public OfferAdapter(Context context, List<Offer> listaGraczy) {
        super(context, 0, listaGraczy);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            listposition++;
        }

        Offer currentOffer = getItem(position);
        TextView offerNameTextView = (TextView) listItemView.findViewById(R.id.list_offer_name);
        offerNameTextView.setText(currentOffer.getName());

        TextView offerTextView = (TextView) listItemView.findViewById(R.id.list_offer_text);
        offerTextView.setText(currentOffer.getText());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_offer_icon);
        imageView.setImageResource(currentOffer.getImageResourceId());

        LauncherActivity.ListItem item = (LauncherActivity.ListItem) listItemView.findViewById(R.id.item);

        return listItemView;
    }
}
