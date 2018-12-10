//https://www.mkyong.com/unittest/junit-4-tutorial-2-expected-exception-test/
//http://www.vogella.com/tutorials/JUnit/article.html

package edu.senai.a22.testes.calculadora;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaCalculadora {

	private Calculadora calculadora;

	@Before
	public void inicializa() {
		this.calculadora = new Calculadora();
	}

	@After
	public void finaliza() {
		this.calculadora = null;
	}

	@Test
	public void testaAdicaoPositiva() {
		// Calculadora calculadora = new Calculadora();
		assertEquals(5, calculadora.getAdicao(2, 3));
	}

	@Test
	public void testaAdicaoComZeroNoSegundoParametro() {
		// Calculadora calculadora = new Calculadora();
		assertEquals(3, calculadora.getAdicao(3, 0));
	}

	@Test
	public void testaMultiplicacao() {
		assertEquals(15, calculadora.getMultiplicacao(3, 5));
	}

	@Test
	public void testaSubtracaoPositiva() {
		assertEquals(4, calculadora.getSubtracao(7, 3));
	}

	@Test
	public void testaSubtracaoNegativa() {
		assertEquals(-5, calculadora.getSubtracao(5, 10));
	}

	@Test
	public void testaDivisaoNormal() {
		assertEquals(5, calculadora.getDivisao(15, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void testaDivisaoPorZero() {
		assertEquals(0, calculadora.getDivisao(1, 0));
	}

	@Test
	public void testaDivisaoZeroComException() {
		try {
			assertEquals(0, calculadora.getDivisao(10, 0));
			Assert.fail();
		} catch (ArithmeticException e) {
			Assert.assertThat(e.getMessage(), is("/ by zero"));
		}
	}

}
