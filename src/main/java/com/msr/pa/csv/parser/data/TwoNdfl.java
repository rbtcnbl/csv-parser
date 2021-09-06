package com.msr.pa.csv.parser.data;

import java.io.Serializable;

public class TwoNdfl implements Serializable {

    private int id;
    private int familyId;
    private String incomePeriod;
    private int incomeCode;
    private int incomeSum;
    private String receiveDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmilyId() {
        return familyId;
    }

    public void setAmilyId(int amilyId) {
        this.familyId = amilyId;
    }

    public String getIncomePeriod() {
        return incomePeriod;
    }

    public void setIncomePeriod(String incomePeriod) {
        this.incomePeriod = incomePeriod;
    }

    public int getIncomeCode() {
        return incomeCode;
    }

    public void setIncomeCode(int incomeCode) {
        this.incomeCode = incomeCode;
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

        TwoNdfl twoNdfl = (TwoNdfl) o;

        if (id != twoNdfl.id) return false;
        if (familyId != twoNdfl.familyId) return false;
        if (incomeCode != twoNdfl.incomeCode) return false;
        if (incomeSum != twoNdfl.incomeSum) return false;
        if (incomePeriod != null ? !incomePeriod.equals(twoNdfl.incomePeriod) : twoNdfl.incomePeriod != null)
            return false;
        return receiveDate != null ? receiveDate.equals(twoNdfl.receiveDate) : twoNdfl.receiveDate == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + familyId;
        result = 31 * result + (incomePeriod != null ? incomePeriod.hashCode() : 0);
        result = 31 * result + incomeCode;
        result = 31 * result + incomeSum;
        result = 31 * result + (receiveDate != null ? receiveDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "" +
                "" + id +
                ";" + familyId +
                ";" + incomePeriod + '\'' +
                ";" + incomeCode +
                ";" + incomeSum +
                ";" + receiveDate;
    }
}
