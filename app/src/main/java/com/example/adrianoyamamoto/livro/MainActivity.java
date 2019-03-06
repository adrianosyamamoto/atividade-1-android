package com.example.adrianoyamamoto.livro;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

import java.util.Locale;

public class MainActivity extends Activity {
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                Locale pt = new Locale("PT", "BR");
                tts.setLanguage(pt);
            }
        });
    }

    public void onclickParte01(View v){
        String texto = "a marvada pinga é que eu me atrapáio," +
                        "Eu entro na venda e já dô meu táio," +
                        "Pego no copo e dali num sáio," +
                        "Ali mesmo eu bebo, ali mesmo eu cáio," +
                        "Só pra carregá é que eu dô trabáio, oi lá!";


        tts.speak(texto,  TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onclickParte02(View v){
        String texto = "Venho da cidade, já venho cantando," +
                "Trago um garrafão que venho chupando," +
                "Venho pros caminho, venho trupicando," +
                "Chifrando os barranco, venho cambeteando," +
                "E no lugar que eu caio já fico roncando, oi lá!";


        tts.speak(texto,  TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onclickParte03(View v){
        String texto = "O marido me disse, ele me falô," +
                "Largue de bebê, peço pro favor," +
                "Prosa de home nunca dei valor," +
                "Bebo com o sor quente pra esfriá o calô," +
                "Se bebo de noite é pra fazer suadô, oi lá!";


        tts.speak(texto,  TextToSpeech.QUEUE_FLUSH, null);
    }
}
