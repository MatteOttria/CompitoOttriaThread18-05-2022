public class Spogliatoio{
    private Semafori s;

    public Spogliatoio(Semafori s) {
        this.s = s;
    }

    public Semafori getS() {
        return s;
    }

    public void setS(Semafori s) {
        this.s = s;
    }

    public void cambioNelloSpogliatoio(String st){
        s.p();
        System.out.println(st + ": è entrato nello spogliatoio");
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {}
        System.out.println(st + ": è uscito dallo spogliatoio");
        s.v();
    }

}
