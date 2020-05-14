/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scalesandchordsgui;

/**
 *
 * @author Luis Carlos A. Rojas Torres <luiscarlos.bsf@oceanica.ufrj.br>
 */
public class Chromatic {
    private final int chromaticScaleSize = 12;
    private String key;
    private String ninth; //Azul oscuro
    private String minorThird; //Amarillo claro 
    private String majorThird; //Amarillo oscuro
    private String diminishedFifth; //Rojo claro
    private String perfectFifth; //Rojo oscuro
    private String minorSeventh; //Verde Claro
    private String majorSeventh; //Verde Oscuro
    private String eleventh;   //Rosa Fuerte
    private String majorSixth; //Rosa Claro
    private String thirteenth; //Rosa Claro
        
    private final String[] notes = {"C","Db","D","Eb","E","F","Gb","G","Ab","A","Bb","B",
                                    "C","Db","D","Eb","E","F","Gb","G","Ab","A","Bb","B"};
    private String[] chromaticScale = new String[chromaticScaleSize];
    
    public Chromatic(String note){
        int index = 0;
        for(int i=0;i<this.chromaticScaleSize;i++){
            if (this.notes[i] == note){
                index = i;
                break;
            }
        }
        System.arraycopy(notes, index, this.chromaticScale, 0, this.chromaticScaleSize);
        this.key = this.chromaticScale[0];
        this.ninth = this.chromaticScale[2];
        this.minorThird = this.chromaticScale[3];
        this.majorThird = this.chromaticScale[4];
        this.eleventh = this.chromaticScale[5];
        this.diminishedFifth  = this.chromaticScale[6];
        this.perfectFifth  = this.chromaticScale[7];
        this.majorSixth = this.chromaticScale[9];
        this.thirteenth  = this.chromaticScale[9];
        this.minorSeventh = this.chromaticScale[10];
        this.majorSeventh = this.chromaticScale[11];
    }
    public void setChromaticScale(String note){
        int index = 0;
        for(int i=0;i<this.chromaticScaleSize;i++){
            if (this.notes[i] == note){
                index = i;
                break;
            }
        }
        System.arraycopy(notes, index, this.chromaticScale, 0, this.chromaticScaleSize);
        this.key = this.chromaticScale[0];
        this.ninth = this.chromaticScale[2];
        this.minorThird = this.chromaticScale[3];
        this.majorThird = this.chromaticScale[4];
        this.eleventh = this.chromaticScale[5];
        this.diminishedFifth  = this.chromaticScale[6];
        this.perfectFifth  = this.chromaticScale[7];
        this.majorSixth = this.chromaticScale[9];
        this.thirteenth  = this.chromaticScale[9];
        this.minorSeventh = this.chromaticScale[10];
        this.majorSeventh = this.chromaticScale[11];
    }
    
    public final String[] getChromaticScaleArray(){
        return this.chromaticScale;        
    }
    public final String getChromaticScaleElem(int i){
        return this.chromaticScale[i];        
    }
    public final String getKey(){
        return this.key;
    }
    public final String getNinth(){
        return this.ninth;
    }
    public final String getMinorThird(){
        return this.minorThird;
    }
    public final String getMajorThird(){
        return this.majorThird;
    }
    public final String getEleventh(){
        return this.eleventh;
    }
    public final String getDiminishedFifth(){
        return this.diminishedFifth;
    }
    public final String getPerfectFifth(){
        return this.perfectFifth;
    }
    public final String getMajorSixth(){
        return this.majorSixth;
    }
    public final String getThirteenth(){
        return this.thirteenth;
    }
    public final String getMinorSeventh(){
        return this.minorSeventh;
    }
    public final String getMajorSeventh(){
        return this.majorSeventh;
    }
    
    @Override
    public String toString(){
        return String.format("%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s %n",
                //+ "Key: %s%n"+"Minor3: %s%n"+"Major3: %s%n"
                //+"Perfect5: %s%n"+"Minor7: %s%n"+"Major7: %s%n",
                this.getChromaticScaleElem(0),
                this.getChromaticScaleElem(1),
                this.getChromaticScaleElem(2),
                this.getChromaticScaleElem(3),
                this.getChromaticScaleElem(4),
                this.getChromaticScaleElem(5),
                this.getChromaticScaleElem(6),
                this.getChromaticScaleElem(7),
                this.getChromaticScaleElem(8),
                this.getChromaticScaleElem(9),
                this.getChromaticScaleElem(10),
                this.getChromaticScaleElem(11));
                //this.getKey(),this.getMinorThird(),this.getMajorThird(),
                //this.getPerfectFifth(),this.getMinorSeventh(),this.getMajorSeventh());
    }
    
}
