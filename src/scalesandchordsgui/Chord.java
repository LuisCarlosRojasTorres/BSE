/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scalesandchordsgui;
import java.util.ArrayList;
/**
 *
 * @author Luis Carlos A. Rojas Torres <luiscarlos.bsf@oceanica.ufrj.br>
 */
public class Chord extends Chromatic{
    private String[] minorChord = new String[3];
    private String[] majorChord = new String[3];
    
    private String[] minorSixthChord = new String[4];
    private String[] majorSixthChord = new String[4];
    
    private String[] dominantSeventhChord = new String[4];
    private String[] minorSeventhChord = new String[4];
    private String[] majorSeventhChord = new String[4];
    
    private String[] addNinthChord = new String[4];
    private String[] dominantNinthChord = new String[5];
    private String[] minorNinthChord = new String[5];
    private String[] majorNinthChord = new String[5];
    
    private String[] dominantEleventhChord = new String[6];
    private String[] minorEleventhChord = new String[6];
    private String[] majorEleventhChord = new String[6];
    
    private String[] dominantThirteenthChord = new String[6];
    private String[] minorThirteenthChord = new String[6];
    private String[] majorThirteenthChord = new String[6];
    
    private ArrayList<String> itemsOfTable = new ArrayList<String>();
    
    public Chord(String note){
        super(note);
        
        this.minorChord[0] = this.getKey();
        this.minorChord[1] = this.getMinorThird();
        this.minorChord[2] = this.getPerfectFifth();
        
        this.majorChord[0] = this.getKey();
        this.majorChord[1] = this.getMajorThird();
        this.majorChord[2] = this.getPerfectFifth();
        
        this.minorSixthChord[0] = this.getKey();
        this.minorSixthChord[1] = this.getMinorThird();
        this.minorSixthChord[2] = this.getPerfectFifth();
        this.minorSixthChord[3] = this.getMajorSixth();
        
        this.majorSixthChord[0] = this.getKey();
        this.majorSixthChord[1] = this.getMajorThird();
        this.majorSixthChord[2] = this.getPerfectFifth();
        this.majorSixthChord[3] = this.getMajorSixth();
        
        this.dominantSeventhChord[0] = this.getKey();
        this.dominantSeventhChord[1] = this.getMajorThird();
        this.dominantSeventhChord[2] = this.getPerfectFifth();
        this.dominantSeventhChord[3] = this.getMinorSeventh();
        
        this.minorSeventhChord[0] = this.getKey();
        this.minorSeventhChord[1] = this.getMinorThird();
        this.minorSeventhChord[2] = this.getPerfectFifth();
        this.minorSeventhChord[3] = this.getMinorSeventh();
        
        this.majorSeventhChord[0] = this.getKey();
        this.majorSeventhChord[1] = this.getMajorThird();
        this.majorSeventhChord[2] = this.getPerfectFifth();
        this.majorSeventhChord[3] = this.getMajorSeventh();
        
        this.addNinthChord[0] = this.getKey();
        this.addNinthChord[1] = this.getMajorThird();
        this.addNinthChord[2] = this.getPerfectFifth();
        this.addNinthChord[3] = this.getNinth();
        
        this.dominantNinthChord[0] = this.getKey();
        this.dominantNinthChord[1] = this.getMajorThird();
        this.dominantNinthChord[2] = this.getPerfectFifth();
        this.dominantNinthChord[3] = this.getMinorSeventh();
        this.dominantNinthChord[4] = this.getNinth();
        
        this.minorNinthChord[0] = this.getKey();
        this.minorNinthChord[1] = this.getMinorThird();
        this.minorNinthChord[2] = this.getPerfectFifth();
        this.minorNinthChord[3] = this.getMinorSeventh();
        this.minorNinthChord[4] = this.getNinth();
        
        this.majorNinthChord[0] = this.getKey();
        this.majorNinthChord[1] = this.getMajorThird();
        this.majorNinthChord[2] = this.getPerfectFifth();
        this.majorNinthChord[3] = this.getMajorSeventh();
        this.majorNinthChord[4] = this.getNinth();
        
        //11
        this.dominantEleventhChord[0] = this.getKey();
        this.dominantEleventhChord[1] = this.getMajorThird();
        this.dominantEleventhChord[2] = this.getPerfectFifth();
        this.dominantEleventhChord[3] = this.getMinorSeventh();
        this.dominantEleventhChord[4] = this.getNinth();
        this.dominantEleventhChord[5] = this.getEleventh();
        
        this.minorEleventhChord[0] = this.getKey();
        this.minorEleventhChord[1] = this.getMinorThird();
        this.minorEleventhChord[2] = this.getPerfectFifth();
        this.minorEleventhChord[3] = this.getMinorSeventh();
        this.minorEleventhChord[4] = this.getNinth();
        this.minorEleventhChord[5] = this.getEleventh();
        
        this.majorEleventhChord[0] = this.getKey();
        this.majorEleventhChord[1] = this.getMajorThird();
        this.majorEleventhChord[2] = this.getPerfectFifth();
        this.majorEleventhChord[3] = this.getMajorSeventh();
        this.majorEleventhChord[4] = this.getNinth();
        this.majorEleventhChord[5] = this.getEleventh();
        
        //13
        this.dominantThirteenthChord[0] = this.getKey();
        this.dominantThirteenthChord[1] = this.getMajorThird();
        this.dominantThirteenthChord[2] = this.getPerfectFifth();
        this.dominantThirteenthChord[3] = this.getMinorSeventh();
        this.dominantThirteenthChord[4] = this.getNinth();
        this.dominantThirteenthChord[5] = this.getThirteenth();
        
        this.minorThirteenthChord[0] = this.getKey();
        this.minorThirteenthChord[1] = this.getMinorThird();
        this.minorThirteenthChord[2] = this.getPerfectFifth();
        this.minorThirteenthChord[3] = this.getMinorSeventh();
        this.minorThirteenthChord[4] = this.getNinth();
        this.minorThirteenthChord[5] = this.getThirteenth();
        
        this.majorThirteenthChord[0] = this.getKey();
        this.majorThirteenthChord[1] = this.getMajorThird();
        this.majorThirteenthChord[2] = this.getPerfectFifth();
        this.majorThirteenthChord[3] = this.getMajorSeventh();
        this.majorThirteenthChord[4] = this.getNinth();
        this.majorThirteenthChord[5] = this.getThirteenth();
    }
    public void setChord(String note){
        super.setChromaticScale(note);
        
        this.minorChord[0] = this.getKey();
        this.minorChord[1] = this.getMinorThird();
        this.minorChord[2] = this.getPerfectFifth();
        
        this.majorChord[0] = this.getKey();
        this.majorChord[1] = this.getMajorThird();
        this.majorChord[2] = this.getPerfectFifth();
        
        this.minorSixthChord[0] = this.getKey();
        this.minorSixthChord[1] = this.getMinorThird();
        this.minorSixthChord[2] = this.getPerfectFifth();
        this.minorSixthChord[3] = this.getMajorSixth();
        
        this.majorSixthChord[0] = this.getKey();
        this.majorSixthChord[1] = this.getMajorThird();
        this.majorSixthChord[2] = this.getPerfectFifth();
        this.majorSixthChord[3] = this.getMajorSixth();
        
        //7
        this.dominantSeventhChord[0] = this.getKey();
        this.dominantSeventhChord[1] = this.getMajorThird();
        this.dominantSeventhChord[2] = this.getPerfectFifth();
        this.dominantSeventhChord[3] = this.getMinorSeventh();
        
        this.minorSeventhChord[0] = this.getKey();
        this.minorSeventhChord[1] = this.getMinorThird();
        this.minorSeventhChord[2] = this.getPerfectFifth();
        this.minorSeventhChord[3] = this.getMinorSeventh();
        
        this.majorSeventhChord[0] = this.getKey();
        this.majorSeventhChord[1] = this.getMajorThird();
        this.majorSeventhChord[2] = this.getPerfectFifth();
        this.majorSeventhChord[3] = this.getMajorSeventh();
        
        //9
        this.addNinthChord[0] = this.getKey();
        this.addNinthChord[1] = this.getMajorThird();
        this.addNinthChord[2] = this.getPerfectFifth();
        this.addNinthChord[3] = this.getNinth();
        
        this.dominantNinthChord[0] = this.getKey();
        this.dominantNinthChord[1] = this.getMajorThird();
        this.dominantNinthChord[2] = this.getPerfectFifth();
        this.dominantNinthChord[3] = this.getMinorSeventh();
        this.dominantNinthChord[4] = this.getNinth();
        
        this.minorNinthChord[0] = this.getKey();
        this.minorNinthChord[1] = this.getMinorThird();
        this.minorNinthChord[2] = this.getPerfectFifth();
        this.minorNinthChord[3] = this.getMinorSeventh();
        this.minorNinthChord[4] = this.getNinth();
        
        this.majorNinthChord[0] = this.getKey();
        this.majorNinthChord[1] = this.getMajorThird();
        this.majorNinthChord[2] = this.getPerfectFifth();
        this.majorNinthChord[3] = this.getMajorSeventh();
        this.majorNinthChord[4] = this.getNinth();
        
        //11
        this.dominantEleventhChord[0] = this.getKey();
        this.dominantEleventhChord[1] = this.getMajorThird();
        this.dominantEleventhChord[2] = this.getPerfectFifth();
        this.dominantEleventhChord[3] = this.getMinorSeventh();
        this.dominantEleventhChord[4] = this.getNinth();
        this.dominantEleventhChord[5] = this.getEleventh();
        
        this.minorEleventhChord[0] = this.getKey();
        this.minorEleventhChord[1] = this.getMinorThird();
        this.minorEleventhChord[2] = this.getPerfectFifth();
        this.minorEleventhChord[3] = this.getMinorSeventh();
        this.minorEleventhChord[4] = this.getNinth();
        this.minorEleventhChord[5] = this.getEleventh();
        
        this.majorEleventhChord[0] = this.getKey();
        this.majorEleventhChord[1] = this.getMajorThird();
        this.majorEleventhChord[2] = this.getPerfectFifth();
        this.majorEleventhChord[3] = this.getMajorSeventh();
        this.majorEleventhChord[4] = this.getNinth();
        this.majorEleventhChord[5] = this.getEleventh();
        
        //13
        this.dominantThirteenthChord[0] = this.getKey();
        this.dominantThirteenthChord[1] = this.getMajorThird();
        this.dominantThirteenthChord[2] = this.getPerfectFifth();
        this.dominantThirteenthChord[3] = this.getMinorSeventh();
        this.dominantThirteenthChord[4] = this.getNinth();
        this.dominantThirteenthChord[5] = this.getThirteenth();
        
        this.minorThirteenthChord[0] = this.getKey();
        this.minorThirteenthChord[1] = this.getMinorThird();
        this.minorThirteenthChord[2] = this.getPerfectFifth();
        this.minorThirteenthChord[3] = this.getMinorSeventh();
        this.minorThirteenthChord[4] = this.getNinth();
        this.minorThirteenthChord[5] = this.getThirteenth();
        
        this.majorThirteenthChord[0] = this.getKey();
        this.majorThirteenthChord[1] = this.getMajorThird();
        this.majorThirteenthChord[2] = this.getPerfectFifth();
        this.majorThirteenthChord[3] = this.getMajorSeventh();
        this.majorThirteenthChord[4] = this.getNinth();
        this.majorThirteenthChord[5] = this.getThirteenth();
    }
    
