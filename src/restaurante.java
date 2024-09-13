import java.util.Scanner;
public class restaurante {
    public static void main(String[] args) throws Exception {

        System.out.println("Bem vindo ao Mequi feliz\n"  + "digite o seu nome:");
        
                        Scanner nome = new Scanner(System.in);
                        String nomeIn = nome.next();
                                         

        System.out.println("Bem-vindo ao Mequi feliz! " + nomeIn + "\n" +
                            "É um prazer receber você em nosso espaço, onde cada refeição é preparada com Alegria, carinho e ingredientes de qualidade.\n " +
                            "A diversão do Mequi esse mes é a turmar do sonic, onde voce pode escolher um entre esses brinquedos:\n" +
                            "(01)Sonic\n" +
                            "(02)Shadow\n" +
                            "(03)Tails\n" +
                            "(04)Amy Rose\n" +
                            "(05)knuckles\n" );
        
        System.out.println("Favor \n digite o codigo de qual diversão deseja! ");
                        Scanner codigoDiversão = new Scanner(System.in);
                        int codigoDiver01 = codigoDiversão.nextInt();
                        
                        if (codigoDiver01 == 01) 
                        {System.out.println("Certo!\n"+
                        "voce escolheu o Sonic\n"+
                        "agora vamos escolher oq deseja comer!");
                        }else{
                            if (codigoDiver01 == 02)
                            {System.out.println("Certo!\n"+
                            "voce escolheu o Shadow\n"+
                            "agora vamos escolher oq deseja comer!");
                                
                            }else{
                                if (codigoDiver01==03) 
                                {System.out.println("Certo!\n"+
                                "voce escolheu o Tails\n"+
                                "agora vamos escolher oq deseja comer!");
                                    
                                }else{
                                    if (codigoDiver01==04) 
                                    {System.out.println("Certo!\n"+
                                    "voce escolheu a Amy Rose\n"+
                                    "agora vamos escolher oq deseja comer!");
                                        
                                    }else{
                                        if (codigoDiver01==05) 
                                        {System.out.println("Certo!\n"+
                                        "voce escolheu o Knuckles\n"+
                                        "agora vamos escolher oq deseja comer!");
                                        }
                                    }
                                }
                            }
                    
                        }
        //aqui volta o codi
    }
}
