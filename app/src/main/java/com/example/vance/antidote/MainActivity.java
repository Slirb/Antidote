package com.example.vance.antidote;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ImageButton agent;
    private ImageButton booth;
    private ImageButton c9;
    private ImageButton mx;
    private ImageButton osler;
    private ImageButton rub;
    private ImageButton serum;
    private ImageButton w2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        agent=(ImageButton)findViewById(R.id.agentButton);
        agent.setTag(1);

        booth=(ImageButton)findViewById(R.id.boothButton);
        booth.setTag(1);

        c9=(ImageButton)findViewById(R.id.c9Button);
        c9.setTag(1);

        mx=(ImageButton)findViewById(R.id.mxButton);
        mx.setTag(1);

        osler=(ImageButton)findViewById(R.id.oslerButton);
        osler.setTag(1);

        rub=(ImageButton)findViewById(R.id.rubButton);
        rub.setTag(1);

        serum=(ImageButton)findViewById(R.id.serumButton);
        serum.setTag(1);

        w2=(ImageButton)findViewById(R.id.w2Button);
        w2.setTag(1);

    }

    public void tonic(View view){


        if(c9.getTag()==1)
        {
                c9.setImageResource(R.drawable.c9_tonic_x);
            c9.setTag(2);
        }
        else
        {
                c9.setImageResource(R.drawable.c9_tonic);
            c9.setTag(1);
        }


    }

    public void agent(View view){


        if(agent.getTag()==1)
        {
            agent.setImageResource(R.drawable.agent_u_x);
            agent.setTag(2);
        }
        else
        {
            agent.setImageResource(R.drawable.agent_u);
            agent.setTag(1);
        }


    }

    public void booth(View view){


        if(booth.getTag()==1)
        {
            booth.setImageResource(R.drawable.bootheide_x);
            booth.setTag(2);
        }
        else
        {
            booth.setImageResource(R.drawable.bootheide);
            booth.setTag(1);
        }


    }

    public void vile(View view){


        if(mx.getTag()==1)
        {
            mx.setImageResource(R.drawable.mx_vile_x);
            mx.setTag(2);
        }
        else
        {
            mx.setImageResource(R.drawable.mx_vile);
            mx.setTag(1);
        }


    }

    public void osler(View view){


        if(osler.getTag()==1)
        {
            osler.setImageResource(R.drawable.oslers_oil_x);
            osler.setTag(2);
        }
        else
        {
            osler.setImageResource(R.drawable.oslers_oil);
            osler.setTag(1);
        }


    }

    public void rub(View view){


        if(rub.getTag()==1)
        {
            rub.setImageResource(R.drawable.rubiximab_x);
            rub.setTag(2);
        }
        else
        {
            rub.setImageResource(R.drawable.rubiximab);
            rub.setTag(1);
        }


    }

    public void serum(View view){


        if(serum.getTag()==1)
        {
            serum.setImageResource(R.drawable.serum_n_x);
            serum.setTag(2);
        }
        else
        {
            serum.setImageResource(R.drawable.serum_n);
            serum.setTag(1);
        }


    }

    public void rose(View view){


        if(w2.getTag()==1)
        {
            w2.setImageResource(R.drawable.w2_rose_x);
            w2.setTag(2);
        }
        else
        {
            w2.setImageResource(R.drawable.w2_rose);
            w2.setTag(1);
        }


    }

    public void reset(View view){

        agent.setImageResource(R.drawable.agent_u);
        agent.setTag(1);

        booth.setImageResource(R.drawable.bootheide);
        booth.setTag(1);

        c9.setImageResource(R.drawable.c9_tonic);
        c9.setTag(1);

        mx.setImageResource(R.drawable.mx_vile);
        mx.setTag(1);

        osler.setImageResource(R.drawable.oslers_oil);
        osler.setTag(1);

        rub.setImageResource(R.drawable.rubiximab);
        rub.setTag(1);

        serum.setImageResource(R.drawable.serum_n);
        serum.setTag(1);

        w2.setImageResource(R.drawable.w2_rose);
        w2.setTag(1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
