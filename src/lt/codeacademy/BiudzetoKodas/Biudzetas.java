package lt.codeacademy.BiudzetoKodas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {
    private ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
    private ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();
    double PBalansas;
    double IBalansas;
    double Balansas;

    public void pridetiPajamuIrasa(double PajamuSuma, String P_Kategorija, boolean P_ArGautiPinigai, String P_DarboPobūdis) {
        this.pajamos.add(new PajamuIrasas(PajamuSuma, P_Kategorija, P_ArGautiPinigai, P_DarboPobūdis));
    }

    public void gautiPajamuIrasa() {
        for (int i = 0; i < pajamos.size(); i++) {
            System.out.println("_________________");
            System.out.println("|Asmuo " + i + "|");
            System.out.println("-----------------");
            System.out.println("Asmesn ID/NR : " + pajamos.get(i).getPCount() + " kategorija, kuriai priklauso pinigai: " + pajamos.get(i).getKategorija() + " Pajamų suma: " + pajamos.get(i).getPajamuSuma() + " Ar pinigai pasieke banką : " + pajamos.get(i).isArGautiPinigai() + " Data: " + pajamos.get(i).getData());
        }
    }

    public void pridetiIslaiduIrasa(double IslaiduSuma, String I_Kategorija, boolean I_ArGautiPinigai, String I_DarboPobūdis) {
        this.islaidos.add(new IslaiduIrasas(IslaiduSuma, I_Kategorija, I_ArGautiPinigai, I_DarboPobūdis));
    }

    public void gautiIslaiduIrasa() {
        for (int i = 0; i < islaidos.size(); i++) {
            System.out.println("_________________");
            System.out.println("|Asmuo " + i + "|");
            System.out.println("-----------------");
            System.out.println("Asmesn ID/NR : " + islaidos.get(i).getICount() + " kategorija, kuriai priklauso pinigai: " + islaidos.get(i).getKategorija() + " Pajamų suma: " + islaidos.get(i).getIslaiduSuma() + " Ar pinigai pasieke banką : " + islaidos.get(i).isArGautiPinigai() + " Data: " + islaidos.get(i).getData());
        }
    }

    void balansas() {
        for (int i = 0; i < pajamos.size(); i++) {
            PBalansas += pajamos.get(i).getPajamuSuma();
        }
        for (int j = 0; j < islaidos.size(); j++) {
            IBalansas += islaidos.get(j).getIslaiduSuma();
        }
        System.out.println("Balansas pajamu " + (PBalansas - IBalansas));
    }

    void PasalintiIrasa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasirinkote istrinti irasa: ");
        System.out.println("kuri irasa norite istrinti: ");
        System.out.println("Islaidu ar Pajamu, jei pajamu 1 , jei islaidu 2");
        int ivestasis = sc.nextInt();
        while (ivestasis == 1 | ivestasis == 2) {
            if (ivestasis == 1) {
                System.out.println("Kuri irasa norite istrinti:");
                gautiPajamuIrasa();
                int istrinti = sc.nextInt();
                if(istrinti >= pajamos.size()){
                    break;
                }
                pajamos.remove(istrinti);
            } else if (ivestasis == 2) {
                System.out.println("Kuri irasa norite istrinti:");
                gautiIslaiduIrasa();
                int istrinti = sc.nextInt();
                if(istrinti >= islaidos.size()) {
                    break;
                }
                islaidos.remove(istrinti);
            } else {
                System.out.println("klaidingai ivestas sk");


            }
        }
    }

}
