package nivel6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Exercicio002Anotacao {

	@Target(ElementType.METHOD)
	
	@Retention(RetentionPolicy.RUNTIME)
	
	public @interface MinhaAnotacao {
		String descricao() default "Método anotado";
		int prioridade() default 1;
	}
}
