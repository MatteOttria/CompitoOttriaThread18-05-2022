import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        Semafori s1 = new Semafori(2);
        Semafori s2 = new Semafori(4);
        Spogliatoio spo = new Spogliatoio(s1);
        Pista pis = new Pista(s2);
        ListaPersone la = new ListaPersone();

        Persona p1 = new Persona("Mirko", "Ragusa", spo, pis);
        Persona p2 = new Persona("Alessandro", "Ferretti", spo, pis);
        Persona p3 = new Persona("Matteo", "Ottria", spo, pis);
        Persona p4 = new Persona("Gabriele", "Duka", spo, pis);
        Persona p5 = new Persona("Mattia", "Vestri", spo, pis);
        Persona p6 = new Persona("Davide", "Apolito", spo, pis);
        Persona p7 = new Persona("Federico", "Borrometi", spo, pis);
        Persona p8 = new Persona("Giulio", "Andreotti", spo, pis);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        la.addPersone(p1);
        la.addPersone(p2);
        la.addPersone(p3);
        la.addPersone(p4);
        la.addPersone(p5);
        la.addPersone(p6);
        la.addPersone(p7);

        Collections.sort(la.getPersone());

        for (int i = 0; i < la.lunghezzaArray(); i++) {
            System.out.println(i + ": " + la.getPersone().get(i).getCognome() + ", Tempo: " + la.getPersone().get(i).getTempo());
        }
    }
}
