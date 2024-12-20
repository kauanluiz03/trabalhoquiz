import java.util.Scanner;

public class TrabalhoQuiz {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int acertos = 0;
        int erros = 0;
        System.out.println("FACULDADE ALFREDO NASSER - UNIFAN");
        System.out.println("--------------------------------------------------");
        System.out.println("ALUNO : KAUAN LUIZ DE SOUTO SILVA");
        System.out.println("PROFESSOR : BRENO PIMENTA - ALGORITMO E PROGRAMAÇÃO II");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("OLA USUARIO,SEJA BEM VINDO AO NOSSO QUIZ , ANTES DE COMEÇAR O QUESTIONARIO GOSTARIA DE SABER QUAL O SEU NOME:");
        String a = leia.nextLine();

        System.out.println("BOM ," + a + " SEJA BEM VINDO AO QUIZ , VOCÊ IRA AGORA RESPONDER UM QUESTIONARIO DE 15 PERGUNTAS SOBRE GEOGRAFIA ");



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

        if (q1.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }



        Questao q2 = new Questao();
        q2.pergunta = "2 - Quais o menor e o maior país do mundo?";
        q2.opcaoA = "A- Mônaco e Canadá";
        q2.opcaoB = "B- Nauru e China";
        q2.opcaoC = "C- São Marino e Índia";
        q2.opcaoD = "D- Vaticano e Rússia";
        q2.opcaoE = "E- Malta e Estados Unidos";
        q2.correta = "D";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();

