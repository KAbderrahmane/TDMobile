package com.example.abderrahmene.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView t = (ListView) findViewById(R.id.ListView);



        final List<Livre> livres = new ArrayList<>();

       /* List<String> auteurs = new ArrayList<>();
        auteurs.add("Andrew Stellamn");
        auteurs.add("Jennifer Greene");
        Livre l1 = new Livre("Learning Agile",auteurs,"Learning Agile is a comprehensive guide to the most popular agile methods, written in a light and engaging style that makes it easy for you to learn.\n" +
                "\n" +
                "Agile has revolutionized the way teams approach software development, but with dozens of agile methodologies to choose from, the decision to \"go agile\" can be tricky. This practical livre helps you sort it out, first by grounding you in agile’s underlying principles, then by describing four specific—and well-used—agile methods: Scrum, extreme programming (XP), Lean, and Kanban and well-used—agile methods: Scrum, extreme programming (XP), Lean, and Kanban",
                2014," O'Reilly Media",R.drawable.ic_agilecovrer,R.drawable.ic_agile);
       livres.add(l1);    livres.add(l1);    livres.add(l1);   livres.add(l1);   livres.add(l1);*/



        String[] liste_resume = getResources().getStringArray(R.array.resume);
       
        // le 1er livre
        Livre livre = new Livre();
        livre.setTitre("Design Patterns in Java");
        List authors = new ArrayList();
        authors.add("Steven John Metsker");
        authors.add("William C. Wake");
        livre.setAuteurs(authors);
        livre.setEdition("Addison-Wesley Professional");
        livre.setCover_icon(R.drawable.ic_dpjava);
        livre.setCover(R.drawable.ic_dpjavacover);
        livre.setAnnee(2006);
        livre.setResume(liste_resume[0]);
        livres.add(livre);
        //2eme livre
         livre = new Livre();
        livre.setTitre("UML 2.0 in a Nutshell UML 2.0");
         authors = new ArrayList();
        authors.add("Dan Pilone");
        authors.add("Neil Pitman");
        livre.setAuteurs(authors);
        livre.setEdition("O'Reilly");
        livre.setCover_icon(R.drawable.ic_uml_2);
        livre.setCover(R.drawable.ic_uml_2cover);
        livre.setAnnee(2005);
        livre.setResume(liste_resume[1]);
        livres.add(livre);
       // 3eme livre 
        livre = new Livre();
        livre.setTitre("Microsoft SQL Server 2012 Pocket Consultant");
        authors = new ArrayList();
        authors.add("William R. Stanek");
        livre.setAuteurs(authors);
        livre.setEdition("Microsoft Press");
        livre.setCover_icon(R.drawable.ic_sqlpc);
        livre.setCover(R.drawable.ic_sqlpc_cover);
        livre.setAnnee(2012);
        livre.setResume(liste_resume[2]);
        livres.add(livre);
        // 4eme livre
        livre = new Livre();
        livre.setTitre("Android UI Fundamentals: Develop & Design");
        authors = new ArrayList();
        authors.add("Jason Ostrander");
        livre.setAuteurs(authors);
        livre.setEdition("Peachpit Press");
        livre.setCover_icon(R.drawable.ic_androidfd);
        livre.setCover(R.drawable.ic_androidfdcover);
        livre.setAnnee(2012);
        livre.setResume(liste_resume[3]);
        livres.add(livre);
        //5eme livre
        livre = new Livre();
        livre.setTitre("Programming in Objective-C");
        authors = new ArrayList();
        authors.add("Stephen Kochan");
        livre.setAuteurs(authors);
        livre.setEdition("Developer's Library");
        livre.setCover_icon(R.drawable.ic_objectivec);
        livre.setCover(R.drawable.ic_objectivecover);
        livre.setAnnee(2012);
        livre.setResume(liste_resume[4]);
        livres.add(livre);
        // 6eme livre
        livre = new Livre();
        livre.setTitre("Learning Agile");
        authors = new ArrayList();
        authors.add("Andrew Stellman");
        authors.add("Jennifer Greene");
        livre.setAuteurs(authors);
        livre.setEdition("Kindle Edition");
        livre.setCover_icon(R.drawable.ic_agile);
        livre.setCover(R.drawable.ic_agilecovrer);
        livre.setAnnee(2014);
        livre.setResume(liste_resume[5]);
        livres.add(livre);
        /// le 7 livre
        livre = new Livre();
        livre.setTitre("\"Learning the UNIX Operating System");
        authors = new ArrayList();
        authors.add("Jerry Peek");
        authors.add("Grace T-Gonguet");
        authors.add("John Strang");
        livre.setAuteurs(authors);
        livre.setEdition("O'Reilly Media, Inc.");
        livre.setCover_icon(R.drawable.ic_unixicon);
        livre.setCover(R.drawable.ic_unixicover);
        livre.setAnnee(2002);
        livre.setResume(liste_resume[6]);
        livres.add(livre);





        Livre_adapter customAdapter = new Livre_adapter(this,livres);
        t.setAdapter(customAdapter);
        t.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),Detail.class);
                Livre l = livres.get(position);
                intent.putExtra("livre",l);
                startActivity(intent);



            }
        });

    }



}
