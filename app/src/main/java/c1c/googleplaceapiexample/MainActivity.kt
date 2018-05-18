package c1c.googleplaceapiexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.google.android.gms.common.api.Status
import com.google.android.gms.location.places.Place
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment
import com.google.android.gms.location.places.ui.PlaceSelectionListener

class MainActivity : AppCompatActivity(),PlaceSelectionListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autocompleteFragment = fragmentManager.findFragmentById(R.id.autocomplete_fragment)
                as PlaceAutocompleteFragment
        autocompleteFragment.setOnPlaceSelectedListener(this)

    }

    override fun onPlaceSelected(p0: Place?) {

          Toast.makeText(applicationContext,""+p0!!.name+p0!!.latLng,Toast.LENGTH_LONG).show();
    }

    override fun onError(status: Status) {
        Toast.makeText(applicationContext,""+status.toString(),Toast.LENGTH_LONG).show();
    }

}
