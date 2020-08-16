package br.com.santander;

public class Cliente {
    private String id;
    private String cpf;
    private String rg;
    private String firstName;
    private String lastName;


    public Cliente() {
    }
    public Cliente(String id, String cpf, String rg, String firstName, String lastName) {
        this.id = id;
        this.cpf = cpf;
        this.rg = rg;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
