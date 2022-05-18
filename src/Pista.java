public class Pista {
    private long start, stop;
    private double tempo;
    private Semafori s;

    

    public Pista(Semafori s) {
        this.start = 0;
        this.stop = 0;
        this.tempo = 0;
        this.s = s;
    }

    

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getStop() {
        return stop;
    }

    public void setStop(long stop) {
        this.stop = stop;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public void corsa(String nome){
        s.p();
        System.out.println(nome + ": Inizia la gara");
        long start = System.nanoTime();
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {}
        }
        long stop = System.nanoTime();
        tempo = stop - start;
        System.out.println(nome + ": Finisce la gara");
        this.setTempo(tempo / 1000000);
        s.v();
    }
    
}
