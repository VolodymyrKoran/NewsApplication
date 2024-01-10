package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

/**
 * Activity to display detailed information about a news article.
 */
public class NewsDeatilActivity extends AppCompatActivity {

    // Data variables for news details
    String title,desc,content,imageURL,url;

    // UI elements
    private TextView titleTV,subDescTV,contentTV;
    private ImageView newsIV;
    private Button readNewsBtn;


    /**
     * Called when the activity is first created.
     * Initializes the UI elements, retrieves data from the intent,
     * and sets up the onClickListener for the "Read News" button.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously being
     *                           shut down, this Bundle contains the data it most recently
     *                           supplied in onSaveInstanceState(Bundle). Otherwise, it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_deatil);

        // Retrieve data from the intent
        title = getIntent().getStringExtra("title");
        content = getIntent().getStringExtra("content");
        desc = getIntent().getStringExtra("desc");
        imageURL = getIntent().getStringExtra("image");
        url = getIntent().getStringExtra("url");

        // Initialize UI elements
        titleTV = findViewById(R.id.idTVTitle);
        subDescTV = findViewById(R.id.idTVSubDesc);
        contentTV = findViewById(R.id.idTVContent);
        newsIV = findViewById(R.id.idIVNews);
        readNewsBtn = findViewById(R.id.idBtnReadNews);

        // Set data to UI elements
        titleTV.setText(title);
        subDescTV.setText(desc);
        contentTV.setText(content);
        Picasso.get().load(imageURL).into(newsIV);

        // Set onClickListener for "Read News" button
        readNewsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the news article in a browser when the button is clicked
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });



    }
}