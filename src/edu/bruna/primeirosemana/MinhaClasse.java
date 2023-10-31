package edu.bruna.primeirosemana;

public class MinhaClasse {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 String primeiroNome = "Bruna";
		 String segundoNome = "Ravelli";
		 String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		 
		 System.out.println(nomeCompleto);
	} 
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
