package com.example.project;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment_one extends Fragment {
    TextView text;



    Button btnurl;
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_, viewGroup, false);
       // TextView output = (TextView) view.findViewById(R.id.msg2);
      //  output.setText("Full Name: Ansalna ansalna Jamal. Address: Click the below button ");
        text  = (TextView) view.findViewById(R.id.msg2);



//        btnurl = (Button)view.findViewById(R.id.btnDialog);
//        btnurl.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //FragmentManager manager = getActivity().getSupportFragmentManager();
////                TextView webURL = null;
////                webURL.setText("https://www.yoururl1.com/");
////                Linkify.addLinks(webURL , Linkify.WEB_URLS);

                text.setMovementMethod(LinkMovementMethod.getInstance());




          //  }
       // });
        return view;
    }
}
