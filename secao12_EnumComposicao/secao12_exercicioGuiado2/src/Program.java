import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dataTexto = "21/06/2018 13:05:44";		
		String titulo = "Traveling to New Zealand";
		String content = "I'm going to visit this wonderful country";
		Integer likes = 12;
		
		LocalDateTime date = LocalDateTime.parse(dataTexto, fmt);
		
		Post post1 = new Post(date, titulo, content, likes);
		String comment = "Have a nice trip";
		Comment comentario01 =  new Comment(comment);
		
		post1.addComentario(comentario01);

		System.out.println(post1);
	}
}
