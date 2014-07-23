package dBuck.getmotivated;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView quote_textview;
    TextView author_textview;
    Button next_button;
    ImageButton upVote_imagebutton;
    ImageButton downVote_imagebutton;
    Quote quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init()
    {
        Quote.initQuotes();
        quote_textview = (TextView) findViewById(R.id.tv_quote);
        author_textview =(TextView) findViewById(R.id.tv_author);
        next_button = (Button) findViewById(R.id.b_next);
        upVote_imagebutton = (ImageButton) findViewById(R.id.ib_upVote);
        downVote_imagebutton = (ImageButton) findViewById(R.id.ib_downvote);
        upVote_imagebutton.setOnClickListener(this);
        downVote_imagebutton.setOnClickListener(this);
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
            case R.id.ib_upVote:
                quote.addWeight(1);
                Toast.makeText(this, "new weight: " + Integer.toString(quote.getWeight()), Toast.LENGTH_SHORT).show();
                break;
            case R.id.ib_downvote:
                quote.addWeight(-1);
                Toast.makeText(this, "new weight: " + Integer.toString(quote.getWeight()), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
