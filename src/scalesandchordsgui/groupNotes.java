/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scalesandchordsgui;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import static scalesandchordsgui.ScalesAndChordsGUI.posXNota;
import static scalesandchordsgui.ScalesAndChordsGUI.posYNota;

/**
 *
 * @author Luis Carlos A. Rojas Torres <luiscarlos.bsf@oceanica.ufrj.br>
 */
public class groupNotes {
    private String arrayNoteKey;
    private Circle[] arrayNote  = new Circle[12];
    private Group groupNote = new Group();
     
     public groupNotes(String note,Scales dummyScale){
        switch (note){
            case "C":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(8), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(20), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(1), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(13), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(5), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(17), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(10), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(22), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(3), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(15), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(8), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(20), posYNota(6), 10);
            break;
            case "Db":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(9), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(21), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(2), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(14), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(6), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(18), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(11), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(11), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(4), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(16), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(9), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(21), posYNota(6), 10);
            break;
            case "D":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(10), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(22), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(3), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(15), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(7), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(19), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(0), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(12), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(5), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(17), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(10), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(22), posYNota(6), 10);
            break;
            case "Eb":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(11), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(11), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(4), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(16), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(8), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(20), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(1), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(13), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(6), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(18), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(11), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(11), posYNota(6), 10);
            break;
            case "E":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(0), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(12), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(5), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(17), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(9), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(21), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(2), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(14), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(7), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(19), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(0), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(12), posYNota(6), 10);
            break;
            case "F":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(1), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(13), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(6), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(18), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(10), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(22), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(3), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(15), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(8), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(20), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(1), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(13), posYNota(6), 10);
            break;
            case "Gb":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(2), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(14), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(7), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(19), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(11), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(11), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(4), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(16), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(9), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(21), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(2), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(14), posYNota(6), 10);
            break;
            case "G":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(3), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(15), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(8), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(20), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(0), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(12), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(5), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(17), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(10), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(22), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(3), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(15), posYNota(6), 10);
            break;
            case "Ab":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(4), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(16), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(9), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(21), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(1), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(13), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(6), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(18), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(11), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(11), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(4), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(16), posYNota(6), 10);
            break;
            case "A":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(5), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(17), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(10), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(22), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(2), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(14), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(7), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(19), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(0), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(12), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(5), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(17), posYNota(6), 10);
            break;
            case "Bb":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(6), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(18), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(11), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(11), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(3), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(15), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(8), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(20), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(1), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(13), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(6), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(18), posYNota(6), 10);
            case "B":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(7), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(19), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(12), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(0), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(4), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(16), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(9), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(21), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(2), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(14), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(7), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(19), posYNota(6), 10);
            break;    
            default:
                break;
        } 
        
        for(int i= 0;i < arrayNote.length;i++){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.BLACK);
            
            if(arrayNoteKey == dummyScale.getKey()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.WHITE);}
            
            if(arrayNoteKey == dummyScale.getNinth()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(0,0,155));}
            
            if(arrayNoteKey == dummyScale.getMinorThird()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(255,255,0));}
            
            if(arrayNoteKey == dummyScale.getMajorThird()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(155,155,0));}
            
            if(arrayNoteKey == dummyScale.getEleventh()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(250,120,200));}
            
            if(arrayNoteKey == dummyScale.getDiminishedFifth()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(255,0,0));}
            
            if(arrayNoteKey == dummyScale.getPerfectFifth()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(150,0,0));}
            
            if(arrayNoteKey == dummyScale.getMajorSixth()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(250,200,200));}
            
            if(arrayNoteKey == dummyScale.getMinorSeventh()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(0,255,0));}
            
            if(arrayNoteKey == dummyScale.getMajorSeventh()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(0,100,0));}
            
            groupNote.getChildren().add(arrayNote[i]);
        }
     }
     
     public void setGroupNotes(String note,Scales dummyScale){
        groupNote.getChildren().clear();
        switch (note){
            case "C":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(8), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(20), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(1), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(13), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(5), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(17), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(10), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(22), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(3), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(15), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(8), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(20), posYNota(6), 10);
            break;
            case "Db":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(9), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(21), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(2), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(14), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(6), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(18), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(11), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(11), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(4), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(16), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(9), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(21), posYNota(6), 10);
            break;
            case "D":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(10), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(22), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(3), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(15), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(7), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(19), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(0), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(12), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(5), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(17), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(10), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(22), posYNota(6), 10);
            break;
            case "Eb":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(11), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(11), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(4), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(16), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(8), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(20), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(1), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(13), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(6), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(18), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(11), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(11), posYNota(6), 10);
            break;
            case "E":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(0), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(12), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(5), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(17), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(9), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(21), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(2), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(14), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(7), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(19), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(0), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(12), posYNota(6), 10);
            break;
            case "F":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(1), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(13), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(6), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(18), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(10), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(22), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(3), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(15), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(8), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(20), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(1), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(13), posYNota(6), 10);
            break;
            case "Gb":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(2), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(14), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(7), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(19), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(11), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(11), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(4), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(16), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(9), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(21), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(2), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(14), posYNota(6), 10);
            break;
            case "G":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(3), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(15), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(8), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(20), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(0), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(12), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(5), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(17), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(10), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(22), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(3), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(15), posYNota(6), 10);
            break;
            case "Ab":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(4), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(16), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(9), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(21), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(1), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(13), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(6), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(18), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(11), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(11), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(4), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(16), posYNota(6), 10);
            break;
            case "A":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(5), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(17), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(10), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(22), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(2), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(14), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(7), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(19), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(0), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(12), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(5), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(17), posYNota(6), 10);
            break;
            case "Bb":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(6), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(18), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(11), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(11), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(3), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(15), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(8), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(20), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(1), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(13), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(6), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(18), posYNota(6), 10);
            case "B":
                arrayNoteKey = note;
                arrayNote[0] = new Circle(posXNota(7), posYNota(1), 10);
                arrayNote[1] = new Circle(posXNota(19), posYNota(1), 10);
            
                arrayNote[2] = new Circle(posXNota(12), posYNota(2), 10);
                arrayNote[3] = new Circle(posXNota(0), posYNota(2), 10);
            
                arrayNote[4] = new Circle(posXNota(4), posYNota(3), 10);
                arrayNote[5] = new Circle(posXNota(16), posYNota(3), 10);
            
                arrayNote[6] = new Circle(posXNota(9), posYNota(4), 10);
                arrayNote[7] = new Circle(posXNota(21), posYNota(4), 10);
        
                arrayNote[8] = new Circle(posXNota(2), posYNota(5), 10);
                arrayNote[9] = new Circle(posXNota(14), posYNota(5), 10);
        
                arrayNote[10] = new Circle(posXNota(7), posYNota(6), 10);
                arrayNote[11] = new Circle(posXNota(19), posYNota(6), 10);
            break;    
            default:
                break;
        } 
        
        for(int i= 0;i < arrayNote.length;i++){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.BLACK);
            
            if(arrayNoteKey == dummyScale.getKey()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.WHITE);}
            
            if(arrayNoteKey == dummyScale.getNinth()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(0,0,155));}
            
            if(arrayNoteKey == dummyScale.getMinorThird()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(255,255,0));}
            
            if(arrayNoteKey == dummyScale.getMajorThird()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(155,155,0));}
            
            if(arrayNoteKey == dummyScale.getEleventh()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(250,120,200));}
            
            if(arrayNoteKey == dummyScale.getDiminishedFifth()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(255,0,0));}
            
            if(arrayNoteKey == dummyScale.getPerfectFifth()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(150,0,0));}
            
            if(arrayNoteKey == dummyScale.getMajorSixth()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(250,200,200));}
            
            if(arrayNoteKey == dummyScale.getMinorSeventh()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(0,255,0));}
            
            if(arrayNoteKey == dummyScale.getMajorSeventh()){
            arrayNote[i].setStroke(Color.BLACK);
            arrayNote[i].setFill(Color.rgb(0,100,0));}
            
            groupNote.getChildren().add(arrayNote[i]);
        }
     }
     
     public Group getGroupNote(){
         return this.groupNote;
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
