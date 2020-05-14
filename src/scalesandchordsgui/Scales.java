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
public class Scales extends Chromatic{
    //Mayor
    private final int[] majorScaleOrder = {0,2,4,5,7,9,11};
    private String[] majorScale = new String[majorScaleOrder.length];
    //Menor
    private final int[] minorScaleOrder = {0,2,3,5,7,8,10};
    private String[] minorScale = new String[minorScaleOrder.length];
    //Pentatonicas
    private final int[] majorPentatonicScaleOrder = {0,2,4,7,9};
    private String[] majorPentatonicScale = new String[majorPentatonicScaleOrder.length];
    
    private final int[] minorPentatonicScaleOrder = {0,3,5,7,10};
    private String[] minorPentatonicScale = new String[minorPentatonicScaleOrder.length];
    
    //MODOS
    //Ionian
    private final int[] ionianOrder = {0,2,4,5,7,9,11};
    private String[] ionianScale = new String[ionianOrder.length];
    //Dorian
    private final int[] dorianOrder = {0,2,3,5,7,9,10};
    private String[] dorianScale = new String[dorianOrder.length];
    //phrygian
    private final int[] phrygianOrder = {0,1,3,5,7,8,10};
    private String[] phrygianScale = new String[phrygianOrder.length];
    //Lydian
    private final int[] lydianOrder = {0,2,4,6,7,9,11};
    private String[] lydianScale = new String[lydianOrder.length];
    //MixoLydian
    private final int[] mixolydianOrder = {0,2,4,5,7,9,10};
    private String[] mixolydianScale = new String[mixolydianOrder.length];
    //Aeolian
    private final int[] aeolianOrder = {0,2,3,5,7,8,10};
    private String[] aeolianScale = new String[aeolianOrder.length];
    //Locrian
    private final int[] locrianOrder = {0,1,3,5,6,8,10};
    private String[] locrianScale = new String[locrianOrder.length];
    
    
    
