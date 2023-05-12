package com;

import java.util.Comparator;

public class Comparador implements Comparator<City> {
	@Override
    public int compare(City city1, City city2) {
		int resultado=0;
        int numAddresses1 = city1.getAddresses().size();
        int numAddresses2 = city2.getAddresses().size();
        if (numAddresses1 == numAddresses2) {
        	resultado= city1.getCity().compareTo(city2.getCity());
        } else {
        	resultado= numAddresses2 - numAddresses1;
        }
        return resultado;
    }
}


