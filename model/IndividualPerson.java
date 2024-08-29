package model;

import absModel.AbsPerson;

public class IndividualPerson extends AbsPerson {
    private String CPF;

    public IndividualPerson(String CPF) {
        this.CPF = CPF;
        super.name = "Individual Person";
    }

    @Override
    public String toString() {
        return "";
    }
}
