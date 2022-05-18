import java.util.ArrayList;

public class ListaPersone {
    private ArrayList<Persona> persone;

    public ListaPersone() {
        persone = new ArrayList<>();
    }

    public ArrayList<Persona> getPersone() {
        return persone;
    }

    public void setPersone(ArrayList<Persona> persone) {
        this.persone = persone;
    }


    public void addPersone(Persona p){
        persone.add(p);
    }

    public int lunghezzaArray(){
        int count = 0;
        for (int i = 0; i < persone.size(); i++) {
            count++;
        }
        return count;
    }
}
