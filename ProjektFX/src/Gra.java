package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Gra {

    private int ID_Gry;
    private int time_spend;
    private String nazwa;

    public Gra(String name,int gameID){    //konstruktor obiektu
        this.nazwa=name;
        this.ID_Gry= gameID;
    }

    public String getNazwa(){                   //getter nazwy
        return nazwa;
    }

    @Override
    public String toString() {
        return "Gra{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}

