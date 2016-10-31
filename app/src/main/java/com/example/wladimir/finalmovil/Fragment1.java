package com.example.wladimir.finalmovil;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

/**
 * Created by filip on 8/21/2015.
 */
public class Fragment1 extends Fragment implements View.OnClickListener {

    private EditText edit1;
    private EditText edit2;
    private EditText edit3;
    private EditText edit4;
    private EditText edit5;

    private Button buttonAdd;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        edit1 = (EditText) getView().findViewById(R.id.editLugar);
        edit2 = (EditText) getView().findViewById(R.id.editDireccion);
        edit3 = (EditText) getView().findViewById(R.id.editTelefono);
        edit4 = (EditText) getView().findViewById(R.id.editLatitud);
        edit5 = (EditText) getView().findViewById(R.id.editLongitud);

        buttonAdd = (Button) getView().findViewById(R.id.buttonAdd);

        //Setting listeners to button
        buttonAdd.setOnClickListener(this);

        return inflater.inflate(R.layout.frag1,container,false);
    }

    private void addEmployee(){

        final String lugar = edit1.getText().toString().trim();
        final String direccion = edit2.getText().toString().trim();
        final String telefono = edit3.getText().toString().trim();
        final String latitud = edit4.getText().toString().trim();
        final String longitud = edit5.getText().toString().trim();

        class AddEmployee extends AsyncTask<Void,Void,String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(Config.KEY_EMP_LUGAR,lugar);
                params.put(Config.KEY_EMP_DIRECCION,direccion);
                params.put(Config.KEY_EMP_TELEFONO,telefono);
                params.put(Config.KEY_EMP_LATITUD,latitud);
                params.put(Config.KEY_EMP_LONGITUD,longitud);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(Config.URL_ADD, params);
                return res;
            }
        }

        AddEmployee ae = new AddEmployee();
        ae.execute();
    }

    @Override
    public void onClick(View v) {
        if(v == buttonAdd){
            addEmployee();
        }
    }

}