    public Scales(String nota){
        super(nota);
        
        //Major Scale
        for(int i=0; i < this.majorScaleOrder.length; i++){
            this.majorScale[i] = getChromaticScaleArray()[this.majorScaleOrder[i]];
        }
        //Minor Scale
        for(int i=0; i < this.minorScaleOrder.length; i++){
            this.minorScale[i] = getChromaticScaleArray()[this.minorScaleOrder[i]];
        }
        //Major Pentatonic Scale
        for(int i=0; i < this.majorPentatonicScaleOrder.length; i++){
            this.majorPentatonicScale[i] = getChromaticScaleArray()[this.majorPentatonicScaleOrder[i]];
        }
        //Minor Pentatonic Scale
        for(int i=0; i < this.minorPentatonicScaleOrder.length; i++){
            this.minorPentatonicScale[i] = getChromaticScaleArray()[this.minorPentatonicScaleOrder[i]];
        }
        //Ionian
        for(int i=0; i < this.ionianOrder.length; i++){
            this.ionianScale[i] = getChromaticScaleArray()[this.ionianOrder[i]];
        }
        //Dorian
        for(int i=0; i < this.dorianOrder.length; i++){
            this.dorianScale[i] = getChromaticScaleArray()[this.dorianOrder[i]];
        }
        //Phrygian
        for(int i=0; i < this.phrygianOrder.length; i++){
            this.phrygianScale[i] = getChromaticScaleArray()[this.phrygianOrder[i]];
        }
        //Lydian
        for(int i=0; i < this.lydianOrder.length; i++){
            this.lydianScale[i] = getChromaticScaleArray()[this.lydianOrder[i]];
        }
        //Mixolydian
        for(int i=0; i < this.mixolydianOrder.length; i++){
            this.mixolydianScale[i] = getChromaticScaleArray()[this.mixolydianOrder[i]];
        }
        //Aeolian
        for(int i=0; i < this.aeolianOrder.length; i++){
            this.aeolianScale[i] = getChromaticScaleArray()[this.aeolianOrder[i]];
        }
        //Locrian
        for(int i=0; i < this.locrianOrder.length; i++){
            this.locrianScale[i] = getChromaticScaleArray()[this.locrianOrder[i]];
        }
    }
    public void setKey(String nota){
        super.setChromaticScale(nota);
        //Major Scale
        for(int i=0; i < this.majorScaleOrder.length; i++){
            this.majorScale[i] = getChromaticScaleArray()[this.majorScaleOrder[i]];
        }
        //Minor Scale
        for(int i=0; i < this.minorScaleOrder.length; i++){
            this.minorScale[i] = getChromaticScaleArray()[this.minorScaleOrder[i]];
        }
        //Major Pentatonic Scale
        for(int i=0; i < this.majorPentatonicScaleOrder.length; i++){
            this.majorPentatonicScale[i] = getChromaticScaleArray()[this.majorPentatonicScaleOrder[i]];
        }
        //Minor Pentatonic Scale
        for(int i=0; i < this.minorPentatonicScaleOrder.length; i++){
            this.minorPentatonicScale[i] = getChromaticScaleArray()[this.minorPentatonicScaleOrder[i]];
        }
        //Ionian
        for(int i=0; i < this.ionianOrder.length; i++){
            this.ionianScale[i] = getChromaticScaleArray()[this.ionianOrder[i]];
        }
        //Dorian
        for(int i=0; i < this.dorianOrder.length; i++){
            this.dorianScale[i] = getChromaticScaleArray()[this.dorianOrder[i]];
        }
        //Phrygian
        for(int i=0; i < this.phrygianOrder.length; i++){
            this.phrygianScale[i] = getChromaticScaleArray()[this.phrygianOrder[i]];
        }
        //Lydian
        for(int i=0; i < this.lydianOrder.length; i++){
            this.lydianScale[i] = getChromaticScaleArray()[this.lydianOrder[i]];
        }
        //Mixolydian
        for(int i=0; i < this.mixolydianOrder.length; i++){
            this.mixolydianScale[i] = getChromaticScaleArray()[this.mixolydianOrder[i]];
        }
        //Aeolian
        for(int i=0; i < this.aeolianOrder.length; i++){
            this.aeolianScale[i] = getChromaticScaleArray()[this.aeolianOrder[i]];
        }
        //Locrian
        for(int i=0; i < this.locrianOrder.length; i++){
            this.locrianScale[i] = getChromaticScaleArray()[this.locrianOrder[i]];
        }
    }
    
     
    public String[] getMajorScaleArray(){
        return this.majorScale;        
    }
    public String[] getMinorScaleArray(){
        return this.minorScale;        
    }
    public String[] getMajorPentatonicScaleArray(){
        return this.majorPentatonicScale;        
    }
    public String[] getMinorPentatonicScaleArray(){
        return this.minorPentatonicScale;        
    }
    public String[] getIonianScaleArray(){
        return this.ionianScale;        
    }
    public String[] getDorianScaleArray(){
        return this.dorianScale;        
    }
    public String[] getPhrygianScaleArray(){
        return this.phrygianScale;        
    }
    public String[] getLydianScaleArray(){
        return this.lydianScale;        
    }
    public String[] getMixolydianScaleArray(){
        return this.mixolydianScale;        
    }
    public String[] getAeolianScaleArray(){
        return this.aeolianScale;        
    }
    public String[] getLocrianScaleArray(){
        return this.locrianScale;        
    }
   //Metodos toString
    public String getMajorScaleString(){
        return String.format("%s, %s, %s, %s, %s, %s, %s%n",
                this.getMajorScaleArray()[0],
                this.getMajorScaleArray()[1],
                this.getMajorScaleArray()[2],
                this.getMajorScaleArray()[3],
                this.getMajorScaleArray()[4],
                this.getMajorScaleArray()[5],
                this.getMajorScaleArray()[6]);
    }
    public String getMinorScaleString(){
        return String.format("%s, %s, %s, %s, %s, %s, %s%n",
                this.getMinorScaleArray()[0],
                this.getMinorScaleArray()[1],
                this.getMinorScaleArray()[2],
                this.getMinorScaleArray()[3],
                this.getMinorScaleArray()[4],
                this.getMinorScaleArray()[5],
                this.getMinorScaleArray()[6]); 
    }
    public String getMajorPentatonicScaleString(){
        return String.format("%s, %s, %s, %s, %s%n",
                this.getMajorPentatonicScaleArray()[0],
                this.getMajorPentatonicScaleArray()[1],
                this.getMajorPentatonicScaleArray()[2],
                this.getMajorPentatonicScaleArray()[3],
                this.getMajorPentatonicScaleArray()[4]);
    }
    public String getMinorPentatonicScaleString(){
        return String.format("%s, %s, %s, %s, %s%n",
                this.getMinorPentatonicScaleArray()[0],
                this.getMinorPentatonicScaleArray()[1],
                this.getMinorPentatonicScaleArray()[2],
                this.getMinorPentatonicScaleArray()[3],
                this.getMinorPentatonicScaleArray()[4]);
    }
    public String getIonianScaleString(){
        return String.format("%s, %s, %s, %s, %s, %s, %s%n",
                this.getIonianScaleArray()[0],
                this.getIonianScaleArray()[1],
                this.getIonianScaleArray()[2],
                this.getIonianScaleArray()[3],
                this.getIonianScaleArray()[4],
                this.getIonianScaleArray()[5],
                this.getIonianScaleArray()[6]);
    }
    public String getDorianScaleString(){
        return String.format("%s, %s, %s, %s, %s, %s, %s%n",
                this.getDorianScaleArray()[0],
                this.getDorianScaleArray()[1],
                this.getDorianScaleArray()[2],
                this.getDorianScaleArray()[3],
                this.getDorianScaleArray()[4],
                this.getDorianScaleArray()[5],
                this.getDorianScaleArray()[6]);     
    }
    public String getPhrygianScaleString(){
        return String.format("%s, %s, %s, %s, %s, %s, %s%n",
                this.getPhrygianScaleArray()[0],
                this.getPhrygianScaleArray()[1],
                this.getPhrygianScaleArray()[2],
                this.getPhrygianScaleArray()[3],
                this.getPhrygianScaleArray()[4],
                this.getPhrygianScaleArray()[5],
                this.getPhrygianScaleArray()[6]);  
    }
    public String getLydianScaleString(){
        return String.format("%s, %s, %s, %s, %s, %s, %s%n",
                this.getLydianScaleArray()[0],
                this.getLydianScaleArray()[1],
                this.getLydianScaleArray()[2],
                this.getLydianScaleArray()[3],
                this.getLydianScaleArray()[4],
                this.getLydianScaleArray()[5],
                this.getLydianScaleArray()[6]);  
    }
    public String getMixolydianScaleString(){
        return String.format("%s, %s, %s, %s, %s, %s, %s%n",
                this.getMixolydianScaleArray()[0],
                this.getMixolydianScaleArray()[1],
                this.getMixolydianScaleArray()[2],
                this.getMixolydianScaleArray()[3],
                this.getMixolydianScaleArray()[4],
                this.getMixolydianScaleArray()[5],
                this.getMixolydianScaleArray()[6]);    
    }
    public String getAeolianScaleString(){
        return String.format("%s, %s, %s, %s, %s, %s, %s%n",
                this.getAeolianScaleArray()[0],
                this.getAeolianScaleArray()[1],
                this.getAeolianScaleArray()[2],
                this.getAeolianScaleArray()[3],
                this.getAeolianScaleArray()[4],
                this.getAeolianScaleArray()[5],
                this.getAeolianScaleArray()[6]);      
    }
    public String getLocrianScaleString(){
        return String.format("%s, %s, %s, %s, %s, %s, %s%n",
                this.getLocrianScaleArray()[0],
                this.getLocrianScaleArray()[1],
                this.getLocrianScaleArray()[2],
                this.getLocrianScaleArray()[3],
                this.getLocrianScaleArray()[4],
                this.getLocrianScaleArray()[5],
                this.getLocrianScaleArray()[6]);        
    }
    
}
