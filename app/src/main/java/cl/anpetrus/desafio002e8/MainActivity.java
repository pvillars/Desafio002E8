package cl.anpetrus.desafio002e8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import cl.anpetrus.desafio002e8.data.Nodes;
import cl.anpetrus.desafio002e8.models.Credential;

public class MainActivity extends AppCompatActivity {

    TextView deparmentTv, jobTitleTv, nameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deparmentTv = (TextView) findViewById(R.id.deparmentTv);
        jobTitleTv = (TextView) findViewById(R.id.jobTitleTv);
        nameTv = (TextView) findViewById(R.id.nameTv);

        new Nodes().credential("00030").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Credential credential = dataSnapshot.getValue(Credential.class);

                deparmentTv.setText(credential.getDeparment());
                jobTitleTv.setText(credential.getJobTitle());
                nameTv.setText(credential.getName());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
