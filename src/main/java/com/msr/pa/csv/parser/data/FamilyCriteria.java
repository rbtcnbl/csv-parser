package com.msr.pa.csv.parser.data;

import java.io.Serializable;

public class FamilyCriteria implements Serializable {

    private int familyId;
    private int noIncome;
    private int intersectionWithDTSZNdata;
    private int sddFns;
    private int sddCalculated;
    private int numberOfLivingQuarters;
    private String livingSpace;
    private String nonLivingSpace;
    private int numberOfLandPlots;
    private String squareOfLandPlots;
    private int numberOfCarPlaces;

    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public int getNoIncome() {
        return noIncome;
    }

    public void setNoIncome(int noIncome) {
        this.noIncome = noIncome;
    }

    public int getIntersectionWithDTSZNdata() {
        return intersectionWithDTSZNdata;
    }

    public void setIntersectionWithDTSZNdata(int intersectionWithDTSZNdata) {
        this.intersectionWithDTSZNdata = intersectionWithDTSZNdata;
    }

    public int getSddFns() {
        return sddFns;
    }

    public void setSddFns(int sddFns) {
        this.sddFns = sddFns;
    }

    public int getSddCalculated() {
        return sddCalculated;
    }

    public void setSddCalculated(int sddCalculated) {
        this.sddCalculated = sddCalculated;
    }

    public int getNumberOfLivingQuarters() {
        return numberOfLivingQuarters;
    }

    public void setNumberOfLivingQuarters(int numberOfLivingQuarters) {
        this.numberOfLivingQuarters = numberOfLivingQuarters;
    }

    public String getLivingSpace() {
        return livingSpace;
    }

    public void setLivingSpace(String livingSpace) {
        this.livingSpace = livingSpace;
    }

    public String getNonLivingSpace() {
        return nonLivingSpace;
    }

    public void setNonLivingSpace(String nonLivingSpace) {
        this.nonLivingSpace = nonLivingSpace;
    }

    public int getNumberOfLandPlots() {
        return numberOfLandPlots;
    }

    public void setNumberOfLandPlots(int numberOfLandPlots) {
        this.numberOfLandPlots = numberOfLandPlots;
    }

    public String getSquareOfLandPlots() {
        return squareOfLandPlots;
    }

    public void setSquareOfLandPlots(String squareOfLandPlots) {
        this.squareOfLandPlots = squareOfLandPlots;
    }

    public int getNumberOfCarPlaces() {
        return numberOfCarPlaces;
    }

    public void setNumberOfCarPlaces(int numberOfCarPlaces) {
        this.numberOfCarPlaces = numberOfCarPlaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FamilyCriteria that = (FamilyCriteria) o;

        if (familyId != that.familyId) return false;
        if (noIncome != that.noIncome) return false;
        if (intersectionWithDTSZNdata != that.intersectionWithDTSZNdata) return false;
        if (sddFns != that.sddFns) return false;
        if (sddCalculated != that.sddCalculated) return false;
        if (numberOfLivingQuarters != that.numberOfLivingQuarters) return false;
        if (numberOfLandPlots != that.numberOfLandPlots) return false;
        if (numberOfCarPlaces != that.numberOfCarPlaces) return false;
        if (livingSpace != null ? !livingSpace.equals(that.livingSpace) : that.livingSpace != null) return false;
        if (nonLivingSpace != null ? !nonLivingSpace.equals(that.nonLivingSpace) : that.nonLivingSpace != null)
            return false;
        return squareOfLandPlots != null ? squareOfLandPlots.equals(that.squareOfLandPlots) : that.squareOfLandPlots == null;
    }

    @Override
    public int hashCode() {
        int result = familyId;
        result = 31 * result + noIncome;
        result = 31 * result + intersectionWithDTSZNdata;
        result = 31 * result + sddFns;
        result = 31 * result + sddCalculated;
        result = 31 * result + numberOfLivingQuarters;
        result = 31 * result + (livingSpace != null ? livingSpace.hashCode() : 0);
        result = 31 * result + (nonLivingSpace != null ? nonLivingSpace.hashCode() : 0);
        result = 31 * result + numberOfLandPlots;
        result = 31 * result + (squareOfLandPlots != null ? squareOfLandPlots.hashCode() : 0);
        result = 31 * result + numberOfCarPlaces;
        return result;
    }

    @Override
    public String toString() {
        return "" +
                "" + familyId +
                ";" + noIncome +
                ";" + intersectionWithDTSZNdata +
                ";" + sddFns +
                ";" + sddCalculated +
                ";" + numberOfLivingQuarters +
                ";" + livingSpace + '\'' +
                ";" + nonLivingSpace + '\'' +
                ";" + numberOfLandPlots +
                ";" + squareOfLandPlots + '\'' +
                ";" + numberOfCarPlaces;
    }
}
