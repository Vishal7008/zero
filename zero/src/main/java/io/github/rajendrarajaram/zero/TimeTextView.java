package io.github.rajendrarajaram.zero;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTextView  extends android.support.v7.widget.AppCompatTextView{
private  Calendar calendar;
private DateFormat inpuFormat;
private  SimpleDateFormat outputFormat;
    public TimeTextView(Context context) {
        super(context);
        initTime();
    }


    private void initTime() {
        calendar = Calendar.getInstance();
        boolean is =android.text.format.DateFormat.is24HourFormat(getContext());
         outputFormat  = new SimpleDateFormat(Constants.Time.TwelveHr.SORT);
        if (is)
        {
            outputFormat.applyPattern(Constants.Time.TwentyFourHr.SORT);
        }

        setText(outputFormat.format(calendar.getTime()));
    }

    public TimeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(attrs);
        initTime();

            }

    public TimeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttrs(attrs);
        initTime();
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
         TypedArray typedArray= getContext().obtainStyledAttributes(set, R.styleable.TimeTextView);
String dateInput = typedArray.getString(R.styleable.TimeTextView_timeformat);

inpuFormat  = new SimpleDateFormat(dateInput);
        }

    }





}
