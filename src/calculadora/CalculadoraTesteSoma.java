package calculadora;
public class CalculadoraTesteSoma {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora(); // Instanciando Objeto da Classe Calculadora, TESTE Metodo Soma
           
        int soma = calc.Soma(3,7);//Cenario de TESTE 1 : Somando dois números positivos
        System.out.println("Cenario de TESTE 1 : Somando dois numeros positivos, Soma = "+soma);
        
        
        
        int soma2 = calc.Soma(-7,-8);//Cenario de TESTE 2 : Somando dois números negativos
        System.out.println("Cenario de TESTE 2 : Somando dois numeros negativos, Soma = "+soma2);
        
        
        
        int soma3 = calc.Soma(-6, 8);//Cenario de TESTE 3 : Somando um número negativo com um positivo
        System.out.println("Cenario de TESTE 3 : Somando um numero negativo com um positivo, Soma = "+soma3);
        
        
        
        int soma4 = calc.Soma(0, 0); //Cenario de TESTE 4 : Somando dois números 0
        System.out.println("Cenario de TESTE 4 : Somando dois numeros 0, Soma = "+soma4);

    }
}
