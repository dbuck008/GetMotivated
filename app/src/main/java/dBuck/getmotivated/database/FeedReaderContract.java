package dBuck.getmotivated.database;

import android.provider.BaseColumns;

/**
 * Created by Dillon on 7/24/2014.
 */
public final class FeedReaderContract {
    public FeedReaderContract(){}

    public static abstract class FeedEntry implements BaseColumns{
        public static final String TABLE_NAME = "Quotes";
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_QUOTE = "quote";
        public static final String COLUMN_NAME_AUTHOR = "author";
        public static final String COLUMN_NAME_CATEGORY = "category";
    }
}
