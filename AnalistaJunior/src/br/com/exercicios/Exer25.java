package br.com.exercicios;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        //System.out.println("Lojas Tabajara");
        
        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago, troco;
        
        do {
            
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.next();
            
            if (continuarCompra.equalsIgnoreCase("s")){
                
                output = "Lojas Tabajara\n";
                
                System.out.println("Digite a quantidade de produtos da compra:");
                qtdProdutos = scan.nextInt();
                
                total = 0;
                
                for (int i=1; i<=qtdProdutos; i++){
                    System.out.println("Informe preço do produto " + i);
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";
                }
                
                output += "Total: R$ " + total;
                
                System.out.println("Total: R$ " + total);
                
                System.out.println("Entre com o valor pago:");
                valorPago = scan.nextDouble();
                
                output += "Dinheiro: R$ " + valorPago + "\n";
                
                troco = total - valorPago;
                
                output += "Troco: R$ " + troco;
                
                System.out.println(output);
                
            } else {
                sair = true;
            }
           
        }while(!sair);
		
		
		
		
	
			
	}

}

/*
Scanner scan = new Scanner(System.in);
double total=0;
double valorPago =0;
int cont = 0;
String output;

//System.out.println(" Lojas Tabajaras !!!");

boolean sair = false;
int i =1;
while ( !sair   ){
	
	System.out.println("Informe o preço do produto"  );
	valorPago = scan.nextDouble();
	
	if(valorPago == 0) {
	for(; i<0;i++) {
		output = "Lojas Tabajaras\n";
	
					
			}
		sair = true;	
	}		
		
			

		
	
					
	cont++;	

	

}


	System.out.println(valorPago);
	total+=valorPago;
	output += "Produto" + i + ": R$" +valorPago+ "\n";	
for(int j =1; j<cont; j++ ) {
	System.out.println(" Produto " + j + " : "+ " R$ " + ( valorPago)  );	
	System.out.println(total);
}

*/