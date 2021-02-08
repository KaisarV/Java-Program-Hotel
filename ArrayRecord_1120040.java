


//1120040
//Kaisar Fredi Valentino

import javax.swing.JOptionPane;

public class ArrayRecord_1120040 {
    
    static class Kamar {
        int kode;
        int harga;
        int biaya;
        int lamaInap;
    }
    
    static class Cabang {
        String nama;
        String lokasi;
        Kamar[] arrKamar = new Kamar[3];
        
        public Cabang(){
        }
        public Cabang(String lokasi, String nama){
            this.lokasi = lokasi;
            this.nama = nama;
        }
    }
    
    public static int hitungBiaya(int lama, int harga){
        int biayaPerawatan = 20000;
        
        int total = (lama * harga) - (biayaPerawatan * lama);
        
        return total;
    }
    
    
    public static void main(String[] args) {
        
        Cabang data[] = new Cabang[3];
        
        int i = 0;
        data[0] = new Cabang("Dago", "Hotel Dago");
        data[1] = new Cabang("Sudirman", "Hotel Sudirman");
        data[2] = new Cabang("Dipati Ukur", "Hotel Dipati Ukur");
        
        int pilihan;
        int inputKode;
        int confirm;
        int a[] = {0, 0, 0};
        int temp = 0;
        boolean kondisi = false;
        boolean kondisi2 = false;
        do {
            
            pilihan = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Hotel Harapan Bangsa" + 
                "\n1. Input Data Kamar" + 
                "\n2. Lihat Data Kamar" + 
                "\n3. Update Data Kamar" +
                "\n4. Hitung Total Bayar Suatu Kamar" +
                "\n5. Hitung Total Keuntungan Total Suatu Cabang" +
                "\n6. Hitung Total Keuntungan Semua Cabang" +
                "\n7. Keluar"
            ));
            
            switch(pilihan){
                
                case 1 :
                    do {
                        do {
                            pilihan = Integer.parseInt(JOptionPane.showInputDialog(
                                null, "Input Data Kamar" + 
                                "\n\nPilihan Cabang" + 
                                "\n1. Dago" + 
                                "\n2. Sudirman" + 
                                "\n3. Dipati Ukur" +
                                "\n4. Keluar"
                            ));
                            if (pilihan > 4) {
                                JOptionPane.showMessageDialog(null, "Cabang Tidak Ditemukan"
                                        , "Failure", JOptionPane.ERROR_MESSAGE);
                            }
                        } while(pilihan > 4);

                        JOptionPane.showMessageDialog(null, "Selamat Datang di " + data[pilihan - 1].nama);
                        
                        data[pilihan - 1].arrKamar[a[pilihan - 1]] = new Kamar();
                        
                        data[pilihan - 1].arrKamar[a[pilihan - 1]].kode = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Masukkan Kode Kamar : "));

                        data[pilihan - 1].arrKamar[a[pilihan - 1]].harga = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Input Harga Kamar : "));

                        data[pilihan - 1].arrKamar[a[pilihan - 1]].lamaInap = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Input Lama Inap : "));

                        confirm = JOptionPane.showConfirmDialog(null, "Apakah data sudah benar?", "Confirm Dialog",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                        
                        
                        if (confirm == 0) {
                            JOptionPane.showMessageDialog(null, "Pengisian Data Berhasil !");
                        }
                    } while(confirm == 1);
                    
                    a[pilihan - 1]++;
                    System.out.println(a[pilihan - 1]);
                    break;
                    
                case 2 :
                    do {
                        do {
                            pilihan = Integer.parseInt(JOptionPane.showInputDialog(
                                null, "Lihat Data Kamar" +
                                "\n\nPilihan Cabang" + 
                                "\n1. Dago" + 
                                "\n2. Sudirman" + 
                                "\n3. Dipati Ukur" +
                                "\n4. Keluar"
                            ));
                            if (pilihan > 4) {
                                JOptionPane.showMessageDialog(null, "Cabang Tidak Ditemukan"
                                        , "Failure", JOptionPane.ERROR_MESSAGE);
                            }
                            
                        } while(pilihan > 4);
                         if (pilihan == 4) {
                            break;
                        }
                        if (a[pilihan - 1] == 0) {
                            JOptionPane.showMessageDialog(null, "Belum ada yang memesan kamar pada cabang ini"
                                        , "Failure", JOptionPane.ERROR_MESSAGE);
                        }

                        for (int j = 0; j <= (a[pilihan - 1] - 1); j++) {
                            JOptionPane.showMessageDialog(null, "\nData Kamar ke " + (j + 1) +
                                "\nKode Kamar : " + data[pilihan - 1].arrKamar[j].kode +
                                "\nHarga Kamar : " + data[pilihan - 1].arrKamar[j].harga +
                                "\nLama Inap : " + data[pilihan - 1].arrKamar[j].lamaInap    
                            );
                        }
                    } while(true);
                    break;
                
                case 3 :
                    do {
                        do {
                            pilihan = Integer.parseInt(JOptionPane.showInputDialog(
                                null, "Ubah Data Kamar" +
                                "\n\nPilihan Cabang" + 
                                "\n1. Dago" + 
                                "\n2. Sudirman" + 
                                "\n3. Dipati Ukur" +
                                "\n4. Keluar"
                            ));
                            if (pilihan > 4) {
                                JOptionPane.showMessageDialog(null, "Cabang Tidak Ditemukan"
                                        , "Failure", JOptionPane.ERROR_MESSAGE);
                            }
                        } while(pilihan > 4);
                        
                        if (pilihan == 4) {
                            break;
                        }
                        
                        do {
                            inputKode = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                        "Masukkan Kode Kamar yang Dicari : " +
                                        "\n0. Keluar"));
                            if (inputKode == 0) {
                                break;
                            }
                            
                            for (int j = 0; j <= a[pilihan - 1] - 1; j++) {
                                if (data[pilihan - 1].arrKamar[j].kode == inputKode) {
                                    temp = j;
                                    kondisi = true;
                                    break;
                                }
                            }
                            if (kondisi == true) {
                                data[pilihan - 1].arrKamar[temp].kode = Integer.parseInt
                                (JOptionPane.showInputDialog(null, "Masukkan Kode Baru : "));
                                JOptionPane.showMessageDialog(null, "Perubahan Data Berhasil !");
                            } if (kondisi == false) {
                                JOptionPane.showMessageDialog(null, "Tidak Ditemukan !");
                                break;
                            }
                        } while (true);
                    } while(true);
                    break;
                    
