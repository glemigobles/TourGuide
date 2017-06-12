package com.kubaczeremosz.tourguideprzemysl;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;

/**
 * Created by Kuba on 2017-06-10.
 */

public class Food_Drinks extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_drinks, container, false);
        return rootView;
    }
}
