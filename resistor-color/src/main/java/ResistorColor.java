class ResistorColor {

    private String[] COLOUR_CODES = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

        int colorCode(String color) {
            for (int i = 0; i < COLOUR_CODES.length; i++) {
                if(color.equalsIgnoreCase(COLOUR_CODES[i])) return i;
            }
            return -1;
        }

        String[] colors() {
            return COLOUR_CODES;
        }
}
