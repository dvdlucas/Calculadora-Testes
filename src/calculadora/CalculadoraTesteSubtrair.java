package calculadora;

public class CalculadoraTesteSubtrair {
        public static void main(String[] args) {
        
        Calculadora calc = new Calculadora(); // Instanciando Objeto da Classe Calculadora, TESTE Metodo Subtrair
       
        int sub = calc.Subtrair(10,7);//Cenario de TESTE 1 : Subtraindo em dois números positivos sendo o primeiro o maior numero
        System.out.println("Cenario de TESTE 1 : Subtraindo em dois numeros positivos= "+sub);
        
        
        
        int subB = calc.Subtrair(7,10);//Cenario de TESTE 1 : Subtraindo em dois números positivos sendo o segundo o maior numero
        System.out.println("Cenario de TESTE 1 B : Subtraindo em dois numeros positivos, sendo o segundo o maior numero= "+subB);
        
        
        
        int sub2 = calc.Subtrair(-10,-8);//Cenario de TESTE 2 : Subtraindo em dois números negativos sendo o primeiro o maior numero
        System.out.println("Cenario de TESTE 2 : Subtraindo em dois numeros negativos= "+sub2);
        
        
        
        int sub2B = calc.Subtrair(-8,-10);//Cenario de TESTE 2 : Subtraindo em dois números negativos sendo o segundo o maior numero
        System.out.println("Cenario de TESTE 2 B : Subtraindo em dois numeros negativos, sendo o segundo o maior numero= "+sub2B);
        
        
        
        int sub3 = calc.Subtrair(-6, 8);//Cenario de TESTE 3 : Subtraindo de um número negativo com um positivo sendo o primeiro o numero negativo
        System.out.println("Cenario de TESTE 3 : Subtraindo em dois numeros negativo com um positivo= "+sub3);
        
        
        
        int sub3B = calc.Subtrair(8, -6);//Cenario de TESTE 3 : Subtraindo de um número negativo com um positivo sendo o segundo o numero negativo
        System.out.println("Cenario de TESTE 3 B : Subtraindo em dois numeros negativo com um positivo, sendo o segundo o numero negativo= "+sub3B);
        
        
        
        int sub4 = calc.Subtrair(0, 0); //Cenario de TESTE 4 : Subtraindo dois números 0
        System.out.println("Cenario de TESTE 4 : Subtraindo dois numeros 0 = "+sub4);
    }   
}
