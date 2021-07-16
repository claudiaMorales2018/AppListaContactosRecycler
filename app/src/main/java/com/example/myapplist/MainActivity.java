package com.example.myapplist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ListView lv;
    public Titular[] datos =
            new Titular[]{
                    new Titular("Luis Perez ", "12345641", R.drawable.foto1),
                    new Titular("Maria Colop ", "45124512", R.drawable.foto2),
                    new Titular("Pedro Sevilla ", "66314512", R.drawable.foto3),
                    new Titular("Alejandra Portillo ", "4541254", R.drawable.foto4),
                    new Titular("Maria Santizo ", "4512415", R.drawable.foto5),
                    new Titular("Carlos Morales ", "45124152", R.drawable.foto6),
                    new Titular("Maria Morales ", "78451241", R.drawable.foto7),
                    new Titular("Claudia Barrera ", "12414521", R.drawable.foto8),
                    new Titular("Regina Colop ", "12415214", R.drawable.foto9),
                    new Titular("Byron Capetillo ", "41254125", R.drawable.foto10),
                    new Titular("Mariano Peralta ", "14521452", R.drawable.foto11)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv = (ListView) findViewById(R.id.LstOpciones);
        AdaptadorContactos AdaptadorContactos = new AdaptadorContactos(this,datos);
        lv.setAdapter(AdaptadorContactos);

    }

    class AdaptadorContactos extends ArrayAdapter<Titular> {

        public AdaptadorContactos(Context context, Titular[]datos){
            super(context,R.layout.item_list,datos);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.item_list, null);

            TextView lblTitulo = (TextView) item.findViewById(R.id.lblNombre);
            lblTitulo.setText(datos[position].getTitulo());

            TextView lblSubtitulo = (TextView) item.findViewById(R.id.lblNombre);
            lblSubtitulo.setText(datos[position].getSubtitulo());

            ImageView imagen = item.findViewById(R.id.Imagen);
            imagen.setImageResource(datos[position].getImagen());
            return (item);
        }
    }

}


