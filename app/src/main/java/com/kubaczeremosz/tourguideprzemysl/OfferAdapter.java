package com.kubaczeremosz.tourguideprzemysl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
        }

        final Offer currentOffer = getItem(position);
        TextView offerNameTextView = (TextView) listItemView.findViewById(R.id.list_offer_name);
        offerNameTextView.setText(currentOffer.getName());

        TextView offerTextView = (TextView) listItemView.findViewById(R.id.list_offer_text);
        offerTextView.setText(currentOffer.getText());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_offer_icon);
        imageView.setImageResource(currentOffer.getImageResourceId());

        ViewGroup item =(ViewGroup) listItemView.findViewById(R.id.item);

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(currentOffer);
            }
        });
        return listItemView;
    }

    public void navigate(Offer offer){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("geo:"+offer.getCords()+" (" +offer.getName()+ ")"));
        getContext().startActivity(intent);

    }
}
