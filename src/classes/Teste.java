package classes;

public class Teste {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("João", 40, "Masculino");
		p[1] = new Pessoa("Ivo", 38, "Masculino");
		p[2] = new Pessoa("Simone", 39, "Feminino");
		
		l[0] = new Livro("Java", "Guanabara, Gustavo", 300, p[0]);
		l[1] = new Livro("PHP", "Guanabara, Gustavo", 270, p[1]);
		l[2] = new Livro("MySQL", "Guanabara, Gustavo", 181, p[2]);
		
		System.out.println(l[0].detalhes());
		
		System.out.println(l[2].detalhes());
}
	}
