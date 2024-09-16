import java.util.Scanner;
public class restaurante {
    public static void main(String[] args) throws Exception {

        System.out.println("Bem vindo(a) ao Mequi feliz!\n"  + "Digite o seu nome:");
        Scanner scanner = new Scanner(System.in);
        String nomeIn = scanner.nextLine();

                                         
        System.out.println(
        "\nBem-vindo(a) ao Mequi feliz! " + nomeIn  +
        "\nÉ um prazer receber você em nosso espaço, onde cada refeição é preparada com Alegria, carinho e ingredientes de qualidade\n" +
        "Nesse sistema voce vai escolher a diversão que é o brinqueo, logo em seguida vai escolher o prato princiapl, acompanhamento e bebida!\n"+
        "A diversão do Mequi esse mes é a turmar do sonic, onde voce pode escolher um entre esses brinquedos:\n" +
        "(1) R$10: Sonic\n" +
        "(2) R$10: Shadow\n" +
        "(3) R$10: Tails\n" +
        "(4) R$10: Amy Rose\n" +
        "(5) R$10: knuckles\n");

        
        System.out.println("Favor\nDigite o codigo de qual diversão deseja! ");
        int codigoDiver01 = scanner.nextInt();
        String diversãoEscolhida="";
        double preçoDiversão=10;
                        
        if (codigoDiver01 == 1) 
        {diversãoEscolhida="sonic";
        System.out.println("Certo!\n"+ "voce escolheu o Sonic\n"+ "agora vamos escolher oq deseja comer!\n");}
        
        else if (codigoDiver01 == 2)
        {diversãoEscolhida="shadow";
        System.out.println("Certo!\n"+"voce escolheu o Shadow\n"+"agora vamos escolher oq deseja comer!\n");}
        
        else if (codigoDiver01==3) 
        {diversãoEscolhida="tails";
        System.out.println("Certo!\n"+ "voce escolheu o Tails\n"+ "agora vamos escolher oq deseja comer!\n");}
        
        else if (codigoDiver01==4) 
        {diversãoEscolhida="Amy Rose";
        System.out.println("Certo!\n"+ "voce escolheu a Amy Rose\n"+ "agora vamos escolher oq deseja comer!\n");}
        
        else if (codigoDiver01==5) 
        {diversãoEscolhida="Knuckles";
        System.out.println("Certo!\n"+"voce escolheu o Knuckles\n"+  "agora vamos escolher oq deseja comer!\n");}
        
        else{System.out.println("opção invalida, favor digitar codigo igual exposto no menu");
        scanner.close();            
        return;}
                            
        
        System.out.println(
        "\nas opçoes de prato principal são as seguintes\n"+
        "(6) R$10.00: MequiFiesta\n"+
        "(7) R$10.50: MequiChedar\n"+
        "(8) R$10.75: MequiChicken\n"+
        "(9) R$11.00: MequiRanch\n"+
        "(10) R$11.50: MequiFish\n"+
        "favor digite o codigo do prato principal\n");
        
        int codigoPrato01 = scanner.nextInt();
        String pratoEscolhido="";
        double preçoPrato= 0;
        
        if (codigoPrato01 == 6) 
        {pratoEscolhido="MequiFiesta";
        preçoPrato=10.00;
        System.out.println("Certo!\n"+ "voce escolheu o MequiFiesta\n"+ "agora vamos escolher o acompanhamento!");}
        
        else if (codigoPrato01 == 7)
        {pratoEscolhido="MequiChedar";
        preçoPrato=10.50;
        System.out.println("Certo!\n"+"voce escolheu o MequiChedar\n"+"agora vamos escolher o acompanhamento!!");}
        
        else if (codigoPrato01==8) 
        {pratoEscolhido="MequiChiken";
        preçoPrato=10.75;
        System.out.println("Certo!\n"+ "voce escolheu o MequiChicken\n"+ "agora vamos escolher o acompanhamento!!");}
        
        else if (codigoPrato01==9) 
        {pratoEscolhido="MequiRanch";
        preçoPrato=11.00;
        System.out.println("Certo!\n"+ "voce escolheu o MequiRanch\n"+ "agora vamos escolher o acompanhamento!!");}
        
        else if (codigoPrato01==10) 
        {pratoEscolhido="MequiFish";
        preçoPrato=11.50;
        System.out.println("Certo!\n"+"voce escolheu o Mequifish\n"+  "agora vamos escolher o acompanhamento!!");}
        
        else{System.out.println("opção invalida, favor digitar codigo igual exposto no menu");
        scanner.close();            
        return;}
            
        
        System.out.println(
        "\nas opçoes de Acompanhamento são as seguintes\n"+
        "(11) R$2.50: Mequi Fritas pequena\n"+
        "(12) R$3.00: Mequi firtas media\n"+
        "(13) R$4.00: Mequi Fritas grande\n"+
        "(14) R$7.00:Mequi nuggets 6 unidades\n"+
        "(15) R$10.00: Mequi nuggets 10 unidades\n"+
        "favor digite o codigo do Acomponhamento\n");
                                  
        int codigoAcompanhamento01 = scanner.nextInt();
        String AcompanhamentoEscolhido="";
        double preçoAcompanhamento=0;
                      
        if (codigoAcompanhamento01 == 11) 
        {AcompanhamentoEscolhido="Fritas pequena";
        preçoAcompanhamento=2.50;
        System.out.println("Certo!\n"+ "voce escolheu as Mequi Fritas pequena");}
        
        else if (codigoAcompanhamento01 == 12)
        {AcompanhamentoEscolhido="Fritas Media";
        preçoAcompanhamento=3.00;
        System.out.println("Certo!\n"+"voce escolheu as Mequi Fritas Media");}
                
        else if (codigoAcompanhamento01==13) 
        {AcompanhamentoEscolhido="fritas grande";
        preçoAcompanhamento=4.00;
        System.out.println("Certo!\n"+ "voce escolheu as Mequi Fritas grande");}
                    
        else if (codigoAcompanhamento01==14) 
        {AcompanhamentoEscolhido="nuggets 6 unidades";
        preçoAcompanhamento=7.00;
        System.out.println("Certo!\n"+ "voce escolheu: Mequi nuggets 6 unidades");}
                        
        else if (codigoAcompanhamento01==15) 
        {AcompanhamentoEscolhido="nuggets 10 unidades";
        preçoAcompanhamento=10.00;
        System.out.println("Certo!\n"+"voce escolheu: Mequi nuggets 10 unidades");}

        else{System.out.println("opção invalida, favor digitar codigo igual exposto no menu");
        scanner.close();            
        return;}


        System.out.println(
        "\nAgora vamos escolher a bebida\nNo Mequi feliz temos a bebida padrão refil de 700ml, onde voce escolher o sabor e pode encher quantas vezes quiser\n"+
        "As opçoes de bebidas são:\n"+
        "(16) R$12.00: coca zero\n"+
        "(17) R$10.00: pepsi\n"+
        "(18) R$9.00: fanta\n"+
        "Favor digite o codigo da bebida:");
                           
        int codigoBebida01 = scanner.nextInt();
        String bebidaEscolhida="";
        double preçoBebida=0;
        
        if (codigoBebida01 == 16) 
        {bebidaEscolhida="coca zero";
        preçoBebida=12.00;
        System.out.println("Certo!\n"+ "voce escolheu coca zero pra beber");}
        
        else if (codigoBebida01 == 17)
        {bebidaEscolhida="Pepsi";
        preçoBebida=10.00;
        System.out.println("Certo!\n"+"voce escolheu Peps pra beber");}
                
        else if (codigoBebida01==18) 
        {bebidaEscolhida="fanta";
        preçoBebida=9.00;
        System.out.println("Certo!\n"+ "voce escolheu Fanta pra beber");}

        else{System.out.println("opção invalida, favor digitar codigo igual exposto no menu");
        scanner.close();            
        return;}


        double total = preçoAcompanhamento+preçoBebida+preçoPrato+preçoDiversão;


        System.out.println("\nResumo do pedido:");
        System.out.println("\nDiversão: " + diversãoEscolhida+"(R$ "+preçoDiversão+")");
        System.out.println("Prato Principal: " + pratoEscolhido + " (R$ " + preçoPrato + ")");
        System.out.println("Acompanhamento: " + AcompanhamentoEscolhido + " (R$ " + preçoAcompanhamento + ")");
        System.out.println("Bebida: " + bebidaEscolhida + " (R$ " + preçoBebida + ")");
        System.out.println("\nTotal a pagar: R$ " + total);

        scanner.close();            
    }
}