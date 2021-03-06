package Controllers;

import DBUtil.DBConnection;
import GestionDeProduit.Produit;
import GestionDeProduit.TypeProduit;
import Login.option;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class UIProduits implements Initializable {

    Connection conn = null;

    @FXML
    private Button SearchBtn;

    @FXML
    private Button shwBtn;

    @FXML
    private Button ajtBtn;

    @FXML
    private Button mdfBtn;

    @FXML
    private Button sprBtn;

    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    private ImageView imageView,imageView2,imageView3, imageView4,imageView5,imageView6;
    @FXML
    private Image image1 = new Image(getClass().getResourceAsStream("/Images/milky.png"));
    @FXML
    private Image image2 = new Image(getClass().getResourceAsStream("/Images/back.png"));
    @FXML
    private Image image3 = new Image(getClass().getResourceAsStream("/Images/afficherProduit.png"));
    @FXML
    private Image image4 = new Image(getClass().getResourceAsStream("/Images/ajouterProduit.png"));
    @FXML
    private Image image5 = new Image(getClass().getResourceAsStream("/Images/supprimerProduit.png"));
    @FXML
    private Image image6 = new Image(getClass().getResourceAsStream("/Images/modifierProduit.png"));
    @FXML
    private Button retourBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageView.setImage(image1);
        imageView2.setImage(image2);
        imageView3.setImage(image3);
        imageView4.setImage(image4);
        imageView5.setImage(image5);
        imageView6.setImage(image6);
        retourBtn.setGraphic(imageView2);
    }
    // RECHERCHER UN PRODUIT DANS LA BASE DE DONNEES


    public void ShowProductScene() throws SQLException{
        Stage stage = (Stage)this.shwBtn.getScene().getWindow();
        stage.close();

        try{
            Stage primaryStage= new Stage();
            Parent root= FXMLLoader.load(getClass().getResource("/GestionProduits/AfficherProduit.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();

        }catch (Exception e){
            System.out.println("Vous avez un probleme avec GestionProduits/AfficherProduit.fxml");
            e.printStackTrace();
        }
    }
    public void AddProductScene() throws SQLException{
        Stage stage = (Stage)this.ajtBtn.getScene().getWindow();
        stage.close();

        try{
            Stage primaryStage= new Stage();

            Parent root= FXMLLoader.load(getClass().getResource("/GestionProduits/AjouterProduit.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){
            System.out.println("Vous avez un probleme avec GestionProduits/AjouterProduit.fxml");
            e.printStackTrace();
        }
    }

    public void ModifyProductScene() throws SQLException{
        Stage stage = (Stage)this.mdfBtn.getScene().getWindow();
        stage.close();

        try{
            Stage primaryStage= new Stage();

            Parent root= FXMLLoader.load(getClass().getResource("/GestionProduits/ModifierProduit.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){
            System.out.println("Vous avez un probleme avec GestionProduits/ModifierProduit.fxml");
            e.printStackTrace();
        }
    }

    public void DeleteProductScene() throws SQLException{
        Stage stage = (Stage)this.sprBtn.getScene().getWindow();
        stage.close();

        try{
            Stage primaryStage= new Stage();

            Parent root= FXMLLoader.load(getClass().getResource("/GestionProduits/SupprimerProduit.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){
            System.out.println("Vous avez un probleme avec GestionProduits/SupprimerProduit.fxml");
            e.printStackTrace();
        }
    }

    public void switchToPreviousScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/AgentDeVente/AgentDeVente.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }


}
