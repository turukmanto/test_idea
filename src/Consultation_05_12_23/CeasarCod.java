package Consultation_05_12_23;

public class CeasarCod {

    int n;

    public CeasarCod(int n){

        this.n = n;
    }
    public String codeString(String toCode){
        String coded = "";
        int lastCharValue = 'z';
        int alphabetlength = 'z' -'a' + 1;

        for(char character :toCode.toCharArray()){
            int charNoRolation = character + n;
            int charVal = charNoRolation <= lastCharValue?charNoRolation :charNoRolation - alphabetlength;
            coded += (char) charVal;
        }
        return coded;
    }

}
