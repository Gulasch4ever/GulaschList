package at.fh.swengb.gulaschlist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.gulaschlist.model.Gulasch;

public class ShowGulaschActivity extends AppCompatActivity {
    private Gulasch gulasch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_gulasch);

        Intent intent = getIntent();
        gulasch = (Gulasch) intent.getExtras().get("gulasch");

        TextView viewFirstName = (TextView) findViewById(R.id.textViewFirstName);
        TextView viewLastName = (TextView) findViewById(R.id.textViewLastName);
        TextView viewAddress = (TextView) findViewById(R.id.textViewAddress);
        TextView viewPhone = (TextView) findViewById(R.id.textViewPhone);
        TextView viewOrderId = (TextView) findViewById(R.id.textViewOrderId);

        viewFirstName.setText(gulasch.getCookFirstName());
        viewLastName.setText(gulasch.getCookLastName());
        viewAddress.setText(gulasch.getRestaurantAddress());
        viewPhone.setText("Phone number: "+gulasch.getPhoneNumber());
        viewOrderId.setText("Order ID: "+gulasch.getOrderId());

    }

    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q="+gulasch.getRestaurantAddress());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:"+gulasch.getPhoneNumber());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

}
