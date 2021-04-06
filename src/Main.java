public class Main {

    public static void main(String[] args) {
        ListaDoble<String> listaDoble = new ListaDoble<>();
        listaDoble.insertaInicio("hola");
        listaDoble.insertaInicio("x");
        listaDoble.insertaInicio("y");
        listaDoble.insertFinal("Heelllos");

        System.out.println("Lista: [ \n" + listaDoble.recorre() + " ]");

        System.out.println(listaDoble.eliminaInicio());
        System.out.println(listaDoble.eliminaFinal());

        System.out.println("Lista: [ \n" + listaDoble.recorre() + "]");
    }
}
