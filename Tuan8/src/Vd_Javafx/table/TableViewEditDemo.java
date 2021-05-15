package Vd_Javafx.table;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TableViewEditDemo extends Application {

    @Override
    public void start(Stage stage) {

        TableView<Person> table = new TableView<Person>();

        // Cho phép sửa trên bảng.
        table.setEditable(true);

        TableColumn<Person, String> fullNameCol //
                = new TableColumn<Person, String>("Full Name");

        TableColumn<Person, Gender> genderCol//
                = new TableColumn<Person, Gender>("Gender");

        TableColumn<Person, Boolean> singleCol//
                = new TableColumn<Person, Boolean>("Single?");

        // ==== FULL NAME (TEXT FIELD) ===
        fullNameCol.setCellValueFactory(new PropertyValueFactory<>("fullName"));

        fullNameCol.setCellFactory(TextFieldTableCell.<Person> forTableColumn());

        fullNameCol.setMinWidth(200);

        // Khi edit xong 1 ô ở cột FullName
        fullNameCol.setOnEditCommit((CellEditEvent<Person, String> event) -> {
            TablePosition<Person, String> pos = event.getTablePosition();

            String newFullName = event.getNewValue();

            int row = pos.getRow();
            Person person = event.getTableView().getItems().get(row);

            person.setFullName(newFullName);
        });

        // ==== GENDER (COMBO BOX) ===

//        ObservableList<Gender> genderList = FXCollections.observableArrayList(//
//                Gender.values());
//
//        genderCol.setCellValueFactory(new Callback<CellDataFeatures<Person, Gender>, ObservableValue<Gender>>() {
//
//            @Override
//            public ObservableValue<Gender> call(CellDataFeatures<Person, Gender> param) {
//                Person person = param.getValue();
//                // F,M
//                String genderCode = person.getGender();
//                Gender gender = Gender.getByCode(genderCode);
//                return new SimpleObjectProperty<Gender>(gender);
//            }
//        });
//
//        genderCol.setCellFactory(ComboBoxTableCell.forTableColumn(genderList));
//
//        genderCol.setOnEditCommit((CellEditEvent<Person, Gender> event) -> {
//            TablePosition<Person, Gender> pos = event.getTablePosition();
//
//            Gender newGender = event.getNewValue();
//
//            int row = pos.getRow();
//            Person person = event.getTableView().getItems().get(row);
//
//            person.setGender(newGender.getCode());
//        });
//
//        genderCol.setMinWidth(120);

        // ==== SINGLE? (CHECH BOX) ===
//        singleCol.setCellValueFactory(new Callback<CellDataFeatures<Person, Boolean>, ObservableValue<Boolean>>() {
//
//            @Override
//            public ObservableValue<Boolean> call(CellDataFeatures<Person, Boolean> param) {
//                Person person = param.getValue();
//
//                SimpleBooleanProperty booleanProp = new SimpleBooleanProperty(person.isSingle());
//
//
//                // Chú ý: singleCol.setOnEditCommit(): Không làm việc với
//                // CheckBoxTableCell.
//
//                // Khi cột "Single?" thay đổi
//                booleanProp.addListener(new ChangeListener<Boolean>() {
//
//                    @Override
//                    public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
//                                        Boolean newValue) {
//                        person.setSingle(newValue);
//                    }
//                });
//                return booleanProp;
//            }
//        });

//        singleCol.setCellFactory(new Callback<TableColumn<Person, Boolean>, //
//                TableCell<Person, Boolean>>() {
//            @Override
//            public TableCell<Person, Boolean> call(TableColumn<Person, Boolean> p) {
//                CheckBoxTableCell<Person, Boolean> cell = new CheckBoxTableCell<Person, Boolean>();
//                cell.setAlignment(Pos.CENTER);
//                return cell;
//            }
//        });

        ObservableList<Person> list = getPersonList();
        table.setItems(list);

        table.getColumns().addAll(fullNameCol, genderCol, singleCol);

        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);

        stage.setTitle("TableView (o7planning.org)");

        Scene scene = new Scene(root, 450, 300);
        stage.setScene(scene);
        stage.show();
    }

    private ObservableList<Person> getPersonList() {

        Person person1 = new Person("Susan Smith", Gender.FEMALE.getCode(), true);
        Person person2 = new Person("Anne McNeil", Gender.FEMALE.getCode(), true);
        Person person3 = new Person("Kenvin White", Gender.MALE.getCode(), false);

        ObservableList<Person> list = FXCollections.observableArrayList(person1, person2, person3);
        return list;
    }

    public static void main(String[] args) {
        launch(args);
    }

}