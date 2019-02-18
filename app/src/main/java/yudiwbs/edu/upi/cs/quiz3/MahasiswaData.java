package yudiwbs.edu.upi.cs.quiz3;

import java.util.ArrayList;

public class MahasiswaData {
    public static String[][] data = new String[][]{
            {"Lundy", "Bandung"}
    };

        public int length(){
            return data.length;
        }



        public static ArrayList<Mahasiswa> getListData(){
            Mahasiswa mahasiswa = null;
            ArrayList<Mahasiswa> list = new ArrayList<>();
            for (int i = 0; i <data.length; i++) {
                mahasiswa = new Mahasiswa();
                mahasiswa.setNama(data[i][0]);
                mahasiswa.setAlamat(data[i][1]);
                list.add(mahasiswa);}
            return list;
        }
    }

