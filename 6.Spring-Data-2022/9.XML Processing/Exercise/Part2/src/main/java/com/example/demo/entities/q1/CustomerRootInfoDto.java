package com.example.demo.entities.q1;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerRootInfoDto {

    @XmlElement(name = "customer")
    private List<CustomerInfoDto> customers;

    public CustomerRootInfoDto() {
    }

    public List<CustomerInfoDto> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerInfoDto> customers) {
        this.customers = customers;
    }
}