    public boolean isIn(String element,String[] vector){
        for(String i:vector){
            if(element == i){
                return true;
            }
        }
        return false;        
    }
    public void verify_ALL(String[] dummyScale){
        if(this.verify_m(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_m(dummyScale));
        }
        if(this.verify_(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_(dummyScale));
        }
        if(this.verify_m6(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_m6(dummyScale));
        }
        if(this.verify_6(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_6(dummyScale));
        }
        if(this.verify_7(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_7(dummyScale));
        }
        if(this.verify_m7(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_m7(dummyScale));
        }
        if(this.verify_M7(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_M7(dummyScale));
        }
        if(this.verify_add9(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_add9(dummyScale));
        }
        if(this.verify_9(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_9(dummyScale));
        }
        if(this.verify_m9(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_m9(dummyScale));
        }
        if(this.verify_M9(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_M9(dummyScale));
        }
        if(this.verify_11(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_11(dummyScale));
        }
        if(this.verify_m11(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_m11(dummyScale));
        }
        if(this.verify_M11(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_M11(dummyScale));
        }
        if(this.verify_13(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_13(dummyScale));
        }
        if(this.verify_m13(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_m13(dummyScale));
        }
        if(this.verify_M13(dummyScale)!= ""){
            this.itemsOfTable.add(this.verify_M13(dummyScale));
        }
    }
    public String verify_m(String[] dummyScale){
        boolean value;
        for(String i:this.getMinorChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"m";
    }
    public String verify_(String[] dummyScale){
        boolean value;
        for(String i:this.getMajorChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey();
    }
    public String verify_m6(String[] dummyScale){
        boolean value;
        for(String i:this.getMinorSixthChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"m6";
    }
    public String verify_6(String[] dummyScale){
        boolean value;
        for(String i:this.getMajorSixthChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"6";
    }
    public String verify_7(String[] dummyScale){
        boolean value;
        for(String i:this.getDominantSeventhChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"7";
    }
    public String verify_m7(String[] dummyScale){
        boolean value;
        for(String i:this.getMinorSeventhChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"m7";
    }
    public String verify_M7(String[] dummyScale){
        boolean value;
        for(String i:this.getMajorSeventhChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"M7";
    }
    public String verify_add9(String[] dummyScale){
        boolean value;
        for(String i:this.getAddNinthChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"add9";
    }
    public String verify_9(String[] dummyScale){
        boolean value;
        for(String i:this.getDominantNinthChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"9";
    }
    public String verify_m9(String[] dummyScale){
        boolean value;
        for(String i:this.getMinorNinthChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"m9";
    }
    public String verify_M9(String[] dummyScale){
        boolean value;
        for(String i:this.getMajorNinthChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"M9";
    }
    public String verify_11(String[] dummyScale){
        boolean value;
        for(String i:this.getDominantEleventhChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"11";
    }
    public String verify_m11(String[] dummyScale){
        boolean value;
        for(String i:this.getMinorEleventhChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"m11";
    }
    public String verify_M11(String[] dummyScale){
        boolean value;
        for(String i:this.getMajorEleventhChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"M11";
    }
    public String verify_13(String[] dummyScale){
        boolean value;
        for(String i:this.getDominantThirteenthChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"13";
    }
    public String verify_m13(String[] dummyScale){
        boolean value;
        for(String i:this.getMinorThirteenthChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"m13";
    }
    public String verify_M13(String[] dummyScale){
        boolean value;
        for(String i:this.getMajorThirteenthChord()){
            value = isIn(i,dummyScale);
            if(value == false){
                return "";
            }
        }
        return this.getKey()+"M13";
    }
    
    //GETTERS
    public String[] getMinorChord(){
        return this.minorChord;
    }
    public String[] getMajorChord(){
        return this.majorChord;
    }
    public String[] getMinorSixthChord(){
        return this.minorSixthChord;
    }
    public String[] getMajorSixthChord(){
        return this.majorSixthChord;
    }
    public String[] getDominantSeventhChord(){
        return this.dominantSeventhChord;
    }
    public String[] getMinorSeventhChord(){
        return this.minorSeventhChord;
    }
    public String[] getMajorSeventhChord(){
        return this.majorSeventhChord;
    }
    public String[] getAddNinthChord(){
        return this.addNinthChord;
    }
    public String[] getDominantNinthChord(){
        return this.dominantNinthChord;
    }
    public String[] getMinorNinthChord(){
        return this.minorNinthChord;
    }
    public String[] getMajorNinthChord(){
        return this.majorNinthChord;
    }
    public String[] getDominantEleventhChord(){
        return this.dominantEleventhChord;
    }
    public String[] getMinorEleventhChord(){
        return this.minorEleventhChord;
    }
    public String[] getMajorEleventhChord(){
        return this.majorEleventhChord;
    }
    public String[] getDominantThirteenthChord(){
        return this.dominantThirteenthChord;
    }
    public String[] getMinorThirteenthChord(){
        return this.minorThirteenthChord;
    }
    public String[] getMajorThirteenthChord(){
        return this.majorThirteenthChord;
    }
    
    public ArrayList getItemsOfTable(){
        return this.itemsOfTable;
    }
    
}
