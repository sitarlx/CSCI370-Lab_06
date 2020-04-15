package asyncs;

import android.content.Intent;
import android.os.AsyncTask;

import androidx.room.Database;

import com.introtoandroid.dblab.PersonsActivity;

import java.util.ArrayList;

import entities.Person;

public class personOne extends AsyncTask {
    
    Person person = new Person(21, "Logan Sitar");
    Database database;
    
    @Override
    protected Object doInBackground(Object[] objects) {
        database.personDao().insertPerson(person);
        ArrayList<String> personNames = new ArrayList<>();
        for(Person p: persons) {
            personNames.add(p.getName());
        }

        Intent i = new Intent(context, PersonsActivity.class);
        i.putExtra("Persons", personNames);
        context.startActivity(i);
    }
}
