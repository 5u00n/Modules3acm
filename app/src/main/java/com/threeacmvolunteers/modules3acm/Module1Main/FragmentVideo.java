package com.threeacmvolunteers.modules3acm.Module1Main;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.JsonWriter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.threeacmvolunteers.modules3acm.Module0.FragmentAggrement;
import com.threeacmvolunteers.modules3acm.R;
import com.threeacmvolunteers.modules3acm.SupportClasses.ArrayAdapterVideo;
import com.threeacmvolunteers.modules3acm.SupportClasses.JsonSupport;
import com.threeacmvolunteers.modules3acm.SupportClasses.Strings;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FragmentVideo extends Fragment {

    int position;
    DatabaseReference myRef,chRef;
    ListView lists;
    List<Strings> str;
    VideoView videoview;
    String st;
    MediaController mdc;
    FrameLayout framelayout;
    Uri ur=null;
    Context cnt;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState == null){
            // Get back arguments
            if(getArguments() != null) {
                position = getArguments().getInt("position", 0);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {

        // Inflate the xml file for the fragment
        return inflater.inflate(R.layout.fragment_video, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Set values for view here
        myRef= FirebaseDatabase.getInstance().getReference("Url/hello");
        lists= (ListView) view.findViewById(R.id.listview_video_lay_lists);
        str=new ArrayList<>();
        //myRef.setValue("Hello, World!");




        lists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               // TextView clickedView = (TextView) view.findViewById(R.id);
              //  clickedView.setVisibility(View.GONE);

               // ur=Uri.parse((String) clickedView.getText());


            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        String id = myRef.push().getKey();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        dateFormat.format(date);
        Strings str1= new Strings("1","test","testing my code",dateFormat.format(date),timeFormat.format(date),"xxxxxxxx","hello");
       myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
               // DataSnapshot contactSnapshot = dataSnapshot.child("VideoUrl");
                str.clear();
                for(DataSnapshot urllistS: dataSnapshot.getChildren())
                {
                    //str.clear();
                    Strings urllist= urllistS.getValue(Strings.class);
                    JsonSupport.logJson(urllist);
                    JsonSupport.saveData(getActivity(),urllist);
                    str.add(urllist);
                }
                ArrayAdapterVideo arrayapt;
                arrayapt = new ArrayAdapterVideo(getActivity(),str);
                lists.setAdapter(arrayapt);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("HEXXXXXXXXXXXX", "Failed to read value.", error.toException());
            }
        });
    }

    // Activity is calling this to update view on Fragment
    public void updateView(int position){

    }
}
