package com.example.projectgui;

import entities.Vehicle;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.skin.DatePickerSkin;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import DAO.VehicleDAO;

import java.io.IOException;
import java.time.LocalDate;

public class SignAcontractGUI extends Application {
    private Stage stage2;

    private Vehicle forRENT;
    private VehicleDAO vehicleDAO;

    public static void main(String[] args) {
        launch(args);
    }

    public Scene getDealScene(Stage primaryStage) {
        vehicleDAO=new VehicleDAO();
        forRENT = VehicleGUI.gettheRented();
        if(forRENT==null)
            System.out.println("not selected yet");
        else System.out.println(forRENT);


        Image CustomerICON = new Image(getClass().getResourceAsStream("/custICON.png"));
        Image EMPICON = new Image(getClass().getResourceAsStream("/emplICON.png"));
        Image contractICON = new Image(getClass().getResourceAsStream("/contractICON.png"));
        Image paymentICON = new Image(getClass().getResourceAsStream("/PaymentICON.png"));
        Image maintenanceICON = new Image(getClass().getResourceAsStream("/maintenanceICON.png"));
        Image carICON = new Image(getClass().getResourceAsStream("/carICON.png"));
        Image LOICON = new Image(getClass().getResourceAsStream("/exitICON.png"));
        Image DBICON = new Image(getClass().getResourceAsStream("/dashboardICON.png"));
        Image dealICON = new Image(getClass().getResourceAsStream("/hand-shake (3).png"));


        Label label = new Label();
        label.setStyle("-fx-background-color: #FDDE55");
        label.setPrefSize(10,90);

        Button CustomersBtn = new Button(" Customers ", new ImageView(CustomerICON));
        Button ContractBtn = new Button(" Contract  ", new ImageView(contractICON));
        Button PaymentsBtn = new Button(" Payments", new ImageView(paymentICON));
        Button EmployeesBtn = new Button(" Employees", new ImageView(EMPICON));
        Button MaintenanceBtn = new Button(" Maintenance" , new ImageView(maintenanceICON));
        Button VehiclesBtn = new Button(" Vehicles   ", new ImageView(carICON));
        Button DASHBOARD = new Button("DashBoard" ,new ImageView(DBICON));
        Button BackBtn = new Button("Back To Main Page");
        Button logOut = new Button(" Log Out  ", new ImageView(LOICON));
        Button dealBtn = new Button(" Make a Deal",new ImageView(dealICON));

        HBox current = new HBox();

        current.getChildren().addAll(label,VehiclesBtn);

        CustomersBtn.setPrefSize(320, 50);
        ContractBtn.setPrefSize(320, 50);
        PaymentsBtn.setPrefSize(320, 50);
        EmployeesBtn.setPrefSize(320, 50);
        MaintenanceBtn.setPrefSize(320, 50);
        VehiclesBtn.setPrefSize(320, 50);
        DASHBOARD.setPrefSize(320, 50);
        BackBtn.setPrefSize(550, 50);
        logOut.setPrefSize(320, 50);
        logOut.setPrefSize(320, 50);
        dealBtn.setPrefSize(320, 50);


        dealBtn.setStyle("-fx-background-color: #3F2B63; " + // Background color
                "-fx-text-fill: #EEF7FF; " + // Text color
                "-fx-font-size: 26px; " + // Font size
                "-fx-font-family:Comic Sans MS;" +
                "-fx-border-width: 0;" +
                "-fx-border-color: BLACk;" +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"

        ); // Font family


        CustomersBtn.setStyle("-fx-background-color: #3F2B63; " + // Background color
                "-fx-text-fill: #EEF7FF; " + // Text color
                "-fx-font-size: 30px; " + // Font size
                "-fx-font-family:Comic Sans MS;" +
                "-fx-border-width: 0;" +
                "-fx-border-color: BLACk;" +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"

        ); // Font family


        ContractBtn.setStyle("-fx-background-color: #3F2B63; " + // Background color
                "-fx-text-fill: #EEF7FF; " + // Text color
                "-fx-font-size: 30px; " + // Font size
                "-fx-font-family:Comic Sans MS;"
                +
                "-fx-border-width: 0;" +
                "-fx-border-color: BLACK;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"); // Font family


        PaymentsBtn.setStyle("-fx-background-color: #3F2B63; " + // Background color
                "-fx-text-fill: #EEF7FF; " + // Text color
                "-fx-font-size: 30px; " + // Font size
                "-fx-font-family: Comic Sans MS;"
                +
                "-fx-border-width: 0;" +
                "-fx-border-color: BLACK;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"); // Font family


        VehiclesBtn.setStyle("-fx-background-color: #3F2B63; " + // Background color
                "-fx-text-fill: #EEF7FF; " + // Text color
                "-fx-font-size: 30px; " + // Font size
                "-fx-font-family: Comic Sans MS;"
                +
                "-fx-border-width: 0;" +
                "-fx-border-color: BLACK;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"); // Font family


        EmployeesBtn.setStyle("-fx-background-color: #3F2B63; " + // Background color
                "-fx-text-fill: #EEF7FF; " + // Text color
                "-fx-font-size: 30px; " + // Font size
                "-fx-font-family: Comic Sans MS;"
                +
                "-fx-border-width: 0;" +
                "-fx-border-color: BLACK;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"); // Font family


        MaintenanceBtn.setStyle("-fx-background-color: #3F2B63; " + // Background color
                "-fx-text-fill: #EEF7FF; " + // Text color
                "-fx-font-size: 28px; " + // Font size
                "-fx-font-family:Comic Sans MS;"
                +
                "-fx-border-width: 0;" +
                "-fx-border-color: BLACK;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"); // Font family


        DASHBOARD.setStyle("-fx-background-color: #3F2B63; " + // Background color
                "-fx-text-fill: #EEF7FF; " + // Text color
                "-fx-font-size: 30px; " + // Font size
                "-fx-font-family:Comic Sans MS;"
                +
                "-fx-border-width: 0;" +
                "-fx-border-color: BLACK;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"); // Font family



        logOut.setStyle("-fx-background-color: #3F2B63; " + // Background color
                "-fx-text-fill: #EEF7FF; " + // Text color
                "-fx-font-size: 30px; " + // Font size
                "-fx-font-family: Comic Sans MS;"
                +
                "-fx-border-width: 0;" +
                "-fx-border-color: BLACK;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"); // Font family

        BackBtn.setStyle("-fx-background-color: #ED5506; " + // Background color
                "-fx-text-fill: #EEF7FF; " + // Text color
                "-fx-font-size: 30px; " + // Font size
                "-fx-font-family: Comic Sans MS;"
                +
                "-fx-border-width: 0;" +
                "-fx-border-color: BLACK;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"); // Font family


        Label space = new Label();
        space.setStyle("-fx-background-color: #3F2B63");
        space.setPrefSize(350,10);


        Image logo = new Image("/LOGO3.PNG");
        ImageView logoView = new ImageView(logo);
        logoView.setFitWidth(320);
        logoView.setFitHeight(100);




        VBox Menu = new VBox();
        Menu.getChildren().addAll(logoView,space,DASHBOARD,CustomersBtn,EmployeesBtn,ContractBtn,PaymentsBtn,MaintenanceBtn,current,logOut);
        Menu.setSpacing(3);
        Menu.setPadding(new Insets(2));

        VBox sceneArea = new VBox();
        sceneArea.setStyle("-fx-background-color: #E2DDF8;");
        sceneArea.setSpacing(50);
        sceneArea.setPadding(new Insets(20,20,350,20));
        // sceneArea.getChildren().addAll(BackBtn);



        sceneArea.setAlignment(Pos.TOP_CENTER);
        Pane pane = new Pane();
        Label t1 = new Label("First Name");
        MainPage MP = new MainPage();

        Screen Cscene = Screen.getPrimary();
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        // primaryStage.setX(bounds.getMinX());
        // primaryStage.setY(bounds.getMinY());
        // primaryStage.setWidth(bounds.getWidth());
        // primaryStage.setHeight(bounds.getHeight());
        GridPane GP1 = new GridPane();
        GP1.add(sceneArea, 1, 0);
        Button close = new Button("Close");

        ColumnConstraints column1 = new ColumnConstraints();
        ColumnConstraints column2 = new ColumnConstraints();
        Stage stage = new Stage();
        //Scene scene = new Scene(GP1, bounds.getWidth(), bounds.getHeight());
        Scene scene = new Scene(GP1,1520, 820);

        column1.setPercentWidth(22);
        column2.setPercentWidth(78);
        GP1.getColumnConstraints().addAll(column1,column2);
        GP1.setBackground(new Background(new BackgroundFill(Color.web("#3F2B63"), null, null)));
        GP1.add(Menu,0,0);



        Label Clabel = new Label("Contract");
        Clabel.setAlignment(Pos.CENTER);
        Clabel.setPrefSize(500,70);
        Clabel.setStyle("-fx-font-family: Helvetica;" +
                "-fx-font-size: 50;"
                +
                "-fx-text-fill: #3F2B63;"+
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"+
                "-fx-background-color: TRANSPARENT;");

        // HBox line1 = new HBox();
        Label Contract_ID = new Label("Contract ID");
        TextField Contract_ID1 = new TextField();
        Label Employee_ID = new Label("Employee ID");
        TextField Employee_ID1 = new TextField();
        Employee_ID1.setEditable(false);
        // line1.getChildren().addAll(Contract_ID,Contract_ID1,Employee_ID,Employee_ID1);
        // line1.setAlignment(Pos.CENTER);
        // line1.setSpacing(50);
        // line1.setPadding(new Insets(10));
        Contract_ID.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;"+
                "-fx-text-fill: #3F2B63;");

