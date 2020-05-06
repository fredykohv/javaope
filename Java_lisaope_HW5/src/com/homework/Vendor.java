package com.homework;

public class Vendor {

    private String vendorName;
    private String vendorAddress;
    private String vendorRepresentativeName;
    private String vendorPhoneNumber;

    public Vendor(String vendorName, String vendorAddress) {
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
    }

    public Vendor(String vendorName, String vendorAddress, String vendorRepresentativeName, String vendorPhoneNumber) {
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorRepresentativeName = vendorRepresentativeName;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorRepresentativeName() {
        return vendorRepresentativeName;
    }

    public void setVendorRepresentativeName(String vendorRepresentativeName) {
        this.vendorRepresentativeName = vendorRepresentativeName;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    @Override
    public String toString() {
        return
                "Vendor name = " + vendorName + '\'' +
                ", Vendor address = '" + vendorAddress + '\'' +
                ", Vendor representative name = '" + vendorRepresentativeName + '\'' +
                ", Vendor phone number = " + vendorPhoneNumber
                ;
    }
}
