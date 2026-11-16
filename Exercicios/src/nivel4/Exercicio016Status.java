package nivel4;

public class Exercicio016Status {

	public enum StatusPedido {
		
		AGUARDANDO_PAGAMENTO(1, "Aguardando Pagamento"),
		PROCESSANDO(2, "Em Processamento"),
		ENVIADO(3, "Enviado"),
		ENTREGUE(4, "Entregue"),
		CANCELADO(5, "Cancelado");
		
		private final int codigo;
		private final String descricao;

		StatusPedido(int codigo, String descricao) {
			this.codigo = codigo;
			this.descricao = descricao;
		}

		public int getCodigo() {
			return codigo;
		}

		public String getDescricao() {
			return descricao;
		}
		
		public static StatusPedido porCodigo(int codigo) {
			for (StatusPedido status : StatusPedido.values()) {
				if (status.getCodigo() == codigo) {
					return status;
				}
			}
			
			throw new IllegalArgumentException("Código de status inválido: " + codigo);
		}
		
	}
}
