package com.isil.sesion4_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Alumno alumno1, alumno2;
    Celular celular1, celular2;
    TextView texto1, texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = findViewById(R.id.info1);
        texto2 = findViewById(R.id.info2);

        //Instanciar objetos de la clase Alumno
        //Instancia es sinónimo de objeto
        alumno1 = new Alumno("Fredy",
                "Tejada", 101);

        alumno2 = new Alumno("Juan Diego",
                "Martinez",202);

        //Instanciar objetos de la clase Celular
        celular1 = new Celular("Sony", "Xperia",
                "negro", alumno1,951753852,
                false);

        celular2 = new Celular("Huawei",
                "P10","negro", alumno2,
                954625741, true);

        texto1.setText(celular1.MostrarInfo());
        texto2.setText(celular2.MostrarInfo());

    }
}
