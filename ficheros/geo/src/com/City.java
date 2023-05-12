package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class City {
    private String cityId;
    private String city;
    private Set<Address> addresses;

    public City(String cityId, String city) throws IOException {
		super();
        this.cityId = cityId;
        this.city = city;
        this.addresses = new HashSet<>();
        addAddress();
    }
    
    private void addAddress() throws IOException {
    	FileReader flujoLectura=new FileReader("files/address.txt");
    	BufferedReader filtroLectura=new BufferedReader(flujoLectura);
  
    	filtroLectura.readLine();
    	String linea=filtroLectura.readLine();
    	String[] arrayLinea;
	    	while (linea!=null) {
	    		arrayLinea = linea.split(",");
				try {
					if(arrayLinea[4].equals(this.cityId)) {
						this.addresses.add(new Address(arrayLinea[0], arrayLinea[1]));
					}
				}catch(ArrayIndexOutOfBoundsException e) {
					
				}
				linea = filtroLectura.readLine();
	 
				
			}
	    	filtroLectura.close();
	    }

    public String getCityId() {
        return cityId;
    }

    public String getCity() {
        return city;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }
	public int numAddresses() {
		return this.addresses.size();
	}
    public int compareTo(City other) {
        int result = Integer.compare(other.numAddresses(), this.numAddresses());
        if (result == 0) {
            result = this.getCity().compareTo(other.getCity());
        }
        return result;
    }
	
    @Override
	public int hashCode() {
		return Objects.hash(cityId);
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof City && this.hashCode()==obj.hashCode();
	}
	@Override
	public String toString() {
		return String.format("id: %s, nombre: %s Número de direcciones: %s %n		", this.cityId, this.city, numAddresses());
	}

}
