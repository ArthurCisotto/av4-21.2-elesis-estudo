/**
 * Curso: Elementos de Sistemas
 * Arquivo: CodeTest.java
 * Created by Luciano Soares <lpsoares@insper.edu.br>
 * Date: 16/04/2017
 */

package assembler;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Rule;

import java.io.IOException;
import java.io.PrintWriter;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.assertTrue;

public class CodeTest  {

	private static StringBuilder builder = new StringBuilder();

	/**
	 * Create the test case
	 */
	public CodeTest() {
	}

	/**
	 * Teste para geração de código para Destino
	 */
	@Test
	public void testCode_Dest_load() {

		try {

			assertTrue("leaw $1, %A"		,Code.dest_load(new String[] {"leaw","$1","%A"}).equals("00"));
			assertTrue("leaw $1, %D"		,Code.dest_load(new String[] {"leaw","$1","%D"}).equals("01"));
			assertTrue("leaw $1, %A, %D"		,Code.dest_load(new String[] {"leaw","$1","%A","%D"}).equals("11"));
			assertTrue("leaw $1, %D, %A"		,Code.dest_load(new String[] {"leaw","$1","%D","%A"}).equals("11"));

		} catch(Exception e) {
			e.printStackTrace();
		}

	}


}
