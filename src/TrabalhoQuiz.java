import java.util.Scanner;

class Questao {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            System.out.println("");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println("");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp){
        if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
        System.out.println("");
        return false;
    }

    public void escrevaQuestao(){
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }

}

public class TrabalhoQuiz {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("FACULDADE ALFREDO NASSER - UNIFAN");
        System.out.println("--------------------------------------------------");
        System.out.println("ALUNO : KAUAN LUIZ DE SOUTO SILVA");
        System.out.println("PROFESSOR : BRENO PIMENTA - ALGORITMO E PROGRAMAÇÃO II");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("OLA USUARIO,SEJA BEM VINDO AO NOSSO QUIZ , ANTES DE COMEÇAR O QUESTIONARIO GOSTARIA DE SABER QUAL O SEU NOME:");
        String a = leia.nextLine();

        System.out.println("BOM ," + a + " VOCÊ IRA AGORA RESPONDER UM QUESTIONARIO DE 15 PERGUNTAS SOBRE GEOGRAFIA ");


        Questao q1 = new Questao();
        q1.pergunta = "1 - O fuso horário é um sistema político adotado amplamente que define os horários civis do países. O sistema de fusos horários está corretamente dividido em";
        q1.opcaoA = "A- 12 fusos de 24 graus";
        q1.opcaoB = "B- 24 fusos de 15 graus";
        q1.opcaoC = "C- 24 fusos de 24 graus";
        q1.opcaoD = "D- 30 fusos de 24 graus";
        q1.opcaoE = "E- 30 fusos de 30 graus";
        q1.correta = "B";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        q1.isCorreta(resposta);



        Questao q2 = new Questao();
        q2.pergunta = "2 - Quais o menor e o maior país do mundo?";
        q2.opcaoA = "A- Mônaco e Canadá";
        q2.opcaoB = "B- Nauru e China";
        q2.opcaoC = "C- São Marino e Índia";
        q2.opcaoD = "D- Vaticano e Rússia";
        q2.opcaoE = "E- Malta e Estados Unidos";
        q2.correta = " D";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        q2.isCorreta(resposta);

        Questao q3 = new Questao();
        q3.pergunta = "3 - Quantos países tem a América? (todas juntas)";
        q3.opcaoA = "A- 67";
        q3.opcaoB = "B- 23";
        q3.opcaoC = "C- 37";
        q3.opcaoD = "D- 24";
        q3.opcaoE = "E- 32";
        q3.correta = " C";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        q3.isCorreta(resposta);

        Questao q4 = new Questao();
        q4.pergunta = "4 - Considerando o texto abaixo, marque a alternativa que indica corretamente o elemento conceituado:\n" +
                "\n" +
                "“Um corpo dinâmico de origem mineral e orgânica, formado por material inconsolidado (ou friável) que reveste a superfície do planeta Terra.” ";

        q4.opcaoA = "A- Solo";
        q4.opcaoB = "B- Rocha";
        q4.opcaoC = "C- Aquifero";
        q4.opcaoD = "D- Mineral";
        q4.opcaoE = "E- Minerio";
        q4.correta = " A";

        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        q4.isCorreta(resposta);

        Questao q5 = new Questao();
        q5.pergunta = "5 - ";
        q5.opcaoA = "A- ";
        q5.opcaoB = "B- ";
        q5.opcaoC = "C- ";
        q5.opcaoD = "D- ";
        q5.opcaoE = "E- ";
        q5.correta = " ";

        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        q5.isCorreta(resposta);





    }
}
