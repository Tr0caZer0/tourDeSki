package application;
	
import java.util.concurrent.atomic.AtomicInteger;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	
	Button btn1,btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnStart, btnQuit, btnReset, btnSearch;
	String choice;
	Label label;
	
	AtomicInteger countSquares = new AtomicInteger();
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Cross Country Ski-time Tracker");
			
			btn1 = new Button("1");
			btn2 = new Button("2");
			btn3 = new Button("3");
			btn4 = new Button("4");
			btn5 = new Button("5");
			btn6 = new Button("6");
			btn7 = new Button("7");
			btn8 = new Button("8");
			btn9 = new Button("9");
			btnStart = new Button("Start");
			btnQuit = new Button("Quit");
			btnReset = new Button("Ny");
			btnSearch = new Button("Search");
			
			label = new Label();
			
			choice = "";
			
			btn1.setMinSize(50, 50);
			btn2.setMinSize(50, 50);
			btn3.setMinSize(50, 50);
			btn4.setMinSize(50, 50);
			btn5.setMinSize(50, 50);
			btn6.setMinSize(50, 50);
			btn7.setMinSize(50, 50);
			btn8.setMinSize(50, 50);
			btn9.setMinSize(50, 50);
			btnStart.setMinSize(50, 50);
			btnQuit.setMinSize(50, 50);
			btnReset.setMinSize(50, 50);
			btnSearch.setMinSize(200,50);
			
			btn1.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btn2.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btn3.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btn4.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btn5.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btn6.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btn7.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btn8.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btn9.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btnStart.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btnQuit.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			btnReset.setFont(Font.font("Arial", FontWeight.BOLD, 11));
			
			btn1.setStyle("-fx-background-color: #e0d4a8");
			btn2.setStyle("-fx-background-color: #e0d4a8");
			btn3.setStyle("-fx-background-color: #e0d4a8");
			btn4.setStyle("-fx-background-color: #e0d4a8");
			btn5.setStyle("-fx-background-color: #e0d4a8");
			btn6.setStyle("-fx-background-color: #e0d4a8");
			btn7.setStyle("-fx-background-color: #e0d4a8");
			btn8.setStyle("-fx-background-color: #e0d4a8");
			btn9.setStyle("-fx-background-color: #e0d4a8");
			
			btnStart.setStyle("-fx-background-color: #03fc35");
			btnQuit.setStyle("-fx-background-color: #fc2803");
			btnReset.setStyle("-fx-background-color: #c6cfc8");
			
			HBox hBoxSearch = new HBox();
			HBox hBox123S = new HBox();
			HBox hBox456R = new HBox();
			HBox hBox789Q = new HBox();
			
//			Search button and int window
			hBoxSearch.alignmentProperty().setValue(Pos.CENTER);
			hBoxSearch.setSpacing(50);
			hBoxSearch.setPadding(new Insets(20));
//			hBoxSearch.setStyle("-fx-background-color: #206587");
			hBoxSearch.getChildren().addAll(btnSearch);
			
			hBox123S.setPadding(new Insets(1));
			hBox456R.setPadding(new Insets(1));
			hBox789Q.setPadding(new Insets(1));
			
			hBox123S.setSpacing(1);
			hBox456R.setSpacing(1);
			hBox789Q.setSpacing(1);
			
			hBox123S.alignmentProperty().setValue(Pos.CENTER);
			hBox456R.alignmentProperty().setValue(Pos.CENTER);
			hBox789Q.alignmentProperty().setValue(Pos.CENTER);
			
			hBox123S.getChildren().addAll(btn1, btn2, btn3, btnStart);
			hBox456R.getChildren().addAll(btn4, btn5, btn6, btnReset);
			hBox789Q.getChildren().addAll(btn7, btn8, btn9, btnQuit);
			
			VBox vBox = new VBox();
			vBox.setPadding(new Insets(50));
			vBox.getChildren().addAll(hBox123S, hBox456R, hBox789Q, label);
			
			
			BorderPane root = new BorderPane();
			root.setCenter(vBox);
			root.setBottom(hBoxSearch);
			
			
//			Add functionality. 
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
