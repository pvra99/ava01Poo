import java.util.Scanner;
public class restaurante {
    public static void main(String[] args) throws Exception {

        System.out.println("Bem vindo ao Mequi feliz\n"  + "digite o seu nome:");
        
                        Scanner nome = new Scanner(System.in);
                        String nomeIn = nome.next();
                                         

        System.out.println("Bem-vindo ao Mequi feliz! " + nomeIn + "\n" +
                            "É um prazer receber você em nosso espaço, onde cada refeição é preparada com Alegria, carinho e ingredientes de qualidade.\n " +
                            "A diversão do Mequi esse mes é a turmar do sonic, onde voce pode escolher um entre esses brinquedos:\n" +
                            "(1)Sonic\n" +
                            "(2)Shadow\n" +
                            "(3)Tails\n" +
                            "(4)Amy Rose\n" +
                            "(5)knuckles\n" );
        
        System.out.println("Favor \n digite o codigo de qual diversão deseja! ");
        Scanner codigoDiversão = new Scanner(System.in);
        int codigoDiver01 = codigoDiversão.nextInt();
                        
        if (codigoDiver01 == 1) 
        {System.out.println("Certo!\n"+ "voce escolheu o Sonic\n"+ "agora vamos escolher oq deseja comer!\n");}
        else{
            if (codigoDiver01 == 2)
            {System.out.println("Certo!\n"+"voce escolheu o Shadow\n"+"agora vamos escolher oq deseja comer!\n");}
                else{
                    if (codigoDiver01==3) 
                    {System.out.println("Certo!\n"+ "voce escolheu o Tails\n"+ "agora vamos escolher oq deseja comer!\n");}
                    else{
                        if (codigoDiver01==4) 
                        {System.out.println("Certo!\n"+ "voce escolheu a Amy Rose\n"+ "agora vamos escolher oq deseja comer!\n");}
                        else{
                            if (codigoDiver01==5) 
                            {System.out.println("Certo!\n"+"voce escolheu o Knuckles\n"+  "agora vamos escolher oq deseja comer!\n");}
                             }
                        }
                    }
            }
        System.out.println("as opçoes de prato principal são as seguintes\n"+
                            "(6).MequiFiesta\n"+
                            "(7).MequiChedar\n"+
                            "(8).MequiChicken\n"+
                            "(9).MequiRanch\n"+
                            "(10).MequiFish\n"+
                            "favor digite o codigo do prato principal\n");
        
        Scanner codigoPratoPrincipal = new Scanner(System.in);
        int codigoPrato01 = codigoPratoPrincipal.nextInt();
        
        if (codigoPrato01 == 6) 
        {System.out.println("Certo!\n"+ "voce escolheu o MequiFiesta\n"+ "agora vamos escolher o acompanhamento!");}
        else{
            if (codigoPrato01 == 7)
            {System.out.println("Certo!\n"+"voce escolheu o MequiChedar\n"+"agora vamos escolher o acompanhamento!!");}
                else{
                    if (codigoPrato01==8) 
                    {System.out.println("Certo!\n"+ "voce escolheu o MequiChicken\n"+ "agora vamos escolher o acompanhamento!!");}
                    else{
                        if (codigoPrato01==9) 
                        {System.out.println("Certo!\n"+ "voce escolheu o MequiRanch\n"+ "agora vamos escolher o acompanhamento!!");}
                        else{
                            if (codigoPrato01==10) 
                            {System.out.println("Certo!\n"+"voce escolheu o Mequifish\n"+  "agora vamos escolher o acompanhamento!!");}
                             }
                        }
                    }
            }
    //favor não mecher nos cochetes abaixo vv! >.<                        
    }
}


