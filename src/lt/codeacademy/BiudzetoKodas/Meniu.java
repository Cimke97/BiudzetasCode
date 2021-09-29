package lt.codeacademy.BiudzetoKodas;

import java.util.Scanner;

public class Meniu  extends Biudzetas {
    public void Meniu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sveiki atvyke į meniu: ");
        System.out.println("Ivestas 1 - Prideti pajamas ");
        System.out.println("Ivestas 2 - Gauti pajamu israsa ");
        System.out.println("Ivestas 3 - Prideti Islaidas ");
        System.out.println("Ivestas 4 - Gauti islaidu israsa ");
        System.out.println("Ivestas 5 Balansas ");
        System.out.println("Ivestas 6 Pasalinti irasa");
        System.out.println("Ivestas 7 Uždaryti");
        System.out.println("Pasirinkimas : ");

        int pasirinkimas = sc.nextInt();
        switch (pasirinkimas) {
            case 1:
                double PajamuSuma;
                System.out.println("Iveskite suma: ");
                PajamuSuma = sc.nextDouble();
                String Kategorija;
                System.out.println("Iveskite kategorija, uz ką gavote pinigus): pvz zeme, nekilnojamasis turtas,t.t: ");
                Kategorija = sc.next();
                boolean ArGautiPinigai = true;
                System.out.println("Iveskite ar gavote pinigus: True, False");
                char Ivedimas = sc.next().charAt(0);
                if (Ivedimas == 't' | Ivedimas == 'T') {
                    ArGautiPinigai = true;
                } else if (Ivedimas == 'n' | Ivedimas == 'N') {
                    ArGautiPinigai = false;
                } else {
                    System.out.println("Klaidingai suvesti duomenys, prašau pakartoti operacija gavote pinigus: True/False");
                    Ivedimas = sc.next().charAt(0);
                }
                String DarboPobūdis;
                System.out.println("Iveskite koki darba atlikote");
                DarboPobūdis = sc.next();
                pridetiPajamuIrasa(PajamuSuma,Kategorija,ArGautiPinigai,DarboPobūdis);
                Meniu();
                break;
            case 2:
                gautiPajamuIrasa();
                Meniu();
                break;
            case 3:
                double IslaiduSuma;
                System.out.println("Iveskite suma: ");
                IslaiduSuma = sc.nextDouble();
                String I_Kategorija;
                System.out.println("Iveskite kategorija, uz ką gavote pinigus): pvz zeme, nekilnojamasis turtas,t.t: ");
                I_Kategorija = sc.next();
                boolean I_ArGautiPinigai = true;
                System.out.println("Iveskite ar gavote pinigus: Taip/ Ne arba taip/ne ");
                char I_Ivedimas = sc.next().charAt(0);
                if (I_Ivedimas == 't' | I_Ivedimas == 'T') {
                    I_ArGautiPinigai = true;
                } else if (I_Ivedimas == 'n' | I_Ivedimas == 'N') {
                    I_ArGautiPinigai = false;
                } else {
                    System.out.println("Klaidingai suvesti duomenys, prašau pakartoti operacija gavote pinigus: True/False");
                    I_Ivedimas = sc.next().charAt(0);
                }
                String I_DarboPobūdis;
                System.out.println("Iveskite koki darba atlikote");
                I_DarboPobūdis = sc.next();
                pridetiIslaiduIrasa(IslaiduSuma,I_Kategorija,I_ArGautiPinigai,I_DarboPobūdis);
                Meniu();
                break;
            case 4:
                gautiIslaiduIrasa();
                Meniu();
                break;
            case 5 :
                balansas();
                Meniu();
                break;
            case 6:
                PasalintiIrasa();
                Meniu();
                break;
            case 7:
                System.out.println("Ačiū , kad naudojotės programa biudžetas");
                break;
            default:
                System.out.println("Blogai ivestas skaicius 1/7");
                break;




        }
    }

}
