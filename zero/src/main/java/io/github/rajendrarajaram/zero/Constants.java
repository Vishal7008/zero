package io.github.rajendrarajaram.zero;

public class Constants {
    interface Date
    {
        public static final String FULL = "EEEE,MMMM d,yyyy";
        public static final String LONG = "MMM dd,yyyy";
        public static final String MEDIUM = "MMMM dd,yyyy";
        public static final String SHORT = "dd/M/yyyy";
    }

    interface Time
    {
        interface TwelveHr{
            public static final String FULL = "hh:m:a s";
            public static final String SORT = "hh:m:a";
        }


        interface TwentyFourHr{
            public static final String FULL = "HH:m: s";
            public static final String SORT = "HH:m:";
        }


    }

}