        Employee_ID.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-text-fill: #3F2B63;");
        Contract_ID1.setStyle(
                "-fx-background-color: transparent;" +
                        "-fx-border-color: transparent transparent black transparent;" +
                        "-fx-border-width: 0 0 1 0;" +
                        "-fx-padding: 5 0 5 0;"
                        + "-fx-font-size: 17;"
        );
        Contract_ID1.setPrefWidth(200);


        Employee_ID1.setStyle(
                "-fx-background-color: transparent;" +
                        "-fx-border-color: transparent transparent black transparent;" +
                        "-fx-border-width: 0 0 1 0;" +
                        "-fx-padding: 5 0 5 0;" + "-fx-font-size: 17"

        );

        //GP1.setStyle("-fx-border-color: #070F2B;" + "-fx-border-width: 20;");


        // HBox line2 = new HBox();
        Label Customer_ID = new Label("Customer ID");
        TextField Customer_ID1 = new TextField();
        Button newCustomer = new Button("New Customer?");
        Button SignUP = new Button("sign up");

        Customer_ID.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-text-fill: #3F2B63;");

        SignUP.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-text-fill: #3F2B63;");

        newCustomer.setStyle("-fx-background-color: #E2DDF8; " + // Background color
                "-fx-text-fill: #3F2B63; " + // Text color
                "-fx-font-size: 20px; " + // Font size
                "-fx-font-family: Comic Sans MS;"
                +
                "-fx-border-width: 0;" +
                "-fx-border-color: #3F2B63;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"
                +
                "-fx-border-radius: 0;"+
                "-fx-background-radius: 0;"+
                "-fx-text-alignment: LEFT;"


        );
        newCustomer.setUnderline(true);


