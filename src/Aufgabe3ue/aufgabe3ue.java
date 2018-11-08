package Aufgabe3ue;

public class aufgabe3ue {

    public static void main(String[] args) {

        String name = "Bene";
        System.out.println(name);
        int alter = 24;
        System.out.println(alter);
        final String FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol"; // Verkürzter Name Fachhochscule Kufstein Tirol
        // final Konstante
        final String ort = "Putzbrunn";

        String Satz  = "JavaverwendetfürStrings\"doppelteAnführungszeichen\"undeinzelneAnführungszeichen\n wie 'c' um einzelne Zeichen zu definieren.";
        System.out.println(Satz);

        String Satz2 = "Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\";
        System.out.println(Satz2);

        String Satz3 = "Ich verwende den\b Backspace, die Newline\n und den \tTabulator";
        System.out.println(Satz3);

        String Satz4 = "Durch den Wagenruecklauf wird die Zeile zurueckgesetzt und der Teil nach dem \r ueberschreibt\n diebestehendeZeile. \f istinderKonsolenichtbemerkbar,daeseinenSeitenumbruch erzwingt.";
        System.out.println(Satz4);

    }


}
