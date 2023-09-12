package br.com.elibras.apielibras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import br.com.elibras.apielibras.domain.Score;
import br.com.elibras.apielibras.domain.User;

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

	@Test
	public void testesemaisteste() {
		Score score = new Score("12654", "teste", "teste");
		User user = new User("teste", "teste", "teste", "teste", score);
		assertEquals("teste", user.getId());
	}

}
