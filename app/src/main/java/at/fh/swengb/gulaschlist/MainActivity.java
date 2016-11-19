package at.fh.swengb.gulaschlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.gulaschlist.model.Gulasch;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Gulasch> listGulasch;
    private ListView myListView;
    private CostumAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myGulaschList);

        listGulasch = new ArrayList<>();
        listGulasch.add(new Gulasch("Johann","Blauensteiner","Alte Poststraße 147, 8020 Graz","01 020304050","2016"));
        listGulasch.add(new Gulasch("Johann","Blauensteiner","Alte Poststraße 147, 8020 Graz","01 020304050","2015"));
        listGulasch.add(new Gulasch("Peter","Scalalhofer","Alte Poststraße 147, 8020 Graz","01 04444050","666"));
        listGulasch.add(new Gulasch("Laszlo","Balo","Steyrergasse 99, 8010 Graz","02 65044050","1111"));
        listGulasch.add(new Gulasch("Laszlo","Balo","Steyrergasse 99, 8010 Graz","02 65044050","1121"));
        listGulasch.add(new Gulasch("Tery","Neuhold","Floraquellweg 45, 8051 Graz","08 65044050","2221"));
        listGulasch.add(new Gulasch("Tery","Neuhold","Floraquellweg 45, 8051 Graz","08 65044050","3221"));
        listGulasch.add(new Gulasch("Berni","Danecker","Keplerbrück Graz","09 65044050","3221"));



        myAdapter = new CostumAdapter(this, listGulasch);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Gulasch selectedGulasch = listGulasch.get(i);
        Intent intent = new Intent(view.getContext(),ShowGulaschActivity.class);
        intent.putExtra("gulasch",selectedGulasch);
        startActivity(intent);

    }
}
