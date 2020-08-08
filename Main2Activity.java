package com.example.hospital_uas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<String> fotorumahsakit = new ArrayList<>();
    private ArrayList<String> namarumahsakit = new ArrayList<>();
    private ArrayList<String> namakota = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();
    private ArrayList<String> fasilitas = new ArrayList<>();
    private ArrayList<String> notelpon = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotorumahsakit, namarumahsakit,namakota, info, fasilitas,notelpon, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namakota.add("JAKARTA");
        namarumahsakit.add("BUNDA JAKARTA");
        fotorumahsakit.add("https://static.guesehat.com/static/directories_thumb/RS000008_Rumah_Sakit_Umum_Bunda_Jakarta.jpg");
        info.add("Rumah Sakit Umum Bunda Jakarta\n " +
                "merupakan Rumah Sakit yang berlokasi di Jakarta Pusat. Rumah Sakit Bunda berangkat dari praktek pribadi Pendiri, Dr. Rizal Sini SpOG yang waktu itu " +
                "ditahun 1969 adalah pegawai negeri sipil, staf pengajar pada FKUI, harus mengakui bahwa sudah merasa perlu meninggalkan jabatannya dari Jalur karir pendidik (1980), " +
                "barang kali calon guru besar. Penjelmaan praktek dokter spesialis Obstetri Ginekologi pribadi dengan mengajak rekanan juniornya waktu itu, menjadi Rumah Bersalin Bunda ditahun 1970-1972, Rumah Sakit" +
                "Bersalin kecil yang akhirnya menjadi cikal bakal Rumah Sakit Bunda Jakarta dengan kompleks yang terlihat sekarang.\n");
        fasilitas.add("\tFasilitas\n\n" +
                "1.\tTempat tidur pasien\n" +
                "2.\tExtra bed\n" +
                "3.\tBantal guling\n" +
                "4.\tAC\n" +
                "5.\tKulkas besar\n" +
                "6.\tDispenser\n" +
                "7.\tAlat steril botol\n" +
                "8.\tTV + First media\n" +
                "9.\tMeja + Telepon\n" +
                "10.\tKursi pasien\n" +
                "11.\tLemari hias + lemari pakaian\n" +
                "12.\tTea seat\n" +
                "13.\tMeja TV ruang tamu\n" +
                "14.\tBed Cover\n" +
                "15.\tSelimut tipis\n" +
                "16.\tBel pasien\n" +
                "17.\tPerlengkapan mandi\n" +
                "18.\tMeja makan pasien");
        notelpon.add("\tJl. Teuku Cik Ditiro No. 21, Jakarta Pusat\n\n" +
                "\t082146978132\n");

        namakota.add("BEKASI");
        namarumahsakit.add("Rumah Sakit Mitra Keluarga Bekasi Timur");
        fotorumahsakit.add("https://static.konsula.com/images/practice/0001001000/0001000884/rumah-sakit-mitra-keluarga-bekasi-timur.300x225.jpg");
        info.add("Rumah Sakit Mitra Keluarga Bekasi Timur merupakan sebuah Rumah Sakit yang berlokasi di Bekasi Timur, Bekasi, Jawa Barat, Indonesia. " +
                "Saat ini, dokter-dokter yang melakukan praktek di Rumah Sakit Mitra Keluarga Bekasi Timur diantaranya adalah dr. Joyce Setyawati, Sp.M, dr. Suijanta Kartadinata, Sp.B-KBD, dr. Isman Firdaus, Sp.JP(K), dan dokter lainnya. " +
                "Adapun beberapa layanan kesehatan yang dapat Anda temukan di Rumah Sakit Mitra Keluarga Bekasi Timur adalah Anak, Gigi, Kebidanan dan Kandungan, Akupunktur, Anestesi, dan lain-lain.\n");
        fasilitas.add("\tFasilitas\n\n" +
                "1. Ambulance\n" +
                "2. Apotek\n" +
                "3. C-Arm\n" +
                "4. Hemodialisa\n" +
                "5. Laboratorium\n" +
                "6. Radiologi\n" +
                "7. Rawat Inap\n" +
                "8. Rehabilitation\n" +
                "9. Ruang UGD\n" +
                "10. Ambulance\n" +
                "11. Apotek\n" +
                "12. C-Arm\n" +
                "13. Ruang UGDn");
        notelpon.add("\tJl. Pengasinan Rawasemut - Bekasi Timur, Bekasi, Jawa Barat, Indonesia 17113\n\n" +
                "\t0819302392\n");

        namakota.add("BOGOR");
        namarumahsakit.add("Rumah Sakit Sentra Medika - Cibinong");
        fotorumahsakit.add("https://static.konsula.com/images/practice/0001002000/0001001087/rumah-sakit-sentra-medika-cibinong.300x225.jpg");
        info.add("Rumah Sakit Sentra Medika - Cibinong merupakan sebuah Rumah Sakit yang berlokasi di Cibinong, " +
                "Kabupaten Bogor, Jawa Barat, Indonesia. Saat ini, dokter-dokter yang melakukan praktek di Rumah Sakit Sentra Medika - Cibinong diantaranya adalah dr. Florencia");
        fasilitas.add("\tFasilitas\n\n" +
                "1.\tTempat tidur pasien\n" +
                "2.\tExtra bed\n" +
                "3.\tBantal guling\n" +
                "4.\tAC\n" +
                "5.\tKulkas besar\n" +
                "6.\tDispenser\n" +
                "7.\tAlat steril botol\n" +
                "8.\tTV + First media\n" +
                "9.\tMeja + Telepon\n" +
                "10.\tKursi pasien\n" +
                "11.\tLemari hias + lemari pakaian\n" +
                "12.\tTea seat\n" +
                "13.\tMeja TV ruang tamu\n" +
                "14.\tBed Cover\n" +
                "15.\tSelimut tipis\n" +
                "16.\tBel pasien\n" +
                "17.\tPerlengkapan mandi\n" +
                "18.\tMeja makan pasien");
        notelpon.add("\tJl. Raya Mayor Oking No. 9 - Cibinong, Kabupaten Bogor, Jawa Barat, Indonesia 16918\n\n" +
                "\t08234302399\n");

        namakota.add("CIKARANG");
        namarumahsakit.add("RS Annisa Cikarang");
        fotorumahsakit.add("https://d1ojs48v3n42tp.cloudfront.net/provider_location_banner/457513_10-2-2020_16-21-7.jpg");
        info.add("Rumah Sakit Annisa adalah rumah sakit umum milik Swasta dan merupakan salah satu rumah sakit tipe C yang terletak di wilayah Cikarang, Bekasi. Rumah sakit Annisa Cikarang memiliki Visi menjadi Rumah Sakit yang memberikan pelayanan unggulan secara prima, " +
                "terjangkau dan manusiawi dengan misi memberikan pelayanan prima dan unggulan kepada masyarakat");
        fasilitas.add("Fasilitas \n\n" +
                "1. Farmasi\n" +
                "2. Unit Perawatan Intensif\n" +
                "3. Instalasi Gizi\n" +
                "4. Instalasi Kecantikan\n" +
                "5. Instalasi Rawat Inap");
        notelpon.add("\tJl. Teuku Cik Ditiro No. 21, Jakarta Pusat\n\n" +
                "\t082146978132\n");







        prosesRecyclerViewAdapter();

    }
}