package com.example.test.quiz;

public class SoalEssay {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Siapakah ini?",
            "Logo Apakah Ini?",
            "Logo Apakah Ini?",
            "Brand Apa Yang Menggunakan Logo Ini?",
            "ini tampilan ui apa?",
            "ini tampilan ui apa?",
            "Logo Apa ini?",
            "Hp Apakah Ini?",
            "Ini adalah hp samsung yang gagal,hp apakah ini?",
            "Ini adalah Hp dengan fingerprint di layar pertama,Hp apakah ini?",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "andy2",
            "playstore",
            "gmaps",
            "lxiaomi",
            "miui",
            "uisamsung",
            "asistant",
            "hnr9",
            "note7",
            "v11pro",
    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "andyrubin",
            "playstore",
            "googlemaps",
            "xiaomi",
            "miui",
            "samsungui",
            "googleasistant",
            "honor9lite",
            "note7",
            "vivov11pro",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}