        Customer_ID1.setStyle(
                "-fx-background-color: transparent;" +
                        "-fx-border-color: transparent transparent black transparent;" +
                        "-fx-border-width: 0 0 1 0;" +
                        "-fx-padding: 5 0 5 0;" + "-fx-font-size: 17;"

        );
        Contract_ID1.setEditable(false);


        // line2.setAlignment(Pos.CENTER);
        //  line2.setSpacing(50);
        // line2.setPadding(new Insets(10));
        //line2.getChildren().addAll(Customer_ID,Customer_ID1,newCustomer,SignUP);

        //  HBox line3 = new HBox();
        Label Vehicle_ID = new Label("Vehicle ID");
        TextField Vehicle_ID1 = new TextField();

        Button specs = new Button("Vehicle specs");
        specs.setPrefSize(150,30);

        specs.setStyle("-fx-background-color: #E2DDF8; " + // Background color
                "-fx-text-fill: #3F2B63; " + // Text color
                "-fx-font-size: 20px; " + // Font size
                "-fx-font-family: Comic Sans MS;"
                +
                "-fx-border-width: 0;" +
                "-fx-border-color: #3F2B63;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"
                +
                "-fx-border-radius: 0;"+
                "-fx-background-radius: 0;"+
                "-fx-text-alignment: LEFT;"


        );
        specs.setUnderline(true);


