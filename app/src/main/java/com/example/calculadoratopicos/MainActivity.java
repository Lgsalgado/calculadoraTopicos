package com.example.calculadoratopicos;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Variables a utilizar
    boolean tan = false;
    boolean cos = false;
    boolean se = false;
    boolean log = false;
    boolean porc = false;
    boolean raizn = false;
    boolean in = false;
    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multi = false;
    boolean divide = false;
    boolean exp  = false;
    boolean ra = false;
    Double[] numero = new Double [10]; // Este arreglo permitira ir guardando los valores ingresados
    Double resultado ; //Guardara el resultado de la operacion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Llamar los botones
        Button n0 = (Button) findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button n1 = (Button) findViewById(R.id.btn1);
        n1.setOnClickListener(this);
        Button n2 = (Button) findViewById(R.id.btn2);
        n2.setOnClickListener(this);
        Button n3 = (Button) findViewById(R.id.btn3);
        n3.setOnClickListener(this);
        Button n4 = (Button) findViewById(R.id.btn4);
        n4.setOnClickListener(this);
        Button n5 = (Button) findViewById(R.id.btn5);
        n5.setOnClickListener(this);
        Button n6 = (Button) findViewById(R.id.btn6);
        n6.setOnClickListener(this);
        Button n7 = (Button) findViewById(R.id.btn7);
        n7.setOnClickListener(this);
        Button n8 = (Button) findViewById(R.id.btn8);
        n8.setOnClickListener(this);
        Button n9 = (Button) findViewById(R.id.btn9);
        n9.setOnClickListener(this);
        Button punto = (Button) findViewById(R.id.btnpunto);
        punto.setOnClickListener(this);
        Button igual = (Button) findViewById(R.id.btnigual);
        igual.setOnClickListener(this);
        Button raiz = (Button) findViewById(R.id.btnraiz);
        raiz.setOnClickListener(this);
        Button sumar = (Button) findViewById(R.id.btnsumar);
        sumar.setOnClickListener(this);
        Button restar = (Button) findViewById(R.id.btnrestar);
        restar.setOnClickListener(this);
        Button dividir = (Button) findViewById(R.id.btndividir);
        dividir.setOnClickListener(this);
        Button multiplicar = (Button) findViewById(R.id.btnmulti);
        multiplicar.setOnClickListener(this);
        Button borrar = (Button) findViewById(R.id.btnBorrar);
        borrar.setOnClickListener(this);
        Button exp = (Button) findViewById(R.id.btnExp);
        exp.setOnClickListener(this);
        Button seno = (Button) findViewById(R.id.btnseno);
        seno.setOnClickListener(this);
        Button coseno = (Button) findViewById(R.id.btncoseno);
        coseno.setOnClickListener(this);
        Button tangente = (Button) findViewById(R.id.btntangente);
        tangente.setOnClickListener(this);
        Button delete = (Button) findViewById(R.id.btndelete);
        delete.setOnClickListener(this);
        Button pocentaje = (Button) findViewById(R.id.btnporcentaje);
        pocentaje.setOnClickListener(this);
        Button log = (Button) findViewById(R.id.btnLog);
        log.setOnClickListener(this);;
        Button in = (Button) findViewById(R.id.btnIn);
        in.setOnClickListener(this);
        Button raizen = (Button) findViewById(R.id.btnRaizEnes);
        raizen.setOnClickListener(this);
        Button preguntar = (Button) findViewById(R.id.btnpregunta);
        preguntar.setOnClickListener(this);

    }
    //Operaciones
    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();
        try {
            switch (seleccion) {
                case R.id.btnpregunta:
                    break;
                case R.id.btn0:
                    pantalla.setText(a+"0");
                    break;
                case R.id.btn1:
                    pantalla.setText(a+"1");
                    break;
                case R.id.btn2:
                    pantalla.setText(a+"2");
                    break;
                case R.id.btn3:
                    pantalla.setText(a+"3");
                    break;
                case R.id.btn4:
                    pantalla.setText(a+"4");
                    break;
                case R.id.btn5:
                    pantalla.setText(a+"5");
                    break;
                case R.id.btn6:
                    pantalla.setText(a+"6");
                    break;
                case R.id.btn7:
                    pantalla.setText(a+"7");
                    break;
                case R.id.btn8:
                    pantalla.setText(a+"8");
                    break;
                case R.id.btn9:
                    pantalla.setText(a+"9");
                    break;
                case R.id.btnLog: //logaritmo normal
                    log = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.log10(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    break;
                case R.id.btnIn: //logaritmo natural
                    in = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.log(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    break;
                case R.id.btnBorrar:
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btncoseno:
                    cos=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.cos(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.btndelete:
                    String cadena = a.substring(0, a.length() - 1);//toma el ultimo caracter y lo borra
                    pantalla.setText(cadena);
                    break;
                case R.id.btndividir:
                    divide = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnExp:
                    exp=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnigual:
                    numero[1]= Double.parseDouble(a);
                    if(suma == true) {
                        resultado = numero[0]+ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (resta == true){
                        resultado = numero[0]- numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (multi == true){
                        resultado = numero[0]* numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (divide == true){
                        resultado = numero[0]/ numero[1];
                        if (numero[1]!=0){
                            pantalla.setText(String.valueOf( resultado));
                        }else{
                            pantalla.setText("La división para '0' no es posible");
                        }

                    }   else if (porc == true){
                        resultado=(numero[0]*100)/numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (exp == true){
                        resultado = Math.pow(numero[0],numero[1]);
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (raizn == true){
                        resultado=Math.pow(numero[0], 1 / numero[1]);
                        pantalla.setText(String.valueOf(resultado));
                    }
                    decimal = false;
                    suma = false;
                    resta = false;
                    multi = false;
                    divide = false;
                    exp  = false;
                    ra = false;
                    tan = false;
                    cos = false;
                    se = false;
                    log = false;
                    porc = false;
                    in = false;
                    raizn = false;
                    break;
                case R.id.btnmulti:
            
                    multi = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnpunto:
                    pantalla.setText(a+".");
                    decimal = true;
                    if(decimal == false){
                        pantalla.setText(a+".");
                    }else{
                        return;
                    }
                    break;
                case R.id.btnraiz:
                    ra = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sqrt(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal=false;
                    break;
                case R.id.btnrestar:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnseno:
                    se=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sin(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.btnporcentaje:
                    porc=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnsumar:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btntangente:
                    tan=true;
                    numero[0]=Double.parseDouble(a);
                    double b=Math.toRadians(numero[0]); //Transformamos en radianes
                    pantalla.setText("");
                    resultado=Math.tan(b);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
            }
        }catch(Exception e){
            pantalla.setText("Error");
        };

    }
    //Cuando se presione atras
    @Override
    public void onBackPressed() {
        AlertDialog.Builder myBulid = new AlertDialog.Builder(this);
        myBulid.setMessage("Desea salir de la calculadora??");
        myBulid.setTitle("Cuidado");
        myBulid.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();;
            }
        });
        myBulid.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog = myBulid.create();
        dialog.show();
    }
}
