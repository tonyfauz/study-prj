public class Bottiglia<T extends Bevanda > {

    T contenuto;

    public Bottiglia(T bottiglia) {
        this.contenuto = bottiglia;
    }
    public T getContenuto(){
        return this.contenuto;
    }
}
