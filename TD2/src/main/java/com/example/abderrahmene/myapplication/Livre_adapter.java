package com.example.abderrahmene.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Abderrahmene on 03/03/2016.
 */
public class Livre_adapter  extends BaseAdapter {
    Context context;
    List<Livre> liste_livre;

    public Livre_adapter(Context context, List<Livre> liste_livre) {
        this.context = context;
        this.liste_livre = liste_livre;
    }

    @Override
    public int getCount() {
        return  liste_livre.size();
    }

    @Override
    public Object getItem(int position) {
        return liste_livre.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       convertView  = parent.inflate(context,R.layout.list_item,null);
        TextView tv_titre =  (TextView) convertView.findViewById(R.id.title);
        TextView tv_auteurs=  (TextView) convertView.findViewById(R.id.authors);
        TextView tv_editeur =  (TextView) convertView.findViewById(R.id.editor);
        ImageView img_icon = (ImageView) convertView.findViewById(R.id.coverIcon);


        tv_titre.setText("Titre : "+ liste_livre.get(position).getTitre());
        String auteurs="Auteurs : ";
        for (int i=0;i<liste_livre.get(i).getAuteurs().size();i++)
        {
            auteurs = auteurs + " " +liste_livre.get(i).getAuteurs().get(i);
        }
        tv_auteurs.setText(auteurs);
        tv_editeur.setText("Editeur : "+liste_livre.get(position).getEdition()  );
        img_icon.setImageResource(liste_livre.get(position).getCover_icon());



        return convertView;
    }
}