        Vehicle_ID.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-text-fill: #3F2B63;");
        Label Available = new Label("check if Available");
        Available.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                + "-fx-font-style: ITALIC;"+
                "-fx-font-weight: BOLD;"+
                "-fx-text-fill: #3F2B63;");
        Button Check = new Button("Check");
        Check.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" );

        Vehicle_ID1.setStyle(
                "-fx-background-color: transparent;" +
                        "-fx-border-color: transparent transparent black transparent;" +
                        "-fx-border-width: 0 0 1 0;" +
                        "-fx-padding: 5 0 5 0;" + "-fx-font-size: 17;");


        // line3.setAlignment(Pos.CENTER);
        //  line3.setSpacing(50);
        //  line3.setPadding(new Insets(10));
        //  line3.getChildren().addAll(Vehicle_ID,Vehicle_ID1,Available,Check);

        // HBox line4 = new HBox();

        Label startDate = new Label("Start Date");
        DatePicker startDate1 = new DatePicker();
        startDate1.setEditable(false);
        Label endDate = new Label("End Date");
        DatePicker endDate1 = new DatePicker();
        endDate1.setEditable(false);
        //  startDate1.setPrefSize(5,5);
        startDate.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-text-fill: #3F2B63;");

        endDate.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-text-fill: #3F2B63;");





        TextField field = startDate1.getEditor();
        field.setStyle(
                "-fx-background-color: transparent;" +
                        "-fx-border-color: transparent transparent black transparent;" +
                        "-fx-border-width: 0 0 1 0;" +
                        "-fx-padding: 5 0 5 0;" + "-fx-font-size: 17;"
        );

        field.setPrefWidth(200);



        startDate1.setStyle(
                "-fx-background-color: transparent;"
        );



        TextField field1 = endDate1.getEditor();
        field1.setStyle(
                "-fx-background-color: transparent;" +
                        "-fx-border-color: transparent transparent black transparent;" +
                        "-fx-border-width: 0 0 1 0;" +
                        "-fx-padding: 5 0 5 0;" + "-fx-font-size: 17;"
        );
        field1.setPrefWidth(200);

        endDate1.setStyle(
                ".combo-box .arrow-button { -fx-background-color: transparent; }" +
                        ".combo-box .arrow { -fx-background-color: black; }"
        );
        endDate1.setStyle(
                "-fx-background-color: transparent;"
        );
        //  line4.setAlignment(Pos.CENTER);
        //  line4.setSpacing(50);
        // line4.setPadding(new Insets(10));
        // line4.getChildren().addAll(startDate,startDate1,endDate,endDate1);

        //  HBox line5 = new HBox();
        Button Submit = new Button("Submit");
        Submit.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" );
        Submit.setPrefSize(220,30);
        // line5.setAlignment(Pos.CENTER);
        // line5.setSpacing(50);
        //  line5.setPadding(new Insets(10));
        Submit.setStyle("-fx-background-color: #E2DDF8; " + // Background color
                "-fx-text-fill: #3F2B63; " + // Text color
                "-fx-font-size: 20px; " + // Font size
                "-fx-font-family: Comic Sans MS;"
                +
                "-fx-border-width: 2;" +
                "-fx-border-color: #3F2B63;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"
                +
                "-fx-border-radius: 10;"+
                "-fx-background-radius: 10;"); // Font family
        Button Select = new Button("Select a Car");
        Select.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" );
        Select.setPrefSize(220,30);
        // line5.setAlignment(Pos.CENTER);
        // line5.setSpacing(50);
        //  line5.setPadding(new Insets(10));
        Select.setStyle("-fx-background-color: #E2DDF8; " + // Background color
                "-fx-text-fill: #3F2B63; " + // Text color
                "-fx-font-size: 20px; " + // Font size
                "-fx-font-family: Comic Sans MS;"
                +
                "-fx-border-width: 2;" +
                "-fx-border-color: #3F2B63;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"
                +
                "-fx-border-radius: 10;"+
                "-fx-background-radius: 10;"); // Font family

        SignUP.setStyle("-fx-background-color: #ED7D31; " + // Background color
                "-fx-text-fill: #070F2B; " + // Text color
                "-fx-font-size: 20px; " + // Font size
                "-fx-font-family: Constantia;"
                +
                "-fx-border-width: 5;" +
                "-fx-border-color: #070F2B;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"); // Font family

        Check.setStyle("-fx-background-color: #ED7D31; " + // Background color
                "-fx-text-fill: #070F2B; " + // Text color
                "-fx-font-size: 20px; " + // Font size
                "-fx-font-family: Constantia;"
                +
                "-fx-border-width: 5;" +
                "-fx-border-color: #070F2B;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-font-style: ITALIC;"); // Font family

        // line5.getChildren().addAll(Submit);





        //  HBox line6 = new HBox();
        String costLINE = " = ";
        String InsuranceLINE = " = ";


        Label cost = new Label("Cost"+costLINE);
        TextField cost1 = new TextField();
        Label insurance = new Label("Insurance"+InsuranceLINE);
        TextField insurance1 = new TextField();

        cost.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-text-fill: #3F2B63;");

        insurance.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-text-fill: #3F2B63;");
        //  line6.setAlignment(Pos.CENTER);
        //  line6.setSpacing(70);
        //  line6.setPadding(new Insets(10));
        // line6.getChildren().addAll(cost,cost1,insurance,insurance1);

        cost1.setStyle(
                "-fx-background-color: transparent;" +
                        "-fx-border-color: transparent transparent black transparent;" +
                        "-fx-border-width: 0 0 1 0;" +
                        "-fx-padding: 5 0 5 0;"+ "-fx-font-size: 17;"

        );

        insurance1.setStyle(
                "-fx-background-color: transparent;" +
                        "-fx-border-color: transparent transparent black transparent;" +
                        "-fx-border-width: 0 0 1 0;" +
                        "-fx-padding: 5 0 5 0;"+ "-fx-font-size: 17;"

        );


        Label RentType = new Label("Rent Type");

        RentType.setStyle("-fx-font-family: 'Arial Rounded MT Bold';" +
                "-fx-font-size: 20;"
                +
                "-fx-font-weight: BOLD;" +
                "-fx-text-fill: #3F2B63;");



        ComboBox Rtype = new ComboBox();
        Rtype.setPrefSize(200,20);

        Rtype.setStyle("-fx-background-color: WHITE;");

        ObservableList<String> items2 = FXCollections.observableArrayList(
                "Daily", "Weekly", "Monthly"

        );
        Rtype.setItems(items2);

        Rtype.setStyle(
                "-fx-background-color: transparent;" +
                        "-fx-border-color: transparent transparent black transparent;" +
                        "-fx-border-width: 0 0 1 0;" +
                        "-fx-padding: 5 0 5 0;"+ "-fx-font-size: 17;"

        );


        // Label space1 = new Label("");
        // space1.setPrefWidth(5);

        GridPane Contractform = new GridPane();
        Contractform.setAlignment(Pos.CENTER);
        Contractform.setHgap(15);
        Contractform.setVgap(30);
        Contractform.setPadding(new Insets(10,10,10,10));
