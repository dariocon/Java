package com;

import java.util.Objects;

public class Address implements Comparable<Address>{
    private String addressId;
    private String address;

    public Address(String addressId, String address) {
		super();
        this.addressId = addressId;
        this.address = address;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getAddress() {
        return address;
    }
	@Override
	public int hashCode() {
		return Objects.hash(address, addressId);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Address
                && this.hashCode()==((Address)obj).hashCode();
    }
	
	
	@Override
	public String toString() {
		return String.format("Address id: %s, address: %s ", this.addressId,this.address);
	}
	public int compareTo(Address o) {
		return this.address.compareTo(o.address);
	}

}


