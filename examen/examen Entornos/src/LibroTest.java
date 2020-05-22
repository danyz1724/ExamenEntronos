import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LibroTest {

	@Test
	// value = " Si el ISBM es igual que 10 de longitud. ISBM = 251561258X "
	public void testCheckISBN10() {
		Libro libro = new Libro("el señor de los anillos", "251561258X", "da Vinci", "la antiguedad");
		assertTrue(libro.checkISBN10());

	}

	@Test
	// value = " Si el ISBM es diferente que 13 de longitud. ISBM = 251561258X "
	public void testCheckISBN13() {
		Libro libro = new Libro("el señor de los anillos", "251561258X", "da Vinci", "la antiguedad");
		assertFalse(libro.checkISBN13());
	}

}
