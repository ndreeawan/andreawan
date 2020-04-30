package com.example.mappme;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sma1BB = new LatLng(-5.458781, 122.608851);
        mMap.addMarker(new MarkerOptions().position(sma1BB).title("SMA Negeri 1 Baubau"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sma1BB));

        LatLng smp2BB = new LatLng(-5.463701, 122.601514);
        mMap.addMarker(new MarkerOptions().position(smp2BB).title("SMP Negeri 2 Baubau"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smp2BB));

        LatLng sd1wajo = new LatLng(-5.470386, 122.603139);
        mMap.addMarker(new MarkerOptions().position(sd1wajo).title("SDN 1 Wajo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sd1wajo));
    }
}
