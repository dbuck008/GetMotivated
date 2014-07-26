package dBuck.getmotivated;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.ShareActionProvider;
import android.widget.TextView;


import dBuck.getmotivated.dummy.DummyContent;

public class QuoteFragment extends Fragment implements View.OnClickListener{

    TextView quote_textview;
    TextView author_textview;
    ImageButton next_button;
    ImageButton favorite_button;
    ImageButton share_button;
    Quote quote;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.quote_activity, container, false);

        quote_textview = (TextView) view.findViewById(R.id.tv_quote);
        author_textview =(TextView) view.findViewById(R.id.tv_author);
        next_button = (ImageButton) view.findViewById(R.id.b_next);
        favorite_button = (ImageButton) view.findViewById(R.id.b_favorite);
        share_button = (ImageButton) view.findViewById(R.id.b_share);
        favorite_button.setOnClickListener(this);
        share_button.setOnClickListener(this);
        next_button.setOnClickListener(this);
        getNewQuote();
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.b_next:
                getNewQuote();
                break;
            case R.id.b_favorite:
                if(quote.getWeight() == 1)
                {
                    quote.addWeight(-1);
                    favorite_button.setColorFilter(Color.WHITE);
                }else {
                    quote.addWeight(1);
                    favorite_button.setColorFilter(Color.YELLOW);
                }
                break;
            case R.id.b_share:
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, quote.getQuoteString() + "\n" + "-" + quote.getAuthor());
                i.setType("text/plain");
                startActivity(i);
                break;
        }
    }

    private void getNewQuote()
    {
        quote = Quote.getRandomQuote();
        quote_textview.setText(quote.getQuoteString());
        author_textview.setText("-" + quote.getAuthor());
        if(quote.getWeight() == 1) {
            favorite_button.setColorFilter(Color.YELLOW);
        }else {
            favorite_button.setColorFilter(Color.WHITE);
        }
    }
}
