package com.example.agileschool;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private TableView<Customer> tableView;

    @FXML
    Button btnRegister, btnDashboard, btnClass;


    //Columns
    @FXML
    private TableColumn<Customer, String> alunoColumn;

    @FXML
    private TableColumn<Customer, Integer> classeColumn;

    @FXML
    private TableColumn<Customer, Integer> raColumn;

    //Text input
    @FXML
    private TextField nameInput;

    @FXML
    private TextField ageInput;

    @FXML
    private TextField numberInput;



    public void initialize (URL url, ResourceBundle resourceBundle) {
        alunoColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("name"));
        classeColumn.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("age"));
        raColumn.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("number"));
    }

    //Submit button
    @FXML
    void submit(ActionEvent event) {
        Customer customer = new Customer(nameInput.getText(),
                Integer.parseInt(ageInput.getText()),
                Integer.parseInt(numberInput.getText()));
        ObservableList <Customer> customers = tableView.getItems();
        customers.add(customer);
        tableView.setItems(customers);
    }

    @FXML
    void removeCustomer(ActionEvent event) {
        int selectedID = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedID);
    }

    public void handleRegister() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));

        Stage window = (Stage)btnRegister.getScene().getWindow();
        window.setScene(new Scene(root));

    }

    public void handleDashboard(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));

        Stage window = (Stage)btnDashboard.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void handleClass(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("class.fxml"));

        Stage window = (Stage)btnDashboard.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}