//        Contractform.add(Contract_ID,2,0);
//        Contractform.add(Contract_ID1,3,0);
//       // Contractform.add(space1,2,0);

        Contractform.add(Employee_ID,2,0);
        Contractform.add(Employee_ID1,3,0);
        Contractform.add(Customer_ID,2,1);
        Contractform.add(Customer_ID1,3,1);
        Contractform.add(newCustomer,4,1);
        // Contractform.add(SignUP,3,1);
        Contractform.add(Vehicle_ID,2,2);
        Contractform.add(Vehicle_ID1,3,2);
        Contractform.add(Select,3,3);
        Contractform.add(specs,4,2);
        Contractform.add(startDate,2,4);
        Contractform.add(startDate1,3,4);
        // Contractform.add(space1,2,3);

        Contractform.add(endDate,2,5);
        Contractform.add(endDate1,3,5);
        Contractform.add(RentType,2,6);
        Contractform.add(Rtype,3,6);


        Contractform.add(Submit,3,7);
        Contractform.add(cost,2,8);
        //Contractform.add(cost1,3,7);
        Contractform.add(insurance,4,8);
        // Contractform.add(insurance1,3,8);
        sceneArea.getChildren().addAll(Clabel,Contractform);
       /* Select.setOnAction(e->{
            VehicleGUI v = new VehicleGUI();
            v.start(stage);
            Scene scene1 = VehiclesBtn.getScene();

            // Get the stage from the scene
            Stage stage2 = (Stage) scene.getWindow();

            // Close the stage
            stage2.close();
        });*/

        Submit.setOnAction(e->{
            boolean err=false;
            String contractID = Contract_ID1.getText();
            String vehicleID = Vehicle_ID1.getText();
            String customerID = Customer_ID1.getText();
            String employeeID = Employee_ID1.getText();

            LocalDate sDate = startDate1.getValue();
            LocalDate eDate = endDate1.getValue();
            String type = (String) Rtype.getValue();
            if(startDate1.getValue()==null){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("start date is empty");
                alert.setHeaderText(null);
                alert.setContentText("start date field is empty");
                alert.showAndWait();
                err=true;
            }
            if(endDate1.getValue()==null){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("end date is empty");
                alert.setHeaderText(null);
                alert.setContentText("end date field is empty");
                alert.showAndWait();
                err=true;
            }
            if (endDate1.getValue()!=null && startDate1.getValue()!=null){
                if(endDate1.getValue().isBefore(startDate1.getValue())){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("conflict");
                    alert.setHeaderText(null);
                    alert.setContentText("end date can begin before start date");
                    alert.showAndWait();
                    err=true;

                }
            }
            if(Vehicle_ID1.getText().equals("")){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("empty field");
                alert.setHeaderText(null);
                alert.setContentText("select a car first !");
                alert.showAndWait();
                err=true;
            }
            if(Rtype.getValue()==null){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("empty field");
                alert.setHeaderText(null);
                alert.setContentText("select a type of rent!");
                alert.showAndWait();
                err=true;
            }
            if(!err){
                Boolean conflict = vehicleDAO.checkContractConflict(Integer.parseInt(Vehicle_ID1.getText()),startDate1.getValue(),endDate1.getValue());
                if(conflict){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("conflict");
                    alert.setHeaderText(null);
                    alert.setContentText("the dates conflict with other contracts please select another car or another date");
                    alert.showAndWait();
                }
            }








        });


        Vehicle_ID1.setEditable(false);
        if(forRENT!=null){
            if (forRENT.getVehicleID()!=0)
                Vehicle_ID1.setText(Integer.toString(forRENT.getVehicleID()));
        }
        specs.setOnAction(e->{
            Stage form = new Stage();
            form.setTitle("Vehicle Data");
            form.setResizable(false);

            GridPane root = new GridPane();
            root.setPrefWidth(250);
            Scene scene1 = new Scene(root, 340, 480);
            form.setScene(scene1);
            root.setPadding(new Insets(10));
            root.setHgap(10);
            root.setVgap(10);
            root. setStyle("-fx-background-color:#E2DDF8; "+ "-fx-border-color: #3F2B63;" + "-fx-border-width: 2");

            Label label1 = new Label("Vehicle ID");
            TextField vehicleIDField = new TextField();
            Label label2 = new Label("Plate ID");
            TextField plateIDField = new TextField();
            Label label3 = new Label("Power");
            TextField powerField = new TextField();
            Label label4 = new Label("Color");
            TextField colorField = new TextField();
            Label label5 = new Label("Status");
            TextField statusField = new TextField();
            Label label6 = new Label("Passengers");
            TextField passengersField = new TextField();
            Label label7 = new Label("Model");
            TextField modelField = new TextField();
            Label label8 = new Label("Year");
            TextField yearField = new TextField();
            Label label9 = new Label("Traffic Fees");
            TextField trafficFeesField = new TextField();
            Label label10 = new Label("Daily Rent");
            TextField dailyRentField = new TextField();
            Label label11 = new Label("Weekly Rent");
            TextField weeklyRentField = new TextField();
            Label label12 = new Label("Monthly Rent");
            TextField monthlyRentField = new TextField();
            Label label13 = new Label("Insurance Payment");
            TextField insurancePaymentField = new TextField();
            if(forRENT!=null){
                if(forRENT.getVehicleID()!=0){
                    vehicleIDField.setText(Integer.toString(forRENT.getVehicleID()));
                    plateIDField.setText(forRENT.getPlateID());
                    powerField.setText(Integer.toString(forRENT.getPower()));
                    colorField.setText(forRENT.getColor());
                    statusField.setText(forRENT.getStatus());
                    passengersField.setText(Integer.toString(forRENT.getNumberOfPassengers()));
                    modelField.setText(forRENT.getModel());
                    yearField.setText(Integer.toString(forRENT.getYear()));
                    trafficFeesField.setText(Double.toString(forRENT.getTrafficDepartmentFees()));
                    dailyRentField.setText(Double.toString(forRENT.getDailyRent()));
                    weeklyRentField.setText(Double.toString(forRENT.getWeeklyRent()));
                    monthlyRentField.setText(Double.toString(forRENT.getMonthlyRent()));
                    insurancePaymentField.setText(Double.toString(forRENT.getInsurancePayment()));}



            }


            vehicleIDField.setEditable(false);
            plateIDField.setEditable(false);
            powerField.setEditable(false);
            colorField.setEditable(false);
            statusField.setEditable(false);
            passengersField.setEditable(false);
            modelField.setEditable(false);
            yearField.setEditable(false);
            dailyRentField.setEditable(false);
            weeklyRentField.setEditable(false);
            monthlyRentField.setEditable(false);
            trafficFeesField.setEditable(false);
            insurancePaymentField.setEditable(false);

            label1.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label2.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label3.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label4.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label5.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label6.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label7.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label8.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label9.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label10.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");
            label11.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label12.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label13.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            Button ok = new Button("OK");
            ok.setPrefSize(150, 25);
            ok.setStyle("-fx-background-color: #E2DDF8; " + // Background color
                    "-fx-text-fill: #3F2B63; " + // Text color
                    "-fx-font-size: 20px; " + // Font size
                    "-fx-font-family: Comic Sans MS; " +
                    "-fx-border-width: 2; " +
                    "-fx-border-color: #3F2B63; " +
                    "-fx-font-weight: BOLD; " +
                    "-fx-font-style: ITALIC; " +
                    "-fx-border-radius: 10; " +
                    "-fx-background-radius: 10;");


            root.add(label1, 0, 0);
            root.add(vehicleIDField, 1, 0);
            root.add(label2, 0, 1);
            root.add(plateIDField, 1, 1);
            root.add(label3, 0, 2);
            root.add(powerField, 1, 2);
            root.add(label4, 0, 3);
            root.add(colorField, 1, 3);
            root.add(label5, 0, 4);
            root.add(statusField, 1, 4);
            root.add(label6, 0, 5);
            root.add(passengersField, 1, 5);
            root.add(label7, 0, 6);
            root.add(modelField, 1, 6);
            root.add(label8, 0, 7);
            root.add(yearField, 1, 7);
            root.add(label9, 0, 8);
            root.add(trafficFeesField, 1, 8);
            root.add(label10, 0, 9);
            root.add(dailyRentField, 1, 9);
            root.add(label11, 0, 10);
            root.add(weeklyRentField, 1, 10);
            root.add(label12, 0, 11);
            root.add(monthlyRentField, 1, 11);
            root.add(label13, 0, 12);
            root.add(insurancePaymentField, 1, 12);




            form.show();




        });




        newCustomer.setOnAction(e2->{

            Stage form = new Stage();
            form.setTitle("Customer Data");
            form.setResizable(false);

            GridPane root = new GridPane();
            root.setPrefWidth(250);
            Scene scene1 = new Scene(root, 320, 400);
            form.setScene(scene1);
            root.setPadding(new Insets(10));
            root.setHgap(10);
            root.setVgap(10);
            root. setStyle("-fx-background-color:#E2DDF8; "+ "-fx-border-color: #3F2B63;" + "-fx-border-width: 2");


            Label label1 = new Label("Customer ID");
            TextField customerIDField = new TextField();
            Label label2 = new Label("First Name");
            TextField customerFirstNameField = new TextField();
            Label label3 = new Label("Last Name");
            TextField customerLastNameField = new TextField();
            Label label4 = new Label("Address");
            TextField customerAddressField = new TextField();
            Label label5 = new Label("Job");
            TextField jobField = new TextField();
            Label label6 = new Label("Phone");
            TextField customerPhoneField = new TextField();
            Label label7 = new Label("License Number");
            TextField licenseNumberField = new TextField();


            label1.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label2.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label3.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label4.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label5.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label6.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");

            label7.setStyle("-fx-font-family: 'Arial Rounded MT Bold';"+
                    "-fx-font-size: 15px;" +"-fx-text-fill: #3F2B63; "+
                    "-fx-font-weight: BOLD;"+ "-fx-font-style: ITALIC;");




            // Create an OK button and style it
            Button ok = new Button("OK");
            ok.setPrefSize(150, 20);
            ok.setStyle("-fx-background-color: #E2DDF8; " + // Background color
                    "-fx-text-fill: #3F2B63; " + // Text color
                    "-fx-font-size: 20px; " + // Font size
                    "-fx-font-family: Comic Sans MS; " +
                    "-fx-border-width: 2; " +
                    "-fx-border-color: #3F2B63; " +
                    "-fx-font-weight: BOLD; " +
                    "-fx-font-style: ITALIC; " +
                    "-fx-border-radius: 10; " +
                    "-fx-background-radius: 10;");


            root.add(label1, 0, 0);
            root.add(customerIDField, 1, 0);
            root.add(label2, 0, 1);
            root.add(customerFirstNameField, 1, 1);
            root.add(label3, 0, 2);
            root.add(customerLastNameField, 1, 2);
            root.add(label4, 0, 3);
            root.add(customerAddressField, 1, 3);
            root.add(label5, 0, 4);
            root.add(jobField, 1, 4);
            root.add(label6, 0, 5);
            root.add(customerPhoneField, 1, 5);
            root.add(label7, 0, 6);
            root.add(licenseNumberField, 1, 6);

            form.show();

            root.add(ok, 1, 7);
            ok.setOnAction(e1->{

                String customerID = customerIDField.getText();
                String customerFirstName = customerFirstNameField.getText();
                String customerLastName = customerLastNameField.getText();
                String customerAddress = customerAddressField.getText();
                String job = jobField.getText();
                String customerPhone = customerPhoneField.getText();
                String licenseNumber = licenseNumberField.getText();


                form.close();


            });

        });





        CustomerGUI customerGUI = new CustomerGUI();
        VehicleGUI vehicleGUI = new VehicleGUI();
        PaymentGUI paymentGUI = new PaymentGUI();
        MaintenanceGUI maintenanceGUI = new MaintenanceGUI();
        ContractGUI contractGUI = new ContractGUI();
        EmployeeGUI employeeGUI = new EmployeeGUI();
        // SignAcontractGUI signAcontractGUI = new SignAcontractGUI();
        MainPage mainGUI = new MainPage();

        DASHBOARD.setOnAction(e -> {
            Scene s = new MainPage().getDashboardScene(primaryStage);
            primaryStage.setScene(s);
            primaryStage.setMaximized(true);
             primaryStage.setResizable(true);
            primaryStage.setTitle("Middle East Car Rental");
        });

        CustomersBtn.setOnAction(e -> {
            // Get the button's scene
            Scene s = new CustomerGUI().getCustomerScene(primaryStage);
            primaryStage.setScene(s);
            primaryStage.setMaximized(true);
             primaryStage.setResizable(true);
            primaryStage.setTitle("Middle East Car Rental");

        });

        EmployeesBtn.setOnAction(e -> {
            // Get the button's scene
            Scene s = new EmployeeGUI().getEmployeeScene(primaryStage);
            primaryStage.setScene(s);
            primaryStage.setMaximized(true);
             primaryStage.setResizable(true);
            primaryStage.setTitle("Middle East Car Rental");

        });

        PaymentsBtn.setOnAction(e -> {
            // Get the button's scene
            Scene s = new PaymentGUI().getPaymentScene(primaryStage);
            primaryStage.setScene(s);
            primaryStage.setMaximized(true);
             primaryStage.setResizable(true);
            primaryStage.setTitle("Middle East Car Rental");

        });

        MaintenanceBtn.setOnAction(e -> {
            // Get the button's scene
            Scene s = new MaintenanceGUI().getMaintenanceScene(primaryStage);
            primaryStage.setScene(s);
            primaryStage.setMaximized(true);
             primaryStage.setResizable(true);
            primaryStage.setTitle("Middle East Car Rental");

        });

        VehiclesBtn.setOnAction(e -> {
            // Get the button's scene
            Scene s = new VehicleGUI().getVehicleScene(primaryStage);
            primaryStage.setScene(s);
            primaryStage.setMaximized(true);
             primaryStage.setResizable(true);
            primaryStage.setTitle("Middle East Car Rental");

        });

        ContractBtn.setOnAction(e -> {
            // Get the button's scene
            Scene s = new ContractGUI().getContractScene(primaryStage);
            primaryStage.setScene(s);
            primaryStage.setMaximized(true);
             primaryStage.setResizable(true);
            primaryStage.setTitle("Middle East Car Rental");

        });
        logOut.setOnAction(e->{
            LoginGUI loginGUI = new LoginGUI();

            loginGUI.start(stage);
            Scene scene3 = logOut.getScene();
            Stage stage2 = (Stage) scene.getWindow();
            stage2.close();




        });

        /*dealBtn.setOnAction(e -> {
            // Get the button's scene
            signAcontractGUI.start(stage);
            Scene scene3 = dealBtn.getScene();

            // Get the stage from the scene
            Stage stage2 = (Stage) scene.getWindow();

            // Close the stage
            stage2.close();

        });



        /*DASHBOARD.setOnAction(e -> {
            // Get the button's scene
            mainGUI.start(stage);
            Scene scene2 = DASHBOARD.getScene();

            // Get the stage from the scene
            Stage stage2 = (Stage) scene.getWindow();

            // Close the stage
            stage2.close();

        });
        CustomersBtn.setOnAction(e -> {
            // Get the button's scene
            customerGUI.start(stage);
            Scene scene1 = CustomersBtn.getScene();

            // Get the stage from the scene
            Stage stage2 = (Stage) scene.getWindow();

            // Close the stage
            stage2.close();

        });

        EmployeesBtn.setOnAction(e -> {
            // Get the button's scene
            employeeGUI.start(stage);
            Scene scene1 = EmployeesBtn.getScene();

            // Get the stage from the scene
            Stage stage2 = (Stage) scene.getWindow();

            // Close the stage
            stage2.close();

        });



        PaymentsBtn.setOnAction(e -> {
            // Get the button's scene
            paymentGUI.start(stage);
            Scene scene1 = PaymentsBtn.getScene();

            // Get the stage from the scene
            Stage stage2 = (Stage) scene.getWindow();

            // Close the stage
            stage2.close();

        });


        MaintenanceBtn.setOnAction(e -> {
            // Get the button's scene
            maintenanceGUI.start(stage);
            Scene scene1 = MaintenanceBtn.getScene();

            // Get the stage from the scene
            Stage stage2 = (Stage) scene.getWindow();

            // Close the stage
            stage2.close();

        });


        VehiclesBtn.setOnAction(e -> {
            // Get the button's scene
            vehicleGUI.start(stage);
            Scene scene1 = VehiclesBtn.getScene();

            // Get the stage from the scene
            Stage stage2 = (Stage) scene.getWindow();

            // Close the stage
            stage2.close();

        });


        ContractBtn.setOnAction(e -> {
            // Get the button's scene
            contractGUI.start(stage);
            Scene scene1 = ContractBtn.getScene();

            // Get the stage from the scene
            Stage stage2 = (Stage) scene.getWindow();

            // Close the stage
            stage2.close();

        });*/








       // stage.setScene(scene);
      //  stage.setTitle("signAcontract GUI");
      //  stage.show();

return scene;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage2 = primaryStage;

        primaryStage.setScene(getDealScene(primaryStage));
        primaryStage.setTitle("Middle East Car Rental");
        //primaryStage.setMaximized(true);
        //  primaryStage.setResizable(true);
        primaryStage.show();
    }


}
