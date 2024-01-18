package br.com.lukemedrano.app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	public static void informacoes(String mensagem) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String data = simpleDateFormat.format(new Date());
		System.out.println("[INFO]" + data + " - " +  mensagem);
	}
}