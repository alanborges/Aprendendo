package br.com.orientacao.objetos.exercicios;

public class Aluno {
	
	String nomeCurso;
	int matricula;
	String aluno;
	String [] nomeDisciplinas  = new String[3]; 
	double [] [] notasDisciplinas = new double [3] [3];
	double media, soma ;
	
	
	
	
	void mostrarInfo(){
        System.out.println("Nome: " + nomeCurso);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);
        
        for (int i=0; i<notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j=0; j<notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	boolean verificaAprovadoReprovado () {
		if(media >= 7) {
			
			System.out.println("Parabéns Aprovado! " + media);
			return true;
			
			
		}else {
			
			System.out.println("Reprovado! " + media);
			return false;
		}
		
		
		
	}
	

}
