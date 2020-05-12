/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scalesandchordsgui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import static javafx.scene.control.TableView.CONSTRAINED_RESIZE_POLICY;
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
    Escalas escalaTest = new Escalas("C");
    
    
    @Override
    public void start(Stage primaryStage) {
////////INICIO COMBO BOX DE ESCALA Y NOTAS
        ComboBox<String> cbNota = new ComboBox<>();
        cbNota.getItems().addAll("C","Db","D","Eb","E","F","Gb","G","Ab","A","Bb","B");
        cbNota.setValue("Nota");
        
                        
        ComboBox<String> cbEscala = new ComboBox<>();
        cbEscala.getItems().addAll("Mayor","Pentanonica Mayor",
                "Menor","Pentatonica Menor",
                "Ionian","Dorian","Phrygian","Lydian","Mixolydian","Aeolian","Locrian");
        cbEscala.setValue("Escala");
        
        HBox hbox1 = new HBox(10);
        hbox1.setAlignment(Pos.TOP_LEFT);
        
        hbox1.getChildren().addAll(cbNota,cbEscala);
////////FIN COMBO BOX DE ESCALA Y NOTAS
        
////////INICIO TABLA DE ACORDES COMPATIBLES
        TableColumn tablaA  = new TableColumn("A");
        //tablaA.setPrefWidth(75);
        tablaA.setMinWidth(75);
        tablaA.setMaxWidth(75);
        TableColumn tablaBb = new TableColumn("Bb");
        tablaBb.setPrefWidth(75);
        TableColumn tablaB  = new TableColumn("B");
        tablaB.setPrefWidth(75);
        TableColumn tablaC  = new TableColumn("C");
        tablaC.setPrefWidth(75);
        TableColumn tablaDb = new TableColumn("Db");
        tablaDb.setPrefWidth(75);
        TableColumn tablaD  = new TableColumn("D");
        tablaD.setPrefWidth(75);
                
        TableColumn tablaE  = new TableColumn("E");
        tablaE.setPrefWidth(75);
        TableColumn tablaEb = new TableColumn("Eb");
        tablaEb.setPrefWidth(75);
        TableColumn tablaF  = new TableColumn("F");
        tablaF.setPrefWidth(75);
        TableColumn tablaGb = new TableColumn("Gb");
        tablaGb.setPrefWidth(75);
        TableColumn tablaG  = new TableColumn("G");
        tablaG.setPrefWidth(75);
        TableColumn tablaAb = new TableColumn("Ab");
        //tablaAb.setPrefWidth(75);
        tablaAb.setMinWidth(75);
        tablaAb.setMaxWidth(75);
                      
        TableView tablaAcordes = new TableView();
        tablaAcordes.getColumns().addAll(tablaA,tablaBb,tablaB,tablaC,tablaDb,tablaD,tablaE,tablaEb,tablaF,tablaGb,tablaG,tablaAb);
        tablaAcordes.setMaxSize(900, 400);
        tablaAcordes.setColumnResizePolicy(CONSTRAINED_RESIZE_POLICY);
        
        VBox vBox1 = new VBox(0);
        vBox1.setAlignment(Pos.CENTER_LEFT);
        vBox1.getChildren().addAll(hbox1,tablaAcordes);
        
////////FIN TABLA DE ACORDES COMPATIBLES
        
////////INICIO TABLA DE ACORDES COMPATIBLES        
        Image trastero = new Image("strat22.png");
        ImageView imagenTrastero = new ImageView(trastero);
               
        //----------------------------------------------------------------------
        Circle[] arrayC  = new Circle[12];
        arrayC[0] = new Circle(posXNota(8), posYNota(1), 10);
        arrayC[1] = new Circle(posXNota(20), posYNota(1), 10);
        
        arrayC[2] = new Circle(posXNota(1), posYNota(2), 10);
        arrayC[3] = new Circle(posXNota(13), posYNota(2), 10);
        
        arrayC[4] = new Circle(posXNota(5), posYNota(3), 10);
        arrayC[5] = new Circle(posXNota(17), posYNota(3), 10);
        
        arrayC[6] = new Circle(posXNota(10), posYNota(4), 10);
        arrayC[7] = new Circle(posXNota(22), posYNota(4), 10);
        
        arrayC[8] = new Circle(posXNota(3), posYNota(5), 10);
        arrayC[9] = new Circle(posXNota(15), posYNota(5), 10);
        
        arrayC[10] = new Circle(posXNota(8), posYNota(6), 10);
        arrayC[11] = new Circle(posXNota(20), posYNota(6), 10);
        
        Group groupC = new Group();
        for(int i= 0;i < arrayC.length;i++){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.rgb(0,100,0));}
            
            groupC.getChildren().add(arrayC[i]);
            
        }
        
        //----------------------------------------------------------------------
        Circle[] arrayDb  = new Circle[12];
        arrayDb[0] = new Circle(posXNota(9), posYNota(1), 10);
        arrayDb[1] = new Circle(posXNota(21), posYNota(1), 10);
        
        arrayDb[2] = new Circle(posXNota(2), posYNota(2), 10);
        arrayDb[3] = new Circle(posXNota(14), posYNota(2), 10);
        
        arrayDb[4] = new Circle(posXNota(6), posYNota(3), 10);
        arrayDb[5] = new Circle(posXNota(18), posYNota(3), 10);
        
        arrayDb[6] = new Circle(posXNota(11), posYNota(4), 10);
        arrayDb[7] = new Circle(posXNota(11), posYNota(4), 10);
        
        arrayDb[8] = new Circle(posXNota(4), posYNota(5), 10);
        arrayDb[9] = new Circle(posXNota(16), posYNota(5), 10);
        
        arrayDb[10] = new Circle(posXNota(9), posYNota(6), 10);
        arrayDb[11] = new Circle(posXNota(21), posYNota(6), 10);
        
        Group groupDb = new Group();
        for(int i= 0;i < arrayDb.length;i++){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.rgb(0,100,0));}
            
            groupDb.getChildren().add(arrayDb[i]);
        }
        //----------------------------------------------------------------------   
        Circle[] arrayD  = new Circle[12];
        arrayD[0] = new Circle(posXNota(10), posYNota(1), 10);
        arrayD[1] = new Circle(posXNota(22), posYNota(1), 10);
        
        arrayD[2] = new Circle(posXNota(3), posYNota(2), 10);
        arrayD[3] = new Circle(posXNota(15), posYNota(2), 10);
        
        arrayD[4] = new Circle(posXNota(7), posYNota(3), 10);
        arrayD[5] = new Circle(posXNota(19), posYNota(3), 10);
        
        arrayD[6] = new Circle(posXNota(0), posYNota(4), 10);
        arrayD[7] = new Circle(posXNota(12), posYNota(4), 10);
        
        arrayD[8] = new Circle(posXNota(5), posYNota(5), 10);
        arrayD[9] = new Circle(posXNota(17), posYNota(5), 10);
        
        arrayD[10] = new Circle(posXNota(10), posYNota(6), 10);
        arrayD[11] = new Circle(posXNota(22), posYNota(6), 10);
        
        Group groupD = new Group();
        for(int i= 0;i < arrayD.length;i++){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.rgb(0,100,0));}
            
            groupD.getChildren().add(arrayD[i]);
        }
       //---------------------------------------------------------------------- 
        Circle[] arrayEb  = new Circle[12];
        arrayEb[0] = new Circle(posXNota(11), posYNota(1), 10);
        arrayEb[1] = new Circle(posXNota(11), posYNota(1), 10);
        
        arrayEb[2] = new Circle(posXNota(4), posYNota(2), 10);
        arrayEb[3] = new Circle(posXNota(16), posYNota(2), 10);
        
        arrayEb[4] = new Circle(posXNota(8), posYNota(3), 10);
        arrayEb[5] = new Circle(posXNota(20), posYNota(3), 10);
        
        arrayEb[6] = new Circle(posXNota(1), posYNota(4), 10);
        arrayEb[7] = new Circle(posXNota(13), posYNota(4), 10);
        
        arrayEb[8] = new Circle(posXNota(6), posYNota(5), 10);
        arrayEb[9] = new Circle(posXNota(18), posYNota(5), 10);
        
        arrayEb[10] = new Circle(posXNota(11), posYNota(6), 10);
        arrayEb[11] = new Circle(posXNota(11), posYNota(6), 10);
        
        Group groupEb = new Group();
        for(int i= 0;i < arrayEb.length;i++){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.rgb(0,100,0));}
            
            groupEb.getChildren().add(arrayEb[i]);
        }
        //----------------------------------------------------------------------      
        Circle[] arrayE  = new Circle[12];
        arrayE[0] = new Circle(posXNota(0), posYNota(1), 10);
        arrayE[1] = new Circle(posXNota(12), posYNota(1), 10);
        
        arrayE[2] = new Circle(posXNota(5), posYNota(2), 10);
        arrayE[3] = new Circle(posXNota(17), posYNota(2), 10);
        
        arrayE[4] = new Circle(posXNota(9), posYNota(3), 10);
        arrayE[5] = new Circle(posXNota(21), posYNota(3), 10);
        
        arrayE[6] = new Circle(posXNota(2), posYNota(4), 10);
        arrayE[7] = new Circle(posXNota(14), posYNota(4), 10);
        
        arrayE[8] = new Circle(posXNota(7), posYNota(5), 10);
        arrayE[9] = new Circle(posXNota(19), posYNota(5), 10);
        
        arrayE[10] = new Circle(posXNota(0), posYNota(6), 10);
        arrayE[11] = new Circle(posXNota(12), posYNota(6), 10);
        
        Group groupE = new Group();
        for(int i= 0;i < arrayE.length;i++){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.rgb(0,100,0));}
            
            groupE.getChildren().add(arrayE[i]);
        }
        
        //---------------------------------------------------------------------- 
        Circle[] arrayF  = new Circle[12];
        arrayF[0] = new Circle(posXNota(1), posYNota(1), 10);
        arrayF[1] = new Circle(posXNota(13), posYNota(1), 10);
        
        arrayF[2] = new Circle(posXNota(6), posYNota(2), 10);
        arrayF[3] = new Circle(posXNota(18), posYNota(2), 10);
        
        arrayF[4] = new Circle(posXNota(10), posYNota(3), 10);
        arrayF[5] = new Circle(posXNota(22), posYNota(3), 10);
        
        arrayF[6] = new Circle(posXNota(3), posYNota(4), 10);
        arrayF[7] = new Circle(posXNota(15), posYNota(4), 10);
        
        arrayF[8] = new Circle(posXNota(8), posYNota(5), 10);
        arrayF[9] = new Circle(posXNota(20), posYNota(5), 10);
        
        arrayF[10] = new Circle(posXNota(1), posYNota(6), 10);
        arrayF[11] = new Circle(posXNota(13), posYNota(6), 10);
        
        Group groupF = new Group();
        for(int i= 0;i < arrayF.length;i++){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.rgb(0,100,0));}
            
            groupF.getChildren().add(arrayF[i]);
        }
        //----------------------------------------------------------------------  
        Circle[] arrayGb  = new Circle[12];
        arrayGb[0] = new Circle(posXNota(2), posYNota(1), 10);
        arrayGb[1] = new Circle(posXNota(14), posYNota(1), 10);
        
        arrayGb[2] = new Circle(posXNota(7), posYNota(2), 10);
        arrayGb[3] = new Circle(posXNota(19), posYNota(2), 10);
        
        arrayGb[4] = new Circle(posXNota(11), posYNota(3), 10);
        arrayGb[5] = new Circle(posXNota(11), posYNota(3), 10);
        
        arrayGb[6] = new Circle(posXNota(4), posYNota(4), 10);
        arrayGb[7] = new Circle(posXNota(16), posYNota(4), 10);
        
        arrayGb[8] = new Circle(posXNota(9), posYNota(5), 10);
        arrayGb[9] = new Circle(posXNota(21), posYNota(5), 10);
        
        arrayGb[10] = new Circle(posXNota(2), posYNota(6), 10);
        arrayGb[11] = new Circle(posXNota(14), posYNota(6), 10);
        
        Group groupGb = new Group();
        for(int i= 0;i < arrayGb.length;i++){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.rgb(0,100,0));}
            
            groupGb.getChildren().add(arrayGb[i]);
        }
        //----------------------------------------------------------------------  
        Circle[] arrayG  = new Circle[12];
        arrayG[0] = new Circle(posXNota(3), posYNota(1), 10);
        arrayG[1] = new Circle(posXNota(15), posYNota(1), 10);
        
        arrayG[2] = new Circle(posXNota(8), posYNota(2), 10);
        arrayG[3] = new Circle(posXNota(20), posYNota(2), 10);
        
        arrayG[4] = new Circle(posXNota(0), posYNota(3), 10);
        arrayG[5] = new Circle(posXNota(12), posYNota(3), 10);
        
        arrayG[6] = new Circle(posXNota(5), posYNota(4), 10);
        arrayG[7] = new Circle(posXNota(17), posYNota(4), 10);
        
        arrayG[8] = new Circle(posXNota(10), posYNota(5), 10);
        arrayG[9] = new Circle(posXNota(22), posYNota(5), 10);
        
        arrayG[10] = new Circle(posXNota(3), posYNota(6), 10);
        arrayG[11] = new Circle(posXNota(15), posYNota(6), 10);
        
        Group groupG = new Group();
        for(int i= 0;i < arrayG.length;i++){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.rgb(0,100,0));}
            
            groupG.getChildren().add(arrayG[i]);
        }
        //----------------------------------------------------------------------  
        Circle[] arrayAb  = new Circle[12];
        arrayAb[0] = new Circle(posXNota(4), posYNota(1), 10);
        arrayAb[1] = new Circle(posXNota(16), posYNota(1), 10);
        
        arrayAb[2] = new Circle(posXNota(9), posYNota(2), 10);
        arrayAb[3] = new Circle(posXNota(21), posYNota(2), 10);
        
        arrayAb[4] = new Circle(posXNota(1), posYNota(3), 10);
        arrayAb[5] = new Circle(posXNota(13), posYNota(3), 10);
        
        arrayAb[6] = new Circle(posXNota(6), posYNota(4), 10);
        arrayAb[7] = new Circle(posXNota(18), posYNota(4), 10);
        
        arrayAb[8] = new Circle(posXNota(11), posYNota(5), 10);
        arrayAb[9] = new Circle(posXNota(11), posYNota(5), 10);
        
        arrayAb[10] = new Circle(posXNota(4), posYNota(6), 10);
        arrayAb[11] = new Circle(posXNota(16), posYNota(6), 10);
        
        Group groupAb = new Group();
        for(int i= 0;i < arrayAb.length;i++){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.rgb(0,100,0));}
            
            groupAb.getChildren().add(arrayAb[i]);
        }
        //----------------------------------------------------------------------  
        Circle[] arrayA  = new Circle[12];
        arrayA[0] = new Circle(posXNota(5), posYNota(1), 10);
        arrayA[1] = new Circle(posXNota(17), posYNota(1), 10);
        
        arrayA[2] = new Circle(posXNota(10), posYNota(2), 10);
        arrayA[3] = new Circle(posXNota(22), posYNota(2), 10);
        
        arrayA[4] = new Circle(posXNota(2), posYNota(3), 10);
        arrayA[5] = new Circle(posXNota(14), posYNota(3), 10);
        
        arrayA[6] = new Circle(posXNota(7), posYNota(4), 10);
        arrayA[7] = new Circle(posXNota(19), posYNota(4), 10);
        
        arrayA[8] = new Circle(posXNota(0), posYNota(5), 10);
        arrayA[9] = new Circle(posXNota(12), posYNota(5), 10);
        
        arrayA[10] = new Circle(posXNota(5), posYNota(6), 10);
        arrayA[11] = new Circle(posXNota(17), posYNota(6), 10);
        
        Group groupA = new Group();
        for(int i= 0;i < arrayA.length;i++){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.rgb(0,100,0));}
            
            groupA.getChildren().add(arrayA[i]);
        }
        //----------------------------------------------------------------------  
        Circle[] arrayBb  = new Circle[12];
        arrayBb[0] = new Circle(posXNota(6), posYNota(1), 10);
        arrayBb[1] = new Circle(posXNota(18), posYNota(1), 10);
        
        arrayBb[2] = new Circle(posXNota(11), posYNota(2), 10);
        arrayBb[3] = new Circle(posXNota(11), posYNota(2), 10);
        
        arrayBb[4] = new Circle(posXNota(3), posYNota(3), 10);
        arrayBb[5] = new Circle(posXNota(15), posYNota(3), 10);
        
        arrayBb[6] = new Circle(posXNota(8), posYNota(4), 10);
        arrayBb[7] = new Circle(posXNota(20), posYNota(4), 10);
        
        arrayBb[8] = new Circle(posXNota(1), posYNota(5), 10);
        arrayBb[9] = new Circle(posXNota(13), posYNota(5), 10);
        
        arrayBb[10] = new Circle(posXNota(6), posYNota(6), 10);
        arrayBb[11] = new Circle(posXNota(18), posYNota(6), 10);
        
        Group groupBb = new Group();
        for(int i= 0;i < arrayBb.length;i++){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.rgb(0,100,0));}
            
            groupBb.getChildren().add(arrayBb[i]);
        }
        //----------------------------------------------------------------------  
        
        Circle[] arrayB  = new Circle[12];
        arrayB[0] = new Circle(posXNota(7), posYNota(1), 10);
        arrayB[1] = new Circle(posXNota(19), posYNota(1), 10);
        
        arrayB[2] = new Circle(posXNota(12), posYNota(2), 10);
        arrayB[3] = new Circle(posXNota(0), posYNota(2), 10);
        
        arrayB[4] = new Circle(posXNota(4), posYNota(3), 10);
        arrayB[5] = new Circle(posXNota(16), posYNota(3), 10);
        
        arrayB[6] = new Circle(posXNota(9), posYNota(4), 10);
        arrayB[7] = new Circle(posXNota(21), posYNota(4), 10);
        
        arrayB[8] = new Circle(posXNota(2), posYNota(5), 10);
        arrayB[9] = new Circle(posXNota(14), posYNota(5), 10);
        
        arrayB[10] = new Circle(posXNota(7), posYNota(6), 10);
        arrayB[11] = new Circle(posXNota(19), posYNota(6), 10);
        
        Group groupB = new Group();
        for(int i= 0;i < arrayB.length;i++){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.rgb(0,100,0));}
            
            groupB.getChildren().add(arrayB[i]);
        }
        //----------------------------------------------------------------------  
        
        Group grupo = new Group(imagenTrastero);
        
        //COMBOBOXES
        cbNota.setOnAction(e -> {
            escalaTest.setKey(cbNota.getValue());
            groupC.getChildren().clear();
            groupDb.getChildren().clear();
            groupD.getChildren().clear();
            groupEb.getChildren().clear();
            groupE.getChildren().clear();
            groupF.getChildren().clear();
            groupGb.getChildren().clear();
            groupG.getChildren().clear();
            groupAb.getChildren().clear();
            groupA.getChildren().clear();
            groupBb.getChildren().clear();
            groupB.getChildren().clear();
            
            for(int i= 0;i < arrayC.length;i++){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="C"){
            arrayC[i].setStroke(Color.BLACK);
            arrayC[i].setFill(Color.rgb(0,100,0));}
            
            groupC.getChildren().add(arrayC[i]);}
            //------------------------------------------------------------------
            for(int i= 0;i < arrayDb.length;i++){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="Db"){
            arrayDb[i].setStroke(Color.BLACK);
            arrayDb[i].setFill(Color.rgb(0,100,0));}
            
            groupDb.getChildren().add(arrayDb[i]);
        }
		for(int i= 0;i < arrayD.length;i++){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="D"){
            arrayD[i].setStroke(Color.BLACK);
            arrayD[i].setFill(Color.rgb(0,100,0));}
            
            groupD.getChildren().add(arrayD[i]);
        }
		for(int i= 0;i < arrayEb.length;i++){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="Eb"){
            arrayEb[i].setStroke(Color.BLACK);
            arrayEb[i].setFill(Color.rgb(0,100,0));}
            
            groupEb.getChildren().add(arrayEb[i]);
        }
		for(int i= 0;i < arrayE.length;i++){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="E"){
            arrayE[i].setStroke(Color.BLACK);
            arrayE[i].setFill(Color.rgb(0,100,0));}
            
            groupE.getChildren().add(arrayE[i]);
        }
		for(int i= 0;i < arrayF.length;i++){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="F"){
            arrayF[i].setStroke(Color.BLACK);
            arrayF[i].setFill(Color.rgb(0,100,0));}
            
            groupF.getChildren().add(arrayF[i]);
        }
		for(int i= 0;i < arrayGb.length;i++){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="Gb"){
            arrayGb[i].setStroke(Color.BLACK);
            arrayGb[i].setFill(Color.rgb(0,100,0));}
            
            groupGb.getChildren().add(arrayGb[i]);
        }
		for(int i= 0;i < arrayG.length;i++){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="G"){
            arrayG[i].setStroke(Color.BLACK);
            arrayG[i].setFill(Color.rgb(0,100,0));}
            
            groupG.getChildren().add(arrayG[i]);
        }
		for(int i= 0;i < arrayAb.length;i++){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="Ab"){
            arrayAb[i].setStroke(Color.BLACK);
            arrayAb[i].setFill(Color.rgb(0,100,0));}
            
            groupAb.getChildren().add(arrayAb[i]);
        }
		for(int i= 0;i < arrayA.length;i++){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="A"){
            arrayA[i].setStroke(Color.BLACK);
            arrayA[i].setFill(Color.rgb(0,100,0));}
            
            groupA.getChildren().add(arrayA[i]);
        }
		for(int i= 0;i < arrayBb.length;i++){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="Bb"){
            arrayBb[i].setStroke(Color.BLACK);
            arrayBb[i].setFill(Color.rgb(0,100,0));}
            
            groupBb.getChildren().add(arrayBb[i]);
        }
		for(int i= 0;i < arrayB.length;i++){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.BLACK);
            if(escalaTest.getKey()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.WHITE);}
            
            if(escalaTest.getNovena()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.rgb(0,0,155));}
            
            if(escalaTest.getTerceraMenor()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.rgb(255,255,0));}
            
            if(escalaTest.getTerceraMayor()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.rgb(155,155,0));}
            
            if(escalaTest.getSeptimaMenor()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.rgb(0,255,0));}
            
            if(escalaTest.getSeptimaMayor()=="B"){
            arrayB[i].setStroke(Color.BLACK);
            arrayB[i].setFill(Color.rgb(0,100,0));}
            
            groupB.getChildren().add(arrayB[i]);
        }
        String[] dummyArray;
            switch(cbEscala.getValue()){
                case "Mayor":
                    dummyArray = escalaTest.getMajorScaleArray();
                    break;
                case "Pentanonica Mayor":
                    dummyArray = escalaTest.getMajorPentatonicScaleArray();
                    break;
                case "Menor":
                    dummyArray = escalaTest.getMinorScaleArray();
                    break;
                case "Pentatonica Menor":
                    dummyArray = escalaTest.getMinorPentatonicScaleArray();
                    break;
                case "Ionian":
                    dummyArray = escalaTest.getIonianScaleArray();
                    break;
                case"Dorian":
                    dummyArray = escalaTest.getDorianScaleArray();
                    break;
                case "Phrygian":
                    dummyArray = escalaTest.getPhrygianScaleArray();
                    break;
                case "Lydian":
                    dummyArray = escalaTest.getLydianScaleArray();
                    break;
                case "Mixolydian":
                    dummyArray = escalaTest.getMixolydianScaleArray();
                    break;
                case "Aeolian":
                    dummyArray = escalaTest.getAeolianScaleArray();
                    break;
                case "Locrian":
                    dummyArray = escalaTest.getLocrianScaleArray();
                    break;
                default:
                    dummyArray = escalaTest.getMajorScaleArray();
                    break;
            }
            grupo.getChildren().clear();
            grupo.getChildren().add(imagenTrastero);
            for(String i: dummyArray){
                
            switch(i){
                case "C":
                    grupo.getChildren().add(groupC);
                    break;
                case "D":
                    grupo.getChildren().add(groupD);
                    break;
                case "E":
                    grupo.getChildren().add(groupE);
                    break;
                case "F":
                    grupo.getChildren().add(groupF);
                    break;
                case "G":
                    grupo.getChildren().add(groupG);
                    break;
                case "A":
                    grupo.getChildren().add(groupA);
                    break;
                case "B":
                    grupo.getChildren().add(groupB);
                    break;
                case "Db": //C#
                    grupo.getChildren().add(groupDb);
                    break;
                case "Eb": //D#
                    grupo.getChildren().add(groupEb);
                    break; 
                case "Gb": //F#
                    grupo.getChildren().add(groupGb);
                    break;
                case "Ab": //G#
                    grupo.getChildren().add(groupAb);
                    break;
                case "Bb": //A#
                    grupo.getChildren().add(groupBb);
                    break;
                default:
                    break;
            }
            }
        });
        
        
        
        
        
        cbEscala.setOnAction(e ->{
            String[] dummyArray;
            switch(cbEscala.getValue()){
                case "Mayor":
                    dummyArray = escalaTest.getMajorScaleArray();
                    break;
                case "Pentanonica Mayor":
                    dummyArray = escalaTest.getMajorPentatonicScaleArray();
                    break;
                case "Menor":
                    dummyArray = escalaTest.getMinorScaleArray();
                    break;
                case "Pentatonica Menor":
                    dummyArray = escalaTest.getMinorPentatonicScaleArray();
                    break;
                case "Ionian":
                    dummyArray = escalaTest.getIonianScaleArray();
                    break;
                case"Dorian":
                    dummyArray = escalaTest.getDorianScaleArray();
                    break;
                case "Phrygian":
                    dummyArray = escalaTest.getPhrygianScaleArray();
                    break;
                case "Lydian":
                    dummyArray = escalaTest.getLydianScaleArray();
                    break;
                case "Mixolydian":
                    dummyArray = escalaTest.getMixolydianScaleArray();
                    break;
                case "Aeolian":
                    dummyArray = escalaTest.getAeolianScaleArray();
                    break;
                case "Locrian":
                    dummyArray = escalaTest.getLocrianScaleArray();
                    break;
                default:
                    dummyArray = escalaTest.getMajorScaleArray();
                    break;
            }
            grupo.getChildren().clear();
            grupo.getChildren().add(imagenTrastero);
            for(String i: dummyArray){
                
            switch(i){
                case "C":
                    grupo.getChildren().add(groupC);
                    break;
                case "D":
                    grupo.getChildren().add(groupD);
                    break;
                case "E":
                    grupo.getChildren().add(groupE);
                    break;
                case "F":
                    grupo.getChildren().add(groupF);
                    break;
                case "G":
                    grupo.getChildren().add(groupG);
                    break;
                case "A":
                    grupo.getChildren().add(groupA);
                    break;
                case "B":
                    grupo.getChildren().add(groupB);
                    break;
                case "Db": //C#
                    grupo.getChildren().add(groupDb);
                    break;
                case "Eb": //D#
                    grupo.getChildren().add(groupEb);
                    break; 
                case "Gb": //F#
                    grupo.getChildren().add(groupGb);
                    break;
                case "Ab": //G#
                    grupo.getChildren().add(groupAb);
                    break;
                case "Bb": //A#
                    grupo.getChildren().add(groupBb);
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
        root.getChildren().addAll(vBox1,grupo);
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Scales & Chords v1.0 2020");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static int posXNota(int traste){
        // Trastes  
        // 1:"38     2:"114"   3:"190"   4:"266"   5:"342"   6:"418"   7:"494"   8:"570"
        // 9:"646"  10:"720"  11:"795"  12:"870"  13:"945"  14:"1021" 15:"1097" 16:"1173"
        //17:"1248" 18:"1324" 19:"1400" 20:"1475" 21:"1550" 22:"1625"
        // 
        int[] posX = {0,38,114,190,266,342,418,494,570,
                    646,720,795,870,945,1021,1097,1173,
                    1248,1324,1400,1475,1550,1625};
        return posX[traste];
    }
    public static int posYNota(int cuerda){
        // 1 string y= 20
        // 2 string y= 55
        // 3 string y= 88
        // 4 string y= 122
        // 5 string y= 156
        // 6 string y= 190
        int[] posY = {0,20,55,88,122,156,190};
        return posY[cuerda];
    }
}
