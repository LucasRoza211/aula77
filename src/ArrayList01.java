

import java.util.ArrayList;

public class ArrayList01{
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>(2);

        System.out.println(names.size());

        //adicionando elementos
        names.add("Mariazinha");
        names.add("Pafuncio Silveira");

        //imprimindo o tamanho
        System.out.println(names.size());

        //hinter - hint - dica de parâmetro
        names.add("Cassiano");

//buscando elemento por index
        System.out.println(names.get(0));

        if (names.contains("Cassiano")) {
            System.out.println("Contem");
        } else {
            System.out.println("Não contem");
        }

        System.out.println(names.size());

        System.out.println(names);

        //remover por index
        names.remove(0);
        
        //remover por objeto
        names.remove("Cassiano");

        System.out.println(names.size());

        System.out.println(names);
    }
}
