package dBuck.getmotivated.dummy;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ShareActionProvider;
import android.widget.TextView;

import dBuck.getmotivated.Quote;
import dBuck.getmotivated.R;


public class QuoteActivity extends ActionBarActivity implements View.OnClickListener {

    TextView quote_textview;
    TextView author_textview;
    ImageButton next_button;
    ImageButton favorite_button;
    ImageButton share_button;
    Quote quote;

    private ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quote_activity);
        init();
        getNewQuote();
    }

    public void init()
    {
        quote_textview = (TextView) findViewById(R.id.tv_quote);
        author_textview =(TextView) findViewById(R.id.tv_author);
        next_button = (ImageButton) findViewById(R.id.b_next);
        favorite_button = (ImageButton) findViewById(R.id.b_favorite);
        share_button = (ImageButton) findViewById(R.id.b_share);
        favorite_button.setOnClickListener(this);
        share_button.setOnClickListener(this);
        next_button.setOnClickListener(this);
    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem item = menu.findItem(R.id.menu_share);
        mShareActionProvider = (ShareActionProvider) item.getActionProvider();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id)
        {
            case R.id.menu_share:
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, quote.getQuoteString() + "\n" + "-" + quote.getAuthor());
                i.setType("text/plain");
                startActivity(i);
                break;
            case R.id.menu_action_settings:
                break;
            case R.id.menu_aboutUs:
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/

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

    private void setShareIntent(Intent shareIntent)
    {
        if(mShareActionProvider != null)
        {
            mShareActionProvider.setShareIntent(shareIntent);
        }
    }

    private void getNewQuote()
    {
        quote = Quote.getRandomQuote();
        quote_textview.setText("\"" + quote.getQuoteString() + "\"");
        author_textview.setText("-" + quote.getAuthor());
        if(quote.getWeight() == 1) {
            favorite_button.setColorFilter(Color.YELLOW);
        }else {
            favorite_button.setColorFilter(Color.WHITE);
        }
    }
}