        if (q2.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q3 = new Questao();
        q3.pergunta = "3 - Quantos países tem a América? (todas juntas)";
        q3.opcaoA = "A- 67";
        q3.opcaoB = "B- 23";
        q3.opcaoC = "C- 37";
        q3.opcaoD = "D- 24";
        q3.opcaoE = "E- 32";
        q3.correta = "C";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();

        if (q3.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q4 = new Questao();
        q4.pergunta = "4 - Considerando o texto abaixo, marque a alternativa que indica corretamente o elemento conceituado:\n" +
                "\n" +
                "“Um corpo dinâmico de origem mineral e orgânica, formado por material inconsolidado (ou friável) que reveste a superfície do planeta Terra.” ";

        q4.opcaoA = "A- Solo";
        q4.opcaoB = "B- Rocha";
        q4.opcaoC = "C- Aquifero";
        q4.opcaoD = "D- Mineral";
        q4.opcaoE = "E- Minerio";
        q4.correta = "A";

        q4.escrevaQuestao();
        resposta = q4.leiaResposta();

        if (q4.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q5 = new Questao();
        q5.pergunta = "5 - Assinale a alternativa abaixo que NÃO SE REFERE a um aspecto utilizado para a demarcação da época geológica denominada Antropoceno ";
        q5.opcaoA = "A- Uma afirmação feita pelos pesquisadores é que o impacto das ações humanas sobre o planeta será visível em sedimentos e rochas daqui a milhões de anos ";
        q5.opcaoB = "B- Uma variedade de processos antropogênicos, como agricultura, urbanização e aquecimento global foram levados em consideração para se pensar em uma nova época geológica.";
        q5.opcaoC = "C- A partir da primeira Revolução Industrial, o crescimento da população passa a se tornar um novo agente transformador do planeta que atuará junto com os demais agentes ambientais";
        q5.opcaoD = "D- A expansão da agricultura e a domesticação dos animais têm um impacto reduzido nas transformações do planeta. Dos processos considerados, aponta-se que a urbanização e a industrialização são os únicos responsáveis pelas mudanças.";
        q5.opcaoE = "E- A extinção em massa de diversas espécies e a alteração da composição atmosférica, principalmente pelo aumento de gases de efeito estufa, são fenômenos que caracterizam o início do Antropoceno.";
        q5.correta = "D";

        q5.escrevaQuestao();
        resposta = q5.leiaResposta();

        if (q5.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q6 = new Questao();
        q6.pergunta = "6 - No território brasileiro, a ausência de cadeias montanhosas explica-se:";
        q6.opcaoA = "A- pela pouca atuação dos agentes externos de transformação do relevo";
        q6.opcaoB = "B- pela intensiva ação humana sobre as áreas naturais";
        q6.opcaoC = "C- pelas intensas atuações do tectonismo";
        q6.opcaoD = "D- pelo escasseamento dos depósitos sedimentares";
        q6.opcaoE = "E- naturais pela ausência de dobramentos modernos";
        q6.correta = "E";

        q6.escrevaQuestao();
        resposta = q6.leiaResposta();

        if (q6.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q7 = new Questao();
        q7.pergunta = " 7 - A elevação dos pontos de relevo é um aspecto importante na caracterização climática. As zonas de elevada altitude estão relacionadas à ocorrência de";
        q7.opcaoA = "A- grandes tempestades.";
        q7.opcaoB = "B- estiagens severas.";
        q7.opcaoC = "C- elevada pressão do ar";
        q7.opcaoD = "D- temperaturas altas";
        q7.opcaoE = "E- temperaturas baixas";
        q7.correta = "D";

        q7.escrevaQuestao();
        resposta = q7.leiaResposta();

        if (q7.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q8 = new Questao();
        q8.pergunta = "8 - (UEG 2018) A média da amplitude térmica na cidade de Cuiabá (MT) durante o mês de junho é de 15,2 °C, ao passo que em Salvador (BA) é de 4,8 °C." +
                " Considerando-se a localização geográfica dessas cidades, o principal fator climático responsável por essa diferença na amplitude térmica é a:";

        q8.opcaoA = "A- altitude";
        q8.opcaoB = "B- latitude";
        q8.opcaoC = "C- longitude";
        q8.opcaoD = "D- pressão atmosférica";
        q8.opcaoE = "E- maritimidade/continentalidade";
        q8.correta = "E";

        q8.escrevaQuestao();
        resposta = q8.leiaResposta();

        if (q8.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q9 = new Questao();
        q9.pergunta = "9 - (IF-GO) Desertificação é a degradação de terras nas regiões áridas, semi-áridas e subúmidas secas, resultante de vários fatores, entre eles as variações climáticas e as atividades humanas." +
                " Sobre a vegetação de climas desérticos, assinale a única opção correta";
        q9.opcaoA = "A- É formada por plantas xerófilas.";
        q9.opcaoB = "B- É formada por vegetação tropófilas";
        q9.opcaoC = "C- É formada por vegetação arbustiva e herbácea";
        q9.opcaoD = "D- É formada por vegetação mediterrânea e herbácea";
        q9.opcaoE = "E- É formada por espécies de folhas perenes";
        q9.correta = "A";

        q9.escrevaQuestao();
        resposta = q9.leiaResposta();

        if (q9.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q10 = new Questao();
        q10.pergunta = "10 - Assinale a alternativa que apresenta um tipo climático que ocorre no território brasileiro:";
        q10.opcaoA = "A- frio de montanha";
        q10.opcaoB = "B- mediterrâneo";
        q10.opcaoC = "C- polar";
        q10.opcaoD = "D- desértico";
        q10.opcaoE = "E- tropical semiárido";
        q10.correta = "E";

        q10.escrevaQuestao();
        resposta = q10.leiaResposta();

        if (q10.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q11 = new Questao();
        q11.pergunta = "11 - Uma manifestação geomorfológica resultante da consolidação do material magmático na superfície é:";
        q11.opcaoA = "A- a constituição de formas de relevo aplainadas";
        q11.opcaoB = "B- a maior atuação dos agentes exógenos do relevo";
        q11.opcaoC = "C- o reposicionamento das camadas sedimentares";
        q11.opcaoD = "D- a formação de rochas ígneas extrusivas";
        q11.opcaoE = "E- o desencadeamento de processos intempéricos.";
        q11.correta = "D";

        q11.escrevaQuestao();
        resposta = q11.leiaResposta();

        if (q11.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }


        Questao q12 = new Questao();
        q12.pergunta = "12 - (FUVEST)\n" +
                "\n" +
                "O vulcanismo é um dos processos da dinâmica terrestre que sempre encantou e amedrontou a humanidade, existindo diversos registros históricos referentes a esse processo. Sabe-se que as atividades vulcânicas trazem novos materiais para locais próximos à superfície terrestre.\n" +
                "\n" +
                "A esse respeito, pode-se afirmar corretamente que o vulcanismo";

        q12.opcaoA = "A- é um dos poucos processos de liberação de energia interna que continuará ocorrendo indefinidamente na história evolutiva da Terra";
        q12.opcaoB = "B-  é um fenômeno tipicamente terrestre, sem paralelo em outros planetas, pelo que se conhece atualmente.";
        q12.opcaoC = "C- traz para a atmosfera materiais nos estados líquido e gasoso, tendo em vista originarem-se de todas as camadas internas da Terra.";
        q12.opcaoD = "D- é o processo responsável pelo movimento das placas tectônicas, causando seu rompimento e o lançamento de materiais fluidos.";
        q12.opcaoE = "E- ocorre, quando aberturas na crosta aliviam a pressão interna, permitindo a ascensão de novos materiais e mudanças em seus estados físicos";
        q12.correta = "E";

        q12.escrevaQuestao();
        resposta = q12.leiaResposta();

        if (q12.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q13 = new Questao();
        q13.pergunta = "13 -Marque a alternativa que indica a maior bacia hidrográfica do mundo:";
        q13.opcaoA = "A- bacia do Mississipi";
        q13.opcaoB = "B- bacia do Amazonas";
        q13.opcaoC = "C- bacia do Congo";
        q13.opcaoD = "D- bacia do Nilo";
        q13.opcaoE = "E-  bacia Platina";
        q13.correta = "B";

        q13.escrevaQuestao();
        resposta = q13.leiaResposta();

        if (q13.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q14 = new Questao();
        q14.pergunta = "14 - A bacia do rio ________ é basicamente de planície, sendo amplamente utilizada para navegação e escoamento de produção dos três países banhados por esse rio: Argentina; Brasil; Paraguai. \n" +
                "\n" +
                "A bacia citada no texto tem como rio principal: \n" +
                "\n" +
                " ";
        q14.opcaoA = "A- Paraná";
        q14.opcaoB = "B- Uruguai";
        q14.opcaoC = "C-  Paraguai";
        q14.opcaoD = "D-  São Francisco";
        q14.opcaoE = "E-  Araguaia";
        q14.correta = "C";

        q14.escrevaQuestao();
        resposta = q14.leiaResposta();

        if (q14.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q15 = new Questao();
        q15.pergunta = "15 -Qual das seguintes afirmações sobre a hidrografia do Brasil está correta?";
        q15.opcaoA = "A- O rio Amazonas é o maior rio em extensão do Brasil.";
        q15.opcaoB = "B- O rio Paraná forma a maior usina hidrelétrica do Brasil, a Usina de Itaipu.";
        q15.opcaoC = "C-  A bacia do rio São Francisco é a maior bacia hidrográfica do Brasil.";
        q15.opcaoD = "D- O Brasil possui poucas bacias hidrográficas devido ao seu clima seco.";
        q15.opcaoE = "E-  A bacia Amazônica é a menor bacia hidrográfica do Brasil.";
        q15.correta = "B";

        q15.escrevaQuestao();
        resposta = q15.leiaResposta();



        if (q15.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        System.out.println("Fim do Quiz!");
        System.out.println("Você acertou " + acertos + " questões.");
        System.out.println("Você errou " + erros + " questões.");

        // Cálculo da porcentagem de acertos
        int totalQuestoes = acertos + erros;
        double porcentagemAcertos = ((double) acertos / totalQuestoes) * 100;
        System.out.println("Sua porcentagem de acertos foi: " + String.format("%.2f", porcentagemAcertos) + "%.");

    }
}
