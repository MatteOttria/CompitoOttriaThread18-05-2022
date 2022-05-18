public class Persona extends Thread implements Comparable<Persona>{
    private String nome, cognome;
    private double tempo;
    private Spogliatoio s;
    private Pista p;
    
    public Persona(String nome, String cognome, Spogliatoio s, Pista p) {
        this.nome = nome;
        this.cognome = cognome;
        this.tempo = 0;
        this.s = s;
        this.p = p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    @Override
    public int compareTo(Persona p) {
        if (this.getTempo() > p.getTempo()) {
            return 1;
        } else if (this.getTempo() < p.getTempo()) {
            return -1;
        }
        return 0;
    }

    @Override
    public void run(){
        s.cambioNelloSpogliatoio(this.nome);
        p.corsa(this.nome);
        s.cambioNelloSpogliatoio(this.nome);
        this.setTempo(p.getTempo());
    }
}