package br.com.elibras.apielibras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

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

	@Test
	public void apitest() {
		try {
			assertEquals(ResponseEntity.ok().body(null), ResponseEntity.ok().build());
		} catch (Exception e) {
			System.out.println(e);
		}

		// System.out.println(ResponseEntity.ok().body(null));
	}

	public void testesemaisteste() {

		assertEquals("", "");
	}

}
