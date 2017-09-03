package cl.anpetrus.desafio002e8.data;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Petrus on 03-09-2017.
 */

public class Nodes {

    private DatabaseReference root = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference credentials(){
        return root.child("credentials");
    }

    public DatabaseReference credential(String key){
        return credentials().child(key);
    }
}
