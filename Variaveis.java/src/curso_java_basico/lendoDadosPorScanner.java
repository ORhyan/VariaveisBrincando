package curso_java_basico;

  import java.util.Scanner;
  
    public class lendoDadosPorScanner {

    
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        
      System.out.println("Digite o seu nome completo:");
      String nomeCompleto = scan.nextLine();
      System.out.println("O seu nome completo é: " + nomeCompleto);

      System.out.println("Digite seu primeiro nome");
      String primeiroNome = scan.nextLine();
      System.out.println("Seu primeiro nome é: " + primeiroNome);
      scan.close(); // Fechar o scan para evitar vazamento de recurso.
    }
}