package calculadora;
public class CalculadoraTesteMultiplicacao {
     public static void main(String[] args) {
        
        Calculadora calc = new Calculadora(); // Instanciando Objeto da Classe Calculadora, TESTE Metodo Multiplicacao
       
        int mult = calc.Multiplicacao(10,7);//Cenario de TESTE 1 : Multiplicacao em dois números positivos sendo o primeiro o maior numero
        System.out.println("Cenario de TESTE 1 : Multiplicacao em dois numeros positivos= "+mult);
        
        
        
        int multB = calc.Multiplicacao(7,10);//Cenario de TESTE 1 : Multiplicacao em dois números positivos sendo o segundo o maior numero
        System.out.println("Cenario de TESTE 1 B : Multiplicacao em dois numeros positivos, sendo o segundo o maior numero= "+multB);
        
        
        
        int mult2 = calc.Multiplicacao(-10,-8);//Cenario de TESTE 2 : Multiplicacao em dois números negativos sendo o primeiro o maior numero
        System.out.println("Cenario de TESTE 2 : Multiplicacao em dois numeros negativos= "+mult2);
        
        
        
        int mult2B = calc.Multiplicacao(-8,-10);//Cenario de TESTE 2 : Multiplicacao em dois números negativos sendo o segundo o maior numero
        System.out.println("Cenario de TESTE 2 B : Multiplicacao em dois numeros negativos, sendo o segundo o maior numero= "+mult2B);
        
        
        
        int mult3 = calc.Multiplicacao(-6, 8);//Cenario de TESTE 3 : Multiplicacao de um número negativo com um positivo sendo o primeiro o numero negativo
        System.out.println("Cenario de TESTE 3 : Multiplicacao em dois numeros negativo com um positivo= "+mult3);
        
        
        
        int mult3B = calc.Multiplicacao(8, -6);//Cenario de TESTE 3 : Multiplicacao de um número negativo com um positivo sendo o segundo o numero negativo
        System.out.println("Cenario de TESTE 3 B : Multiplicacao em dois numeros negativo com um positivo, sendo o segundo o numero negativo= "+mult3B);
        
        
        
        int mult4 = calc.Multiplicacao(0, 0); //Cenario de TESTE 4 : multiplicacao dois números 0
        System.out.println("Cenario de TESTE 4 : Multiplicacao dois numeros 0 = "+mult4);
        
        
        
        int mult4B = calc.Multiplicacao(30, 0); //Cenario de TESTE 4 B : Multiplicacao dois números 0, Sendo o segundo numero 0
        System.out.println("Cenario de TESTE 4 : Multiplicacao dois numeros 0, Sendo o segundo o numero 0 = "+mult4B);
    }   
}
