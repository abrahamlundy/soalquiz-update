package yudiwbs.edu.upi.cs.quiz3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ListHandler extends RecyclerView.Adapter<ListHandler.CategoryViewHolder>{
        private Context context;

        ArrayList<Mahasiswa> getListMahasiswa() {

            return listMahasiswa;
        }

        //fungsi ini akan dipanggil nnti dalam void showrecylcle di main activity
        void setListMahasiswa(ArrayList<Mahasiswa> listMahasiswa) {
            this.listMahasiswa = listMahasiswa;
        }

        private ArrayList<Mahasiswa> listMahasiswa;
        ListHandler(Context context) {

            this.context = context;
        }


        @Override
        public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int
        viewType) {
            View itemRow =
                    LayoutInflater.from(parent.getContext()).inflate(R.layout.mahasiswa_row, parent, false);
            return new CategoryViewHolder(itemRow);
        }
        @Override
        public void onBindViewHolder(CategoryViewHolder holder, int position) {
            int number = position+1;
            //Untuk membuat kustomisasi Nama dengan penanda nomor. Fungsi holder tidak mendukung concate dua string secara langsung
            String nama = String.valueOf(number)+"."+getListMahasiswa().get(position).getNama();
           holder.tvNama.setText(nama);
           holder.tvAlamat.setText(getListMahasiswa().get(position).getAlamat());

        }
        @Override
        public int getItemCount() {
            return getListMahasiswa().size();
        }
        class CategoryViewHolder extends RecyclerView.ViewHolder{
            TextView tvNama;
            TextView tvAlamat;
            CategoryViewHolder(View itemView) {
                super(itemView);
                tvNama = itemView.findViewById(R.id.tvNama);
                tvAlamat = itemView.findViewById(R.id.tvAlamat);

            }
        }
}
