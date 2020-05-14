/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scalesandchordsgui;

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Luis Carlos A. Rojas Torres <luiscarlos.bsf@oceanica.ufrj.br>
 */
public class ScalesAndChordsGUI extends Application {
    Scales escalaTest = new Scales("A");
    
    Chord chordC  = new Chord("C");
    Chord chordDb = new Chord("Db");
    Chord chordD  = new Chord("D");
    Chord chordEb = new Chord("Eb");
    Chord chordE  = new Chord("E");
    Chord chordF  = new Chord("F");
    Chord chordGb = new Chord("Gb");
    Chord chordG  = new Chord("G");
    Chord chordAb = new Chord("Ab");
    Chord chordA  = new Chord("A");
    Chord chordBb = new Chord("Bb");
    Chord chordB  = new Chord("B");
    //Grupos de circulos
    groupNotes groupC  = new groupNotes("C" ,escalaTest);
    groupNotes groupDb = new groupNotes("Db",escalaTest);
    groupNotes groupD  = new groupNotes("D" ,escalaTest);
    groupNotes groupEb = new groupNotes("Eb",escalaTest);
    groupNotes groupE  = new groupNotes("E" ,escalaTest);
    groupNotes groupF  = new groupNotes("F" ,escalaTest);
    groupNotes groupGb = new groupNotes("Gb",escalaTest);
    groupNotes groupG  = new groupNotes("G" ,escalaTest);
    groupNotes groupAb = new groupNotes("Ab",escalaTest);
    groupNotes groupA  = new groupNotes("A" ,escalaTest);
    groupNotes groupBb = new groupNotes("Bb",escalaTest);
    groupNotes groupB  = new groupNotes("B" ,escalaTest);
    
    
    @Override
    public void start(Stage primaryStage) {
////////INICIO COMBO BOX DE ESCALA Y NOTAS
        ComboBox<String> cbNota = new ComboBox<>();
        cbNota.getItems().addAll("A","Bb","B","C","Db","D","Eb","E","F","Gb","G","Ab");
        cbNota.setValue("Note");
        
                        
        ComboBox<String> cbEscala = new ComboBox<>();
        cbEscala.getItems().addAll("Major","Major Pentatonic",
                "Minor","Minor Pentatonic",
                "Ionian","Dorian","Phrygian","Lydian","Mixolydian","Aeolian","Locrian");
        cbEscala.setValue("Scales");
        
        HBox hboxComboBoxes = new HBox(10);
        hboxComboBoxes.setAlignment(Pos.TOP_LEFT);
        
        hboxComboBoxes.getChildren().addAll(cbNota,cbEscala);
////////FIN COMBO BOX DE ESCALA Y NOTAS
        
////////INICIO TABLA DE ACORDES COMPATIBLES
        //A
        ListView<String> listA = new ListView<String>();
        listA.setPrefSize(75, 300);
        //Bb
        ListView<String> listBb = new ListView<String>();
        listBb.setPrefSize(75, 300);
        //B
        ListView<String> listB = new ListView<String>();
        listB.setPrefSize(75, 300);
        //C
        ListView<String> listC = new ListView<String>();
        listC.setPrefSize(75, 300);
        //Db
        ListView<String> listDb = new ListView<String>();
        listDb.setPrefSize(75, 300);
        //D
        ListView<String> listD = new ListView<String>();
        listD.setPrefSize(75, 300);
        //Eb
        ListView<String> listEb = new ListView<String>();
        listEb.setPrefSize(75, 300);
        //E
        ListView<String> listE = new ListView<String>();
        listE.setPrefSize(75, 300);
        //F
        ListView<String> listF = new ListView<String>();
        listF.setPrefSize(75, 300);
        //Gb
        ListView<String> listGb = new ListView<String>();
        listGb.setPrefSize(75, 300);
        //G
        ListView<String> listG = new ListView<String>();
        listG.setPrefSize(75, 300);
        //Ab
        ListView<String> listAb = new ListView<String>();
        listAb.setPrefSize(75, 300);
        
        HBox hBoxLists = new HBox(10);
        hBoxLists.getChildren().addAll(listA,listBb,listB,listC,listDb,listD,
                                       listEb,listE,listF,listGb,listG,listAb);
        
        //HELP leyenda de COLORES
        Circle cKey = new Circle (30,500,10);
        cKey.setStroke(Color.BLACK);
        cKey.setFill(Color.WHITE);
        Label lblKey = new Label("Key Note:");
        lblKey.setPrefWidth(100);
        Label lblKeyIN = new Label("");
        HBox cKeyBox = new HBox(10,cKey,lblKey,lblKeyIN);
        
        
        Circle cm3 = new Circle (30,475,10);
        cm3.setStroke(Color.BLACK);
        cm3.setFill(Color.rgb(255,255,0));
        Label lblm3 = new Label("Minor 3rd:");
        lblm3.setPrefWidth(100);
        Label lblm3IN = new Label("");
        HBox cm3Box = new HBox(10,cm3,lblm3,lblm3IN);
        
        Circle cM3 = new Circle (30,450,10);
        cM3.setStroke(Color.BLACK);
        cM3.setFill(Color.rgb(155,155,0));
        Label lblM3 = new Label("Major 3rd:");
        lblM3.setPrefWidth(100);
        Label lblM3IN = new Label("");
        HBox cM3Box = new HBox(10,cM3,lblM3,lblM3IN);
        
        Circle cD5 = new Circle (30,425,10);
        cD5.setStroke(Color.BLACK);
        cD5.setFill(Color.rgb(255,0,0));
        Label lblD5 = new Label("Diminished 5th:");
        lblD5.setPrefWidth(100);
        Label lblD5IN = new Label("");
        HBox cD5Box = new HBox(10,cD5,lblD5,lblD5IN);
        
        Circle cP5 = new Circle (30,400,10);
        cP5.setStroke(Color.BLACK);
        cP5.setFill(Color.rgb(150,0,0));
        Label lblP5 = new Label("Perfect 5th:");
        lblP5.setPrefWidth(100);
        Label lblP5IN = new Label("");
        HBox cP5Box = new HBox(10,cP5,lblP5,lblP5IN);
        
        Circle cM6 = new Circle (30,375,10);
        cM6.setStroke(Color.BLACK);
        cM6.setFill(Color.rgb(250,200,200));
        Label lblM6 = new Label("Major 6th or 13th:");
        lblM6.setPrefWidth(100);
        Label lblM6IN = new Label("");
        HBox cM6Box = new HBox(10,cM6,lblM6,lblM6IN);
        
        Circle cm7 = new Circle (30,350,10);
        cm7.setStroke(Color.BLACK);
        cm7.setFill(Color.rgb(0,255,0));
        Label lblm7 = new Label("Minor 7th:");
        lblm7.setPrefWidth(100);
        Label lblm7IN = new Label("");
        HBox cm7Box = new HBox(10,cm7,lblm7,lblm7IN);
        
        Circle cM7 = new Circle (30,325,10);
        cM7.setStroke(Color.BLACK);
        cM7.setFill(Color.rgb(0,100,0));
        Label lblM7 = new Label("Major 7th:");
        lblM7.setPrefWidth(100);
        Label lblM7IN = new Label("");
        HBox cM7Box = new HBox(10,cM7,lblM7,lblM7IN);
        
        Circle c9 = new Circle (30,300,10);
        c9.setStroke(Color.BLACK);
        c9.setFill(Color.rgb(0,0,155));
        Label lbl9 = new Label("2nd or 9th:");
        lbl9.setPrefWidth(100);
        Label lbl9IN = new Label("");
        HBox c9Box = new HBox(10,c9,lbl9,lbl9IN);
        
        Circle c11 = new Circle (30,275,10);
        c11.setStroke(Color.BLACK);
        c11.setFill(Color.rgb(250,120,200));
        Label lbl11 = new Label("4th or 11th:");
        lbl11.setPrefWidth(100);
        Label lbl11IN = new Label("");
        HBox c11Box = new HBox(10,c11,lbl11,lbl11IN);
        
        VBox vBoxHelp = new VBox(10);
        vBoxHelp.getChildren().addAll(cKeyBox,cm3Box,cM3Box,cD5Box,cP5Box,
                                      cM6Box,cm7Box,cM7Box,c9Box,c11Box);
        
        //FIN HELP leyenda de COLORES
        
        
        HBox hBoxListsAndHelp = new HBox(20);
        hBoxListsAndHelp.getChildren().addAll(hBoxLists,vBoxHelp);
        VBox vBoxTables = new VBox(50);
        vBoxTables.setAlignment(Pos.CENTER_LEFT);
        vBoxTables.getChildren().addAll(hboxComboBoxes,hBoxListsAndHelp);
        
////////FIN TABLA DE ACORDES COMPATIBLES
        
////////INICIO TABLA DE ACORDES COMPATIBLES        
        Image trastero = new Image("strat22.png");
        ImageView imagenTrastero = new ImageView(trastero);
          
        Group grupo = new Group(imagenTrastero);
        
        //COMBOBOXES
        cbNota.setOnAction(e -> {
            escalaTest.setKey(cbNota.getValue());
            //System.out.println(escalaTest);
            
            lblKeyIN.setText(escalaTest.getKey());
            lblm3IN.setText(escalaTest.getMinorThird());
            lblM3IN.setText(escalaTest.getMajorThird());
            lblD5IN.setText(escalaTest.getDiminishedFifth());
            lblP5IN.setText(escalaTest.getPerfectFifth());
            lblP5IN.setText(escalaTest.getPerfectFifth());
            lblM6IN.setText(escalaTest.getMajorSixth());
            lblm7IN.setText(escalaTest.getMinorSeventh());
            lblM7IN.setText(escalaTest.getMajorSeventh());
            lbl9IN.setText(escalaTest.getNinth());
            lbl11IN.setText(escalaTest.getEleventh());
            
            groupC.setGroupNotesColours(escalaTest);
            groupDb.setGroupNotesColours(escalaTest);
            groupD.setGroupNotesColours(escalaTest);
            groupEb.setGroupNotesColours(escalaTest);
            groupE.setGroupNotesColours(escalaTest);
            groupF.setGroupNotesColours(escalaTest);
            groupGb.setGroupNotesColours(escalaTest);
            groupG.setGroupNotesColours(escalaTest);
            groupAb.setGroupNotesColours(escalaTest);
            groupA.setGroupNotesColours(escalaTest);
            groupBb.setGroupNotesColours(escalaTest);
            groupB.setGroupNotesColours(escalaTest);
            
        String[] dummyArray;
            switch(cbEscala.getValue()){
                case "Major":
                    dummyArray = escalaTest.getMajorScaleArray();
                    //System.out.println(escalaTest.getMajorScaleString());
                    break;
                case "Major Pentatonic":
                    dummyArray = escalaTest.getMajorPentatonicScaleArray();
                    //System.out.println(escalaTest.getMajorPentatonicScaleString());
                    break;
                case "Minor":
                    dummyArray = escalaTest.getMinorScaleArray();
                    //System.out.println(escalaTest.getMinorScaleString());
                    break;
                case "Minor Pentatonic":
                    dummyArray = escalaTest.getMinorPentatonicScaleArray();
                    //System.out.println(escalaTest.getMinorPentatonicScaleString());
                    break;
                case "Ionian":
                    dummyArray = escalaTest.getIonianScaleArray();
                    //System.out.println(escalaTest.getIonianScaleString());
                    break;
                case"Dorian":
                    dummyArray = escalaTest.getDorianScaleArray();
                    //System.out.println(escalaTest.getDorianScaleString());
                    break;
                case "Phrygian":
                    dummyArray = escalaTest.getPhrygianScaleArray();
                    //System.out.println(escalaTest.getPhrygianScaleString());
                    break;
                case "Lydian":
                    dummyArray = escalaTest.getLydianScaleArray();
                    //System.out.println(escalaTest.getLydianScaleString());
                    break;
                case "Mixolydian":
                    dummyArray = escalaTest.getMixolydianScaleArray();
                    //System.out.println(escalaTest.getMixolydianScaleString());
                    break;
                case "Aeolian":
                    dummyArray = escalaTest.getAeolianScaleArray();
                    //System.out.println(escalaTest.getAeolianScaleString());
                    break;
                case "Locrian":
                    dummyArray = escalaTest.getLocrianScaleArray();
                    //System.out.println(escalaTest.getLocrianScaleString());
                    break;
                default:
                    dummyArray = escalaTest.getMajorScaleArray();
                    break;
            }
            
            chordA.verify_ALL(dummyArray);
            chordBb.verify_ALL(dummyArray);
            chordB.verify_ALL(dummyArray);
            chordC.verify_ALL(dummyArray);
            chordDb.verify_ALL(dummyArray);
            chordD.verify_ALL(dummyArray);
            chordEb.verify_ALL(dummyArray);
            chordE.verify_ALL(dummyArray);
            chordF.verify_ALL(dummyArray);
            chordGb.verify_ALL(dummyArray);
            chordG.verify_ALL(dummyArray);
            chordAb.verify_ALL(dummyArray);
            
            listA.setItems(chordA.getObservableItems());
            listBb.setItems(chordBb.getObservableItems());
            listB.setItems(chordB.getObservableItems());
            listC.setItems(chordC.getObservableItems());
            
            listDb.setItems(chordDb.getObservableItems());
            listD.setItems(chordD.getObservableItems());
            listEb.setItems(chordEb.getObservableItems());
            listE.setItems(chordE.getObservableItems());
            
            listF.setItems(chordF.getObservableItems());
            listGb.setItems(chordGb.getObservableItems());
            listG.setItems(chordG.getObservableItems());
            listAb.setItems(chordAb.getObservableItems());
            //chordA.showList();
            //chordBb.showList();
            //chordB.showList();
            //chordC.showList();
            //chordDb.showList();
            //chordD.showList();
            //chordEb.showList();
            //chordE.showList();
            //chordF.showList();
            //chordGb.showList();
            //chordG.showList();
            //chordAb.showList(); 
            
            //GRAPHIC PART
            grupo.getChildren().clear();
            grupo.getChildren().add(imagenTrastero);
            
            for(String i: dummyArray){
                
            switch(i){
                case "C":
                    grupo.getChildren().add(groupC.getGroupNote());
                    break;
                case "D":
                    grupo.getChildren().add(groupD.getGroupNote());
                    break;
                case "E":
                    grupo.getChildren().add(groupE.getGroupNote());
                    break;
                case "F":
                    grupo.getChildren().add(groupF.getGroupNote());
                    break;
                case "G":
                    grupo.getChildren().add(groupG.getGroupNote());
                    break;
                case "A":
                    grupo.getChildren().add(groupA.getGroupNote());
                    break;
                case "B":
                    grupo.getChildren().add(groupB.getGroupNote());
                    break;
                case "Db": //C#
                    grupo.getChildren().add(groupDb.getGroupNote());
                    break;
                case "Eb": //D#
                    grupo.getChildren().add(groupEb.getGroupNote());
                    break; 
                case "Gb": //F#
                    grupo.getChildren().add(groupGb.getGroupNote());
                    break;
                case "Ab": //G#
                    grupo.getChildren().add(groupAb.getGroupNote());
                    break;
                case "Bb": //A#
                    grupo.getChildren().add(groupBb.getGroupNote());
                    break;
                default:
                    break;
            }
            }
            
            
        });
        
        
        cbEscala.setOnAction(e ->{
            String[] dummyArray;
            System.out.println("------------------------------------------------");
            switch(cbEscala.getValue()){
                case "Major":
                    dummyArray = escalaTest.getMajorScaleArray();
                    //System.out.println(escalaTest.getMajorScaleString());
                    break;
                case "Major Pentatonic":
                    dummyArray = escalaTest.getMajorPentatonicScaleArray();
                    //System.out.println(escalaTest.getMajorPentatonicScaleString());
                    break;
                case "Minor":
                    dummyArray = escalaTest.getMinorScaleArray();
                    //System.out.println(escalaTest.getMinorScaleString());
                    break;
                case "Minor Pentatonic":
                    dummyArray = escalaTest.getMinorPentatonicScaleArray();
                    //System.out.println(escalaTest.getMinorPentatonicScaleString());
                    break;
                case "Ionian":
                    dummyArray = escalaTest.getIonianScaleArray();
                    //System.out.println(escalaTest.getIonianScaleString());
                    break;
                case"Dorian":
                    dummyArray = escalaTest.getDorianScaleArray();
                    //System.out.println(escalaTest.getDorianScaleString());
                    break;
                case "Phrygian":
                    dummyArray = escalaTest.getPhrygianScaleArray();
                    //System.out.println(escalaTest.getPhrygianScaleString());
                    break;
                case "Lydian":
                    dummyArray = escalaTest.getLydianScaleArray();
                    //System.out.println(escalaTest.getLydianScaleString());
                    break;
                case "Mixolydian":
                    dummyArray = escalaTest.getMixolydianScaleArray();
                    //System.out.println(escalaTest.getMixolydianScaleString());
                    break;
                case "Aeolian":
                    dummyArray = escalaTest.getAeolianScaleArray();
                    //System.out.println(escalaTest.getAeolianScaleString());
                    break;
                case "Locrian":
                    dummyArray = escalaTest.getLocrianScaleArray();
                    //System.out.println(escalaTest.getLocrianScaleString());
                    break;
                default:
                    dummyArray = escalaTest.getMajorScaleArray();
                    break;
            }
                       
            chordA.verify_ALL(dummyArray);
            chordBb.verify_ALL(dummyArray);
            chordB.verify_ALL(dummyArray);
            chordC.verify_ALL(dummyArray);
            chordDb.verify_ALL(dummyArray);
            chordD.verify_ALL(dummyArray);
            chordEb.verify_ALL(dummyArray);
            chordE.verify_ALL(dummyArray);
            chordF.verify_ALL(dummyArray);
            chordGb.verify_ALL(dummyArray);
            chordG.verify_ALL(dummyArray);
            chordAb.verify_ALL(dummyArray);
            
            
            listA.setItems(chordA.getObservableItems());
            listBb.setItems(chordBb.getObservableItems());
            listB.setItems(chordB.getObservableItems());
            listC.setItems(chordC.getObservableItems());
            
            listDb.setItems(chordDb.getObservableItems());
            listD.setItems(chordD.getObservableItems());
            listEb.setItems(chordEb.getObservableItems());
            listE.setItems(chordE.getObservableItems());
            
            listF.setItems(chordF.getObservableItems());
            listGb.setItems(chordGb.getObservableItems());
            listG.setItems(chordG.getObservableItems());
            listAb.setItems(chordAb.getObservableItems());
            //chordA.showList();
            //chordBb.showList();
            //chordB.showList();
            //chordC.showList();
            //chordDb.showList();
            //chordD.showList();
            //chordEb.showList();
            //chordE.showList();
            //chordF.showList();
            //chordGb.showList();
            //chordG.showList();
            //chordAb.showList();  
            
            
            grupo.getChildren().clear();
            grupo.getChildren().add(imagenTrastero);
            for(String i: dummyArray){
                
            switch(i){
                case "C":
                    grupo.getChildren().add(groupC.getGroupNote());
                    break;
                case "D":
                    grupo.getChildren().add(groupD.getGroupNote());
                    break;
                case "E":
                    grupo.getChildren().add(groupE.getGroupNote());
                    break;
                case "F":
                    grupo.getChildren().add(groupF.getGroupNote());
                    break;
                case "G":
                    grupo.getChildren().add(groupG.getGroupNote());
                    break;
                case "A":
                    grupo.getChildren().add(groupA.getGroupNote());
                    break;
                case "B":
                    grupo.getChildren().add(groupB.getGroupNote());
                    break;
                case "Db": //C#
                    grupo.getChildren().add(groupDb.getGroupNote());
                    break;
                case "Eb": //D#
                    grupo.getChildren().add(groupEb.getGroupNote());
                    break; 
                case "Gb": //F#
                    grupo.getChildren().add(groupGb.getGroupNote());
                    break;
                case "Ab": //G#
                    grupo.getChildren().add(groupAb.getGroupNote());
                    break;
                case "Bb": //A#
                    grupo.getChildren().add(groupBb.getGroupNote());
                    break;
                default:
                    break;
            }
            }            
                    
        });
        
        
        
        //
        
////////FIN TABLA DE ACORDES COMPATIBLES        
        
        
        VBox root = new VBox(50);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(vBoxTables,grupo);
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Scales & Chords v1.1 rev1 2020 - JyL");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
