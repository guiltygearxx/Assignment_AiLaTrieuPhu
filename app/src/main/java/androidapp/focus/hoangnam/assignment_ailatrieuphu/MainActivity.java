package androidapp.focus.hoangnam.assignment_ailatrieuphu;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void readyGame(View view){
        Intent intent = new Intent(getApplicationContext(), ReadyGameActivity.class);
        startActivity(intent);
    }

    public void highScore(View view){
        dialog = new Dialog(MainActivity.this);
        // khởi tạo dialog
        dialog.setContentView(R.layout.high_core_popup);
        // xét layout cho dialog
        dialog.setTitle("Đăng kí");
        // xét tiêu đề cho dialog
        dialog.show();
        // hiển thị dialog
    }
}
