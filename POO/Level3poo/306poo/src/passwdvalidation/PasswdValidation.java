package passwdvalidation;
/**
 * O algoritimo a seguir avalia a segurança de uma senha fornecida pelo usuário.
 * São dez critérios a serem seguidos conforme descrito no próprio programa.
 * As senhas são divididas entre FRACA, MEDIA e FORTE.
 * 
 * Obs.: Se a senha for considerada média, o programa pergunta ao usuário se ele
 * deseja configurar uma nova senha.
 * 
 * @author João Pedro LPS
 */
import java.util.Scanner;
public class PasswdValidation {
    public static void main(String[] args) {
        //Criação de método e variável para receber a senha:
        Scanner ler=new Scanner(System.in);
        String passwd;
        
        //Criação de variáveis de apoio:
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        char currentCharacter;
        boolean numberPresent, upperCasePresent, lowerCasePresent, specialCharacterPresent;
        int qtdPresent, qtdUpper, qtdLower, qtdSpecial, totalMatches;
        String answer;

        //Aviso de Segurança:
        System.out.println(
            "Critérios de Segurança\n" + "\n" +
            "Para que o dado seja seguro, devemos observar dez itens a serem cumpridos"
            + " para o considerarmos como uma senha forte. As senhas consideradas"
            + " fracas não serão aceitas, e às consideradas médias será oferecida a"
            + " oportunidade de inserir a senha novamente.\n" +
            "\n" + "FRACA:\n" +
            "1 - Sem caracteres especiais: ~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/? ;\n" +
            "2 - Sem caracteres maiúsculos;\n" +
            "3 - Sem números;\n" +
            "4 - Sem caracteres minúsculos;\n" +
            "5 - Menor que seis dígitos;\n" +
            "\n" + "MÉDIA:\n" +
            "6 - Uma ou mais maiúsculas;\n" +
            "7 - Um ou mais números;\n" +
            "8 - Um ou mais caracteres especiais;\n" +
            "9 - Menor que nove dígitos;\n" +
            "\n" + "FORTE:\n" +
            "10 - Maior que nove dígitos;\n\n"
            + "Insira sua senha: "
        );

        do{
            //Zerando variáveis:
            numberPresent = false;
            qtdPresent = 0;
            upperCasePresent = false;
            qtdUpper = 0;
            lowerCasePresent = false;
            qtdLower = 0;
            specialCharacterPresent = false;
            qtdSpecial = 0;
            totalMatches = 0;
            answer = "n";
            
            //Validade para teste (passwd==null):
            do{
                //Entrada do usuário:
                passwd = ler.nextLine();
                
                if(passwd == null){
                    System.out.println("\nInsira sua senha novamente: ");
                }
                
            }while(passwd == null);

            //Laço para verificação de cada char da string "passwd":
            for (int i = 0; i < passwd.length(); i++) {
                currentCharacter = passwd.charAt(i);

                if (Character.isDigit(currentCharacter)) {
                    numberPresent = true;
                    qtdPresent += 1;
                    totalMatches +=1;
                } else if (Character.isUpperCase(currentCharacter)) {
                    upperCasePresent = true;
                    qtdUpper += 1;
                    totalMatches +=1;
                } else if (Character.isLowerCase(currentCharacter)) {
                    lowerCasePresent = true;
                    qtdLower += 1;
                    totalMatches +=1;
                } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                    specialCharacterPresent = true;
                    qtdSpecial += 1;
                    totalMatches +=1;
                }
                
            }
            
            //SENHA FRACA
            if(passwd.length() < 6){
                if(numberPresent == false || upperCasePresent == false || lowerCasePresent == false || specialCharacterPresent == false){
                    System.out.println("A senha inseria é considerada FRACA, Insira sua senha novamente: ");
                }
            }
            
            //SENHA MÉDIA
            else if(passwd.length() < 9){
                if(qtdPresent > 1 || qtdUpper > 1 || qtdSpecial > 1){
                    System.out.println("\nA senha inserida é considerada MÉDIA, deseja inserir uma nova senha? (s/n) ");
                    answer = ler.nextLine();
                    
                    if("n".equals(answer)){
                        System.out.println("\nObrigado.");
                    }
                    
                    else{
                        System.out.println("\nInsira sua senha novamente:");
                    }
                }    
            }
            
            //SENHA FORTE
            else{
                System.out.println("\nA senha inserida é considerada FORTE. Obrigado.\n\n");
            }
            
        }while(passwd.length() < 6 || numberPresent == false || upperCasePresent == false || lowerCasePresent == false || specialCharacterPresent == false || "s".equals(answer));
        
    }
    
}
