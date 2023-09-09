package calculadora;
public class CalculadoraTesteDivisao {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora(); // Instanciando Objeto da Classe Calculadora, TESTE Metodo Divisao
       
        int div = calc.Divisao(10,7);//Cenario de TESTE 1 : Divisao em dois números positivos sendo o primeiro o maior numero
        System.out.println("Cenario de TESTE 1 : Divisao em dois numeros positivos= "+div);
        
        
        
        int divB = calc.Divisao(7,10);//Cenario de TESTE 1 : Divisao em dois números positivos sendo o segundo o maior numero
        System.out.println("Cenario de TESTE 1 B : Divisao em dois numeros positivos, sendo o segundo o maior numero= "+divB);
        
        
        
        int div2 = calc.Divisao(-10,-8);//Cenario de TESTE 2 : Divisao em dois números negativos sendo o primeiro o maior numero
        System.out.println("Cenario de TESTE 2 : Divisao em dois numeros negativos= "+div2);
        
        
        
        int div2B = calc.Divisao(-8,-10);//Cenario de TESTE 2 : Divisao em dois números negativos sendo o segundo o maior numero
        System.out.println("Cenario de TESTE 2 B : Divisao em dois numeros negativos, sendo o segundo o maior numero= "+div2B);
        
        
        
        int div3 = calc.Subtrair(-6, 8);//Cenario de TESTE 3 : Divisao de um número negativo com um positivo sendo o primeiro o numero negativo
        System.out.println("Cenario de TESTE 3 : Divisao em dois numeros negativo com um positivo= "+div3);
        
        
        
        int div3B = calc.Subtrair(8, -6);//Cenario de TESTE 3 : Divisao de um número negativo com um positivo sendo o segundo o numero negativo
        System.out.println("Cenario de TESTE 3 B : Divisao em dois numeros negativo com um positivo, sendo o segundo o numero negativo= "+div3B);
        
        
        
        int div4 = calc.Subtrair(0, 0); //Cenario de TESTE 4 : Divisao dois números 0
        System.out.println("Cenario de TESTE 4 : Divisao dois numeros 0 = "+div4);
        
        
        
        int div4B = calc.Subtrair(30, 0); //Cenario de TESTE 4 B : Divisao dois números 0, Sendo o segundo numero 0
        System.out.println("Cenario de TESTE 4 : Divisao dois numeros 0, Sendo o segundo o numero 0 = "+div4B);
        
        
    }
}