                case 4 :
                    do {
                        do {
                            pilihan = Integer.parseInt(JOptionPane.showInputDialog(
                                null, "Keuntungan Tiap Kamar" +
                                "\n\nPilihan Cabang" + 
                                "\n1. Dago" + 
                                "\n2. Sudirman" + 
                                "\n3. Dipati Ukur" +
                                "\n4. Keluar"
                            ));
                            if (pilihan > 4) {
                                JOptionPane.showMessageDialog(null, "Cabang Tidak Ditemukan"
                                        , "Failure", JOptionPane.ERROR_MESSAGE);
                            }
                        } while(pilihan > 4);
                        
                        if (pilihan == 4) {
                            break;
                        }
                        do {
                            inputKode = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                        "Masukkan Kode Kamar yang Dicari : " +
                                        "\n0. Keluar"));
                            if (inputKode == 0) {
                                break;
                            }
                            
                            for (int j = 0; j <= a[pilihan - 1] - 1; j++) {
                                if (data[pilihan - 1].arrKamar[j].kode == inputKode) {
                                    temp = j;
                                    kondisi2 = true;
                                    break;
                                }
                            }
                            if (kondisi2 == true) {
                                data[pilihan - 1].arrKamar[temp].biaya = 
                                        hitungBiaya(data[pilihan - 1].arrKamar[temp].lamaInap, 
                                                    data[pilihan - 1].arrKamar[temp].harga);
                                JOptionPane.showMessageDialog(null, "Pendapatan Kamar\n" + 
                                        data[pilihan - 1].arrKamar[temp].biaya);
                                break;
                            } if (kondisi2 == false) {
                                JOptionPane.showMessageDialog(null, "Tidak Ditemukan !");
                                break;
                            }
                        } while (true);
                        
                    } while (true);
                    break;
                
                case 5 :
                    do {
                        do {
                            pilihan = Integer.parseInt(JOptionPane.showInputDialog(
                                null, "Keuntungan Tiap Kamar" +
                                "\n\nPilihan Cabang" + 
                                "\n1. Dago" + 
                                "\n2. Sudirman" + 
                                "\n3. Dipati Ukur" +
                                "\n4. Keluar"
                            ));
                            if (pilihan >= 4) {
                                JOptionPane.showMessageDialog(null, "Cabang Tidak Ditemukan"
                                        , "Failure", JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            if (a[pilihan - 1] == 0) {
                                JOptionPane.showMessageDialog(null, "Kamar Kosong !"
                                        , "Failure", JOptionPane.ERROR_MESSAGE);
                                pilihan = 5;
                            }
                        } while(pilihan > 4);
                        
                        if (pilihan == 4) {
                            break;
                        }
                        temp = 0;
                        for (int j = 0; j < a[pilihan - 1]; j++) {
                            temp += data[pilihan - 1].arrKamar[j].biaya;
                        }
                        JOptionPane.showMessageDialog(null, "Total Pendapatan Dari Cabang " 
                                + data[pilihan - 1].nama + " adalah " + temp);
                    } while (true);
                    break;
                    
                case 6 : 
                    temp = 0;
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < a[j]; k++) {
                            temp += data[j].arrKamar[k].biaya;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Total Pendapatan adalah " + temp);
                    break;
            }
   
            if (pilihan > 7) {
                JOptionPane.showMessageDialog (null, "Menu Tidak Ditemukan", 
                        "Failure", JOptionPane.ERROR_MESSAGE);
            }
            if (pilihan == 7) {
                JOptionPane.showMessageDialog (null, "Terimakasih !");
            }
            
        } while(pilihan != 7);
    }
    
}
