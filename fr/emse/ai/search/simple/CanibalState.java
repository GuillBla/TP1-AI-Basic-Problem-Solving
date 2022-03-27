package fr.emse.ai.search.simple;

public class CanibalState {

    public final static String AG = "BG G : 3C 3M  D : 0C 0M ";

    public final static String BG = "BG G : 2C 3M  D : 1C 0M";
    public final static String BD = "BD G : 2C 3M  D : 1C 0M";

    public final static String CG = "BG G : 2C 2M  D : 1C 1M";
    public final static String CD = "BD G : 2C 2M  D : 1C 1M";

    public final static String DG = "BG G : 1C 3M  D : 2C 0M";
    public final static String DD = "BD G : 1C 3M  D : 2C 0M";

    public final static String EG = "BG G : 1C 1M  D : 2C 2M";
    public final static String ED = "BD G : 1C 1M  D : 2C 2M";

    public final static String GD = "BD G : 0C 3M  D : 3C 0M ";

    public final static String HG = "BG G : 3C 0M  D : 0C 3M ";

    public final static String IG = "BG G : 1C 0M  D : 2C 3M ";
    public final static String ID = "BD G : 1C 0M  D : 2C 3M ";

    public final static String JG = "BG G : 2C 0M  D : 1C 3M ";
    public final static String JD = "BD G : 2C 0M  D : 1C 3M ";




    public final static String F = " Victoire!!! BD G : 0C 0M  D : 3C 3M";

    public String value;

    public CanibalState(String value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (o instanceof CanibalState) {
            return ((CanibalState) o).value.equals(this.value);
        }
        return false;
    }

    public String toString() {
        return value;
    }

}
