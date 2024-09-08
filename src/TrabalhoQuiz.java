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
        q1.pergunta = "qual numero é par?";
        q1.opcaoA = "A - 18 ";
        q1.opcaoB = " B - 21 ";
        q1.opcaoC = "C - 31";
        q1.opcaoD = "D - 1";
        q1.opcaoE = "E - 3";
        q1.correta = "A";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        q1.isCorreta(resposta);

    }
}
