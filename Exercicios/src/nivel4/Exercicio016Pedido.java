package nivel4;

import nivel4.Exercicio016Status.StatusPedido;

public class Exercicio016Pedido {

	private Long id;
	private StatusPedido status;


	public Exercicio016Pedido(long idDigitado) {
		this.id = idDigitado;
		this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	
}
