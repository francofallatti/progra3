package TestingUnitario;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestingTest {


	@Test(expected = NullPointerException.class)
	public void sumarPositivosNullTest() {
		Testing.sumarPositivos(null);
	}
	@Test
	public void sumarPositivosVacioTest() {
		int[] b= new int[0];
		assertEquals(0, Testing.sumarPositivos(b));
	}
	@Test
	public void sumarPositivosNegTest() {
		int[] b= new int[] {-1,0,-4};
		assertEquals(0, Testing.sumarPositivos(b));
	}
	@Test
	public void sumarPositivosTest() {
		int[] b= new int[] {1,2,3,4};
		assertEquals(10, Testing.sumarPositivos(b));
	}
	@Test
	public void sumarPositivosMezcladosTest() {
		int[] b= new int[] {1,-2,-3,4};
		assertEquals(5, Testing.sumarPositivos(b));
	}
	
	
	@Test
	public void buscarTest() {
		int[] b= new int[] {1,2,3,4};
		assertTrue(Testing.buscar(b,3));
	}
	@Test
	public void buscarFalseTest() {
		int[] b= new int[] {1,2,3,4};
		assertFalse(Testing.buscar(b,10));
	}
	
	@Test 
	public void maximoNullTest(){
		assertEquals(0,Testing.maximo(null));
	}
	@Test
	public void maximoZeroTest(){
		int[]b=new int[] {0};
		assertEquals(0,Testing.maximo(b));
	}
	@Test
	public void maximoTest(){
		int[] b= new int[] {1,2,442,43,4,865,323,13,4};
		assertEquals(865,Testing.maximo(b));
	}
	@Test
	public void maximoIgualesTest(){
		int[] b= new int[] {1,1,1,1,1,1,1,1,1,1,1};
		assertEquals(1,Testing.maximo(b));
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void ceroDuplicadoExeptionTest() {
		Testing.ceroDuplicado(null,0);
	}

}
