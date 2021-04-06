public class Nodo<T> {

    T info;
    Nodo<T> sig;
    Nodo<T> ant;

    public Nodo() {
        this.info = null;
        this.sig = null;
        this.ant = null;
    }

    public Nodo(T info, Nodo<T> sig, Nodo<T> ant) {
        this.info = info;
        this.sig = sig;
        this.ant = ant;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo<T> getSig() {
        return sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    public Nodo<T> getAnt() {
        return ant;
    }

    public void setAnt(Nodo<T> ant) {
        this.ant = ant;
    }
}
