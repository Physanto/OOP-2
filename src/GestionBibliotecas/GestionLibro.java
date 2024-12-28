package GestionBibliotecas;

import GestionBibliotecas.Interfaces.ValidadorDatos;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionLibro extends Validadores{

    Scanner stdin;
    ArrayList<Libro> listaLibros = new ArrayList<>();

    public GestionLibro(){
        this.stdin = new Scanner(System.in);
    }

    public void Main(){

    }

    public String solicitarDatos(Scanner stdin, String mensaje, ValidadorDatos<String> validadorDatos){

        String entrada;
        do{
            System.out.print(mensaje + ": ");
            entrada = stdin.nextLine();

            if(validadorDatos.validarDato(entrada)){
                return entrada;
            }
            validadorDatos.mensajeError();
        }
        while(true);

        listaLibros.add(new Libro(ISBN, nombre, autor, anno,  numCopias, true));
    }

    public void crearLibro(){

        String ISBN = solicitarDatos(stdin, "Ingresa el ISBN del libro (13 digitos): ", new ValidarISBN());
        String titulo = solicitarDatos(stdin, "Ingresa el titulo del libro: ", new ValidarDatoVacio());
        String autor = solicitarDatos(stdin, "Ingresa el autor del libro: ", new ValidarDatoVacio());
        short anno = Short.parseShort(solicitarDatos(stdin, "Ingresa el anno de publicacion del libro: ", new ValidarAnno()));
        short numCopias = Short.parseShort(solicitarDatos(stdin, "Ingresa el numero de copias disponibles (1-1000): ", new ValidarNumCopias()));
    }
}