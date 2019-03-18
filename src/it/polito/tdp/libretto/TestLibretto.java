package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto libr = new Libretto();
		
		libr.add(new Voto(30, "Analisi 1", LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(25, "Analisi 2", LocalDate.of(2018, 1, 15)));
		libr.add(new Voto(28, "Fisica 1", LocalDate.of(2017, 2, 15)));
		libr.add(new Voto(25, "Geometria", LocalDate.of(2017, 2, 18)));
		libr.add(new Voto(25, "Chimica", LocalDate.of(2018, 1, 19)));
		libr.add(new Voto(19, "Programmmazione a oggetti", LocalDate.of(2018, 2, 7)));
		
		List<Voto> venticinque = libr.cercaVoti(25);
		System.out.println(venticinque);
	}

}
