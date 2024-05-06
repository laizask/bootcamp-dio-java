package edu.laiza.segundasemana;
public class MinhaClasse {
public static void main (String [] args ) {

    String primeiroNome = "Laiza";
    String segundoNome = "Barbosa";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Redultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}