package cn.edu.fjnu.se.helloandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvStatus = findViewById(R.id.tv_status);
        Button btnAction = findViewById(R.id.btn_action);

        btnAction.setOnClickListener(v -> {
            clickCount++;
            String statusText = getString(R.string.status_clicked, clickCount);
            tvStatus.setText(statusText);
            Toast.makeText(MainActivity.this, statusText, Toast.LENGTH_SHORT).show();
        });
    }
}
