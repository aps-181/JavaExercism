public class Twofer {
    public String twofer(String name) {
        name = name == null? "you" : name;
        String returnMessage = "One for "+name+", one for me.";
        return returnMessage;
    }
}
