package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Country {
    private String countryId;
    private String country;
    private List<City> cities;

    public Country(String countryId, String country) throws IOException {
        this.countryId = countryId;
        this.country = country;
        this.cities = new ArrayList<>();
        addCity();
        Collections.sort(this.cities,new Comparador());
    }

    public String getCountryId() {
        return countryId;
    }
    private void addCity() throws IOException {
    	FileReader flujoLectura=new FileReader("files/city.txt");
    	BufferedReader filtroLectura=new BufferedReader(flujoLectura);
  
    	filtroLectura.readLine();
    	String linea=filtroLectura.readLine();
    	String[] arrayLinea;
	    	while (linea!=null) {
	    		arrayLinea = linea.split(",");
				try {
					if(arrayLinea[4].equals(this.countryId)) {
						this.cities.add(new City(arrayLinea[0], arrayLinea[1]));
					}
				}catch(ArrayIndexOutOfBoundsException e) {
					
				}
				linea = filtroLectura.readLine();
	 
				
			}
	    	filtroLectura.close();
	    }


    public String getCountry() {
        return country;
    }
    public int numCities() {
        return this.cities.size();
    }
	public String citiesToString() {
        StringBuilder sb = new StringBuilder();
        for(City c : this.cities) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }

    public List<City> getCities() {
        return cities;
    }
	@Override
	public int hashCode() {
		return Objects.hash(country, countryId);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Country
                && this.hashCode()==((Country)obj).hashCode();
    }

	@Override
	public String toString() {
	    return String.format("Country id: %s, country: %s\nCities: %s\n%s",
	                         this.countryId, this.country, this.cities.size(), citiesToString());
	}


}
