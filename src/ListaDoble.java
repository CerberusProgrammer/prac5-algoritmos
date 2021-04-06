public class ListaDoble<T> {

    Nodo<T> inicio;

    public ListaDoble() {
        inicio = null;
    }

    void insertaInicio(T dato) {
        Nodo<T> n = new Nodo<>();
        n.setInfo(dato);
        n.setSig(inicio);
        n.setAnt(null);

        if (inicio != null)
            inicio.ant = n;

        inicio = n;
    }

    void insertFinal(T dato) {
        Nodo<T> n = new Nodo<>();
        n.setInfo(dato);
        n.setSig(null);

        if (inicio == null) {
            n.setAnt(inicio);
            inicio = n;
        } else {
            Nodo<T> r = new Nodo<>();
            r = inicio;

            while (r.sig != null)
                r = r.sig;

            r.setSig(n);
            n.setAnt(r);
        }
    }

    T eliminaInicio() {
        Nodo<T> nodo = inicio;

        if (inicio == null)
            return null;
        else if (inicio.sig == null)
            inicio = null;
        else {
            inicio = inicio.sig;
            inicio.setAnt(null);
        }

        return nodo.info;
    }

    T eliminaFinal() {
        Nodo<T> x = new Nodo<>();

        if (inicio == null)
            return null;
        else if (inicio.sig == null) {
            x = inicio;
            inicio = null;
        } else {
            Nodo<T> r = inicio;

            while (r.sig != null)
                r = r.sig;

            r.ant.setSig(null);
            x = r;
        }

        return x.info;
    }

    String recorre() {
        if (inicio != null) {
            String s = "";
            Nodo<T> x = inicio;

            while (x != null) {
                s += x.info + "\n";
                x = x.sig;
            }

            return s;
        }

        return "vacio";
    }
}
