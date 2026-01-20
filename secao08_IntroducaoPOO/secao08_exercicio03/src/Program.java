
public class Program {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.nota1 = 17;
		aluno.nota2 = 20;
		aluno.nota3 = 15;
		
		double media = aluno.media();
		
		System.out.println(media);
		aluno.reprovado(media);
	}
}
