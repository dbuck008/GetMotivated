package dBuck.getmotivated;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView quote_textview;
    TextView author_textview;
    Button next_button;
    ImageButton favorite_button;
    Button share_button;
    Quote quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init()
    {
        quote_textview = (TextView) findViewById(R.id.tv_quote);
        author_textview =(TextView) findViewById(R.id.tv_author);
        next_button = (Button) findViewById(R.id.b_next);
        favorite_button = (ImageButton) findViewById(R.id.b_favorite);
        share_button = (Button) findViewById(R.id.b_share);
        favorite_button.setOnClickListener(this);
        share_button.setOnClickListener(this);
        next_button.setOnClickListener(this);
        Quote quote = Quote.getRandomQuote();
        quote_textview.setText("\"" + quote.getQuoteString() + "\"");
        author_textview.setText("-" + quote.getAuthor());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            case R.id.action_settings:
                break;
            case R.id.aboutUs:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.b_next:
                quote = Quote.getRandomQuote();
                quote_textview.setText("\"" + quote.getQuoteString() + "\"");
                author_textview.setText("-" + quote.getAuthor());
                break;
            case R.id.b_favorite:
                break;
            case R.id.b_share:
                break;
        }
    }
}
