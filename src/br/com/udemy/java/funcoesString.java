package br.com.udemy.java;

public class funcoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG  ";
		
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); // removedor dos espaços nos cantos
		String s04 = original.substring(2); // ele irá recortar até o índice no argumento.
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -"+original + "-");
		System.out.println("toLowerCase: -"+s01 + "-");
		System.out.println("ToUpperCase: -"+s02 + "-");
		System.out.println("Trim: -"+s03+ "-");
		System.out.println("subString(2): -" +s04+"-");
		System.out.println("subString(2,9): -" +s05+"-");
		System.out.println("replace(a,x): -" +s06+"-");
		System.out.println("indexOf(bc): -" +i+"-");
		System.out.println("indexOf(bc): -" +j+"-");
		
		System.out.println("-----Split -----");
		
		String s = "Thiago Henrique Santos Ferreira";
		
		String[] vect = s.split(" ");
		String nome = vect[0];
		String nome1 = vect[1];
		String sobrenome = vect[2];
		String sobrenome1 = vect[3];
		
		System.out.println("Seu nome é: "+ nome+" "+nome1+ " seu sobrenome é: "+sobrenome +" "+sobrenome1);
		
	}
	
}
