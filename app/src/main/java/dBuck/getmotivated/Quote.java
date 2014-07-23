package dBuck.getmotivated;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dillon on 7/22/2014.
 */
public class Quote {
    private static final String TAG = "Quote";

    private static List<Quote> quotes = new ArrayList<Quote>();
    String quote = "";
    String author = "";
    int weight = 0;

    public Quote(String q, String a) {
        q = q.trim().replace("\"", "'");
        if(!(q.endsWith(".") || q.endsWith("!") || q.endsWith("?") || q.endsWith("'"))) { q = q + "."; }
        quote = q;
        author = a;
        if(!q.isEmpty() && !a.isEmpty()) { quotes.add(this); }
    }

    public Quote(String q)
    {
        new Quote(q, "Unknown");
    }

    public static void initQuotes()
    {
        new Quote("Asking dumb questions is easier than fixing dumb mistakes.", "Madison Buck");
        new Quote("Success in not final, failure is not fatal: it is the courage to continue that counts.", "Winston Churchill");
        new Quote("Try to perceive this world from your own point of understanding and it'll be long before you learn something new. Refer to diverse understandings from diverse people and your mind will go places…");
        new Quote("Twenty years from now you will be more disappointed by the things you didn't do than by the ones you did do.  So throw off the bowlines.  Sail away from the safe harbor.  Catch the trade winds in your sails.  Explore.  Dream.  Discover.", "Mark Twain");
        new Quote("Everything that irritates us about others can lead us to a better understanding of ourselves.", "Carl Gustav Jung");
        new Quote("Never underestimate your power to change yourself; never overestimate your power to change others.", "Wayne Dyer");
        new Quote("When you squeeze an orange, orange juice comes out - because that is what's inside. When you are squeezed, what comes out is what is inside.", "Wayne Dyer");
        new Quote("You can't force love, I realized. It's there or it isn't. If it's not there, you've got to be able to admit it. If it is there, you've got to do whatever it takes to protect the ones you love.", "Richelle Mead");
        new Quote("There comes a time in your life when you have to let go of all the pointless drama and the people who create it and surround yourself with people who make you laugh so hard that you forget the bad and focus solely on the good. After all, life is to short to be anything but happy.");
        new Quote("Nothing lasts forever; so live it up, drink it down, avoid the negativity, take chances and never regret because at one point it was what you wanted.");
        new Quote("Few people are capable of expressing with equanimity opinions which differ from the prejudices of their social environment. Most people are even incapable of forming such opinions.", "Albert Einstein");
        new Quote("Never allow someone to be your priority while allowing yourself to be their option.", "Mark Twain");
        new Quote("If people are good only because they fear punishment, and hope for reward, then we are a sorry lot indeed.", "Albert Einstein");
        new Quote("Blowing out someone else’s candle, doesn't make yours any brighter.");
        new Quote("Impossible is just a big word thrown around by small men who find it easier to live in the world they've been given than to explore the power they have to change it. Impossible is not a fact. It's an opinion. Impossible is not a declaration. It's a dare. Impossible is potential. Impossible is temporary. Impossible is nothing.", "Muhammad Ali");
        new Quote("Sometimes Me Think, 'What is Friend?' and then me say, 'Friend is someone to share the last cookie with.", "Cookie Monster");
        new Quote("Life is too short to be miserable, if you’re not happy with something, change it!");
        new Quote("Dumb people make dumb decisions because they are dumb, intelligent people make dumb decisions because they’re human. The trick to determining who's who, is that the dumb people publicize and rationalize all their incompetence. The intelligent people admit they were dumb and hide their shame from the world like everyone should.");
        new Quote("Many people die at twenty five and aren't buried until they are seventy five.", "Benjamin Franklin");
        new Quote("Being happy doesn't mean that everything is perfect. It means that you've decided to look beyond the imperfections.");
        new Quote("Thousands of candles can be lighted from a single candle, and the life of the candle will not be shortened. Happiness never decreases by being shared.", "Buddha");
        new Quote("Remember, happiness doesn't depend upon who you are or what you have; it depends solely on what you think.", "Dale Carnegie");
        new Quote("Love is when the other person's happiness is more important than your own.", "H. Jackson Brown, Jr.");
        new Quote("Success is getting what you want. Happiness is liking what you get.", "H. Jackson Brown, Jr.");
        new Quote("People take different roads seeking fulfillment and happiness. Just because they're not on your road doesn't mean they've gotten lost.", "H. Jackson Brown, Jr.");
        new Quote("The world bursts at the seams with people ready to tell you you’re not good enough. On occasion, some may be correct. But do not do their work for them. Seek any job; ask anyone out; pursue any goal. Don’t take it personally when they say \"no\" – they may not be smart enough to say \"yes\".", "Keith Olbermann");
        new Quote("Nothing in the world is more dangerous than sincere ignorance.");
        new Quote("Every person you will ever meet knows something you don't.", "Bill Nye");
        new Quote("There is no one so rich they don't need or so poor that they cannot help.");
        new Quote("True ideas possess greater ultimate power than physical might");
        new Quote("You outlive something by living it out.");
        new Quote("When nothing seems to help, I go look at a stone cutter hammering away at his rock perhaps a hundred times without as much as a crack showing in it. Yet at the hundred and first blow it will split in two, and I know it was not that blow that did it, but all that had gone before.", "Jacob Riis");
        new Quote("Go confidently in the direction of your dreams. Live the life you have imagined.", "Henry David Thoreau");
        new Quote("To argue with a person that has renounced the use of reason is like administering medicine to the dead.", "Thomas Paine");
        new Quote("To be upset over what you don't have is to waste what you do have.", "Ken S. Keyes Jr.");
        new Quote("In order to succeed, we must first believe that we can.", "Nikos Kazantzakis");
        new Quote("If you can dream it, you can do it.", "Walk Disney");
        new Quote("Even if you fall on your face, you're still moving forward.", "Victor Kiam");
        new Quote("By failing to prepare, you are preparing to fail.", "Benjamin Franklin");
        new Quote("I don't believe you have to be better than everybody else. I believe you have to be better than you ever thought you could be.", "Ken Venturi");
        new Quote("Change your life today. Don't gamble on the future, act now, without delay.", "Simone de Beauvoir");
        new Quote("Don't watch the clock; do what it does. Keep going.", "Sam Levenson");
        new Quote("If your going through hell, keep going.", "Winston Churchill");
        new Quote("Without hard work, nothing grows but weeds.", "Gordon B. Hinckley");
        new Quote("Be miserable. Or motivate yourself. Whatever has to be done, it's always your choice.", "Wayne Dyer");
        new Quote("The secret of getting ahead is getting started.", "Mark Twain");
        new Quote("The key is to keep company only with people who uplift you, whose presence calls forth your best.", "Epictetus");
        new Quote("Quality is not an act, it is a habit.", "Aristotle");
        new Quote("Setting goals is the first step in turning the invisible into the visible.", "Tony Robbins");
        new Quote("I'd rather attempt to do something great and fail than to attempt to do nothing and succeed.", "Robert H. Schuller");
        new Quote("Well done is better than well said.", "Benjamin Franklin");
    }

    public static List getAllQuotes() { return quotes; }

    public static Quote getRandomQuote()
    {
        int num = (int) (Math.random()*quotes.size());
        Log.i(TAG, "num: " + Integer.toString(num));
        return quotes.get(num);
    }

    public String getAuthor() { return this.author; }

    public String getQuoteString() { return this.quote; }

}
