package aulas;

public class VariaveisMetodos {

    public static void main(String[] args) {

        // estrutura básica da vairável
        // Tipo NomeBem Definido = Atribuição (opicional)

        String primeiroNome = "Meu";
        String segundoNome = "Nome";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        // corpo do método nomeCompleto
        //estrutura básica do método
        // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

        // return primeiroNome.concat(" ").concat(segundoNome);

        return "Resultado do método NomeCompleto é " + primeiroNome.concat(" ").concat(segundoNome);

    }

}
