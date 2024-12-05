package com.formation;

import org.junit.Assert;
import org.junit.Test;

public class SalesmanTest {

	@Test
	public void testCalculerSalaire() {
		int chiffreAffaires = 30000;
		Salesman s = new Salesman("Pierre", "Business", 45, "1995", chiffreAffaires);
		double valeurObtenue = s.calculerSalaire();
		double valeurAttendue = 6400.0;
		Assert.assertEquals(valeurAttendue, valeurObtenue, 0);
	}

	@Test
	public void testCalculerSalaire2() {
		int chiffreAffaires =30000;
		Salesman s = new Salesman("Pierre", "Business", 45, "1995", chiffreAffaires);
		double valeurObtenue = s.calculerSalaire();
		double valeurAttendue = 6400.0;
		Assert.assertEquals(valeurAttendue, valeurObtenue, 0);
	}
	
	@Test
	public void testCalculerSalaireNull() {
		int chiffreAffaires = 0;
		Salesman s = new Salesman("Pierre", "Business", 45, "1995", chiffreAffaires);
		double valeurObtenue = s.calculerSalaire();
		double valeurAttendue = 400.0;
		Assert.assertEquals(valeurAttendue, valeurObtenue, 0);
	}
	
	@Test
	public void testCalculerSalaireNegatif() {
		int chiffreAffaires = -500;
		Salesman s = new Salesman("Pierre", "Business", 45, "1995", chiffreAffaires);
		double valeurObtenue = s.calculerSalaire();
		double valeurAttendue = 0.0;
		Assert.assertEquals(valeurAttendue, valeurObtenue, 0);
	}
}