package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
@ManagedBean
public class ContatoController {

		private String mensagem;
		private String nome;
		private String email;		
		
		public void enviarMensagem() {
		    System.out.println("Nome: "+getNome()+"\n"+"Email: "+getEmail()+"\n"+"Mensagem: "+getMensagem());
		  }
		
				
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

			public String getHorario() {
		    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		    return "Atualizado em " + sdf.format(new Date());
		  }
		
}
