package pt.iade.friends;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import pt.iade.friends.databinding.ActivityMapFriendBinding;

public class MapFriend extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LocationManager locationManager;
    LocationListener locationListener;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == 1) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_friend);
        @NonNull ActivityMapFriendBinding binding = ActivityMapFriendBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        //markers of temporary locations in database
        LatLng miscbytartaria = new LatLng(38.7088218655313, -9.14763781597465);
        MarkerOptions marker = new MarkerOptions();
        mMap.addMarker(new MarkerOptions().position(miscbytartaria).title("Misc by Tartar-ia"));
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_marker));
        mMap.addMarker(marker);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(miscbytartaria));

        LatLng bohemio = new LatLng(38.707914767868346, -9.146330460154292);
        MarkerOptions marker2 = new MarkerOptions();
        mMap.addMarker(new MarkerOptions().position(bohemio).title("Bohemio da Ribeira"));
        marker2.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_marker));
        mMap.addMarker(marker2);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bohemio));

        LatLng suba = new LatLng(38.70977071141623, -9.147095160154217);
        MarkerOptions marker3 = new MarkerOptions();
        mMap.addMarker(new MarkerOptions().position(suba).title("SUBA Restaurante"));
        marker3.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_marker));
        mMap.addMarker(marker3);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(suba));

        LatLng bono = new LatLng(38.7076953628457, -9.141795075497946);
        MarkerOptions marker4 = new MarkerOptions();
        mMap.addMarker(new MarkerOptions().position(bono).title("Bono lisboa"));
        marker4.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_marker));
        mMap.addMarker(marker4);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bono));

        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                LatLng userLocation = new LatLng(location.getLatitude(), location.getLongitude());
                mMap.addMarker(new MarkerOptions().position(userLocation).title("You"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(userLocation));

            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

            }
        };

        if (Build.VERSION.SDK_INT < 23) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
            }
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        } else {
            if (ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
            } else {
                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
                Location lastKnownLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

                LatLng userLocation = new LatLng(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                mMap.addMarker(new MarkerOptions().position(userLocation).title("You"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(userLocation));
            }
        }
    }
}
