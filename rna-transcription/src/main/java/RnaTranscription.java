import java.util.HashMap;

class RnaTranscription {

    private HashMap<Character,Character> dnaMap = new HashMap<>();


    public RnaTranscription() {
        dnaMap.put('G','C');
        dnaMap.put('C','G');
        dnaMap.put('T','A');
        dnaMap.put('A','U');
    }

    String transcribe(String dnaStrand) {
        if(dnaStrand.isEmpty()) return "";

        String rna = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            rna+=dnaMap.get(dnaStrand.charAt(i));
        }
        return rna;
    }

}
