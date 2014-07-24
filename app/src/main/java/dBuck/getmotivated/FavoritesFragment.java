package dBuck.getmotivated;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import dBuck.getmotivated.dummy.DummyContent;

//TODO: populate the listview with all quotes that have a weight of 1
public class FavoritesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.favorites_fragment, container, false);
        ListView listView = (ListView) view.findViewById(R.id.lv_favorites);
        final List<Quote> listFavorites = new ArrayList<Quote>(Quote.getFavoriteQuotes());
        final ArrayAdapter<Quote> arrayAdapter = new ArrayAdapter<Quote>(view.getContext(), android.R.layout.simple_list_item_2, android.R.id.text1, listFavorites){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = (TextView) view.findViewById(android.R.id.text1);
                TextView text2 = (TextView) view.findViewById(android.R.id.text2);

                text1.setText(listFavorites.get(position).getQuoteString());
                text2.setText(listFavorites.get(position).getAuthor());
                return view;
            }
        };
        listView.setAdapter(arrayAdapter);
        return view;
    }

}
