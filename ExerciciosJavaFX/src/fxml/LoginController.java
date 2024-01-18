package fxml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.controlsfx.control.Notifications;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class LoginController {
	@FXML
	private TextField emailField;
	@FXML
	private TextField senhaField;
	
	private static final String SUCESSO_LOGIN = "Login Efetuado com sucesso";
	
	private static final String EMAIL_INVALIDO =  "O email deve atender a esses requisitos:"
	            + "\n- nome_email@gmail.com"
	            + "\n- nome_email@outlook.com";
	
	private static final String SENHA_INVALIDA = "A senha deve atender a esses requisitos:"
	            + "\n- Tamanho mínimo de 8 caracteres alfanuméricos"
	            + "\n- Letras de a-z e A-Z"
	            + "\n- Números de 0-9"
	            + "\n- Caracteres Especiais: @$!%^*()#";
	
	private static final String[] DOMINIOS_PERMITIDOS = { "gmail\\.com", "outlook\\.com" };
	
	private boolean validacao(Pattern pattern, String  campo) {
		Matcher matcher = pattern.matcher(campo);
		return matcher.matches();
	}
	
	private void loginEfetuadoComSucesso(String mensagem, Pos posicao, Duration duration) {
        Notifications.create()
                .position(posicao)
                .title("Login FXML")
                .text(mensagem)
                .hideAfter(duration)
                .showInformation();
    }
	
	private void erroAoRealizarLogin(String mensagem, Pos posicao, Duration duration) {
		Notifications.create()
	        .position(posicao)
	        .title("Login FXML")
	        .text(mensagem)
	        .hideAfter(duration)
	        .showError();
	}
	
	private void exibeMensagem(boolean email, boolean senha) {
		if(email && senha) {
			loginEfetuadoComSucesso(SUCESSO_LOGIN, Pos.TOP_RIGHT, Duration.seconds(5));
		} else if(!senha || !email) {
			StringBuilder mensagemErro = new StringBuilder();
			
			mensagemErro.append(EMAIL_INVALIDO).append("\n\n");
			mensagemErro.append(SENHA_INVALIDA);
            
			erroAoRealizarLogin(mensagemErro.toString(), Pos.TOP_RIGHT, Duration.seconds(5));
		}
	}
	
	public void entrar() {
		String email = emailField.getText();
        String senha = senhaField.getText();

        // Construir a parte da expressão regular para os domínios permitidos
        String dominio = String.join("|", DOMINIOS_PERMITIDOS);

        // Padrão para verificar se o email contém os domínios permitidos
        Pattern patternEmail = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:" + dominio + ")$");
        boolean matchEmail = validacao(patternEmail, email);
        
        // Verifica se a senha tem letras maiúsculas, minúsculas, números, caracteres especiais e possui um tamanho mínimo de 8 caracteres
        Pattern patternSenha = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%¨&*()_+]).{8,}$");
        boolean matchSenha = validacao(patternSenha, senha);
        
        // Exibe uma mensagem condicional usando o Controls FX
        exibeMensagem(matchEmail, matchSenha);
	}
}
