package com.msr.pa.csv.parser.gui;


import java.io.*;
import java.net.URL;
import java.util.*;

import com.msr.pa.csv.parser.gui.checkbox.CheckboxFactory;
import com.msr.pa.csv.parser.gui.checkbox.EgissoBySnilsCheckboxFactory;
import com.msr.pa.csv.parser.gui.checkbox.FamilyCriteriaCheckboxFactory;
import com.msr.pa.csv.parser.gui.checkbox.FamilyInformationCheckboxFactory;
import com.msr.pa.csv.parser.handler.EgissoBySnilsHandler;
import com.msr.pa.csv.parser.handler.FamilyCriteriaHandler;
import com.msr.pa.csv.parser.handler.FamilyInformationHandler;
import com.msr.pa.csv.parser.Parser;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Controller implements Initializable {
    private static final Logger log = LoggerFactory.getLogger(Controller.class);
    private final static String FAMILY_INFORMATION = "Сведения о семьях";
    private final static String FAMILY_CRITERIA = "Критерии по семьям";
    private final static String EGISSO_SNILS = "Информирование из ЕГИССО по СНИЛС";


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lableCSV;

    @FXML
    private ScrollPane ScrollPaneCSV;

    @FXML
    private Button buttonSelectCSV;

    @FXML
    private Label LableChecksFile;

    @FXML
    private FileChooser fileChooser;

    @FXML
    private ScrollPane resultCheck;

    @FXML
    private Label fileName;

    @FXML
    private ListView<CheckBox> checkboxContainer;

    @FXML
    private ComboBox<String> fileType;

    private Parser parser;

    private File file;

    private CheckboxFactory checkboxFactory;

    @FXML
    private void addCSV() throws Exception {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select CSV File");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            file = selectedFile;
            fileName.setText("Выбран: " + selectedFile.getName());
            Label text = new Label();
            text.setText(readFromInputStream(selectedFile));
            ScrollPaneCSV.setContent(text);
            createCheckboxFactory(fileType.getValue());
            checkboxContainer.getItems().clear();
            checkboxContainer.getItems().addAll(checkboxFactory.getCheckboxList());
        }
    }

    private String readFromInputStream(File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        parser = new Parser();
        fileType.getItems().add(FAMILY_INFORMATION);
        fileType.getItems().add(FAMILY_CRITERIA);
        fileType.getItems().add(EGISSO_SNILS);
        fileType.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                createCheckboxFactory(newValue);
                checkboxContainer.getItems().clear();
                checkboxContainer.getItems().addAll(checkboxFactory.getCheckboxList());
            }
        });
    }

    private void createCheckboxFactory(String value) {
        CheckboxFactory.ViewCallback callback = new CheckboxFactory.ViewCallback() {
            @Override
            public void show(String text) {
                Label label = new Label();
                label.setText(text);
                resultCheck.setContent(label);
            }
        };
        switch (value) {
            case FAMILY_INFORMATION:
                FamilyInformationHandler handler = new FamilyInformationHandler(parser.parseFamilyInformation(file));
                checkboxFactory = new FamilyInformationCheckboxFactory(handler, callback);
                break;
            case FAMILY_CRITERIA:
                FamilyCriteriaHandler handler1 = new FamilyCriteriaHandler(parser.parseFamilyCriteria(file));
                checkboxFactory = new FamilyCriteriaCheckboxFactory(handler1, callback);
                break;
            case EGISSO_SNILS:
                EgissoBySnilsHandler handler2 = new EgissoBySnilsHandler(parser.parseEgissoBySnils(file));
                checkboxFactory = new EgissoBySnilsCheckboxFactory(handler2,callback);
                break;
            default:
        }
    }
}
