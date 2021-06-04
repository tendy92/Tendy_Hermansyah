package com.example.tendy_hermansyah;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()) {
                case R.id.home_menu:
                    f = new Home();
                    break;
                case R.id.dailyactivity_menu:
                    f = new DailyActivity();
                    break;
                case R.id.gallery_menu:
                    f = new Gallery();
                    break;
                case R.id.music_menu:
                    f = new MusicVideo();
                    break;
                case R.id.profile_menu:
                    f = new Profile();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, f).commit();
            return true;
        }
    };

    public void shareToFacebook(View view) {
        Intent facebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/tendyhermansyah92"));
        startActivity(facebook);
    }

    public void shareToWhatsapp(View view) {
        Intent whatsapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/087764597673"));
        startActivity(whatsapp);
    }

    public void shareToTelegram(View view) {
        Intent telegram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/tntpro92"));
        startActivity(telegram);
    }

    public void shareToGmail(View view) {
        Intent gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:hermansyahtendy47@gmail.com"));
        startActivity(gmail);
    }

    public void shareToMaps(View view) {
        Intent maps = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/place/Ling+Tegalsari+Daerah+Kebonraja+Rt+001+Rw+002+Kel.+Talun,+Kec.+Sumedang+Utara,+Kabupaten+Sumedang,+Jawa+Barat/@-6.8535957,107.8729528,13z/data=!3m1!4b1!4m5!3m4!1s0x2e68d14065ae50ad:0x401e8f1fc28cd70!8m2!3d-6.8381188!4d107.9275324"));
    }

    public void about(View view) {
        com.example.tendy_hermansyah.Dialog dialog = new com.example.tendy_hermansyah.Dialog();
        dialog.show(getSupportFragmentManager(), "DialogFragment");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new Home());
        bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);

    }

    private boolean loadFragment(Fragment f) {
        if (f != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, f)
                    .commit();
            return true;
        }
        return false;
    }
}
