package lt.codeacademy.BiudzetoKodas;

import java.time.LocalDate;

public class IslaiduIrasas {
    private static int IslaiduCount;
    private int ICount;
    private double IslaiduSuma;
    private String I_Kategorija;
    private boolean I_ArGautiPinigai;
    private String I_DarboPobūdis;
    private LocalDate data = LocalDate.now();

    IslaiduIrasas(double IslaiduSuma, String I_Kategorija, boolean I_ArGautiPinigai, String I_DarboPobūdis) {
        this.IslaiduSuma = IslaiduSuma;
        this.I_Kategorija = I_Kategorija;
        this.I_ArGautiPinigai = I_ArGautiPinigai;
        this.I_DarboPobūdis = I_DarboPobūdis;
        this.data = LocalDate.now();
        this.ICount = IslaiduCount++;
    }

    public static int getIslaiduCount() {
        return IslaiduCount;
    }

    public int getICount() {
        return ICount;
    }

    public double getIslaiduSuma() {
        return IslaiduSuma;
    }

    public String getKategorija() {
        return I_Kategorija;
    }

    public boolean isArGautiPinigai() {
        return I_ArGautiPinigai;
    }

    public String getDarboPobūdis() {
        return I_DarboPobūdis;
    }

    public LocalDate getData() {
        return data;
    }
}
