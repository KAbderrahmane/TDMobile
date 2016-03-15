package com.example.abderrahmene.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);



        /* Intent intent = getIntent()   ;
        Book b =  (Book) intent.getSerializableExtra("book");
      //  String text = intent.getStringExtra("message");
        TextView  textView = (TextView) findViewById(R.id.textView);
        textView.setText(b.getAuteur());*/
        Intent intent = getIntent()  ;
        Livre livre = (Livre) intent.getSerializableExtra("livre");
        ImageView img_cover = (ImageView) findViewById(R.id.img_cover);
        TextView  tx_titre  = (TextView) findViewById(R.id.d_titre);
        TextView  tx_edit  = (TextView) findViewById(R.id.d_editeur);
        TextView  tx_resume  = (TextView) findViewById(R.id.d_resume);
        TextView  tx_auteurs  = (TextView) findViewById(R.id.d_auteurs);
        TextView  tx_annee  = (TextView) findViewById(R.id.d_annee);

        img_cover.setImageResource(livre.getCover());
        tx_titre.setText("Titre : "+livre.getTitre());
        tx_annee.setText("Annee : "+String.valueOf(livre.getAnnee()));
        tx_resume.setText("Resumé : " +livre.getResume());
        tx_edit.setText("Editeur : "+livre.getEdition());
        String S = "Auteur : " ;

        for (String s : livre.getAuteurs())
        {
            S = S + " "+s;
        }
        tx_auteurs.setText(S);

    }
}
