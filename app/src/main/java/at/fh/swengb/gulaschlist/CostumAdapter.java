package at.fh.swengb.gulaschlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.gulaschlist.model.Gulasch;

/**
 * Created by laszlobalo on 19.11.16.
 */

public class CostumAdapter extends BaseAdapter {

    List<Gulasch> listGulasch;
    Context context;
    LayoutInflater inflter;

    public CostumAdapter(Context applicationContext, List<Gulasch> listGulasch) {
        this.context = applicationContext;
        this.listGulasch= listGulasch;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listGulasch.size();
    }

    @Override
    public Object getItem(int i) {
        return listGulasch.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewOrderId=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAddress=(TextView)view.findViewById(R.id.textViewListAddress);
        TextView viewChefName=(TextView)view.findViewById(R.id.textViewListPhone);

        Gulasch gulasch = listGulasch.get(i);
        viewOrderId.setText("Order ID: "+gulasch.getOrderId());
        viewAddress.setText(gulasch.getRestaurantAddress());
        viewChefName.setText(gulasch.getCookFirstName()+" "+gulasch.getCookLastName());

        return view;
    }
}
