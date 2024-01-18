package br.com.lukemedrano.teste.exercicioSB.controllersExemplos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	// http://localhost:3000/calculadora/soma/10/20
	@GetMapping(path = "/soma/{num1}/{num2}")
	public String soma(@PathVariable int num1, @PathVariable int num2) {
		int resultado = num1 + num2;
		return String.format("%d + %d = %d", num1, num2, resultado);
	}
	
	
	// http://localhost:3000/calculadora/subtracao?num1=?&num2=?
	@GetMapping(path = "/subtracao")
	public String subtracao(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		int resultado = num1 - num2;
		return String.format("%d - %d = %d", num1, num2, resultado);
	}
	
	
	// http://localhost:3000/calculadora/multiplicacao?num1=?&num2=?
	@GetMapping(path = "/multiplicacao")
	public String multiplicacao(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		int resultado = num1 * num2;
		return String.format("%d * %d = %d", num1, num2, resultado);
	}
	
	
	// http://localhost:3000/calculadora/divisao?num1=?&num2=?
	@GetMapping(path = "/divisao")
	public String divisao(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		if(num2 == 0) {
			return "Não é possível dividir por zero";
		}
		
		double resultado = (double) num1 / num2;
		return String.format("%d / %d = %.2f", num1, num2, resultado);
	}
	
	
	// http://localhost:3000/calculadora/modulo?num1=?&num2=?
	@GetMapping(path = "/modulo")
	public String modulo(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		double resultado = num1 % num2;
		return String.format("%d modulo %d = %.2f", num1, num2, resultado);
	}
	
	
	// http://localhost:3000/calculadora/potenciacao?base=?&expoente=?
	@GetMapping(path = "/potenciacao")
	public String potenciacao(@RequestParam(name = "base") int base, @RequestParam(name = "expoente") int expoente) {
		double resultado = Math.pow(base, expoente);
		return String.format("%d^%d = %.2f", base, expoente, resultado);
	}
	
	
	// http://localhost:3000/calculadora/raiz-quadrada?num1=?
	@GetMapping(path = "/raiz-quadrada")
	public String raizQuadrada(@RequestParam(name = "num1") int num1) {
		double resultado = Math.sqrt(num1);
		return String.format("Raiz quadrada de %d = %.2f", num1, resultado);
	}
	
	
	// http://localhost:3000/calculadora/raiz-cubica?num1=?
	@GetMapping(path = "/raiz-cubica")
	public String raizCubica(@RequestParam(name = "num1") int num1) {
		double resultado = Math.cbrt(num1);
		return String.format("Raiz cúbica de %d = %.2f", num1, resultado);
	}
	
	
	// http://localhost:3000/calculadora/logaritmo?num1=?
	@GetMapping(path = "/logaritmo")
	public String logaritmo(@RequestParam(name = "num1") int num1) {
		double resultado = Math.log10(num1);
		return String.format("Logaritmo de %d na base 10 = %.2f", num1, resultado);
	}
	
	
	// http://localhost:3000/calculadora/fatorial?num1=?
	@GetMapping(path = "/fatorial")
	public String fatorial(@RequestParam(name = "num1") int num1) {
		if(num1 < 0) {
			return "NaN";
		}
		
		int resultado = 1;
		for(int i = 2; i <= num1; i++) {
			resultado *= i;
		}
		
		return String.format("%d! = %d", num1, resultado);
	}
}