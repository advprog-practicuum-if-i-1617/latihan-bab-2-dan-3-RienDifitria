package Latian23;

public class convert {

    private String[] huruf;

    public convert() {
        this.huruf = new String[]{"", "satu", "dua", "tiga", "empat", "lima", 
            "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas",
            "belas", "puluh", "seratus", "ratus", "seribu"};
    }

    void ubah(int angka) {
        System.out.println("(" + angka + ")" + " => " + angkaToKata(angka));
    }

    public String angkaToKata(int angka) {
        if (angka < 12) {
            return huruf[angka];
        }
        if (angka >= 12 && angka <= 19) {
            return huruf[angka % 10] +" "+ huruf[12];
        }
        if (angka >= 20 && angka <= 99) {
            return angkaToKata(angka / 10) +" "+ huruf[13] +" "+ huruf[angka % 10];
        }
        if (angka >= 100 && angka <= 199) {
            return huruf[14] +" "+ angkaToKata(angka % 100);
        }
        if (angka >= 200 && angka <= 999) {
            return angkaToKata(angka / 100) +" "+ huruf[15] +" "+ angkaToKata(angka % 100);
        }
        if (angka == 1000) {
            return huruf[16];
        }
        if (angka > 1000) {
            return "Melebihi batas! Max: 1000";
        }
        return "";
    }

    public int kataToAngka(String kata) {
        int spasi = 0, indexA = 0;
        int angka1 = 0, angka2 = 0, angka3=0;
        String kata1 = " ", kata2 = " ", kata3 = " ";
        
        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i) == ' ') {
                spasi++;
            }
        }
        
        if (spasi == 0) {
            kata1 = "";
            kata2 = kata;
        }
        if (spasi == 1) {
            for (int i = 0; i < kata.length(); i++) {
                if (kata.charAt(i) == ' ') {
                    indexA = i;
                    break;
                }
            }
            kata1 = kata.substring(0, indexA);
            kata2 = kata.substring(indexA + 1);
        }
        if (spasi == 2) {
            for (int i = 0; i < kata.length(); i++) {
                if (kata.charAt(i) == ' ') {
                    indexA = i;
                    break;
                }
            }
            kata1 = kata.substring(0, indexA);
            kata2 = kata.substring(indexA + 7);
        }
        if (spasi == 3) {
            for (int i = 0; i < kata.length(); i++) {
                if (kata.charAt(i) == ' ') {
                    indexA = i;
                    break;
                }
            }
            kata1 = kata.substring(0, indexA);
            kata2 = kata.substring(indexA + 7);
        }
        
        if (kata1.equalsIgnoreCase(huruf[2])) {
            angka1 = 20;
        } else if (kata1.equalsIgnoreCase(huruf[3])) {
            angka1 = 30;
        } else if (kata1.equalsIgnoreCase(huruf[4])) {
            angka1 = 40;
        } else if (kata1.equalsIgnoreCase(huruf[5])) {
            angka1 = 50;
        } else if (kata1.equalsIgnoreCase(huruf[6])) {
            angka1 = 60;
        } else if (kata1.equalsIgnoreCase(huruf[7])) {
            angka1 = 70;
        } else if (kata1.equalsIgnoreCase(huruf[8])) {
            angka1 = 80;
        } else if (kata1.equalsIgnoreCase(huruf[9])) {
            angka1 = 90;
        }
        if (kata2.equalsIgnoreCase(huruf[1])) {
            angka2 = 1;
        } else if (kata2.equalsIgnoreCase(huruf[2])) {
            angka2 = 2;
        } else if (kata2.equalsIgnoreCase(huruf[3])) {
            angka2 = 3;
        } else if (kata2.equalsIgnoreCase(huruf[4])) {
            angka2 = 4;
        } else if (kata2.equalsIgnoreCase(huruf[5])) {
            angka2 = 5;
        } else if (kata2.equalsIgnoreCase(huruf[6])) {
            angka2 = 6;
        } else if (kata2.equalsIgnoreCase(huruf[7])) {
            angka2 = 7;
        } else if (kata2.equalsIgnoreCase(huruf[8])) {
            angka2 = 8;
        } else if (kata2.equalsIgnoreCase(huruf[9])) {
            angka2 = 9;
        } else if (kata2.equalsIgnoreCase(huruf[12])) {
            angka1 = (angka1 / 10) + 10;
        } else if (kata2.equalsIgnoreCase(huruf[10])) {
            angka1 = 10;
        } else if (kata2.equalsIgnoreCase(huruf[11])) {
            angka1 = 11;
        } else if (kata2.equalsIgnoreCase(huruf[0])) {
            angka1 = 0;
        } else if (kata2.equalsIgnoreCase(huruf[14])) {
            angka1 = 100;
        } 
        
        for (int i = 1; i < kata.length(); i++) {
            if (kata1.equalsIgnoreCase(huruf[14])&&kata2.equalsIgnoreCase(huruf[i])) {
            angka1 = 100; angka2=i;
            } 
        }
       
        return angka1 + angka2;
    }
}
