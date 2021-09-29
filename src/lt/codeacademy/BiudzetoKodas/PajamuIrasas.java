package lt.codeacademy.BiudzetoKodas;

import java.time.LocalDate;
import java.util.Scanner;

public class PajamuIrasas {
    private static int PajamuCount;
    private int PCount;
    private double PajamuSuma;
    private String P_Kategorija;
    private boolean P_ArGautiPinigai;
    private String P_DarboPobūdis;

    public LocalDate getData() {
        return data;
    }

    private LocalDate data = LocalDate.now();

    public static int getPajamuCount() {
        return PajamuCount;
    }

    public int getPCount() {
        return PCount;
    }

    public double getPajamuSuma() {
        return PajamuSuma;
    }

    public String getKategorija() {
        return P_Kategorija;
    }

    public boolean isArGautiPinigai() {
        return P_ArGautiPinigai;
    }

    public String getDarboPobūdis() {
        return P_DarboPobūdis;
    }

    PajamuIrasas(double PajamuSuma, String Kategorija, boolean ArGautiPinigai, String DarboPobūdis) {
        this.PajamuSuma = PajamuSuma;
        this.P_Kategorija = Kategorija;
        this.P_ArGautiPinigai = ArGautiPinigai;
        this.P_DarboPobūdis = DarboPobūdis;
        this.PCount = PajamuCount++;
        this.data = LocalDate.now();

    }
}