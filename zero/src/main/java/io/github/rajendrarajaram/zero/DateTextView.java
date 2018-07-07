package io.github.rajendrarajaram.zero;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTextView  extends AppCompatTextView {

    private Calendar calendar;
    private SimpleDateFormat outputFormat;
    private SimpleDateFormat inpuFormat;

    public DateTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        calendar = Calendar.getInstance();
        outputFormat  = new SimpleDateFormat(Constants.Date.FULL);

        setText(outputFormat.format(calendar.getTime()));
    }

    public DateTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(attrs);
        init();
    }

    public DateTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttrs(attrs);
        init();
    }

    public  void changeFormat(String s)
    {
        outputFormat  = new SimpleDateFormat(s);
        setText(outputFormat.format(calendar.getTime()));

    }


    public void setDate(String dateStr)
    {
        try {
            //DateFormat srcDf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = inpuFormat.parse(dateStr);
            //DateFormat destDf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
            // format the date into another format

            dateStr = outputFormat.format(date);
            setText(dateStr);
        }

        catch (ParseException e) {

            e.printStackTrace();

        }

    }

    private  void initAttrs(AttributeSet set)
    {
        if (set!=null)
        {
            TypedArray typedArray= getContext().obtainStyledAttributes(set, R.styleable.DateTextView);
            String dateInput = typedArray.getString(R.styleable.DateTextView_dateformat);

            inpuFormat  = new SimpleDateFormat(dateInput);
        }

    }
}
