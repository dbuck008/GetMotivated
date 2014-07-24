package dBuck.getmotivated.NavigationDrawer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import dBuck.getmotivated.NavigationDrawer.NavigationDrawerItem;
import dBuck.getmotivated.R;

/**
 * Created by Dillon on 7/24/2014.
 */
public class CustomAdapter extends BaseAdapter {

    Context context;
    List<NavigationDrawerItem> navDrawerItem;

    CustomAdapter(Context context, List<NavigationDrawerItem> navDrawerItem)
    {
        this.context = context;
        this.navDrawerItem = navDrawerItem;
    }

    @Override
    public int getCount() {
        return navDrawerItem.size();
    }

    @Override
    public Object getItem(int position) {
        return navDrawerItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return navDrawerItem.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.navigation_drawer_list_items, null);
        }

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);

        NavigationDrawerItem row_pos = navDrawerItem.get(position);
        // setting the image resource and title
        imgIcon.setImageResource(row_pos.getIcon());
        txtTitle.setText(row_pos.getTitle());

        return convertView;
    }
}
