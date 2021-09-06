package com.msr.pa.csv.parser.data;

import java.io.Serializable;

public class EgissoBySnils implements Serializable {

    private int id;
    private int familyId;
    private int mszCode;
    private String incomePeriod;
    private int incomeSum;
    private String receiveDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public int getMszCode() {
        return mszCode;
    }

    public void setMszCode(int mszCode) {
        this.mszCode = mszCode;
    }

    public String getIncomePeriod() {
        return incomePeriod;
    }

    public void setIncomePeriod(String incomePeriod) {
        this.incomePeriod = incomePeriod;
    }

    public int getIncomeSum() {
        return incomeSum;
    }

    public void setIncomeSum(int incomeSum) {
        this.incomeSum = incomeSum;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EgissoBySnils that = (EgissoBySnils) o;

        if (id != that.id) return false;
        if (familyId != that.familyId) return false;
        if (mszCode != that.mszCode) return false;
        if (incomeSum != that.incomeSum) return false;
        if (incomePeriod != null ? !incomePeriod.equals(that.incomePeriod) : that.incomePeriod != null) return false;
        return receiveDate != null ? receiveDate.equals(that.receiveDate) : that.receiveDate == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + familyId;
        result = 31 * result + mszCode;
        result = 31 * result + (incomePeriod != null ? incomePeriod.hashCode() : 0);
        result = 31 * result + incomeSum;
        result = 31 * result + (receiveDate != null ? receiveDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "" +
                "" + id +
                ";" + familyId +
                ";" + mszCode + '\'' +
                ";" + incomePeriod + '\'' +
                ";" + incomeSum +
                ";" + receiveDate;
    }
}
