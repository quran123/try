package com.example.user.recycleview;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class listdata1 extends AppCompatActivity implements View.OnClickListener {
    Movie movie;

        Intent i=getIntent();
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.item0);

    Bundle b = getIntent().getExtras();
    TextView title = (TextView)findViewById(R.id.list_item1);
    TextView data = findViewById(R.id.list_data);
   // RecyclerView tre = (RecyclerView)findViewById(R.id.recycler_view);
    Context context = getApplicationContext();
   // title.setText(title.get());
    title.setText(getIntent().getStringExtra("TITLE"));
    //if((getIntent().getStringExtra("TITLE")).equals("Mad Max: Fury Road"))
    //title.setText(getIntent().getStringExtra("TITLE"));
    data.setText(getIntent().getStringExtra("GENERE")+"\n"+getIntent().getStringExtra("YEAR"));

 //   LinearLayoutManager recyclerViewLayoutManager = new LinearLayoutManager(context);
   // tre.setLayoutManager(recyclerViewLayoutManager);



}


@Override
public void onClick(View v) {

        }
        }