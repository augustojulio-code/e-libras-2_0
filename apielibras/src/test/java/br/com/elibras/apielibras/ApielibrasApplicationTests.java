package br.com.elibras.apielibras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApielibrasApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testes() {
		try {
			assertEquals("Olá imbecil", "Olá imbecil");
			System.out.println("Deu certo");
		} catch (Exception e) {
			System.out.println("Deu errado: " + e);
		}

	}

}
