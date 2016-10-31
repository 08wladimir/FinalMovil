package com.example.wladimir.finalmovil;

/**
 * Created by Belal on 10/24/2015.
 */
public class Config {

    //Address of our scripts of the CRUD
    public static final String URL_ADD="http://wlacho.co.nf/addEmp.php";
    public static final String URL_GET_ALL = "http://wlacho.co.nf/getAllEmp.php";
    public static final String URL_GET_EMP = "http://wlacho.co.nf/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://wlacho.co.nf/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://wlacho.co.nf/deleteEmp.php?id=";

    //Keys that will be used to send the request to php scripts
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_LUGAR = "lugar";
    public static final String KEY_EMP_DIRECCION = "direccion";
    public static final String KEY_EMP_TELEFONO = "telefono";
    public static final String KEY_EMP_LATITUD = "latitud";
    public static final String KEY_EMP_LONGITUD = "longitud";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_LUGAR = "lugar";
    public static final String TAG_DIRECCION = "direccion";
    public static final String TAG_TELEFONO = "telefono";
    public static final String TAG_LATITUD = "latitud";
    public static final String TAG_LONGITUD = "longitud";

    //employee id to pass with intent
    public static final String EMP_ID = "emp_id";
}
