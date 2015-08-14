package ejemplo2.tse.myaplication1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Toast.makeText(this, "Hola estoy escuchando", Toast.LENGTH_SHORT).show();
        // Pasar a una nueva actividad con Intent, tengo que instanciarlo y pasarle dos parametros
        // uno es la actividad en la que me encuentro y otra es la actividad hacia donde me dirijo
        Intent intent = new Intent(this,Mymusic.class);
        startActivity(intent);

    }


}
