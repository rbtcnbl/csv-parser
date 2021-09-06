package com.msr.pa.csv.parser.data;

import java.io.Serializable;

public class FamilyItem implements Serializable {

    private int id;
    private int familyId;
    private String role;
    private String surname;
    private String name;
    private String patronymic;
    private String birthdate;
    private String docType;
    private String docNumber;
    private String docDate;
    private String snils;
    private String inn;
    private String address;
    private String btiCode;
    private String flatNumber;
    private String marriageCertificate;
    private String divorceCertificate;

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBtiCode() {
        return btiCode;
    }

    public void setBtiCode(String btiCode) {
        this.btiCode = btiCode;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getMarriageCertificate() {
        return marriageCertificate;
    }

    public void setMarriageCertificate(String marriageCertificate) {
        this.marriageCertificate = marriageCertificate;
    }

    public String getDivorceCertificate() {
        return divorceCertificate;
    }

    public void setDivorceCertificate(String divorceCertificate) {
        this.divorceCertificate = divorceCertificate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FamilyItem that = (FamilyItem) o;

        if (id != that.id) return false;
        if (familyId != that.familyId) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (patronymic != null ? !patronymic.equals(that.patronymic) : that.patronymic != null) return false;
        if (birthdate != null ? !birthdate.equals(that.birthdate) : that.birthdate != null) return false;
        if (docType != null ? !docType.equals(that.docType) : that.docType != null) return false;
        if (docNumber != null ? !docNumber.equals(that.docNumber) : that.docNumber != null) return false;
        if (docDate != null ? !docDate.equals(that.docDate) : that.docDate != null) return false;
        if (snils != null ? !snils.equals(that.snils) : that.snils != null) return false;
        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (btiCode != null ? !btiCode.equals(that.btiCode) : that.btiCode != null) return false;
        if (flatNumber != null ? !flatNumber.equals(that.flatNumber) : that.flatNumber != null) return false;
        if (marriageCertificate != null ? !marriageCertificate.equals(that.marriageCertificate) : that.marriageCertificate != null)
            return false;
        return divorceCertificate != null ? divorceCertificate.equals(that.divorceCertificate) : that.divorceCertificate == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + familyId;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (docType != null ? docType.hashCode() : 0);
        result = 31 * result + (docNumber != null ? docNumber.hashCode() : 0);
        result = 31 * result + (docDate != null ? docDate.hashCode() : 0);
        result = 31 * result + (snils != null ? snils.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (btiCode != null ? btiCode.hashCode() : 0);
        result = 31 * result + (flatNumber != null ? flatNumber.hashCode() : 0);
        result = 31 * result + (marriageCertificate != null ? marriageCertificate.hashCode() : 0);
        result = 31 * result + (divorceCertificate != null ? divorceCertificate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "" +
                "" + id +
                ";" + familyId +
                ";" + role + '\'' +
                ";" + surname + '\'' +
                ";" + name + '\'' +
                ";" + patronymic + '\'' +
                ";" + birthdate + '\'' +
                ";" + docType + '\'' +
                ";" + docNumber + '\'' +
                ";" + docDate + '\'' +
                ";" + snils + '\'' +
                ";" + inn + '\'' +
                ";" + address + '\'' +
                ";" + btiCode + '\'' +
                ";" + flatNumber + '\'' +
                ";" + marriageCertificate + '\'' +
                ";" + divorceCertificate + '\'';
    }
}
