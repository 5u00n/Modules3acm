package com.threeacmvolunteers.modules3acm.SupportClasses;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.threeacmvolunteers.modules3acm.R;

import java.util.List;

public class ArrayAdapterVideo  extends ArrayAdapter<Strings>
{
    ImageView img;
    TextView name,url,disc,type,date;
    private Activity context;
    private List<Strings> lists;


    public ArrayAdapterVideo(@NonNull Activity context, List<Strings>lists) {
        super(context, R.layout.video_view_listview,lists);
        this.context=context;
        this.lists=lists;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inf = context.getLayoutInflater();
        View vw =inf.inflate(R.layout.video_view_listview,null,true);
        Strings vl = (Strings)lists.get(position);
        img = (ImageView)vw.findViewById(R.id.image_videoview_thumbnail);

        name = (TextView)vw.findViewById(R.id.text_videoview_name);
        type = (TextView)vw.findViewById(R.id.text_videoview_type);
        url = (TextView)vw.findViewById(R.id.text_videoview_url);
        disc = (TextView)vw.findViewById(R.id.text_videoview_discript);
        date = (TextView)vw.findViewById(R.id.text_videoview_date);
        name.setText(vl.name);
        type.setText(vl.type);
        url.setText(vl.url);
        date.setText(vl.date);
        disc.setText(vl.discription);
       // Uri ur= Uri.parse(v1.url);

      //  String url1 = v1.getUrl();

      /*  RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.drawable.ic_launcher_background);
        requestOptions.error(R.drawable.ic_launcher_foreground);


        Glide.with(getContext())
                .load(url1)
                .apply(requestOptions)
                .thumbnail(Glide.with(getContext()).load(url1))
                .into(im);*/


        return  vw;
    }



    /*public static Bitmap retriveVideoFrameFromVideo(String videoPath)throws Throwable
    {
        Bitmap bitmap = null;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try
        {
            mediaMetadataRetriever = new MediaMetadataRetriever();
            if (Build.VERSION.SDK_INT >= 14)
                mediaMetadataRetriever.setDataSource(videoPath, new HashMap<String, String>());
            else
                mediaMetadataRetriever.setDataSource(videoPath);
            //   mediaMetadataRetriever.setDataSource(videoPath);
            bitmap = mediaMetadataRetriever.getFrameAtTime(1, MediaMetadataRetriever.OPTION_CLOSEST);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new Throwable("Exception in retriveVideoFrameFromVideo(String videoPath)"+ e.getMessage());
        }
        finally
        {
            if (mediaMetadataRetriever != null)
            {
                mediaMetadataRetriever.release();
            }
        }
        return bitmap;
    }*/
}
