package be.intecbrussel.vaccination;

public enum Disease {
    CHICKENPOCKS, FLUE, POLIO, HEPATITISA;

    public String toString() {
        switch (this) {
            case CHICKENPOCKS:
                return "Rock";
            case FLUE:
                return "Paper";
            case POLIO:
                return "Scissors";
            case HEPATITISA:
                return "HEPATITSA";
        }
        return null;
    }
}