package com.goyalatul.simplenotetaker;

import android.content.Context;
//import android.icu.text.SimpleDateFormat;
//import android.icu.util.TimeZone;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by A on 28-07-2017.
 */
public class Note implements Serializable{
    private long nDateTime;
    private String nTitle;
    private String nContent;

    public Note(long dateTime,String title,String content)
    {
        nContent=content;
        nDateTime=dateTime;
        nTitle=title;
    }

    public void setContent(String content) {
        nContent = content;
    }

    public void setDateTime(long dateTime){
        nDateTime=dateTime;
    }

    public void setTitle(String title) {
        nTitle = title;
    }

    public long getDateTime(){
        return nDateTime;
    }

    public String getTitle(){
        return nTitle;
    }

    public String getContent(){
        return nContent;
    }

    public String getDateTimeFormatted(Context context){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm", context.getResources().getConfiguration().locale);
        sdf.setTimeZone(TimeZone.getDefault());
        return sdf.format(new Date(nDateTime));
    }
}
