import java.util.Scanner;
public class restaurante {
    public static void main(String[] args) throws Exception {

        System.out.println("Bem vindo ao Mequi feliz\n"  + "digite o seu nome:");
        
                        Scanner nome = new Scanner(System.in);
                        String nomeIn = nome.nextLine();
                                         

        System.out.println("Bem-vindo ao Mequi feliz! " + nomeIn + "\n" +
                            "É um prazer receber você em nosso espaço, onde cada refeição é preparada com Alegria, carinho e ingredientes de qualidade\n" +
                            "A diversão do Mequi esse mes é a turmar do sonic, onde voce pode escolher um entre esses brinquedos:\n" +
                            "(1)Sonic\n" +"(2)Shadow\n" +"(3)Tails\n" +"(4)Amy Rose\n" +"(5)knuckles\n" );
        
        System.out.println("Favor\n digite o codigo de qual diversão deseja! ");
        Scanner codigoDiversão = new Scanner(System.in);
        int codigoDiver01 = codigoDiversão.nextInt();
        String diversãoEscolhida="";
                        
        if (codigoDiver01 == 1) 
        {diversãoEscolhida="sonic";
            System.out.println("Certo!\n"+ "voce escolheu o Sonic\n"+ "agora vamos escolher oq deseja comer!\n");}
        else{
            if (codigoDiver01 == 2)
            {diversãoEscolhida="shadow";
                System.out.println("Certo!\n"+"voce escolheu o Shadow\n"+"agora vamos escolher oq deseja comer!\n");}
                else{
                    if (codigoDiver01==3) 
                    {diversãoEscolhida="tails";
                        System.out.println("Certo!\n"+ "voce escolheu o Tails\n"+ "agora vamos escolher oq deseja comer!\n");}
                    else{
                        if (codigoDiver01==4) 
                        {diversãoEscolhida="Amy Rose";
                            System.out.println("Certo!\n"+ "voce escolheu a Amy Rose\n"+ "agora vamos escolher oq deseja comer!\n");}
                        else{
                            if (codigoDiver01==5) 
                            {diversãoEscolhida="Knuckles";
                                System.out.println("Certo!\n"+"voce escolheu o Knuckles\n"+  "agora vamos escolher oq deseja comer!\n");}
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
        String pratoEscolhido="";
        double preçoPrato= 0;
        
        if (codigoPrato01 == 6) 
        {pratoEscolhido="MequiFiesta";
        preçoPrato=10.00;
        System.out.println("Certo!\n"+ "voce escolheu o MequiFiesta\n"+ "agora vamos escolher o acompanhamento!");}
        else{
            if (codigoPrato01 == 7)
            {pratoEscolhido="MequiChedar";
            preçoPrato=10.50;
            System.out.println("Certo!\n"+"voce escolheu o MequiChedar\n"+"agora vamos escolher o acompanhamento!!");}
                else{
                    if (codigoPrato01==8) 
                    {pratoEscolhido="MequiChiken";
                    preçoPrato=10.75;
                    System.out.println("Certo!\n"+ "voce escolheu o MequiChicken\n"+ "agora vamos escolher o acompanhamento!!");}
                    else{
                        if (codigoPrato01==9) 
                        {pratoEscolhido="MequiRanch";
                        preçoPrato=11.00;
                        System.out.println("Certo!\n"+ "voce escolheu o MequiRanch\n"+ "agora vamos escolher o acompanhamento!!");}
                        else{
                            if (codigoPrato01==10) 
                            {pratoEscolhido="MequiFish";
                            preçoPrato=11.50;
                            System.out.println("Certo!\n"+"voce escolheu o Mequifish\n"+  "agora vamos escolher o acompanhamento!!");}
                            }
                        }
                    }
     
            }
        System.out.println("as opçoes de Acompanhamento são as seguintes\n"+
                            "(11).Mequi Fritas pequena\n"+
                            "(12).Mequi firtas media\n"+
                            "(13).Mequi Fritas grande\n"+
                            "(14).Mequi nuggets 6 unidades\n"+
                            "(15).Mequi nuggets 10 unidades\n"+
                            "favor digite o codigo do Acomponhamento\n");
                            
        Scanner codigoAcompanhamento = new Scanner(System.in);
        int codigoAcompanhamento01 = codigoAcompanhamento.nextInt();
        String AcompanhamentoEscolhido="";
        double preçoAcompanhamento=0;
    
                            
        if (codigoAcompanhamento01 == 11) 
        {AcompanhamentoEscolhido="Fritas pequena";
        preçoAcompanhamento=2.50;
        System.out.println("Certo!\n"+ "voce escolheu as Mequi Fritas pequena");}
        else{
            if (codigoAcompanhamento01 == 12)
            {AcompanhamentoEscolhido="Fritas Media";
            preçoAcompanhamento=3.00;
            System.out.println("Certo!\n"+"voce escolheu as Mequi Fritas Media");}
                else{
                    if (codigoAcompanhamento01==13) 
                    {AcompanhamentoEscolhido="fritas grande";
                    preçoAcompanhamento=4.00;
                    System.out.println("Certo!\n"+ "voce escolheu as Mequi Fritas grande");}
                    else{
                        if (codigoAcompanhamento01==14) 
                        {AcompanhamentoEscolhido="nuggets 6 unidades";
                        preçoAcompanhamento=5.00;
                        System.out.println("Certo!\n"+ "voce escolheu: Mequi nuggets 6 unidades");}
                        else{
                            if (codigoAcompanhamento01==15) 
                            {AcompanhamentoEscolhido="nuggets 10 unidades";
                            preçoAcompanhamento=6.00;
                            System.out.println("Certo!\n"+"voce escolheu: Mequi nuggets 10 unidades");}
                            }
                        }
                    }
                         
            }
        
        System.out.println(" agora vamos escolher a bebida\n no Mequi feliz temos a bebida padrão refil de 700ml, onde voce escolher o sabor e pode encher quantas vezes quiser\n"+
                           "As opçoes de bebidas são:\n(16)coca zero\n(17)peps\n(18)fanta\n Favor digite o codigo da bebida:");
                           
        Scanner codigoBebida = new Scanner(System.in);
        int codigoBebida01 = codigoBebida.nextInt();
        String bebidaEscolhida="";
        double preçoBebida=0;
        
        if (codigoBebida01 == 16) 
        {bebidaEscolhida="coca zero";
        preçoBebida=12.00;
        System.out.println("Certo!\n"+ "voce escolheu coca zero pra beber");}
        else{
            if (codigoBebida01 == 17)
            {bebidaEscolhida="Peps";
            preçoBebida=10.00;
            System.out.println("Certo!\n"+"voce escolheu Peps pra beber");}
                else{
                    if (codigoBebida01==18) 
                    {bebidaEscolhida="fanta";
                    preçoBebida=8.00;
                    System.out.println("Certo!\n"+ "voce escolheu Fanta pra beber");}
                    }
            }
        double total = preçoAcompanhamento+preçoBebida+preçoPrato;

        System.out.println("\nResumo do pedido:");
        System.out.println("Diversão: " + diversãoEscolhida);
        System.out.println("Prato Principal: " + pratoEscolhido + " (R$ " + preçoPrato + ")");
        System.out.println("Acompanhamento: " + AcompanhamentoEscolhido + " (R$ " + preçoAcompanhamento + ")");
        System.out.println("Bebida: " + bebidaEscolhida + " (R$ " + preçoBebida + ")");
        System.out.println("Total a pagar: R$ " + total);


            
    //favor não mecher nos cochetes abaixo vv! >.<                        
    }
}


