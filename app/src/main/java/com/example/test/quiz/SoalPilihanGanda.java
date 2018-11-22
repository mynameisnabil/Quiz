package com.example.test.quiz;

public class SoalPilihanGanda {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Siapa Pembuat android",
            "hp apa yang pertama kali menggunakan android",
            "tahun berapa android pertama dijual",
            "Apa Itu Android one?",
            "Hp Apa yang menggunakan Android one",
            "Brand Smarphone android Apa Yang Paling Laris Di Dunia",
            "Hanphone Dengan Kameran Terbaik Adalah",
            "Apa Nama Android Terbaru Saat Ini",
            "Kpan Tanggal Rilis Android Versi Pie",
            "Apa Nama Smartphone Gaming Dari Xiaomi?",
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Andy rubin","steve job","bill gate"},
            {"htc dream","nexus 6p","google pixel"},
            {"2005","1999","2008"},
            {"sitem oprasi android yang polos atau tanpa modifikasi dari developer","ui buatan samsung","costum os xiaomi"},
            {"Xiaomi MIA1","Galaxy Note 8","Oppo F7"},
            {"Samsung","Huawei","Xiaomi"},
            {"Huawei P20 Pro","Galaxy Note 8","Oppo F9"},
            {"Android Jelly bean","Android Oreo","Android Pie"},
            {"6 Agustus 2018","4 Maret 2018","3 Januari 2018"},
            {"ROG Phone","Nubia Red Magic","Xiaomi black shark"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "Andy rubin",
            "htc dream",
            "2008",
            "sitem oprasi android yang polos atau tanpa modifikasi dari developer",
            "Xiaomi MIA1",
            "Samsung",
            "Huawei P20 Pro",
            "Android Pie",
            "6 Agustus 2018",
            "Xiaomi black shark",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}