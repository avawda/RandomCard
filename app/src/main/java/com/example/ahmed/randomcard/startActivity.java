package com.example.ahmed.randomcard;

/*
    Ahmed Vawda, 09 Nov 2016
    Basic code to test button functionality and image retrieval/display of playing cards
*/

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class startActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //Initiate the variables needed for the App
        Button genCardBtn = (Button) findViewById(R.id.generateCardBtn);
        Button tglCardVisibleBtn = (Button) findViewById(R.id.toggleVisibleBtn);
        final ImageView cardImage = (ImageView) findViewById(R.id.imageView);
        final Map<Integer,Bitmap> deck = configureDeck();

        //Setup the HashMap of cards within the deck


        //Define what will happen when generate button is pressed
        genCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // nextInt is normally exclusive of the top value,
                // so add 1 to make it inclusive
                int minCard = 1;
                int maxCard = 24;
                Random r = new Random();
                int cardPos = r.nextInt( (maxCard - minCard) +1 ) + minCard;
                cardImage.setImageBitmap(deck.get(cardPos));
            }
        });

        //Define what will happen when toggle visibility button is pressed
        tglCardVisibleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardImage.getVisibility() == View.VISIBLE) {
                    cardImage.setVisibility(View.INVISIBLE);
                } else {
                    cardImage.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private Map<Integer,Bitmap> configureDeck(){
        final Bitmap JackClubs   = BitmapFactory.decodeResource(getResources(),R.mipmap.jack_of_clubs2);
        final Bitmap JackDiam    = BitmapFactory.decodeResource(getResources(),R.mipmap.jack_of_diamonds2);
        final Bitmap JackHearts  = BitmapFactory.decodeResource(getResources(),R.mipmap.jack_of_hearts2);
        final Bitmap JackSpades  = BitmapFactory.decodeResource(getResources(),R.mipmap.jack_of_spades2);
        
        final Bitmap NineClubs  = BitmapFactory.decodeResource(getResources(),R.mipmap.nine_of_clubs);
        final Bitmap NineDiam   = BitmapFactory.decodeResource(getResources(),R.mipmap.nine_of_diamonds);
        final Bitmap NineHearts = BitmapFactory.decodeResource(getResources(),R.mipmap.nine_of_hearts);
        final Bitmap NineSpades = BitmapFactory.decodeResource(getResources(),R.mipmap.nine_of_spades);

        final Bitmap TenClubs  = BitmapFactory.decodeResource(getResources(),R.mipmap.ten_of_clubs);
        final Bitmap TenDiam   = BitmapFactory.decodeResource(getResources(),R.mipmap.ten_of_diamonds);
        final Bitmap TenHearts = BitmapFactory.decodeResource(getResources(),R.mipmap.ten_of_hearts);
        final Bitmap TenSpades = BitmapFactory.decodeResource(getResources(),R.mipmap.ten_of_spades);

        final Bitmap AceClubs  = BitmapFactory.decodeResource(getResources(),R.mipmap.ace_of_clubs);
        final Bitmap AceDiam   = BitmapFactory.decodeResource(getResources(),R.mipmap.ace_of_diamonds);
        final Bitmap AceHearts = BitmapFactory.decodeResource(getResources(),R.mipmap.ace_of_hearts);
        final Bitmap AceSpades = BitmapFactory.decodeResource(getResources(),R.mipmap.ace_of_spades);

        final Bitmap KingClubs  = BitmapFactory.decodeResource(getResources(),R.mipmap.king_of_clubs2);
        final Bitmap KingDiam   = BitmapFactory.decodeResource(getResources(),R.mipmap.king_of_diamonds2);
        final Bitmap KingHearts = BitmapFactory.decodeResource(getResources(),R.mipmap.king_of_hearts2);
        final Bitmap KingSpades = BitmapFactory.decodeResource(getResources(),R.mipmap.king_of_spades2);

        final Bitmap QueenClubs  = BitmapFactory.decodeResource(getResources(),R.mipmap.queen_of_clubs2);
        final Bitmap QueenDiam   = BitmapFactory.decodeResource(getResources(),R.mipmap.queen_of_diamonds2);
        final Bitmap QueenHearts = BitmapFactory.decodeResource(getResources(),R.mipmap.queen_of_hearts2);
        final Bitmap QueenSpades = BitmapFactory.decodeResource(getResources(),R.mipmap.queen_of_spades2);
        
        
        Map<Integer,Bitmap> deck = new HashMap<Integer,Bitmap>();
        deck.put(1,JackClubs);
        deck.put(2,JackDiam);
        deck.put(3,JackHearts);
        deck.put(4,JackSpades);

        deck.put(5,NineClubs);
        deck.put(6,NineDiam);
        deck.put(7,NineHearts);
        deck.put(8,NineSpades);

        deck.put(9,TenClubs);
        deck.put(10,TenDiam);
        deck.put(11,TenHearts);
        deck.put(12,TenSpades);
        
        deck.put(13,AceClubs);
        deck.put(14,AceDiam);
        deck.put(15,AceHearts);
        deck.put(16,AceSpades);

        deck.put(17,KingClubs);
        deck.put(18,KingDiam);
        deck.put(19,KingHearts);
        deck.put(20,KingSpades);

        deck.put(21,QueenClubs);
        deck.put(22,QueenDiam);
        deck.put(23,QueenHearts);
        deck.put(24,QueenSpades);
        
        return deck;
    }
}
