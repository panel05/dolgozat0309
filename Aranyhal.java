package dolgozatelso;

import java.util.ArrayList;
import java.util.Map;

public class Aranyhal {

    private static int KIVANSAGOKSZAMA = 3;
    private int kor;
    private Map<String, ArrayList<Integer>> kivansagok;
    private String kifogta;
    
    
    public Aranyhal(String kifogta){
        this.kifogta = kifogta;
    }
    
    public Aranyhal(String Kifogta, int kor){
        this.kifogta = kifogta;
        this.kor = kor;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    
    
    public int kivansagokSzama(String kifogta){
        return 0;
    }
    
    
    public String[] kikkelTalalkozott(){
        
        return null;
        
    }
    
    public boolean kivansagotTeljesit(String kivansag){
        
        return false;
        
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }
    
    
    
}



