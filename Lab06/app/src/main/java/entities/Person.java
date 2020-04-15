package entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Person {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;

    public Person(int i, String n){
        this.id = i;
        this.name = n;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }
    public void setName(String n){
        this.name = n;
    }

}
