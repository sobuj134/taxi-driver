package com.future.it.taxi.client.module.registration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.future.it.taxi.client.App;
import com.future.it.taxi.client.R;
import com.future.it.taxi.client.net.APIServices;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;

/**
 * Created by monir.sobuj on 11/9/17.
 */

public class VehicleFragment extends Fragment {

    @Inject
    APIServices apiServices;
    @Inject
    Realm r;


    public VehicleFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //initiate dependencies
        App.getComponent().inject(this);
        View rootView = inflater.inflate(R.layout.fragment_registration_5_vehicle, container, false);
        setHasOptionsMenu(false);
        getActivity().setTitle("Vehicle Details");
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick(R.id.btnNext)
    public void onClick() {
        Fragment fragment = new AddressFragment();
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack("address").commit();
    }
}
