package com.msr.pa.csv.parser;

import com.msr.pa.csv.parser.data.EgissoBySnils;
import com.msr.pa.csv.parser.data.FamilyCriteria;
import com.msr.pa.csv.parser.data.FamilyItem;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Parser {

    public List<FamilyItem> parseFamilyInformation(File file) {
        try {
            CSVParserBuilder parserBuilder = new CSVParserBuilder();
            parserBuilder.withSeparator(';');
            CSVReaderBuilder builder = null;
            builder = new CSVReaderBuilder(new FileReader(file));
            builder.withSkipLines(1);
            builder.withCSVParser(parserBuilder.build());
            CSVReader reader = builder.build();
            CsvToBean<FamilyItem> csv = new CsvToBean<FamilyItem>();
            csv.setCsvReader(reader);
            csv.setMappingStrategy(setFamilyInformationColumMapping());
            return csv.parse();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return Collections.emptyList();
        }
    }

    //TODO убрать пропуск строки и вынести эту хрень в один метод
    public List<FamilyCriteria> parseFamilyCriteria(File file) {
        try {
            CSVParserBuilder parserBuilder = new CSVParserBuilder();
            parserBuilder.withSeparator(';');
            CSVReaderBuilder builder = null;
            builder = new CSVReaderBuilder(new FileReader(file));
            builder.withSkipLines(1);
            builder.withCSVParser(parserBuilder.build());
            CSVReader reader = builder.build();
            CsvToBean<FamilyCriteria> csv = new CsvToBean<FamilyCriteria>();
            csv.setCsvReader(reader);
            csv.setMappingStrategy(setFamilyCriteriaColumMapping());
            return csv.parse();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return Collections.emptyList();
        }
    }

    public List<EgissoBySnils> parseEgissoBySnils(File file) {
        try {
            CSVParserBuilder parserBuilder = new CSVParserBuilder();
            parserBuilder.withSeparator(';');
            CSVReaderBuilder builder = null;
            builder = new CSVReaderBuilder(new FileReader(file));
            builder.withSkipLines(1);
            builder.withCSVParser(parserBuilder.build());
            CSVReader reader = builder.build();
            CsvToBean<EgissoBySnils> csv = new CsvToBean<EgissoBySnils>();
            csv.setCsvReader(reader);
            csv.setMappingStrategy(setEgissoBySnilsColumMapping());
            return csv.parse();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return Collections.emptyList();
        }
    }

    private ColumnPositionMappingStrategy<FamilyItem> setFamilyInformationColumMapping() {
        ColumnPositionMappingStrategy<FamilyItem> strategy = new ColumnPositionMappingStrategy<FamilyItem>();
        strategy.setType(FamilyItem.class);
        String[] columns = new String[]{"id", "familyId", "role", "surname", "name", "patronymic", "birthdate", "docType", "docNumber", "docDate", "snils", "inn", "address", "btiCode", "flatNumber", "marriageCertificate", "divorceCertificate"};
        strategy.setColumnMapping(columns);
        return strategy;
    }

    private ColumnPositionMappingStrategy<FamilyCriteria> setFamilyCriteriaColumMapping() {
        ColumnPositionMappingStrategy<FamilyCriteria> strategy = new ColumnPositionMappingStrategy<FamilyCriteria>();
        strategy.setType(FamilyCriteria.class);
        String[] columns = new String[]{"familyId", "noIncome", "intersectionWithDTSZNdata", "sddFns", "sddCalculated", "numberOfLivingQuarters", "livingSpace", "nonLivingSpace", "numberOfLandPlots", "squareOfLandPlots", "numberOfCarPlaces"};
        strategy.setColumnMapping(columns);
        return strategy;
    }

    private ColumnPositionMappingStrategy<EgissoBySnils> setEgissoBySnilsColumMapping() {
        ColumnPositionMappingStrategy<EgissoBySnils> strategy = new ColumnPositionMappingStrategy<EgissoBySnils>();
        strategy.setType(EgissoBySnils.class);
        String[] columns = new String[]{"id", "familyId", "mszCode", "incomePeriod", "incomeSum", "receiveDate"};
        strategy.setColumnMapping(columns);
        return strategy;
    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("dd.MM.yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
